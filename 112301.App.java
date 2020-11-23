package Sjs;

import java.util.Scanner;

public class AOP {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
            System.out.println("请输入数字1");
            while (true) {
            int a = scann.nextInt();
            int z = (int) (Math.random() * a*100%100);
            int f = (int) (Math.random() * a*100%100);
            if(a==1){
              System.out.println("生成的随机坐标为"+z+","+f);
            }else{
                System.out.println("请输入数字1");
                }

        }
    }
}
