package day13;

public class SchoolTest {
    private static Manager manager = new Manager(10);
    private static SchoolUI ui = new SchoolUI();
    private static boolean isMain = true;

    public static void main(String[] args) {
        while (isMain) {
            ui.printMainMenu();
            int whatMenu = ui.selectMenu();
            switch (whatMenu) {
                case 1 -> {
                    createPerson:
                    while (true) {
                        ui.printCreatePerson();
                        int whatPerson = ui.selectMenu();
                        switch (whatPerson) {
                            case 1 -> {
                                manager.makeStudentInstance();
                            }
                            case 2 -> {
                                manager.makeTeacherInstance();
                            }
                            case 3 -> {
                                break createPerson;
                            }
                        }
                    }
                }
                case 2 -> {
                    String name = ui.findByName();
                    manager.findPerson(name);
                }
                case 3 -> {
                    String name = ui.findByName();
                    manager.deletePerson(name);
                }
                case 4 -> {
                    manager.printWholeProfile();
                }
                case 99 -> {
                    System.out.println("프로그램을 종료합니다.");
                    isMain = false;
                }
                default -> {
                    System.out.println("선택지 중에서 고르세요.");
                }
            }
        }

    }
}
