public class prob113 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a==b && b==c && a==c){
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }
}
