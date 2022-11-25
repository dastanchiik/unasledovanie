package person;

public class Dancer extends Person {
    private String dance;

    public void properties1() {
        System.out.print("dancing"+"\n");
    }

    public Dancer() {
    }

    public String getDance() {
        return dance;
    }

    public void setDance(String dance) {
        this.dance = dance;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                super.toString()+
                "dance ='" + dance + '\'' +
                '}';
    }

}
