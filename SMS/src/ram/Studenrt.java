package ram;
public class Studenrt {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) { // Optional: Add validation for age
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student = new Student();
        
        // Set values using setters
        student.setName("John Doe");
        student.setAge(20);

        // Get values using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
