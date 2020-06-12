package melon2;

import java.util.Scanner;
public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input < 11) {
        	System.out.println(translateEng1(input));
        }else if(input>11&&input<20){
        	System.out.println(translateEng2(input));
        }else if(input>20&&input<30){
        	System.out.println(translateEng3(input));
        }else {
        	System.out.println(translateEng4(input));
        }
    }

    // 0~10の数値を英訳する変換するメソッド
    static String translateEng1(int n) {
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

    // 11~20の数値を英訳する変換するメソッド
    static String translateEng2(int n) {
    	String output =null;
    	if(n==11) output="eleven";
    	if(n==12) output="twelve";
    	if(n==13) output="thirteen";
    	if(n==14) output="fourteen";
    	if(n==15) output="fifteen";
    	if(n==16) output="sixteen";
    	if(n==17) output="seventeen";
    	if(n==18) output="eighteen";
    	if(n==19) output="nineteen";
    	return output;
    }

    // 21~30の数値を英訳する変換するメソッド
    static String translateEng3(int n) {
    	//String output=null;
    	if(n>20&&n<30) {
    		int a=n-20;
    		return "twenty-"+translateEng1(a);
    	}else if(n>30&&n<40) {
    		int a=n-30;
    		return "thirty-"+translateEng1(a);
    	}else if(n>40&&n<50) {
    		int a=n-40;
    		return "fourty-"+translateEng1(a);
    	}else if(n>50&&n<60) {
    		int a=n-40;
    		return "fifty-"+translateEng1(a);
    	}else if(n>60&&n<70) {
    		int a=n-40;
    		return "sixty-"+translateEng1(a);
    	}else if(n>70&&n<80) {
    		int a=n-40;
    		return "seventy-"+translateEng1(a);
    	}else if(n>80&&n<90) {
    		int a=n-40;
    		return "eighty-"+translateEng1(a);
    	}else if(n>80&&n<90) {
    		int a=n-40;
    		return "ninety-"+translateEng1(a);
    	}
    	return null;
    }

    static String translateEng4(int n) {
    	String output=null;
    	if(n==20) output="twenty";
    	if(n==30) output="thirty";
    	if(n==40) output="fourty";
    	if(n==50) output="fifty";
    	if(n==60) output="sixty";
    	if(n==70) output="seventy";
    	if(n==80) output="eighty";
    	if(n==90) output="ninety";
    	return output;
    }

}

