import java.util.Stack;
public class numbertwo {
	/*
	Given an n x n grid with non-negative entries x_{i, j} for i, j \in [n],
	find the minimum-cost path from the bottom left of the grid to the top
	right of the grid, where on each step of the path we either step up or to the right.
	 */
	//just use djisktra lol

    public static void main(String args[]) {
        int n = 1;
        int[][] grid = new int[n][n];
        int[] bestroute = bestroute(grid);
	}

    public static int[] bestroute(int[][] grid){
        int n = grid.length;
        int[][] gridval = new int[n][n];
        Stack<int[]> stack = new Stack<int[]>();

        //initial condition
        int r=0;
        int c=n-1;
        int[] idx = {r,c};

        stack.push(idx);



        pushval(r,c);


    }
    public static int[][] pushval(int[] idx){
        int[][] adj;
    }

}
