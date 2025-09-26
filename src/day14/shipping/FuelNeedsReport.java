package day14.shipping;

public class FuelNeedsReport {
    private double totalRequiredFuel;

    public void printRequiredFuel() {
        Company company = Company.getInstance();
        System.out.println();
        for (Vehicle v :
                company.getVehicles()) {
            if (v != null) {
                System.out.printf("탈것 %s는 %.3fL의 연료가 필요합니다.\n", v.getName(), v.calculatedFuelNeeds());
                totalRequiredFuel = totalRequiredFuel + v.calculatedFuelNeeds();
            }
        }
        System.out.printf("총 필요 연료량 : %.3fL\n", totalRequiredFuel);
    }

}
