package kr.co.mlec.dp;

import java.util.Scanner;

//������ : Ÿ�� ä��� 
public class DP_2133 {
	public static void main(String[] args) {
		//3*N ũ���� ���� 2*1, 1*2 �� ä��� ��� �� ���� ���ϴ� ������
		// 3*N���� �������� �ü� �ִ� ����� ���� 
		// ũ�Ⱑ 4 �̸��� ���� 3���� ��찡 �ִ� ������ Ǯ�����Ŵ� �������� �ü� �ִ°� 2�����־��� 
		// ���α��̰� �޶��� ������ �� 2���� �����ָ������ �̹��� 3������ ���α��̰� �� �Ȱ��Ƽ� 
		// ���� ������� 3�� �����ָ�ȴ�.
		// ũ�Ⱑ 4�� �Ѿ��, ���̰� 2�� ����̸� ����� �ִ� ����Ǽ��� 2������ �þ�� (* 2)�� ���ش�
		// ũ�Ⱑ 4�� �Ѿ�� 4�� �ɵ��� -2 �����ָ鼭 ( * 2) �� ���ذ��� �����ָ� �ȴ�.
		//DP[I]=���α��̰� I�� ������ 2*1 ,1*2�� ä��� ����� ��
		//DP[I]= I�� 2���� �� * 3�� ���ְ�, 4�� �Ѿ��*2�� 
		//��ƴ� �𸣰ڴ�
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		long dp[]=new long[num+1];
		dp[0]=1;
		
		for(int i=2;i<=num;i=i+2) {
			dp[i]=dp[i-2]*3; //�⺻������ �������� �� �� �ִ� ����� ���� 3������ �� 3���� ��� ���� ���̰� 2�̱� ������ -2 �� ���ذſ� *3�� ���ָ�ȴ�.
			for(int j=i-4;j>=0;j=j-2) {
				dp[i]=dp[i]+dp[j]*2; // 4�� �Ѿ�� ����� ����� 2������ �߰��ȴ�. �׷���  *2 
								     // I�� 6�̶�� ���� �ü��ִ°� 4�ڸ��� �ü������ϱ� J=2 ���� 4�ڸ� �����̴ϱ� 2�� �ü��ִ� ����� ���� 4�ڸ� ������ִ� ���� 2�������ϱ� * 2 �����ش�.
				//���࿡ i �� 10�̸� 10, 8, 6 �϶� �ѹ� �� *2�� ������ؼ� for���� �����Եȴ�.
			}
		}
		System.out.println(dp[num]);
		
	}
}