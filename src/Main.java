import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortList = new ArrayList<>();
       for(int num : intList){
            if(num  > 0 && num %  2 == 0){
                sortList.add(num);
            }
        } Collections.sort(sortList);
       for (int  num : sortList){
           System.out.println(num + " ");
       }
    }
}
