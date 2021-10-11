public class Matriz_02 {
    public static void main(String[] args) {

        int[][] m = new int[3][7];
        
        m[0][0]= 0;
        m[0][1]= 1;
        m[0][2]= 4;
        m[0][3]= 9;
        m[0][4]= 16;
        m[0][5]= 25;
        m[0][6]= 36;

        m[1][0]= 0;
        m[1][1]= 1;
        m[1][2]= 4;
        m[1][3]= 9;
        m[1][4]= 16;
        m[1][5]= 25;
        m[1][6]= 36;

        m[2][0]= 0;
        m[2][1]= 1;
        m[2][2]= 4;
        m[2][3]= 9;
        m[2][4]= 16;
        m[2][5]= 25;
        m[2][6]= 36;
        

        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }  
}

