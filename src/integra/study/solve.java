package integra.study;
import java.util.Scanner;
public class solve {
    public static void main(String[] args) {
        /* 연습문제 */
        //1.1.2
        //System.out.println((1+2+"3").getClass().getName()); //데이터 타입 조회
        //1.1.3
        /*
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a==b && b==c && a==c){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        %javac-introcs prob113.java
        % java-introcs prob113 20 20 20
        equal

        */
        // 1.1.5
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        if ((x>=0 && x<=1) && (y<=1&&y>=0)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        /*
        ~/Desktop/java_Algorithms/src/integra/study> java solve.java 0.7 0.8
        : true
        */
    }
}
