package Day_2;
import java.util.*;
public class Collections_Queue {
    public static void main(String[] args){
        Queue<String> queue=new LinkedList<String>();
        queue.add("tomato");
        queue.add("potato");
        queue.add("chilli");
        queue.add("cabbage");

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }
}
