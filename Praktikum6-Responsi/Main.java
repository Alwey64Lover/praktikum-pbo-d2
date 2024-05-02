public class Main{
    public static void main(String[] args){
        StackOfNumber stackN = new StackOfNumber();
        StackOfPoint stackP = new StackOfPoint();

        QueueOfNumber queueN = new QueueOfNumber();
        QueueOfPoint queueP = new QueueOfPoint();

        Point p1 = new Point(4, 5);
        Point p2 = new Point(6, 7);
        Point p3 = new Point(8, 9);

        stackN.addElement(1); stackN.addElement(2); stackN.addElement(3);
        stackP.addElement(p1); stackP.addElement(p2); stackP.addElement(p3);

        queueN.addElement(1); queueN.addElement(2); queueN.addElement(3);
        queueP.addElement(p1); queueP.addElement(p2); queueP.addElement(p3);

        System.out.println(stackP.getList().get(0).getAbsis());
    }
}