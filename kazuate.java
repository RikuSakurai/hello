import java.util.Scanner;
import java.util.Random;

class kazuate{
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        Random rand = new Random();

        int answer= rand.nextInt(90) + 10;

        for(int turn=1;turn<6;turn++){

            System.out.println("Turn" + turn + "");
            System.out.println("2桁の数値を入力:");
            int num = scanner.nextInt();

            
            if(num==answer){
                System.out.println("当たり\n");
                turn=6;
            }
            if(num<answer){
                if(answer-num>=20){
                    System.out.println("答えはその数値より20以上大きいです\n");
                }
                else{
                    System.out.println("答えはその数値より大きいです\n");
                }
            }
            if(num>answer){
                if(answer-num>=20){
                    System.out.println("答えはその数値より20以上小さいです\n");
                }
                else{
                    System.out.println("答えはその数値より小さいです\n");
                }
            }

        }
        System.out.println("終了、答えは" + answer + "です");
    }
}