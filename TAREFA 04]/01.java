public class Matriz_04 {
    public static void main(String[] args) {
        int[][] m = new int[3][6];
        
        m[0][0]= 0;
        m[0][1]= 1;
        m[0][2]= 2;
        m[0][3]= 3;
        m[0][4]= 4;
        m[0][5]= 5;

        m[1][0]= 6;
        m[1][1]= 7;
        m[1][2]= 8;
        m[1][3]= 9;
        m[1][4]= 10;
        m[0][5]= 11;


        m[2][0]= 12;
        m[2][1]= 13;
        m[2][2]= 14;
        m[2][3]= 15;
        m[2][4]= 16;
        m[0][5]= 17;

        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }  
}