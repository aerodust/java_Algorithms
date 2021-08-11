import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a){
        // 배열 a는 이미 정렬된 상태여야 한다.
        int lo = 0;
        int hi = a.length - 1;
        while (lo<=hi){
            // 키가 a[lo..hi]에 있거나 존재하지 않는다.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1; /* Return -1 means nothing in java. It is just returning a int value.*/
    }

    public static void main(String[] args) {
        // In은 외부 라이브러리에서 가져온 클래스입니다. https://introcs.cs.princeton.edu/java/stdlib/
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()){
            // R키를 읽어서 whitelist에 없으면 출력한다.
            int key = StdIn.readInt();
            if (rank(key, whitelist)==-1){
                StdOut.println(key);
            }
        }
    }
}
