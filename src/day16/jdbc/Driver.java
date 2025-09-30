package day16.jdbc;

public class Driver {
    private Query q;

    Driver() {
//        q = new Oracle();
        q= new MySQL();
    }

    public Query getQuery() {
        return q;
    }
}
