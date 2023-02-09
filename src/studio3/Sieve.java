package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Highest Value: ");
		int p = in.nextInt();

		boolean[] nums = new boolean [p+1];

		for(int i=0; i<nums.length; i++)
		{
			nums[i]=true;
		}
		nums[0]=false;
		nums[1]=false;

		for(int i=2; i<nums.length; i++)
		{
			for(int j=i*2; j<nums.length; j = j + i)
			{
				nums[j]= false;

			}

		}
		for(int i = 2; i<nums.length;i++) {
			if(nums[i]) {
				System.out.println(i);
			}

		}






	}

}
