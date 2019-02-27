package Lab2;


public class Country {
    private String name;
    private Province[] provinces;

    public Country() {
        this.name = "Canada";
        this.provinces = new Province[10];
        this.provinces[0] = new Province("Ontario", "Toronto", 13);
        this.provinces[1] = new Province("Quebec", "Quebec City", 8);
        this.provinces[2] = new Province("Nova Scotia", "Halifax[", 0);
        this.provinces[3] = new Province("New Brunswick", "Fredericton", 0);
        this.provinces[4] = new Province("Manitoba", "Winnipeg", 1);
        this.provinces[5] = new Province("British Columbia", "Victoria", 4);
        this.provinces[6] = new Province("Prince Edward Island", "Charlottetown",0);
        this.provinces[7] = new Province("Saskatchewan", "Regina",1);
        this.provinces[8] = new Province("Alberta", "Edmonton", 4);
        this.provinces[9] = new Province("Newfoundland and Labrador", "St. John's", 0);
    }

    public void displayAllProvinces() {
        for (int i = 0; i < this.provinces.length; i++){
            System.out.println(this.provinces[i].getDetails());
        }
    }

    /**
     * Checking the number of provinces with the population between min and max
     * @param min
     * @param max
     * @return
     */
    public int howManyHaveThisPopulation(int min, int max) {
        int count = 0;
        for (Province elem : this.provinces) {
            if (min <= elem.getPopulationInMillions() && elem.getPopulationInMillions() <= max) {
                count++;
            }
        }
        return count;
    }
}

