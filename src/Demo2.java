import java.util.Random;
import java.util.Scanner;

public class Demo2 {// ��������main�ķ����� ����main Alt+?
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������һ������");
		int num1=scanner.nextInt();
		System.out.println("������ڶ������֣��ڶ�����������ڵ�һ������");
		int num2=scanner.nextInt();
		
		int rand=new Random().nextInt(num2-num1)+num1;
		System.out.println(rand);
		//[num1,num2)2
		//nextInt(num2-num1)+num1
		
		System.out.println("��������µ�����");
		int aim=scanner.nextInt();
		
		if(aim==rand)
			System.out.println("OK");
		else if(aim>rand)
			System.out.println("��µĴ���");
		else 
			System.out.println("��µ�С��");
	}
}
