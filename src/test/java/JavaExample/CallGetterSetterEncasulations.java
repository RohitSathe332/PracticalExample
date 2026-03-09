package JavaExample;

public class CallGetterSetterEncasulations {

    public static void main(String[] args) {

    	GetterSetterEncasulation obj = new GetterSetterEncasulation();

        obj.setName("Rohit");
        obj.setAge(25);
        obj.setSalary(50000);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Salary: " + obj.getSalary());
        
        obj.setName("Sathe");
        obj.setAge(55);
        obj.setSalary(500000);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Salary: " + obj.getSalary());
    }
}