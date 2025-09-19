package day9.bank;

public class AccountIDGenerator {
    //형식 : 은행번호 - 지점번호 - 일련번호 , ***-****-****
    private static int serialNum = 1000;
    public static String getAccID(String bankNo, String areaNo) {
        serialNum++;
        return bankNo+"-"+areaNo+"-"+serialNum;
    }

    public static void main(String[] args) {
        String accNo1 = getAccID("1234","123123");
        String accNo2 = getAccID("1234","123123");
        String accNo3 = getAccID("1234","123123");
        System.out.println(accNo1);
        System.out.println(accNo2);
        System.out.println(accNo3);

    }
}
