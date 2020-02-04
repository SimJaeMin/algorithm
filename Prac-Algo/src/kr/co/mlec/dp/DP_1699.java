package kr.co.mlec.dp;

import java.util.Scanner;

//������ : �������� ��
public class DP_1699 {
	public static void main(String[] args) {
		//� �ڿ��� N�� �׺��� �۰ų� ���� ���������� ������ ��Ÿ �����ִ�. 11 =3������ 1������ 1������
		//�̷��� �ڿ��� N�� ����� �ּ����� ������ ���ؾ��Ѵ�
		//DP[I] = I�� ����� ������ �ּ����� ��
		//DP[I] = ���� �������� �ü��ִ� ����� ������ ����� ������ I���� �۾ƾ��Ѵ�.
		//dp[i] = dp[i-j*j]+1 (�������� ���� �� ���� ��) �������� ���¼� j*j�� ���ְ� ���� ���ڴ� �̹� ���Ѽ��ڴϱ� �װ� �̿��ϰ� j*j�� 1���� �Ǵϱ�  + 1 �� ���ش�.��
		//�� �������� �ü��ִ� ���ڴ� 1���� N�������� ������
		//�ʱⰪ���� ��� ���� 1�� �������� ����� �ڱ��ڽ��� ����. (���� ���� ���)
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int dp[]=new int[num+1];
		
		for(int i=1;i<=num;i++) {
			dp[i]=i; //�ʱⰪ ����
		}
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j*j<=i;j++) { //���⼭ J�� �������� ���� ����� �����ȴ�.
				if(dp[i]>dp[i-(j*j)]+1) //�������� ���� ���ڸ� �����ؼ� ���ִ� ����̴ϱ� dp[i-j*j] ������ ���ڰ� j*j�� ��츦 �� ������ �ּ����� ���� + �ڱ��ڽ��� ������ ����Ǽ� (1) �� �����ش�.
				dp[i]=dp[i-j*j]+1;	//J�� ���� ���� DP[I-J] �� ������ش�.
			}
		}
		System.out.println(dp[num]);
		
	}
}