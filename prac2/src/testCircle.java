public class testCircle {
    public static void main(String[] args) {
        Circle test = new Circle(10, 0,0);
        System.out.println("test: " + test.toString());
        test.setD(15);
        test.setX(10);
        test.setY(5);
        System.out.println(test.toString());
        System.out.println("Area = " + test.area());
        System.out.println("Length = " + test.length());
        Circle test1 = new Circle(10, 0,0);
        System.out.println("test1: " + test1.toString());
        if (test1.equals(test)){
            System.out.println("test is equal to test1");
        }
        else{
            System.out.println("test isn't equal to test1");
        }

        test1.setY(5);
        test1.setX(10);
        test1.setD(15);
        System.out.println("test1: " + test1.toString());
        if (test1.equals(test)){
            System.out.println("test is equal to test1");
        }
        else{
            System.out.println("test isn't equal to test1");
        }

    }
}
