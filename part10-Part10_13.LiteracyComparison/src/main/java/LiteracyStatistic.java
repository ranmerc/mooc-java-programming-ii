public class LiteracyStatistic implements Comparable<LiteracyStatistic> {

    private String countryName, gender;
    private int year;
    private double percent;

    public LiteracyStatistic(String countryName, String gender, int year, double percent) {
        this.countryName = countryName;
        this.gender = gender;
        this.year = year;
        this.percent = percent;
    }

    @Override
    public int compareTo(LiteracyStatistic comparedLS) {
        if (comparedLS.percent > this.percent) {
            return -1;
        } else if (comparedLS.percent < this.percent) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.countryName + " (" + this.year + "), " + this.gender + ", " + this.percent;
    }
}
