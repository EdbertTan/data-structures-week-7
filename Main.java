import java.lang.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int npass=0;
        String nfind = "this";
        String[][] words = {{"t", "h", "i", "s"},{"w", "a", "t", "s"},{"o", "a", "h", "g"},{"f", "g", "d", "t"}};
        for (int n = 0;n<4;n++){ //horizontal
            StringBuilder str = new StringBuilder();
            for (int m = 0;m<4;m++){
                str.append(words[n][m]);
            }
            //System.out.println(str);
            if (str.indexOf(nfind)>=0){
                System.out.println("horizontal row "+(n+1)+" column "+(str.indexOf(nfind)+1));
                npass=1;
            }
        }

        if (npass == 0) {
            for (int n = 0; n < 4; n++) { //vertical
                StringBuilder str = new StringBuilder();
                for (int m = 0; m < 4; m++) {
                    str.append(words[m][n]);
                }

                //System.out.println(str);
                if (str.indexOf(nfind)>=0){
                    System.out.println("vertical row "+(str.indexOf(nfind)+1)+" column "+(n+1));
                    npass=1;
                }
            }
        }
        if (npass == 0) {
            for (int m = 0; m <= 6; m++) { //diagonal left
                StringBuilder str = new StringBuilder();
                int k = m;
                int l = 0;
                int nstart = -100;
                int nsrow = 0;
                int nscol = 0;
                while (k >= 0) {
                    if (k < 4 && l < 4) {
                        if (nstart == -100){
                            nstart=0;
                            nsrow = l;
                            nscol = k;
                        }
                        str.append(words[l][k]);
                    }
                    k = k - 1;
                    l = l + 1;
                }
                //System.out.println(str);
                int nindex = str.indexOf(nfind);
                if (str.indexOf(nfind)>=0){
                    System.out.println("diagonal right to left "+nsrow+" column "+nscol);
                    npass = 1;
                }
            }
        }
        if (npass == 0) {
            for (int m = -3; m <= 3; m++) { //diagonal left
                StringBuilder str = new StringBuilder();
                int l = 0;
                int k = m;
                int nstart = -100;
                int nsrow = 0;
                int nscol = 0;
                while (k < 4) {
                    if (k >= 0 && l < 4) {
                        if (nstart == -100){
                            nstart=0;
                            nsrow = l;
                            nscol = k;
                        }
                        str.append(words[l][k]);
                    }
                    l = l + 1;
                    k = k + 1;
                }
                //System.out.println(str);
                int nindex = str.indexOf(nfind);
                if (str.indexOf(nfind)>=0){
                    System.out.println("diagonal right to left "+nsrow+" column "+nscol);
                    npass = 1;
                }
            }
        }

    }
}