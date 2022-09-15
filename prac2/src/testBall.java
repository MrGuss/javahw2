public class testBall {
    public static void main(String[] args) {
        Ball test = new Ball();
        System.out.println(test.toString());
        Ball test1 = new Ball(1, 1);
        System.out.println(test1.toString());
        test1.setX(2);
        test1.setY(3);
        System.out.println(test1.getX()+" "+test1.getY());
        test1.setXY(4,5);
        System.out.println(test1.toString());
        test1.move(-1,-1);
        System.out.println(test1.toString());
    }
}
