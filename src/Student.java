public class Student {
    protected int id,age;
    protected String nom;
    public Student() {}
    public Student(String nom, int age, int id) {
        this.nom = nom;
        this.age = age;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Identifiant : "+ id
                + "\nNom : " + nom
                + "\nAge : " + age;
    }
}
