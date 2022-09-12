public class Main {
    public static void main(String[] args) {

        int sutun = 0;
        int satir = 0;
        int[][] array = new int[3][6];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = j * (i+1);
                System.out.print(array[i][j]+"  ");
            }
            sutun = array[i].length;
            satir = array.length;
            System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("satir sayisi: "+satir);
        System.out.println("sutun sayisi: "+sutun);

        int[][] newdizi = new int[sutun][satir];
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(array[j][i]+"  ");
            }

            System.out.println();

        }

    }
}
