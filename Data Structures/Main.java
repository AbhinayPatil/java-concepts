import java.util.*;


public class Main{

    //**************************************************ARRAYS*******************************************
    public static void ArrayExample(){
        int[] arr = {1,4,2,6,3,4,8,9,0};

        //sorting 1d array
        Arrays.sort(arr);
        //u can add second and third parameter as start index and end index
        Arrays.sort(arr,3,5);//last index excluded

        //sorting 2d array
        int[][] arr2 = {{1,2,3},{2,1,5}};
        Arrays.sort(arr2,(a,b)->Integer.compare(a[1],b[1]));
    }

    //************************************************ARRAYLIST*******************************************
    public static void ArrayListExample(){
        ArrayList<Integer> arrayList = new ArrayList<>();
    }

    //*******************************************STRINGS*******************************************
    public static void StringExample(){
        //sting to character array and back
        char[] arr = "String".toCharArray();
        String ans  = new String(arr);
    }


    //*******************************************INTEGER WRAPPER CLASS*******************************************
    public static void IntegerWrapperClassUsage(){
        //convert string to number(u can have 2nd and 3rd param for start and end index of string)
        int a = Integer.parseInt("123");

        //convert int to binary string
        String bin = Integer.toBinaryString(21);
    }

    public static void main(String[] args) {
    }
}