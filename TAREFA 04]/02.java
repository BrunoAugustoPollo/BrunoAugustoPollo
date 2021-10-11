public class Matriz_01 {
    public static void main(String[] args) {

        int[][] m = new int[3][5];
        
        m[0][0]= 0;
        m[0][1]= 1;
        m[0][2]= 2;
        m[0][3]= 3;
        m[0][4]= 4;

        m[1][0]= 0;
        m[1][1]= 1;
        m[1][2]= 2;
        m[1][3]= 3;
        m[1][4]= 4;

        m[2][0]= 0;
        m[2][1]= 1;
        m[2][2]= 2;
        m[2][3]= 3;
        m[2][4]= 4;

        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }  
}

