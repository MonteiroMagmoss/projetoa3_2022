package projeto.classes;



import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static String host = "localhost";
    private static String port = "3306";
    private static String db = "db_A3fastFood";
    private static String user = "root";
    private static String pass = "miguel123";

    public static Connection obtemConexao() {
        try {
            //return DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + db, user, pass);  
            String url = String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC", host, port, db);
            return DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
