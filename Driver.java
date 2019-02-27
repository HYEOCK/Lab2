package Lab2;

public class Driver {
    public static void main(String[] args) {

        Country ca = new Country();
        ca.displayAllProvinces();

        System.out.println(ca.howManyHaveThisPopulation(10, 15));
    }
}
