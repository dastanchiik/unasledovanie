package person;

public class Singer extends Person {

    private String genre;

    public void properties2() {
        System.out.println("sings");
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
                "genre='" + genre + '\'' +
                super.toString()+
                '}';
    }
}
