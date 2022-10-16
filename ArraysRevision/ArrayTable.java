package ArraysRevision;

/*A simple Java class to display the contents of an Array in a
table form using a for loop.*/

public class ArrayTable {
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        int testArray[]={32,12,18,54,2};

        for(int i=0;i<testArray.length;i++){
            System.out.println(i + "\t\t" + testArray[i]);
        }
    }
}
