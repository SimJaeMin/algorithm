package kr.co.mlec.dp;

import java.util.Scanner;
//������ : 1�� �����
public class DP_1463 {

	public static void main(String[] args) {
		long dp[]=new long[1000001]; // 10�� 6�º��� �������� 10�� 6���� �����ԵǸ� �� �Ʒ������� �� ��ƾ���
		//dp ���� n�� 1�� �Ǵ� �ּ����� ������ ���� ����.
		//3���� �����ų�, 2�γ����ų�, 1�� ���� 3�߿� �ϳ��� �� �� ������
		//3���� �Ѱ��� �ּҰ��� ����ȴ�.
		//2���� �������� ������ ���� n�� 3���γ����� + n/3�� 1�θ���µ� �ּ����� ������� �����Ѱ� 
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=2;i<=num;i++) {
			if(i<4) {
				dp[i]=1;
			}
			dp[i]=dp[i-1]+1 ;// 1�� �A��� 1�� �� �� ������ 1���̴ϱ� + 1 �� ���ְ�
			//i���� 1�� ���� ��  1�� �Ǵ� �ּ����� ������ ���� dp[i-1]�� ����;
			
			if(i%2==0 &&dp[i]>(dp[i/2]+1)) { //�ּ����� ���� Ƚ���� ���ؾ��ϱ� ������
				dp[i]=dp[i/2]+1; 	//���� 2�� ������ �ִ����� üũ �ؾ��ϰ� 2�� �������ִٸ� �ּҰ��� �����ش�.
			}
			
			if(i%3==0 && dp[i]>(dp[i/3]+1)) { // ���� 3���� ������ �ִ����� üũ�ؾ��ϰ� 3���� ������ �ִٸ� �ּҰ��� �����ش�.
				dp[i]=dp[i/3]+1;
			}
		}
			System.out.println(dp[num]);
		
	}
//dp�� Ǯ�� �ִ� ������ num�� 100�϶� 50�� 1�� �Ǵ� �ּ����� ������� num�� 200�� �� 50�� 1�εǴ� �ּ����� ������� ����.
//�� ������ ������ ���� �������� ���Ҽ��ְ�, ��ġ�� ���������� ������ �޸����̼��ؼ� Ǯ���ִ�.
//���� 3������ ������� 1�� ����� ������ ū������ ���������� ���� ������� Ǯ�� �ִ�.
}