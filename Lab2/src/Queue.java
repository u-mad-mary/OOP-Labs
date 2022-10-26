import java.util.ArrayList;


public class Queue<T>
{
    private boolean hasParameter;
    private ArrayList<T> queue;

    public Queue()
    {
        queue = new ArrayList<>();
        this.hasParameter = false;
    }

    public Queue(int n)
    {
        queue = new ArrayList<>(n);
        this.hasParameter = true;
    }

    public void push(T value)
    {
        if (isFull() == "This queue is  full")
        {
            System.out.println("Queue is full");
        }
        else
        {
            queue.add(value);
        }
    }

    public T pop()
    {
        T lastElement;
        lastElement = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return lastElement;
    }

    public boolean isEmpty()
    {
        if (queue.size() == 0)
        {
            return true;
        }
        return false;
    }

    public int getNumberOfElements(){
        int count =0;
        for(int i=0; i<queue.size(); i++){
            queue.get(i);
            count++;
        }
        return  count;
    }

    public String isFull()
    {
        if (hasParameter = false)
        {
            return "This queue is never full";
        }
        else if(isEmpty() == true)
        {
            return "This queue has no elements in it";
        }else{
            if(getNumberOfElements() == queue.size()){
                return "This queue is Full";
            }
        }
        return "Something went wrong";

    }

    @Override public String toString()
    {
        return "Queue " + queue;
    }
}