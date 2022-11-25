package person;

public class Singer extends Person {

    private String genre;

    public void properties() {
        System.out.print("sings"+"\n");
    }

    public Singer() {
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Singer{" +
                super.toString()+
                "genre='" + genre + '\'' +
                '}';
    }
}
