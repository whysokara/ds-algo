import java.util.Arrays;

public class sumProductDiff {
    public static void main(String[] args) {
        System.out.println(sum(345));
    }

//    static int sumProdDiff(int nums){
//        int diff = sum() - diff();
//    }

    static int sum(int nums) {
        int sum = 0;
        while(nums != 0){
            sum = sum + nums % 10;
            nums = nums / 10;
        }
        return sum;
    }
    static int prod(int nums) {
        int prod = 0;
        while(nums != 0){
            prod = prod + prod % 10;
            nums = nums / 10;
        }
        return sum;
    }
}
