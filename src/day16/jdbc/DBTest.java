package day16.jdbc;

public class DBTest {
    public static void main(String[] args) {
        Driver db = new Driver();
        Query sql = db.getQuery();
        System.out.println(sql.selectQuery());
    }
}
