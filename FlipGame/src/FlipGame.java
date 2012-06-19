import java.util.*;

public class FlipGame {
    int count;
    int finish;
    int[][] board;
    int xlen;
    int ylen;

	public int minOperations(String[] board) {
		count = 0;
        finish = 0;
        xlen = board.length;
        ylen = board[0].length();
        this.board = new int[xlen][ylen];
        for(int i = 0 ; i < xlen; i ++){
            String s= board[i];
            for(int j = 0 ; j < ylen; j ++){
                char c = s.charAt(j);
                if (c == '1')
                    this.board[i][j] = 1;
            }
        }
        flip();
        return count;

	}
    void flip(){

        if(finish == xlen)
            return;
        int x_len = 0;
        for(int i = finish; i < xlen; i ++){
            int j = ylen - 1;
            for(; j >= 0 && j >= x_len ; j --){

                if(board[i][j] == 1)  {
                    break;
                }
            }
            x_len = j + 1;
            boolean all_zero = true;
            for(int k = 0; k < x_len; k ++){
                board[i][k] ^= 1;
                if(board[i][k] ==1)
                    all_zero = false;
            }
            if(all_zero && i == finish){
                finish ++;
            }
        }
        if (x_len > 0)
            count ++;
        flip();

    }
}
