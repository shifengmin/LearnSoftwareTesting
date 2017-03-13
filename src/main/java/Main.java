/**
 * Created by sfm on 17-3-10.
 */


import java.util.Scanner;

public class Main {
    public  String judgeTriangleType(int a,int b,int c){
        if(a+b<=c||a+c<=b||b+c<=a||a<=0||b<=0||c<=0){
            return "NotATriangle";
        } else if (a == b && a == c && b == c) {
            return "equilateral";
        } else if (a == b || a == c || b == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}

