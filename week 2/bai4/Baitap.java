package baitap;
//Nhập 1 số nguyên n, một số thực m, một xâu ký tự từ bàn phím và hiển thị giá trị vừa nhập ra màn hình.
import java.util.Scanner;

public class Baitap {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        float m = cin.nextFloat();
        cin.nextLine();
        String s = cin.nextLine();
        System.out.println("Số n = " + n);
        System.out.println("Số m = " + m);
        System.out.println("chuỗi s  = " + s);
    }
    
}
