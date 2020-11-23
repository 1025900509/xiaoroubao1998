package Sjs;

import java.util.Scanner;

public class AOP {
    public static void main(String[] args) throws InterruptedException {
            while (true) {
            Thread.sleep(1500);
            int z = (int) (Math.random()*100%100);
            int f = (int) (Math.random()*100%100);
            System.out.println("生成的随机坐标为"+z+","+f);
    }}}
