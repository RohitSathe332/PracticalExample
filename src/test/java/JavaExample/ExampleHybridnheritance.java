package JavaExample;

interface X {
    void show();
}

class Y implements X{
    public void show() {
        System.out.println("Show from A");
    }
}

class Z extends Y {
    void display() {
        System.out.println("Display from C");
    }
}

public class ExampleHybridnheritance {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.show();
        obj.display();
    }
}



