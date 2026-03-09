package JavaExample;

class GetterSetterEncasulation {
    private String name;
    private int age;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

 public class ExampleEncasulation {

    public static void main(String[] args) {

    	GetterSetterEncasulation obj = new GetterSetterEncasulation();

        obj.setName("Rohit");
        obj.setAge(25);
        obj.setSalary(50000);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Salary: " + obj.getSalary());
        
       
    }
}