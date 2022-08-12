public class Book {

    private String name;
    private int recommendAge;

    public Book(String name, int recommendAge) {
        this.name = name;
        this.recommendAge = recommendAge;
    }

    public String getName() {
        return name;
    }

    public int getRecommendAge() {
        return recommendAge;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.recommendAge + " year-olds or older)";
    }
}