package person;

public class Programmer extends Person {
    private String languageProgramming;

    public void programmer() {
        System.out.printf("earns a lot" + "\n");
    }

    public Programmer() {
    }

    public Programmer(String languageProgramming, String name, int age, String national) {
        super(name, age, national);
        this.languageProgramming = languageProgramming;
    }


    public String getLanguageProgramming() {
        return languageProgramming;
    }

    public void setLanguageProgramming(String languageProgramming) {
        this.languageProgramming = languageProgramming;
    }

    @Override
    public String
         toString() {
        return "Programmer{"+'\''+
        "languageProgramming='" + languageProgramming + '\'' +
                super.toString()+
                '}';
    }
}