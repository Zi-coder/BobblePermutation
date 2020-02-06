import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    static void printPermutation(List<String []> list){
        int size = list.size();
        int next = 0;
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
    public static void main(String[] anil) {
       
        String csvFile = anil[0];
        String lineSep  = "";
        String csvSplit = ",";
        List<String[]> mainList = new ArrayList<String[]>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((lineSep = br.readLine()) != null) {

                // use comma as separator
                String temp[] = lineSep.split(csvSplit);
                for(int i =0;i < temp.length ;i++){
                    temp[i] = Character.toString(temp[i].charAt(1));
                }
                mainList.add(temp);
            }
            printPermutation(mainList);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}