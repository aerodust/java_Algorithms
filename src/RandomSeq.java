public class RandomSeq {
    public static void main(String[] args) {
        // lo, hi) 범위에서 랜덤하게 N개의 숫자를 출력한다.
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++){
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
// 외부에서 라이브러리를 가져왔기에, 로컬 터미널에서 컴파일시 에러가 발생한다. 이에 따라 반드시 이것을 설치하기를 권한다. https://lift.cs.princeton.edu/java/mac/