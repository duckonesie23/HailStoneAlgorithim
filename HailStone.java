import java.util.*;
public class HailStone{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        hailStoneAlg(number);
        for(int i = 1; i<=200;i++){
            hailStoneAlg(i);
        }
    }
    public static void hailStoneAlg(int num){
        System.out.print(num + " ");
        if (num == 1){
            System.out.println("Done");
        }else if(num%2 == 0){
            hailStoneAlg(num/2);
        }else{
            hailStoneAlg((num*3)+1);
        }
    }
}