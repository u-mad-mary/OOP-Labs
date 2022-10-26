public class Main
{
    public static void main(String[] args)
    {
        var box = new Box();
        var box1 = new Box(3);
        var box2 = new Box(3,6,9);
        System.out.println("First box: " + box);
        System.out.println("Second box: " +box1);
        System.out.println("Third box: " +box2);
        System.out.println("Volume: " + box1.findVolume() + " m^3");
        System.out.println("Area: " + box2.findSurfaceArea()+ " m^2");
        Queue<Integer> q1 = new Queue<>();
        Queue<String> q2 = new Queue<>(3);


        q1.push(1);
        q1.push(2);
        q1.push(3);


        q2.push("First");
        q2.push("Second");
        q2.push("Third");

        q2.push("NowFull");

        System.out.println("q1 is full: " + q1.isFull());
        System.out.println("q2 is full: " + q2.isFull());

        q1.pop();
        q1.pop();
        int q1element=q1.pop();

        System.out.println("q1's last element: " + q1element);
        System.out.println("q1 is empty: " + q1.isEmpty());
        System.out.println("q2 is empty: " + q2.isEmpty());

        q2.pop();
        q2.pop();
        String q2element = q2.pop();

        System.out.println("q2's last element: " + q2element);
        System.out.println("q1 is empty: " + q1.isEmpty());
        System.out.println("q2 is empty: " + q2.isEmpty());
        q2.pop();
        System.out.println("q2 is empty : " + q2.isEmpty());
        System.out.println(q2.isFull());
        q2.push("Lets hope it works");
        System.out.println(q2.isFull());
    }


}
