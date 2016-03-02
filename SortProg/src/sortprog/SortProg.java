package sortprog;

import java.util.Arrays;
import java.util.Scanner;
 
/**
 * @author fredrick oluoch
 */
 
public class SortProg {
 
	public static void main(String[] args) {
 
        //int arrayList[] = { 6,5,4,3,2,1 };
        Scanner input = new Scanner(System.in);
        int[]arrayList = new int[6];
        
        for (int i = 0; i < arrayList.length; i++)
    {
        System.out.println("Please enter random number between 1 to 6");
        arrayList[i] = input.nextInt();
    }
        System.out.println("");
        System.out.println("\nFinal result:"+Arrays.toString(BubbleSortAsceMethod(arrayList)));
	}
 
    public static int[] BubbleSortAsceMethod(int[] arr){
        int temp;
        for(int i=0; i < arr.length-1; i++){
 
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
        }
        return arr;
    }
}