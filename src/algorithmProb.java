import java.sql.SQLOutput;

public class algorithmProb {
    public static void main(String[] args) {
        /*


        //a
        double t = 0.9;
        while (Math.abs(t-9.0/t) > .001){
            t = (9.0/t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
        // 3.00030
        //b
        int sum = 0;
        for(int i = 1; i < 1000; i++)
            for(int j = 0; j < i; j++)
                sum ++;
        StdOut.println(sum);
        //499500
        int sum1 = 0;
        for (int i = 1; i<1000; i++)
            for(int j = 0; j<1000; j++)
                sum1++;
        StdOut.println(sum1);
        //999000
                */
        /*
        int N = Integer.parseInt(args[0]);
        System.out.println(Integer.toBinaryString(N));
         */
        /*
        boolean[][] a = new boolean[2][3];
            for(int i = 0; i<2; i++ )
                for(int j=0;j<3;j++)
                    a[i][j] = false;
        a[1][2] = true;
        for(int i = 0; i<2; i++)
            for(int j =0; j<3; j++)
                if(a[i][j] == true){
                    System.out.printf("row : %d, col : %d, value = *\n ",i,j);
                } else {
                    System.out.printf("row : %d, col : %d, value =  \n ",i,j);
                }
        /*
        ~/Desktop/java_Algorithms/src> javac-introcs algorithmProb.java
        ~/Desktop/java_Algorithms/src> java-introcs algorithmProb 21
        row : 0, col : 0, value =
        row : 0, col : 1, value =
        row : 0, col : 2, value =
        row : 1, col : 0, value =
        row : 1, col : 1, value =
        row : 1, col : 2, value = *
         */
        /*
        int[] a= new int[10];
        for (int i =0; i<10; i++)
            a[i] = 9-i;
        for (int i = 0; i <10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i<10; i++)
            System.out.println(a[i]);
        //result : 0123443210 , 반복문 실행 중 기존 어레이 값이 변경되어 이런 출력 양상을 보임
         */
        //2차원 배열 회전 알고리즘(pi/2), 정방행렬 기준
        /*
        int M = Integer.parseInt(args[0]);
        int[][] a = new int[M][M];
        int k = 0;
        for (int i = 0; i < M; i++)
            for(int j = 0; j<M; j++){
                a[i][j] = k;
                k++;
            }
        for (int i = 0; i < M; i++)
            for(int j = 0; j<M; j++)
                System.out.println(a[i][j]);
        int[][] b = new int[M][M];
        for (int i = 0; i < M; i++)
            for(int j = 0; j<M; j++)
                b[j][M-i-1] = a[i][j];
        for (int i = 0; i < M; i++)
            for(int j = 0; j<M; j++)
                System.out.println(b[i][j]);
        //result
        //~/Desktop/java_Algorithms/src> javac-introcs algorithmProb.java
        //~/Desktop/java_Algorithms/src> java-introcs algorithmProb 2
        //0
        //1
        //2
        //3
        //2
        //0
        //3
        //1
        //~/Desktop/java_Algorithms/src> java-introcs algorithmProb 3
        //0
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //6
        //3
        //0
        //7
        //4
        //1
        //8
        //5
        //2

         */
        // Math class 사용하지않고 로그2 함수 결과값보다 작은 정수 확인 구현
        int N = Integer.parseInt(args[0]);
        int div = 0;
        while (N/2 != 0){
            N = N/2;
            System.out.println(N);
            div++;
        }
        //System.out.println(1/2);
        System.out.println(div);
    }
}
