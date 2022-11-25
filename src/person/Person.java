package person;

public class Person {
    private String name;
    private int age;
    private String national;

    public void properties() {
        System.out.println("running around" + "\n");

    }

    public Person() {
    }

    public Person(String name, int age, String national) {
        this.name = name;
        this.age = age;
        this.national = national;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return
                "name = '" + name + '\'' +
                ", age = " + age +
                ", national = '" + national + '\'' +
                '}';
    }
}
