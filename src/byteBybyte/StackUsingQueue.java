package byteBybyte;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<String> primary = new LinkedList<>() ;
    private Queue<String> secondary = new LinkedList<>();


    private void push(String elem){
        secondary.add(elem);

        while(!primary.isEmpty()){
            secondary.add(primary.remove());
        }

        Queue<String> temp = new LinkedList<>();
        primary = secondary;
        secondary = temp;
    }

    private String pop(){
        if (primary.isEmpty()) throw new IndexOutOfBoundsException();
        else return primary.remove();
    }


    public static void main(String args[]){
        System.out.println("Starting test!!!");
        StackUsingQueue sq = new StackUsingQueue();
        sq.push("1");
        sq.push("2");
        sq.push("3");

        System.out.println("Pop element : " + sq.pop());

    }
}


