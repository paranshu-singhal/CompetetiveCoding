import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
        int n = Integer.parseInt(scanner.nextLine().split(" ")[0]);

        List<Integer> A = new ArrayList<Integer>();

        String[] str = scanner.nextLine().split(" ");

        for(int i=0;i<n;i++){
            A.add(Integer.parseInt(str[i]));
        }
        scanner.close();
        bubble_sort(A,n);
        selection_sort(A,n);
        insertion_sort(A,n);
        merge_sort(A,0,n);
    }

    public static void bubble_sort(List<Integer> A, int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(A.get(j)>A.get(j+1)){
                    Collections.swap(A, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(A.toArray()));
    }

    public static void selection_sort(List<Integer> A, int n){

        for(int i=0;i<n;i++){
            int iMin = i;
            for(int j=i+1;j<n;j++){
                if(A.get(iMin) > A.get(j)){
                    iMin = i;
                }
            }
            Collections.swap(A, iMin, i);
        }
        System.out.println(Arrays.toString(A.toArray()));
    }

    public static void insertion_sort(List<Integer> A, int n){

        for(int i=1;i<n;i++){
            int curr = A.get(i);
            int j=i;
            while(j>0 && A.get(j-1)>curr){
                A.set(j,A.get(j-1));
                j--;
            }
            A.set(j,curr);
        }
        System.out.println(Arrays.toString(A.toArray()));
    }

    public static void merge_sort(List<Integer> A, int start, int end){
        if(end>start){
            int middle = (end+start)/2;
            merge_sort(A,start,middle);
            merge_sort(A,middle+1,end);
            merge(A,start,middle,end);
        }
        System.out.println(Arrays.toString(A.toArray()));
    }

    public static void merge(List<Integer> A, int start, int middle, int end){

        int n1 = middle-start+1;
        int n2 = end-middle;

        int[] array1 = new int[n1];
        int[] array2 = new int[n2];

        for(int i=0;i<n1;i++) array1[i] = A.get(start+i);
        for(int i=0;i<n2;i++) array2[i] = A.get(middle+i+1);

        int i = 0, j = 0; 
        int k = start; 

        while (i < n1 && j < n2) 
        { 
            if (array1[i] <= array2[j]) {
                A.set(k,array1[i]);
                i++; 
            } else { 
                A.set(k,array2[j]);
                j++; 
            } 
            k++; 
        } 

        while (i < n1) { 
            A.set(k, array1[i]);
            i++;  k++; 
        } 

        while (j < n2) { 
            A.set(k, array2[j]);
            j++; k++; 
        }

    }

}