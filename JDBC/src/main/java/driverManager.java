import java.sql.*;
import java.text.MessageFormat;

public class driverManager {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            // 1.加载数据库厂商提供的驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.获取数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bishe?autoReconnect=true&useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8","root","lmjnb666");
            // 3.创建statement对象
            statement = connection.createStatement();
            // 4.定义并执行sql语句
            String sql = "select * from createknowledge";
            // 5.执行并获取结果集
            resultSet = statement.executeQuery(sql);
            // 6.遍历结果集
            while(resultSet.next()) {
                String user_id = resultSet.getString(1);
                String name = resultSet.getString(2);
                String data = resultSet.getString(3);
                int state = resultSet.getInt(4);
                String datetime = resultSet.getString(6);
                String id = resultSet.getString(8);
                System.out.println(MessageFormat.format("user_id:{0} name:{1} data:{2} state:{3} datetime:{4} id:{5}",user_id,name,
                        data,state,datetime,id));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
