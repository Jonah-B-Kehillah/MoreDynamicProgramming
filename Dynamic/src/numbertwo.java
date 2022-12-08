import java.util.Stack;
public class numbertwo {
    public int n = 3;
	/*
	Given an n x n grid with non-negative entries x_{i, j} for i, j \in [n],
	find the minimum-cost path from the bottom left of the grid to the top
	right of the grid, where on each step of the path we either step up or to the right.
	 */
	//just use djisktra lol

    public static void main(String args[]) {

        //int[][] grid = new int[n][n];
        int[][] grid = new int[][]{{1,1,1},{1,1,1},{1,1,1}};
        int[] bestroute = bestroute(grid);
	}

    public static int[] bestroute(int[][] grid){
        int n = grid.length;
        int[][] gridval = new int[n][n];

        //initial condition
        int r=0;
        int c=n-1;
        gridval[r][c] = grid[r][c];

        Stack<int[]> adj = getadj(new int[]{r,c});

        while(!adj.empty()){
            int[] idx = adj.pop();
            if(gridval[idx[0]][idx[1]]==0) gridval[idx[0]][idx[1]] = getvalue(idx);
        }

        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+gridval[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static Stack getadj(int[] idx){
        Stack<int[]> adj = new Stack<int[]>();
        if(idx[0] == 0){
            if(idx[1] >= n-1) return null;
            adj.push(new int[] {idx[0],idx[1]+1});
        }
        else if(idx[1] >= n-1) adj.push(new int[] {idx[0]-1,idx[1]});
        else{
            adj.push(new int[] {idx[0],idx[1]+1});
            adj.push(new int[] {idx[0]-1,idx[1]});
        }
        return adj;
    }
    public static int getvalue(int[] idx){
        if(idx[0] == n){
            if(idx[1] >= n-1) return null;
            adj.push(new int[] {idx[0],idx[1]+1});
        }
        else if(idx[1] >= n-1) adj.push(new int[] {idx[0]-1,idx[1]});
        else{
            adj.push(new int[] {idx[0],idx[1]+1});
            adj.push(new int[] {idx[0]-1,idx[1]});
        }
        return adj;
    }

}
