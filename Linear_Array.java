/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Linear_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1.Creating an Array :");
        int []array={10,20,30,40,50,60};
        System.out.println(Arrays.toString(array));
        System.out.println("");
        
        System.out.println("2.Iterating over the elements of an array :");
        System.out.println(Arrays.toString(array));
        System.out.println("");
        
        System.out.println("3.Copying an array :");
        int []temp=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            temp[i]=array[i];
        }
        System.out.println(Arrays.toString(temp));
        System.out.println("");
        
       System.out.println("4.Resizing an array :"); 
       int []temp2=new int[7];
       for(int i=0;i<array.length;i++)
        {
            temp2[i]=temp[i];
        }
       System.out.println(Arrays.toString(temp2));
       System.out.println("");
       
       System.out.println("4.Reversing an array :");
       int i=0;
       int j=temp.length-1;
       while(i<j)
       {
           int value=temp[i];
           temp[i]=temp[j];
           temp[j]= value;
           i++;
           j--;
       }
       System.out.println(Arrays.toString(temp));
       System.out.println("");
       
       Shift_left(array,2);
       Shift_right(array,2);
       insert_element(array,6,100,2);
       Rotate_left(array,3);
       Rotate_right(array,3);
       
       
       
    }
    public static void Shift_left(int []source,int a)
    {
        System.out.println("5.Shifting an array left by k position");
        /*
        int [] temp= source.clone();
        for(int i=1;i<temp.length;i++)
        {
            temp[i-1]=temp[i];
            
        }
        temp[temp.length-1]=0;
        System.out.println(Arrays.toString(temp));
        */
        int [] temp= source.clone();
        int k=a;
        int j=0;
        for(int i=k;i<temp.length;i++)
        {
            temp[j]=temp[i];
            j++;
            
            
        }
        
       for(int i=0;i<k;i++)
       {
            temp[j]=0;
            j++;
       }

        System.out.println(Arrays.toString(temp));
        System.out.println("");
    }

    public static void Shift_right(int[] source, int a) {
        System.out.println("6.Shifting an array right by k position");
       int [] temp= source.clone();
       int [] temp2= source.clone();
       int k=a;
      /* for(int i=temp.length-1;i>0;i--)
       {
           temp[i]=temp[i-1];
           
       }
       temp[0]=0;
       System.out.println(Arrays.toString(temp));
       */
      for(int i=k;i<temp.length;i++)
       {
           temp[i]=temp2[i-k];
           
       }
      for(int i = 0 ; i<k ; i++)
      {
           temp[i] = 0;
      }
      System.out.println(Arrays.toString(temp));
      System.out.println("");
    }
    public static void insert_element(int [] source, int size, int elem, int index)
            
    {
        
        System.out.println("7. Inserting an element into an array : ");
        int [] temp= source.clone();
        int [] temp2=new int[7];
       for(int i=0;i<temp2.length-1;i++)
       {
           temp2[i]=temp[i];
       }
    
        if(size>temp2.length-1){
       System.out.println("No Space left");
    }
    else if(index>temp2.length-1){
      System.out.println("Invalid Index");
    }
    else if (size<temp2.length){
      
      System.out.println("Number of elements after insertaion: "+(size+1));
      for(int i = size-1 ; i>=index ; i--){
        temp2[size] = temp2[i];
        size--;
      }
      temp2[index] = elem;
    
    }
     System.out.println(Arrays.toString(temp2));   
    }

    public static void Rotate_left(int[] source, int a) {
        System.out.println("8. Rotating an array left : ");
        int [] temp= source.clone();
        int [] temp2= source.clone();
        int k=a;
        int j=0;
        for(int i=k;i<temp.length;i++)
        {
            temp[j]=temp[i];
            j++;
            
            
        }
         j=0;
        
       for(int i = k ; i<source.length ; i++){
       temp[i] = temp2[j];
       j++;
    }

        System.out.println(Arrays.toString(temp));
        System.out.println("");
    }

    public static void Rotate_right(int[] source, int a) {
        System.out.println("8. Rotating an array right : ");
        int [] temp= source.clone();
       int [] temp2= source.clone();
       int k=a;
       for(int i=k;i<temp.length;i++)
       {
           temp[i]=temp[i-k];
           
       }
       int j=k;
      for(int i = 0 ; i<k ; i++)
      {
           temp[i] = temp2[j];
           j++;
      }
      System.out.println(Arrays.toString(temp));
      System.out.println("");
       
    }
    
}
