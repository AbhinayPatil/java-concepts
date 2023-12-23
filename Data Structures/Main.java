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

    //*******************************************HashMap*******************************************
    public static void hashMapExample(){
        //initialize;
        HashMap<String,Integer> map = new HashMap<>();

        //ad element
        map.put("A",1);

        //check an key and object
        map.containsKey("whaterver u wnt to search");//returns boolean
        map.containsValue(1);//returns boolean

        //get a value
        map.get("whatever u want");//returns value

        //iterator for map
        Iterator<String> itt = map.keySet().iterator();
        while(itt.hasNext()){
            String key = itt.next();
            //use this key eventually to access each value;
        }
    }
    


    public static void main(String[] args) {
        //main method
    }
}

//*******************************************CUSTOM COMPARATOR*******************************************

//I am using this class to store objects in my desired form so that i can compare them
class MyComparison{
    int first;
    int second;
    int third;
    MyComparison(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
//u can compare two variable using lamba expression, but if u have 3 variabels in comparison operation
//then u need to implement comparator class
 class ComparatorExample implements Comparator<MyComparison>{
    @Override
    public int compare(MyComparison o1, MyComparison o2) {
        //if u want to swap elements then return 1, if not return -1;
        if(o1.second<o2.second)
            return -1;
        else if(o1.second>o2.second)
            return 1;
        else if(o1.third<o2.third)
            return -1;
        else return 1;
    }

    //use it int main class by caking an object of comparator class ans sorting the list based ont that comparator
    //example
    //ComparatorExample ce = new ComparatorExample<>();
    //Collections.sort(arr,ce);
 }