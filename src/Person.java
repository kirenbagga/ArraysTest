public class Person {

    private String fisrtName;
    private String lastName;
    private int age;

    public Person(String fisrtName, String lastName, int age) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(Person source) {
        setFisrtName(source.fisrtName);
        setLastName(source.lastName);
        setAge(source.age);
    }

    public String getFisrtName() {
        return fisrtName;
    }


    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPerson() {
        System.out.println(fisrtName+" "+lastName+" age --> "+age);
    }
}
