/*
 * ����һ�������� n������һ������ 1 �� n2 ����Ԫ�أ���Ԫ�ذ�˳ʱ��˳���������е������ξ���

ʾ��:
����: 3
���:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
*/
package lianxi0319;


public class test0319 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int n = 4;
		int[][] a = S.generateMatrix(n);
		for(int i = 0; i < 4;i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}


class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int count = 1;
        int i = 0;
        while(count <= n*n){
        	//�ؼ�����Ҫ�������±��Լ����г��ȵĹ�ϵ�����
            for( int j = i; j < n - i; j++){
            	//�ϱ�
                a[i][j] = count;
                count ++;
            }
            for( int j = i + 1; j < n - i; j++ ){
            	//�ұ�
                a[j][n - i -1] = count ;
                count ++;
            }
            for(int j = n - 2- i; j >= i;j-- ){
            	//�±�
                a[n - i -1][j] =count;
                count++;
            }
            for(int j = n- i - 2; j > i; j--){
            	//���
                a[j][i] = count;
                count ++;
            }
            i++;
        }
        return a;
    }
}