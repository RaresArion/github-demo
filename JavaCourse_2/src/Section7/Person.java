package Section7;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public static void getSmth() {
        System.out.println("Smth");
    }
    public void getSmth2() {
        System.out.println("Smth2");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen () {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName () {
        if ((firstName.isEmpty()) && (lastName.isEmpty())) {
            return "";
        } else if (lastName.isEmpty()) {
            return this.firstName;
        } else if (firstName.isEmpty()) {
            return this.lastName;
        }
        return this.firstName + " " + this.lastName;
    }
}
