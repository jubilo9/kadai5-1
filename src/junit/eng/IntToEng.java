package junit.eng;
import java.util.Scanner;

public class IntToEng {


	    // ���C�����\�b�h
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    // ���l���p�󂷂�ϊ����郁�\�b�h
	    static String translateEng(int n) {
	    	String []eng1={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twenteen","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen"};
	    	String []eng2={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	    	return eng1[n]+" ";
	    }
	}


