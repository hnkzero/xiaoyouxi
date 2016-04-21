import java.util.Random;
import java.util.Scanner;


public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1=scanner.nextInt();
		System.out.println("请输入第二个数字，第二个数字须大于第一个数字");
		int num2=scanner.nextInt();
		
		int rand=new Random().nextInt(num2-num1)+num1;
		System.out.println(rand);
		
		System.out.println("请输入你猜的数字");
		int aim=scanner.nextInt();
		
		while(true){
			if (aim==rand){
			System.out.println("OK");
			break;
		}else if(aim>rand){
			System.out.println("你猜大了");
		}else {
			System.out.println("你猜小了");
		}
			System.out.println("请输入你猜的数字");
			aim=scanner.nextInt();
		}
		
			
		
	}

}
