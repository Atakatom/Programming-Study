// link of the problem https://www.hackerrank.com/challenges/one-week-preparation-kit-queue-using-two-stacks/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-five&h_r=next-challenge&h_v=zen

import java.io.*;
import java.util.*;

public class Solution {
    public static Stack<Integer> mainStack = new Stack<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; i++){
            int command = input.nextInt();
            switch(command){
                case 1:
                    enqueue(input.nextInt());
                    break;
                case 2:
                    if(mainStack.size()>0)
                        mainStack.pop();
                    // dequeue();
                    break;
                case 3:
                    System.out.println(mainStack.peek());
                    break;
            }
            if(input.hasNext())
                input.nextLine(); 
            // System.out.println(mainStack.toString()); 
        }
        input.close();
    }
    private static void enqueue(int num){
        if(mainStack.size()==0)
            mainStack.push(num);
        else {
            Stack<Integer> dummyStack = new Stack<>();
            int n = mainStack.size();
            for(int i = 0; i < n; i++){
                dummyStack.push(mainStack.pop());
            }
            dummyStack.push(num);
            for(int i = 0; i <= n; i++){
                mainStack.push(dummyStack.pop());
            }
        }
    }
    
    // private static void dequeue(){
    //     if(mainStack.size()==0)
    //         System.out.println("The stack is already empty!");
    //     else if(mainStack.size()==1)
    //         mainStack.pop();
    //     else {
    //         Stack<Integer> dummyStack = new Stack<>();
    //         int n = mainStack.size();
    //         for(int i = 0; i < n; i++){
    //             dummyStack.push(mainStack.pop());
    //         }
    //         dummyStack.pop();
    //         for(int i = 0; i < n-1; i++){
    //             mainStack.push(dummyStack.pop());
    //         }
    //     }
    // }
}
