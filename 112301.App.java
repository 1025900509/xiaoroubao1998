package Sjs;

import java.util.Scanner;

public class AOP {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
            System.out.println("请输入一个数字");
            while (true) {
            int a = scann.nextInt();
            int z = (int) (Math.random() * a*100%10);
            int f = (int) (Math.random() * a*100%10);
            System.out.println("生成的随机坐标为"+z+","+f);
        }
    }
}
