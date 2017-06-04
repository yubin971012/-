
import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;

public class JavaProject {
	protected int value;
	
	public int getValue(){
		return value;
	}
	public void setValue(int v){
		value=v;	
	}
	
	public void easy(int v) {
		
		Scanner inputt = new Scanner(System.in);
		
		Random random1 = new Random();
		int rNum1 = (random1.nextInt(99)+1);
		int rNum2 = (random1.nextInt(99)+1);
		
		System.out.println(rNum1+"+"+rNum2+"=");
		
		int result = rNum1 + rNum2;
		int inputNum=inputt.nextInt();
		
		if(inputNum==result){
			value=v+100;
		}else if(inputNum!=result){
			value=v;
		}
		
	}
	
	public void normal(int v){
		Scanner inputt = new Scanner(System.in);
		
		Random random1 = new Random();
		int rNum1 = (random1.nextInt(300)+1);
		int rNum2 = (random1.nextInt(300)+1);
		
		System.out.println(rNum1+"+"+rNum2+"=");
		
		int result = rNum1 + rNum2;
		int inputNum=inputt.nextInt();
		
		if(inputNum==result){
			value=v+100;
		}else if(inputNum!=result){
			value=v;
		}
		
	}
	
	public void hard(int v){
	Scanner inputt = new Scanner(System.in);
		
		Random random1 = new Random();
		int rNum1 = (random1.nextInt(20)+1);
		int rNum2 = (random1.nextInt(20)+1);
		
		System.out.println(rNum1+"*"+rNum2+"=");
		
		int result = rNum1 * rNum2;
		int inputNum=inputt.nextInt();
		
		if(inputNum==result){
			value=v+100;
		}else if(inputNum!=result){
			value=v;
		}
	}
	
}