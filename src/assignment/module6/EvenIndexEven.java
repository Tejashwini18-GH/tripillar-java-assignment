package assignment.module6;

public class EvenIndexEven {
    public static void main(String[] args) {
        int[] arr = {3,6,12,1,5,8};
        int[] res = new int[arr.length];
        int even = 0, odd = 1;
        for(int num : arr){
            if(num % 2 == 0){
                res[even] = num;
                even += 2;
            } else {
                res[odd] = num;
                odd += 2;
            }
        }
        for(int i:res)
            System.out.print(i+" ");
    }
}
