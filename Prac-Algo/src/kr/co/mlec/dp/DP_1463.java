package kr.co.mlec.dp;

import java.util.Scanner;
//문제명 : 1로 만들기
public class DP_1463 {

	public static void main(String[] args) {
		long dp[]=new long[1000001]; // 10의 6승보다 작은정수 10의 6승이 들어오게되면 그 아래수들은 다 담아야함
		//dp 에는 n이 1이 되는 최소한의 연산의 수가 들어간다.
		//3으로 나누거나, 2로나누거나, 1을 빼는 3중에 하나를 할 수 있으니
		//3개를 한것중 최소값이 들어가면된다.
		//2가지 과정으로 나눌수 있음 n을 3으로나눈다 + n/3을 1로만드는데 최소한의 연산수를 저장한값 
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=2;i<=num;i++) {
			if(i<4) {
				dp[i]=1;
			}
			dp[i]=dp[i-1]+1 ;// 1을 뺸경우 1을 뺀 개 연산이 1번이니까 + 1 을 해주고
			//i에서 1을 뺀수 가  1이 되는 최소한의 연산의 수는 dp[i-1]에 있음;
			
			if(i%2==0 &&dp[i]>(dp[i/2]+1)) { //최소한의 연산 횟수를 구해야하기 때문에
				dp[i]=dp[i/2]+1; 	//먼저 2로 나눌수 있는지를 체크 해야하고 2로 나눌수있다면 최소값을 비교해준다.
			}
			
			if(i%3==0 && dp[i]>(dp[i/3]+1)) { // 먼저 3으로 나눌수 있는지를 체크해야하고 3으로 나눌수 있다면 최소값을 비교해준다.
				dp[i]=dp[i/3]+1;
			}
		}
			System.out.println(dp[num]);
		
	}
//dp로 풀수 있는 이유는 num이 100일때 50이 1로 되는 최소한의 연산수나 num이 200일 때 50이 1로되는 최소한의 연산수는 같다.
//즉 문제의 정답을 작은 문제에서 구할수있고, 겹치는 작은문제의 정답을 메모리제이션해서 풀수있다.
//또한 3가지의 방법으로 1로 만들기 때문에 큰문제와 작은문제를 같은 방법으로 풀수 있다.
}
