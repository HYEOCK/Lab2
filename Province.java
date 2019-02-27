package Lab2;

public class Province {
    // constants
    private static final int DEFAULT_POPULATION_MILLIONS = 4;
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";

    // instance variables
    private String province;
    private String capital;
    private int populationInMillions;

    // constructor
    public Province(String province, String capital, int populationInMillions){
        if (isValidPopulation(populationInMillions) && isValidProvince(province) && isValidCapitalCity(capital)){
            this.province = province;
            this.capital = capital;
            this.populationInMillions = populationInMillions;
        } else { // if there is any error; create the default data, shown below
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS; // 4
            this.province = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }
    }

    private boolean isValidProvince(String province){
        String[] provinces = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
        int i = 0;
        while (i < provinces.length){
            if (province.equals(provinces[i])){
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital){
        String[] capitals = {"Toronto", "Quebec City", "Halifax[", "Fredericton", "Winnipeg", "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"};
        for (String cap : capitals){
            if (capital.equals(cap)){
                return true;
            }
        }
        return false;
    }

    private boolean isValidPopulation(int population){
        if (population <= 4 || population >= 38){
            return false;
        }else {
            return true;
        }
    }

    public String getProvince() {
        return province;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulationInMillions() {
        return populationInMillions;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulationInMillions(int populationInMillions) {
        this.populationInMillions = populationInMillions;
    }

    public String getDetails(){
        return "The capital of " + this.province + "(pop." + this.populationInMillions + ")is " + this.capital;
    }



}


