import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main extends guessing {
    Main (){
        System.out.println("GUESSING GAME");
    }

    public static void main(String[] args) {
        new Main();
        tampilPrivate();
    }
}

class guessing {
    public static String [][] papan = new String[6][4];
    public static String [][] kartu = new String[6][4];
    public static String namaPemain1, namaPemain2, namaPemain3, namaPemain4;
    public static Scanner scanner = new Scanner(System.in);
    //method1
    public static void papan4x4(){
        //loop n condition
        for (int i=0; i<4; i++){
            System.out.print("|");
            for(int j=0; j<4; j++){
                System.out.print(papan[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static void papan6x4(){
        //loop n condition
        for (int i=0; i<6; i++){
            System.out.print("|");
            for(int j=0; j<4; j++){
                System.out.print(papan[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static void kartu4x4(){
        Random random = new Random();
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");

        int index;
        //loop n condition
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                index = random.nextInt(letters.size());
                kartu[i][j] = letters.get(index);
                letters.remove(index);
            }
        }
    }

    public static void kartu6x4(){
        Random random = new Random();
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("I");
        letters.add("J");
        letters.add("K");
        letters.add("L");
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("I");
        letters.add("J");
        letters.add("K");
        letters.add("L");

        int index;
        //loop n condition
        for (int i=0; i<6; i++){
            for (int j=0; j<4; j++){
                index = random.nextInt(letters.size());
                kartu[i][j] = letters.get(index);
                letters.remove(index);
            }
        }
    }

    public static void input4x4(String [][] kartu){
        int P1 = 0;
        int P2 = 0;
        //loop n condition
        while(true){
            if (!selesai4x4()) {
                System.out.println(" ");
                System.out.println("Giliran "+namaPemain1+" : ");
                System.out.println("Baris: (1-4)");
                int row1 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column1 = scanner.nextInt();

                if (!papan[row1 - 1][column1 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    System.out.println();

                    papan4x4();
                    continue;
                } else {
                    papan[row1 - 1][column1 - 1] = " " + kartu[row1 - 1][column1 - 1] + " ";
                    papan4x4();
                }

                System.out.println("Baris: (1-4)");
                int row2 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column2 = scanner.nextInt();

                if (!papan[row2 - 1][column2 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    papan[row1 - 1][column1 - 1] = " _ ";
                    System.out.println();

                    papan4x4();
                } else {
                    papan[row2 - 1][column2 - 1] = " " + kartu[row2 - 1][column2 - 1] + " ";
                    if (papan[row1 - 1][column1 - 1].equals(papan[row2 - 1][column2 - 1])) {
                        P1 = P1 + 1;
                        papan4x4();
                        System.out.println("Benar");
                        System.out.println("Poin " + namaPemain1 + " : " + P1);
                    } else {
                        papan4x4();
                        System.out.println("Salah");
                        papan[row1 - 1][column1 - 1] = " _ ";
                        papan[row2 - 1][column2 - 1] = " _ ";
                        papan4x4();
                    }
                }
            }if (!selesai4x4()) {
                System.out.println(" ");
                System.out.println("Giliran "+namaPemain2+" : ");
                System.out.println("Baris: (1-4)");
                int row1 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column1 = scanner.nextInt();

                if (!papan[row1 - 1][column1 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    System.out.println();

                    papan4x4();
                    continue;
                } else {
                    papan[row1 - 1][column1 - 1] = " " + kartu[row1 - 1][column1 - 1] + " ";
                    papan4x4();
                }

                System.out.println("Baris: (1-4)");
                int row2 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column2 = scanner.nextInt();

                if (!papan[row2 - 1][column2 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    papan[row1 - 1][column1 - 1] = " _ ";
                    System.out.println();

                    papan4x4();
                } else {
                    papan[row2 - 1][column2 - 1] = " " + kartu[row2 - 1][column2 - 1] + " ";

                    if (papan[row1 - 1][column1 - 1].equals(papan[row2 - 1][column2 - 1])) {
                        P2 = P2 + 1;
                        papan4x4();
                        System.out.println("Benar");
                        System.out.println("Poin "+namaPemain2+" : "+P2);
                    } else {
                        papan4x4();
                        System.out.println("Salah");
                        papan[row1 - 1][column1 - 1] = " _ ";
                        papan[row2 - 1][column2 - 1] = " _ ";
                        papan4x4();
                    }
                }
            } else{
                System.out.println("Permainan Berakhir");
                if(P1 > P2)
                {
                    System.out.println(" ");
                    System.out.println(namaPemain1+" adalah pemenang dengan poin : "+P1);
                    System.out.println("Poin "+namaPemain2+" : "+P2);
                }
                else if(P2 > P1)
                {
                    System.out.println(" ");
                    System.out.println(namaPemain2+" adalah pemenang dengan poin : "+P2);
                    System.out.println("Poin "+namaPemain1+" : "+P1);
                }
                else
                {
                    System.out.println(" ");
                    System.out.println("Seri !! Skor kedua pemain sama");
                    System.out.println("Poin "+namaPemain1+" : "+P1);
                    System.out.println("Poin "+namaPemain2+" : "+P2);
                }
                break;
            }
        }
    }

    public static void input6x4(String [][] kartu){
        int P1 = 0;
        int P2 = 0;
        int P3 = 0;
        int P4 = 0;
        //loop n condition
        while(true){
            if (!selesai6x4()) {
                System.out.println(" ");
                System.out.println("Giliran "+namaPemain1+" : ");
                System.out.println("Baris: (1-6)");
                int row1 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column1 = scanner.nextInt();

                if (!papan[row1 - 1][column1 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    System.out.println();

                    papan6x4();
                    continue;
                } else {
                    papan[row1 - 1][column1 - 1] = " " + kartu[row1 - 1][column1 - 1] + " ";
                    papan6x4();
                }

                System.out.println("Baris: (1-6)");
                int row2 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column2 = scanner.nextInt();

                if (!papan[row2 - 1][column2 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    papan[row1 - 1][column1 - 1] = " _ ";
                    System.out.println();

                    papan6x4();
                } else {
                    papan[row2 - 1][column2 - 1] = " " + kartu[row2 - 1][column2 - 1] + " ";

                    if (papan[row1 - 1][column1 - 1].equals(papan[row2 - 1][column2 - 1])) {
                        P1 = P1 + 1;
                        papan6x4();
                        System.out.println("Benar");
                        System.out.println("Poin "+namaPemain1+" : "+P1);
                    } else {
                        papan6x4();
                        System.out.println("Salah");
                        papan[row1 - 1][column1 - 1] = " _ ";
                        papan[row2 - 1][column2 - 1] = " _ ";
                        papan6x4();
                    }
                }
            }if (!selesai6x4()) {
                System.out.println(" ");
                System.out.println("Giliran "+namaPemain2+" : ");
                System.out.println("Baris: (1-6)");
                int row1 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column1 = scanner.nextInt();

                if (!papan[row1 - 1][column1 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    System.out.println();

                    papan6x4();
                    continue;
                } else {
                    papan[row1 - 1][column1 - 1] = " " + kartu[row1 - 1][column1 - 1] + " ";
                    papan6x4();
                }

                System.out.println("Baris: (1-6)");
                int row2 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column2 = scanner.nextInt();

                if (!papan[row2 - 1][column2 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    papan[row1 - 1][column1 - 1] = " _ ";
                    System.out.println();

                    papan6x4();
                } else {
                    papan[row2 - 1][column2 - 1] = " " + kartu[row2 - 1][column2 - 1] + " ";

                    if (papan[row1 - 1][column1 - 1].equals(papan[row2 - 1][column2 - 1])) {
                        P2 = P2 + 1;
                        papan6x4();
                        System.out.println("Benar");
                        System.out.println("Poin "+namaPemain2+" : "+P2);
                    } else {
                        papan6x4();
                        System.out.println("Salah");
                        papan[row1 - 1][column1 - 1] = " _ ";
                        papan[row2 - 1][column2 - 1] = " _ ";
                        papan6x4();
                    }
                }
            }
            if (!selesai6x4()) {
                System.out.println(" ");
                System.out.println("Giliran "+namaPemain3+" : ");
                System.out.println("Baris: (1-6)");
                int row1 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column1 = scanner.nextInt();

                if (!papan[row1 - 1][column1 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    System.out.println();

                    papan6x4();
                    continue;
                } else {
                    papan[row1 - 1][column1 - 1] = " " + kartu[row1 - 1][column1 - 1] + " ";
                    papan6x4();
                }

                System.out.println("Baris: (1-6)");
                int row2 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column2 = scanner.nextInt();

                if (!papan[row2 - 1][column2 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    papan[row1 - 1][column1 - 1] = " _ ";
                    System.out.println();

                    papan6x4();
                } else {
                    papan[row2 - 1][column2 - 1] = " " + kartu[row2 - 1][column2 - 1] + " ";

                    if (papan[row1 - 1][column1 - 1].equals(papan[row2 - 1][column2 - 1])) {
                        P3 = P3 + 1;
                        papan6x4();
                        System.out.println("Benar");
                        System.out.println("Poin "+namaPemain3+" : "+P3);
                    } else {
                        papan6x4();
                        System.out.println("Salah");
                        papan[row1 - 1][column1 - 1] = " _ ";
                        papan[row2 - 1][column2 - 1] = " _ ";
                        papan6x4();
                    }
                }
            }
            if (!selesai6x4()) {
                System.out.println(" ");
                System.out.println("Giliran "+namaPemain4+" : ");
                System.out.println("Baris: (1-6)");
                int row1 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column1 = scanner.nextInt();

                if (!papan[row1 - 1][column1 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    System.out.println();

                    papan6x4();
                    continue;
                } else {
                    papan[row1 - 1][column1 - 1] = " " + kartu[row1 - 1][column1 - 1] + " ";
                    papan6x4();
                }

                System.out.println("Baris: (1-6)");
                int row2 = scanner.nextInt();
                System.out.println("Kolom: (1-4)");
                int column2 = scanner.nextInt();

                if (!papan[row2 - 1][column2 - 1].equals(" _ ")) {
                    System.out.println("Sudah Terbuka");
                    papan[row1 - 1][column1 - 1] = " _ ";
                    System.out.println();

                    papan6x4();
                } else {
                    papan[row2 - 1][column2 - 1] = " " + kartu[row2 - 1][column2 - 1] + " ";

                    if (papan[row1 - 1][column1 - 1].equals(papan[row2 - 1][column2 - 1])) {
                        P4 = P4 + 1;
                        papan6x4();
                        System.out.println("Benar");
                        System.out.println("Poin "+namaPemain4+" : "+P4);
                    } else {
                        papan6x4();
                        System.out.println("Salah");
                        papan[row1 - 1][column1 - 1] = " _ ";
                        papan[row2 - 1][column2 - 1] = " _ ";
                        papan6x4();
                    }
                }
            }
            else{
                System.out.println("Permainan Berakhir");
                if(P1 > P2) {
                    if(P1 > P3) {
                        if(P1 > P4) {
                            System.out.println(" ");
                            System.out.println(namaPemain1+" adalah pemenang dengan poin : " + P1);
                            System.out.println("Poin "+namaPemain2+" : " + P2);
                            System.out.println("Poin "+namaPemain3+" : " + P3);
                            System.out.println("Poin "+namaPemain4+" : " + P4);
                        }
                    }
                }
                else if(P2 > P1) {
                    if(P2 > P3) {
                        if(P2 > P4) {
                            System.out.println(" ");
                            System.out.println(namaPemain2+" adalah pemenang dengan poin : " + P2);
                            System.out.println("Poin "+namaPemain1+" : " + P1);
                            System.out.println("Poin "+namaPemain3+" : " + P3);
                            System.out.println("Poin "+namaPemain4+" : " + P4);
                        }
                    }
                }
                else if(P3 > P1) {
                    if(P3 > P2) {
                        if(P3 > P4) {
                            System.out.println(" ");
                            System.out.println(namaPemain3+" adalah pemenang dengan poin : " + P3);
                            System.out.println("Poin "+namaPemain1+" : " + P1);
                            System.out.println("Poin "+namaPemain2+" : " + P2);
                            System.out.println("Poin "+namaPemain4+" : " + P4);
                        }
                    }
                }
                else if(P4 > P1) {
                    if(P4 > P2) {
                        if(P4 > P3) {
                            System.out.println(" ");
                            System.out.println(namaPemain4+" adalah pemenang dengan poin : " + P4);
                            System.out.println("Poin "+namaPemain1+" : " + P1);
                            System.out.println("Poin "+namaPemain2+" : " + P2);
                            System.out.println("Poin "+namaPemain3+" : " + P3);
                        }
                    }
                }
                else
                {
                    if(P1==P2){
                        System.out.println(" ");
                        System.out.println(namaPemain1+" dan "+namaPemain2+" adalah pemenang");
                        System.out.println("Poin "+namaPemain1+" : " + P1);
                        System.out.println("Poin "+namaPemain2+" : " + P2);
                        System.out.println("Poin "+namaPemain3+" : " + P3);
                        System.out.println("Poin "+namaPemain4+" : " + P4);
                        if(P1==P3){
                            System.out.println(" ");
                            System.out.println(namaPemain1+", "+namaPemain2+" dan "+namaPemain3+" adalah pemenang");
                            System.out.println("Poin "+namaPemain1+" : " + P1);
                            System.out.println("Poin "+namaPemain2+" : " + P2);
                            System.out.println("Poin "+namaPemain3+" : " + P3);
                            System.out.println("Poin "+namaPemain4+" : " + P4);
                        }
                        if(P1==P4){
                            System.out.println(" ");
                            System.out.println(namaPemain1+", "+namaPemain2+" dan "+namaPemain4+" adalah pemenang");
                            System.out.println("Poin "+namaPemain1+" : " + P1);
                            System.out.println("Poin "+namaPemain2+" : " + P2);
                            System.out.println("Poin "+namaPemain3+" : " + P3);
                            System.out.println("Poin "+namaPemain4+" : " + P4);
                        }
                    }
                    else if(P1==P3){
                        System.out.println(" ");
                        System.out.println(namaPemain1+" dan "+namaPemain3+" adalah pemenang");
                        System.out.println("Poin "+namaPemain1+" : " + P1);
                        System.out.println("Poin "+namaPemain2+" : " + P2);
                        System.out.println("Poin "+namaPemain3+" : " + P3);
                        System.out.println("Poin "+namaPemain4+" : " + P4);
                        if(P1==P4){
                            System.out.println(" ");
                            System.out.println(namaPemain1+", "+namaPemain3+" dan "+namaPemain4+" adalah pemenang");
                            System.out.println("Poin "+namaPemain1+" : " + P1);
                            System.out.println("Poin "+namaPemain2+" : " + P2);
                            System.out.println("Poin "+namaPemain3+" : " + P3);
                            System.out.println("Poin "+namaPemain4+" : " + P4);
                        }
                    }
                    else if(P1==P4){
                        System.out.println(" ");
                        System.out.println(namaPemain1+" dan "+namaPemain4+" adalah pemenang");
                        System.out.println("Poin "+namaPemain1+" : " + P1);
                        System.out.println("Poin "+namaPemain2+" : " + P2);
                        System.out.println("Poin "+namaPemain3+" : " + P3);
                        System.out.println("Poin "+namaPemain4+" : " + P4);
                    }
                    else if(P2==P3){
                        System.out.println(" ");
                        System.out.println(namaPemain2+" dan "+namaPemain3+" adalah pemenang");
                        System.out.println("Poin "+namaPemain1+" : " + P1);
                        System.out.println("Poin "+namaPemain2+" : " + P2);
                        System.out.println("Poin "+namaPemain3+" : " + P3);
                        System.out.println("Poin "+namaPemain4+" : " + P4);
                        if(P2==P4){
                            System.out.println(" ");
                            System.out.println(namaPemain2+", "+namaPemain3+" dan "+namaPemain4+" adalah pemenang");
                            System.out.println("Poin "+namaPemain1+" : " + P1);
                            System.out.println("Poin "+namaPemain2+" : " + P2);
                            System.out.println("Poin "+namaPemain3+" : " + P3);
                            System.out.println("Poin "+namaPemain4+" : " + P4);
                        }
                    }
                    else if(P2==P4){
                        System.out.println(" ");
                        System.out.println(namaPemain2+" dan "+namaPemain4+" adalah pemenang");
                        System.out.println("Poin "+namaPemain1+" : " + P1);
                        System.out.println("Poin "+namaPemain2+" : " + P2);
                        System.out.println("Poin "+namaPemain3+" : " + P3);
                        System.out.println("Poin "+namaPemain4+" : " + P4);
                    }
                    else if(P3==P4){
                        System.out.println(" ");
                        System.out.println(namaPemain3+" dan "+namaPemain4+" adalah pemenang");
                        System.out.println("Poin "+namaPemain1+" : " + P1);
                        System.out.println("Poin "+namaPemain2+" : " + P2);
                        System.out.println("Poin "+namaPemain3+" : " + P3);
                        System.out.println("Poin "+namaPemain4+" : " + P4);
                    }
                    else{
                        System.out.println(" ");
                        System.out.println("Seri !! Skor keempat pemain sama");
                        System.out.println("Poin "+namaPemain1+" : " + P1);
                        System.out.println("Poin "+namaPemain2+" : " + P2);
                        System.out.println("Poin "+namaPemain3+" : " + P3);
                        System.out.println("Poin "+namaPemain4+" : " + P4);
                    }
                }
                break;
            }
        }
    }

    public static boolean selesai4x4(){
        //loop n condition
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(papan[i][j].equals(" _ ")){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean selesai6x4(){
        //loop n condition
        for(int i=0; i<6; i++){
            for(int j=0; j<4; j++){
                if(papan[i][j].equals(" _ ")){
                    return false;
                }
            }
        }
        return true;
    }


    private static void panggil() {
        Scanner input = new Scanner(System.in);
        //loop n condition
        while(true){
            System.out.println("Tekan s Untuk Start, q Untuk Quit");
            String mulai = scanner.nextLine();

            if(mulai.equals("q")){
                System.out.println("Game Keluar");
                break;
            }else if(mulai.equals("s")){
                System.out.println("Pilihan Bermain : ");
                System.out.println("1. Tile 4x4 (2 Pemain)");
                System.out.println("2. Tile 6x4 (4 Pemain)");
                System.out.print("Masukkan Pilihan : ");
                int pil = scanner.nextInt();
                switch (pil){
                    case 1:
                        System.out.print("Nama Pemain 1 : ");
                        namaPemain1 = input.nextLine();
                        System.out.print("Nama Pemain 2 : ");
                        namaPemain2 = input.nextLine();
                        System.out.println("");
                        kartu4x4();
                        for(int i=0; i<4; i++){
                            for(int j=0; j<4; j++){
                                papan[i][j] = " _ ";
                            }
                        }
                        papan4x4();
                        input4x4(kartu);
                        break;
                    case 2:
                        System.out.print("Nama Pemain 1 : ");
                        namaPemain1 = input.nextLine();
                        System.out.print("Nama Pemain 2 : ");
                        namaPemain2 = input.nextLine();
                        System.out.print("Nama Pemain 3 : ");
                        namaPemain3 = input.nextLine();
                        System.out.print("Nama Pemain 4 : ");
                        namaPemain4 = input.nextLine();
                        System.out.println("");
                        kartu6x4();
                        for(int i=0; i<6; i++){
                            for(int j=0; j<4; j++){
                                papan[i][j] = " _ ";
                            }
                        }
                        papan6x4();
                        input6x4(kartu);
                        break;
                    default:
                        System.out.println("Input Salah");
                }
                break;
            }else{
                System.out.println("Input Salah");
                continue;
            }
        }
    }
    public static void tampilPrivate(){
        panggil();
    }
}