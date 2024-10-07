import java.util.*;
public class HailStone2{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();
        int iterationNumber = 0;
        int highestNumber = 0;
        for(int i = 1; i<=200;i++){
            if(hailStoneAlg(i,0)>iterationNumber){
                iterationNumber=hailStoneAlg(i,0);
                highestNumber = i;
            }
            
        }
        System.out.println("Digit with most iterations "+highestNumber);
            System.out.println("Number of iterations: "+iterationNumber);
    }
    public static int hailStoneAlg(int num, int count){
        //System.out.print(num + " ");
        count +=1;
        if (num == 1){
            return count;
        }else if(num%2 == 0){
            return hailStoneAlg(num/2,count);
        }else{
            return hailStoneAlg((num*3)+1,count);
        }

    }
}