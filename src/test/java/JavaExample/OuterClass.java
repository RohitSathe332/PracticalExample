package JavaExample;

class OuterClass {

    int x = 10;

    // First Inner Class
    class InnerClass1 {
        void display() {
            System.out.println("InnerClass1: x = " + x);
        }
    }

    // Second Inner Class
    class InnerClass2 {
        void show() {
            System.out.println("InnerClass2: x = " + x);
        }
    }
}

 class TestInnerClass {
    public static void main(String[] args) {

        OuterClass obj = new OuterClass();

        // Creating object of InnerClass1
        OuterClass.InnerClass1 obj1 = obj.new InnerClass1();
        obj1.display();

        // Creating object of InnerClass2
        OuterClass.InnerClass2 obj2 = obj.new InnerClass2();
        obj2.show();
    }
}