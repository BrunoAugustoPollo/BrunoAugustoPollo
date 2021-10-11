public class Matriz_04 {
    public static void main(String[] args) {
        int[][] m = new int[4][5];
        
        m[0][0]= 0;
        m[0][1]= 2;
        m[0][2]= 4;
        m[0][3]= 6;
        m[0][4]= 8;

        m[1][0]= 1;
        m[1][1]= 3;
        m[1][2]= 5;
        m[1][3]= 7;
        m[1][4]= 9;

        m[2][0]= 2;
        m[2][1]= 4;
        m[2][2]= 6;
        m[2][3]= 8;
        m[2][4]= 10;

        m[3][0]= 3;
        m[3][1]= 5;
        m[3][2]= 7;
        m[3][3]= 9;
        m[3][4]= 11;
        

        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }  
}