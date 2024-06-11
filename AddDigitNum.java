package practice24_05_2024;

import java.util.Scanner;

public class AddDigitNum {

	public static void main(String[] args) {

		int num,rem,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		while(num>0)
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		System.out.println(sum);

	}

}
