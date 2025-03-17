import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-18 上午12:33
 */

public class dataSource {
    public static void main(String[] args) {
        // 执行多条sql直到连接关闭
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL("jdbc:mysql://localhost:3306/bishe?autoReconnect=true&useUnicode=true" +
                "&characterEncoding=utf8&serverTimezone=GMT%2B8");
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("lmjnb666");

    }
}
