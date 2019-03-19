/*
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。

示例:
输入: 3
输出:
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
        	//关键就是要把行列下标以及行列长度的关系搞清楚
            for( int j = i; j < n - i; j++){
            	//上边
                a[i][j] = count;
                count ++;
            }
            for( int j = i + 1; j < n - i; j++ ){
            	//右边
                a[j][n - i -1] = count ;
                count ++;
            }
            for(int j = n - 2- i; j >= i;j-- ){
            	//下边
                a[n - i -1][j] =count;
                count++;
            }
            for(int j = n- i - 2; j > i; j--){
            	//左边
                a[j][i] = count;
                count ++;
            }
            i++;
        }
        return a;
    }
}