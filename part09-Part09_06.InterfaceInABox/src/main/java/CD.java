public class CD implements Packable {

    private String artistName;
    private String CDName;
    private int publicationYear;

    public CD(String artistName, String CDName, int publicationYear) {
        this.artistName = artistName;
        this.CDName = CDName;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return this.artistName + ": " + this.CDName + " (" + this.publicationYear + ")";
    }
}
