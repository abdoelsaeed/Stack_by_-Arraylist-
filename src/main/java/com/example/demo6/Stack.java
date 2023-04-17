package com.example.demo6;

import java.nio.channels.Pipe;
import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> arrayList=new ArrayList<>();

    public int find(int value)
    {
      return arrayList.indexOf(value);
    }

    public boolean insert(Integer value)
    {

           arrayList.add(value);
            System.out.println("OK");
        return true;
    }


    public void delete(int value){
        if(arrayList.isEmpty())
            System.out.println("the array is empty");


        else
        {
int  index=  arrayList.indexOf(value);
arrayList.remove(index);
        }

            System.out.println("Done");
        }



    public String display(){
        String number="";
for (Integer value : arrayList){
    number+=""+value+"\n";
}
        return number;
    }

}
