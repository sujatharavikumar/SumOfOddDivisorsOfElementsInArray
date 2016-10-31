package Ravikumar.Sujatha.SumOfOddDivisors;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sujatharavikumar on 10/24/16.
 */
public class HackerRank2 {

    static long countSum(int[] numbers) {
        int sum = 0;
        int total = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<numbers.length; i++){
                for (int j=1; j<=numbers[i]; j++){
                    if((numbers[i]%j == 0) && ((j%2 != 0))){
                        sum+= j;
                    }
                }
                list.add(sum);
                sum = 0;
        }
        for( int num : list){
            total += num;
        }
        return total;
    }


    public static void main(String[] args) {
        int[] num = {21,11,7};
        long total = countSum(num);
        System.out.println(total);
    }

}
