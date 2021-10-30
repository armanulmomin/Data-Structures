/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class Circular_Array {
    public static void main(String[]args)
    {
    int []array=new int[8];
    array[0]=15;
    array[1]=-4;
    array[2]=17;
    array[5]=5;
    array[6]=7;
    array[7]=9;
    Linearizing_a_circular_array(array,5,6,8);
    Resizing_a_circular_array(array,5,6,10);
    inserting_an_element_in_a_cicular_array(array,5,6,13,3);
    removing_an_element_in_a_cicular_array(array,5,7,15,3);
    }

    public static void Linearizing_a_circular_array(int[] source, int start, int size, int capacity) {
       System.out.println("Linearizing a circular array : ");
       int [] temp=new int[size];
       int k=start;
       for(int i=0;i<size;i++)
       {
           temp[i]=source[k];
           k=(k+1)%source.length;
       }
        System.out.println(Arrays.toString(temp));
        System.out.println("");
    }

    private static void Resizing_a_circular_array(int[] source, int start, int size, int newcap) {
       System.out.println("Resizing a circular array : "); 
       int [] temp=new int[newcap];
       int k=start;
       for(int i=0;i<size;i++)
       {
           temp[i]=source[k];
           k=(k+1)%source.length;
       }
        System.out.println(Arrays.toString(temp));
        System.out.println("");
    }

    private static void inserting_an_element_in_a_cicular_array(int[] source, int start, int size, int elem, int pos) {
     System.out.println("inserting an element in a cicular array : "); 
        int [] temp= source.clone();
        if(size==source.length)
     {
         System.out.println("please resize array.");
     }
     else
     {
         int nshifts=size-pos;
         int from=(start+size-1)%source.length;
         int to=(from+1)%source.length;
         for(int i=0;i<nshifts;i++)
         {
             temp[to]=temp[from];
             to=from;
             from=from-1;
             if(from==-1)
             {
                 from=temp.length;
             }
         }
         int index=(start+pos)%temp.length;
         temp[index]=elem;
         System.out.println(Arrays.toString(temp));
         System.out.println("");
     }
    }

    private static void removing_an_element_in_a_cicular_array(int[] source, int start, int size, int element, int pos) {
        System.out.println("removing an element in a cicular array : ");
        int [] temp= source.clone();
        int index=(start+pos)%temp.length;
        int removed= temp[index];
        int nshifts=size-pos-1;
        int to=index;
        int from=(to+1)%temp.length;
        for(int i=0;i<nshifts;i++)
        {
            temp[to]=temp[from];
            to=from;
            from=(from+1)%temp.length;
        }
        temp[from]=0;
        System.out.println(Arrays.toString(temp));
         System.out.println("");
        
        
        
    }
  
   
    
}
