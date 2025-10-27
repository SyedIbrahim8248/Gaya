package Backtrackinbyraghavsir.java;

public class _05_RatInDeadMazeFourDirection {
    public static void main(String[] args) {
        int rows = 4;;
        int cols =6;
        int [][] maze = {{1,0,1,1,1,1,},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1 },
                        {0,0,1,0,1,1}};
        boolean[][] isVisited = new boolean[rows][cols];
        print(0,0,rows-1,cols-1, "",maze,isVisited);
    }
    private static  void print(int sr,int sc,int er,int ec,String s,int[][]maze,boolean [][] isVisited) {
        if(sr>er || sc>ec) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(isVisited[sr][sc] == true) return;
        isVisited[sr][sc] =true;
        print(sr, sc+1 ,er,ec, s+ "R", maze,isVisited);
        print(sr+1,sc,er,ec,s+ "D",maze,isVisited);
        isVisited[sr][sc] = false;
    }
}


