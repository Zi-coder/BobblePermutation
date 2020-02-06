import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    //Function to print the permutations
    static void printPermutation(List<String []> list){
        //lenght of main list
        int size = list.size();
        int next = 0;
        //index array equal to size to keep track of lists
        int indexs[] = new int[size];

        for(int i = 0;i < size;i++){
            while(true){
                for(int j =0;j < size;j++){
                    System.out.print(list.get(j)[indexs[j]]);
                }
                System.out.print(", ");

                next = size- 1;
                while(next >= 0 && (indexs[next] + 1 >= list.get(next).length))
                next--;
                if(next < 0)
                return;

                indexs[next]++;
                for(int k = next+1;k < size ;k++){
                    indexs[k] = 0;
                }
            }
        }
        
    }
    //Driver function
    public static void main(String[] args) {
       
        //Argument from command line
        String csvFile = args[0];
        String lineSep  = "";
        String csvSplit = ",";

        //List to keep arrays of Strings
        List<String[]> mainList = new ArrayList<String[]>();


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            //linesep is a single line from csv
            while ((lineSep = br.readLine()) != null) {

                // use comma as separator ,returns String array
                String temp[] = lineSep.split(csvSplit);

                //Loop to remove ' ' around chars
                for(int i =0;i < temp.length ;i++){
                    temp[i] = Character.toString(temp[i].charAt(1));
                }
                //Adding to main list
                mainList.add(temp);
            }
            //calling function 
            printPermutation(mainList);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}