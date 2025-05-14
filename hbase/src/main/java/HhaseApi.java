import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.SharedConnection;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.List;

import static jdk.internal.net.http.common.Utils.close;
import static org.apache.hadoop.hdfs.HdfsConfiguration.init;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-25 下午2:48
 */

public class HhaseApi {

    static Connection connection = null;
    public static void listTables() throws IOException {
        init();//建立连接
        Admin admin = null;
        List<TableDescriptor> tableDescriptors = admin.listTableDescriptors();
        for(TableDescriptor tableDescriptor : tableDescriptors){
            TableName tableName = tableDescriptor.getTableName();
            System.out.println("Table:" + tableName);
        }
        close();//关闭连接
    }

    //在终端打印出指定的表的所有记录数据
    public static void getData(String tableName)throws  IOException{
        init();
        Table table = connection.getTable(TableName.valueOf(tableName));
        Scan scan = new Scan();
        ResultScanner scanner = table.getScanner(scan);//获取行的遍历器
        for (Result result:scanner){
            printRecoder(result);
        }
        close();
    }
    //打印一条记录的详情
    public  static void printRecoder(Result result)throws IOException{
        for(Cell cell:result.rawCells()){
            System.out.print("行健: "+new String(Bytes.toString(cell.getRowArray(),cell.getRowOffset(), cell.getRowLength())));
            System.out.print("列簇: "+new String( Bytes.toString(cell.getFamilyArray(),cell.getFamilyOffset(), cell.getFamilyLength()) ));
            System.out.print(" 列: "+new String(Bytes.toString(cell.getQualifierArray(),cell.getQualifierOffset(), cell.getQualifierLength())));
            System.out.print(" 值: "+new String(Bytes.toString(cell.getValueArray(),cell.getValueOffset(), cell.getValueLength())));
            System.out.println("时间戳: "+cell.getTimestamp());
        }
    }

    public static void insterRow(String tableName,String rowKey,String colFamily,String col,String val) throws IOException {
        init();
        Table table = connection.getTable(TableName.valueOf(tableName));
        Put put = new Put(rowKey.getBytes());
        put.addColumn(colFamily.getBytes(), col.getBytes(), val.getBytes());
        table.put(put);
        table.close();
        close();
    }
    //删除数据
    public static void deleRow(String tableName,String rowKey,String colFamily,String col) throws IOException {
        init();
        Table table = connection.getTable(TableName.valueOf(tableName));
        Delete delete = new Delete(rowKey.getBytes());
        //删除指定列族
        delete.addFamily(Bytes.toBytes(colFamily));
        //删除指定列
        delete.addColumn(Bytes.toBytes(colFamily),Bytes.toBytes(col));
        table.delete(delete);
        table.close();
        close();
    }

    //清空指定的表的所有记录数据
    public static void clearRows(String tableName)throws IOException{
        init();
        TableName tablename = TableName.valueOf(tableName);
        admin.disableTable(tablename);
        admin.deleteTable(tablename);
        TableDescriptorBuilder tableDescriptor = TableDescriptorBuilder.newBuilder(tablename);
        admin.createTable(tableDescriptor.build());
        close();
    }


    //统计表的行数
    public static void countRows(String tableName)throws IOException{
        init();
        Table table = connection.getTable(TableName.valueOf(tableName));
        Scan scan = new Scan();
        ResultScanner scanner = table.getScanner(scan);
        int num = 0;
        for (Result result = scanner.next();result!=null;result=scanner.next()){
            num++;
        }
        System.out.println("行数:"+ num);
        scanner.close();
        close();
    }

    public static void createTable(String tableName,String[] fields) throws IOException {

        init();
        TableName tablename = TableName.valueOf(tableName);

        if(admin.tableExists(tablename)){
            System.out.println("table is exists!");
            admin.disableTable(tablename);
            admin.deleteTable(tablename);//删除原来的表
        }

        TableDescriptorBuilder tableDescriptor = TableDescriptorBuilder.newBuilder(tablename);
        for(String str : fields){
            tableDescriptor.setColumnFamily(ColumnFamilyDescriptorBuilder.newBuilder(Bytes.toBytes(str)).build());
            admin.createTable(tableDescriptor.build());
        }
        close();
    }

    public static void scanColumn(String tableName,String column)throws  IOException{
        init();
        Table table = connection.getTable(TableName.valueOf(tableName));
        Scan scan = new Scan();
        scan.addFamily(Bytes.toBytes(column));
        ResultScanner scanner = table.getScanner(scan);
        for (Result result = scanner.next(); result != null; result = scanner.next()){
            showCell(result);
        }
        table.close();
        close();
    }
    //格式化输出
    public static void showCell(Result result){
        Cell[] cells = result.rawCells();
        for(Cell cell:cells){
            System.out.println("RowName:"+new String(Bytes.toString(cell.getRowArray(),cell.getRowOffset(), cell.getRowLength()))+" ");
            System.out.println("Timetamp:"+cell.getTimestamp()+" ");
            System.out.println("column Family:"+new String(Bytes.toString(cell.getFamilyArray(),cell.getFamilyOffset(), cell.getFamilyLength()))+" ");
            System.out.println("row Name:"+new String(Bytes.toString(cell.getQualifierArray(),cell.getQualifierOffset(), cell.getQualifierLength()))+" ");
            System.out.println("value:"+new String(Bytes.toString(cell.getValueArray(),cell.getValueOffset(), cell.getValueLength()))+" ");
        }
    }

    public static void modifyData(String tableName,String row,String column,String val)throws IOException{
        init();
        Table table = connection.getTable(TableName.valueOf(tableName));
        Put put = new Put(row.getBytes());
        put.addColumn(column.getBytes(),null,val.getBytes());
        table.put(put);
        table.close();
        close();
    }

    public static void deleteRow(String tableName,String row)throws IOException{
        init();
        Table table = connection.getTable(TableName.valueOf(tableName));
        Delete delete = new Delete(row.getBytes());
        table.delete(delete);
        table.close();
        close();
    }



}
