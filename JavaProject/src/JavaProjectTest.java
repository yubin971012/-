import java.util.Scanner;

public class JavaProjectTest {
	public static void main(String[] args){
		
	    JavaProject yeh =new JavaProject();
	    
	    yeh.setValue(0);
		Scanner sc=new Scanner(System.in);
		System.out.println("���̵��� �����Ͻÿ�");

		System.out.println("1.����\n");
		System.out.println("2.����\n");
		System.out.println("3.�����\n");
		
		Scanner input = new Scanner(System.in);
		int levelel = input.nextInt();
		
		switch(levelel){
		case 1:
			yeh.normal(yeh.getValue());
			break;
		case 2:
			yeh.normal(yeh.getValue());
			break;
		case 3:
			yeh.hard(yeh.getValue());
			break;
		}
		input.close();
		
		System.out.print(yeh.getValue());
	}
	

}
