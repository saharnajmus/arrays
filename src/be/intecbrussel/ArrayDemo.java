package be.intecbrussel;

import java.util.Arrays;

public class ArrayDemo {
    //hoofdstuck 7 Opdracht 1
    public static void main(String[] args) {
        int[] myArray = new int[20];
        for(int i = 0;i< myArray.length;i++){
            myArray[i] = 7*i;
        }
        System.out.println(Arrays.toString(myArray));
        /*for(int myNumber:myArray){
            System.out.println(myNumber);//enhance for loop.
        }*/
        for(int i = 19;i>=0;i--){
            System.out.println(myArray[i]);
        }
        //Opdracht1 part 4
boolean[] boolArray = {true,false,true,true};
       for(int i = 0;i< boolArray.length;i++){
           System.out.println(boolArray[i]);
        }




    }
}
