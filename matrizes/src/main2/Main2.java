package main2;

public class Main2 {
    public static void main(String[] args) {
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 6;

        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 6;
        notasAlunos[1][2] = 9;
        notasAlunos[1][3] = 8;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 10;
        notasAlunos[2][2] = 9;
        notasAlunos[2][3] = 8;



        for(int i=0;i< notasAlunos.length;i++){
          //System.out.println(notasAlunos[i] + " ");
            for(int j =0;j < notasAlunos[i].length ;j++){
                System.out.println(notasAlunos[i][j] + " ");
            }
        }

    }
}
