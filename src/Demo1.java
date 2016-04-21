import java.util.Random;
import java.util.Scanner;

public class Demo1 {// 快速输入main的方法： 输入main Alt+?
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1=scanner.nextInt();
		System.out.println("请输入第二个数字，第二个数字需大于第一个数字");
		int num2=scanner.nextInt();
		
		int rand=new Random().nextInt(num2-num1)+num1;
		System.out.println(rand);
		//[num1,num2)2
		//nextInt(num2-num1)+num1
		
		System.out.println("请输入你猜的数字");
		int aim=scanner.nextInt();
		
		while(true){//循环
			if(aim==rand){
				System.out.println("OK");
				break;//如果aim=rand则退出程序
			}else if(aim>rand){
				System.out.println("你猜的大了");
			}else {
				System.out.println("你猜的小了");
			}
			System.out.println("请输入你猜的数字");
			aim=scanner.nextInt();
			
		}
		
	}
}
