package melon2;

import java.util.Scanner;
public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String output=null;
    	if(n==0) output="zero";
    	if(n==1) output="one";
    	if(n==2) output="two";
    	if(n==3) output="three";
    	if(n==4) output="four";
    	if(n==5) output="five";
    	if(n==6) output="six";
    	if(n==7) output="seven";
    	if(n==8) output="eight";
    	if(n==9) output="nine";
    	if(n==10) output="ten";
        return output;
    }
}

