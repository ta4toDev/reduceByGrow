//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    public static int grow(int[] x){
        int i = x.length;
        System.out.println(i);
        int res = x[0];
        for (int y = 1; y < i; y++){
            res = res * x[y];
        }
        return res;

    }

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        System.out.println(grow(x));
    }



}