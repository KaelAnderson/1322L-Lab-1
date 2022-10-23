import java.util.Objects;

public class Lab1A {
    public static void main(String[] args){
        char[][] car = new char[4][13];
        car = make_forward();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                System.out.print(car[i][j]);
            }
            System.out.println();
        }
        car = make_mirror(make_forward());
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                System.out.print(car[i][j]);
            }
            System.out.println();
        }
        car = make_forward();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                System.out.print(car[i][j]);
            }
            car = make_mirror(car);
            for(int j = 0; j < 13; j++){
                System.out.print(car[i][j]);
            }
            car = make_forward();
            System.out.println();
        }
    }
    public static char[][] make_forward()
    {
        char[][] pixel = new char[4][13];
        pixel[0][0]=' ';
        pixel[0][1]=' ';
        pixel[0][2]='_';
        pixel[0][3]='_';
        pixel[0][4]='_';
        pixel[0][5]='_';
        pixel[0][6]='_';
        pixel[0][7]='_';
        pixel[0][8]=' ';
        pixel[0][9]=' ';
        pixel[0][10]=' ';
        pixel[0][11]=' ';
        pixel[0][12]=' ';
        pixel[1][0]=' ';
        pixel[1][1]='/';
        pixel[1][2]='|';
        pixel[1][3]='_';
        pixel[1][4]='|';
        pixel[1][5]='|';
        pixel[1][6]='_';
        pixel[1][7]='\\';
        pixel[1][8]='\'';
        pixel[1][9]='.';
        pixel[1][10]='_';
        pixel[1][11]='_';
        pixel[1][12]=' ';
        pixel[2][0]='(';
        pixel[2][1]=' ';
        pixel[2][2]=' ';
        pixel[2][3]=' ';
        pixel[2][4]='_';
        pixel[2][5]=' ';
        pixel[2][6]=' ';
        pixel[2][7]=' ';
        pixel[2][8]=' ';
        pixel[2][9]='_';
        pixel[2][10]=' ';
        pixel[2][11]='_';
        pixel[2][12]='\\';
        pixel[3][0]='=';
        pixel[3][1]='\'';
        pixel[3][2]='-';
        pixel[3][3]='(';
        pixel[3][4]='_';
        pixel[3][5]=')';
        pixel[3][6]='-';
        pixel[3][7]='-';
        pixel[3][8]='(';
        pixel[3][9]='_';
        pixel[3][10]=')';
        pixel[3][11]='-';
        pixel[3][12]='\'';
        return pixel;
    }



    public static char[][] make_mirror(char[]... input){
    int runtime1 = 0;

    char[][] reverse = new char[4][13];
    int rowreplace = 0;

    int rowsearch = 0;

        do{
            int collumnsearch = 12;
            int collumnreplace = 0;
            int runtime2 = 0;
            do {

                reverse[rowreplace][collumnreplace] = input[rowsearch][collumnsearch];

                if(Objects.equals(input[rowsearch][collumnsearch],')')){
                reverse[rowreplace][collumnreplace] = "(".charAt(0);
                }
                if(Objects.equals(input[rowsearch][collumnsearch],'(')){
                    reverse[rowreplace][collumnreplace] = ")".charAt(0);
                }
                if(Objects.equals(input[rowsearch][collumnsearch],'/')){
                    reverse[rowreplace][collumnreplace] = '\\';
                }
                if(Objects.equals(input[rowsearch][collumnsearch],'\\')){
                    reverse[rowreplace][collumnreplace] = '/';
                }



                collumnreplace = collumnreplace + 1;
                collumnsearch = collumnsearch - 1;
                runtime2++;
            }while (runtime2 < 13);





            rowreplace = rowreplace + 1;
            rowsearch = rowsearch + 1;
            runtime1++;
        }while(runtime1 < 4);



        /*
        char[][] reverse = new char[4][13];
        int w = 3;
        int t = 12;
        for(int i = 0; i < 4; i++){


            for(int j = 12; j > 0; j -= 1){

                reverse[w][t] = input[i][j];
                t = t-1;

            }

            w = w-1;
        }
        */

        return reverse;
    }
}
