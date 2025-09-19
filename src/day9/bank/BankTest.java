package day9.bank;

public class BankTest {
    public static final String
    BANK_NO =
            "1234";
    public static final String
    AREA_NO =
            "0025";
    public static void main(String[] args) {
        Customer cs1 = new Customer("김민자", "12345-155332", "김수한무의 용궁아래");
        Account a1 = new Account(AccountIDGenerator.getAccID(BANK_NO, AREA_NO), cs1, 11111);
        Account a2 = new Account("1200", cs1, 11111);
        a1.deposit(9999);
        a1.printAccountInfo();

        System.out.println(a1.getBalance());
//        AccountIDGenerator accGnerate = new AccountIDGenerator();
//        accGnerate.getAccID(); // If getAccID() is not static, we have to make instance for using the method

        String newAccID = AccountIDGenerator.getAccID(BANK_NO, AREA_NO);
        System.out.println(AccountIDGenerator.getAccID(BANK_NO, AREA_NO));

    }
}
