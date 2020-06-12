package melon2;

import java.util.Scanner;
public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input < 11) {
        	System.out.println(translateEng1(input));
        }else if(input>10&&input<20){
        	System.out.println(translateEng2(input));
        }else if(input>19&&input<101){
        	System.out.println(translateEng3(input));
        }else if(input>99&&input<1001){
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
    	String output=null;
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
    		int a=n-50;
    		return "fifty-"+translateEng1(a);
    	}else if(n>60&&n<70) {
    		int a=n-60;
    		return "sixty-"+translateEng1(a);
    	}else if(n>70&&n<80) {
    		int a=n-70;
    		return "seventy-"+translateEng1(a);
    	}else if(n>80&&n<90) {
    		int a=n-80;
    		return "eighty-"+translateEng1(a);
    	}else if(n>90&&n<100) {
    		int a=n-90;
    		return "ninety-"+translateEng1(a);
    	}
    	if(n==20) output="twenty";
    	if(n==30) output="thirty";
    	if(n==40) output="fourty";
    	if(n==50) output="fifty";
    	if(n==60) output="sixty";
    	if(n==70) output="seventy";
    	if(n==80) output="eighty";
    	if(n==90) output="ninety";
    	if(n==100) output="one-hundred";
    	return output;
    	//return null;
    }
    //100以上の時
    static String translateEng4(int n) {
    	String output =null;
    	if(n>100&&n<200) {
    		int a=n-100;
    	if(a<11) {
    		return "one-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "one-hundred-"+translateEng2(a);
    	}else {
    		return "one-hundred-"+translateEng3(a);
    	}
    	}
    	if(n>200&&n<300) {
    		int a=n-200;
    	if(a<11) {
    		return "two-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "two-hundred-"+translateEng2(a);
    	}else {
    		return "two-hundred-"+translateEng3(a);
    	}
    	}
    	if(n>300&&n<400) {
    		int a=n-300;
    	if(a<11) {
    		return "three-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "three-hundred-"+translateEng2(a);
    	}else {
    		return "three-hundred-"+translateEng3(a);
    	}
    	}
    	if(n>400&&n<500) {
    		int a=n-400;
    	if(a<11) {
    		return "four-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "four-hundred-"+translateEng2(a);
    	}else {
    		return "four-hundred-"+translateEng3(a);
    	}
    	}
    	if(n>500&&n<600) {
    		int a=n-500;
    	if(a<11) {
    		return "five-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "five-hundred-"+translateEng2(a);
    	}else {
    		return "five-hundred-"+translateEng3(a);
    	}
    	}
    	if(n>600&&n<700) {
    		int a=n-600;
    	if(a<11) {
    		return "six-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "six-hundred-"+translateEng2(a);
    	}else {
    		return "six-hundred-"+translateEng3(a);
    	}
    	}
    	if(n>700&&n<800) {
    		int a=n-700;
    	if(a<11) {
    		return "seven-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "seven-hundred-"+translateEng2(a);
    	}else {
    		return "seven-hundred-"+translateEng3(a);
    	}
    	}
    	if(n>800&&n<900) {
    		int a=n-800;
    	if(a<11) {
    		return "eight-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "eight-hundred-"+translateEng2(a);
    	}else {
    		return "eight-hundred-"+translateEng3(a);
    	}
    	}
    	if(n>900&&n<1000) {
    		int a=n-900;
    	if(a<11) {
    		return "nine-hundred-"+translateEng1(a);
    	}else if(a>11&&a<20) {
    	return "nine-hundred-"+translateEng2(a);
    	}else {
    		return "nine-hundred-"+translateEng3(a);
    	}
    	}
    	if(n==200) output="two-hundred";
    	if(n==300) output="three-hundred";
    	if(n==400) output="four-hundred";
    	if(n==500) output="five-hundred";
    	if(n==600) output="six-hundred";
    	if(n==700) output="seven-hundred";
    	if(n==800) output="eight-hundred";
    	if(n==900) output="nine-hundred";
    	if(n==1000) output="one-thousand";
    	return output;
    }
}

