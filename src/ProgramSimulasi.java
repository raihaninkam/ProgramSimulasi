import java.util.Scanner;

public class ProgramSimulasi{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int in;

        System.out.println("Selamat Datang di Program Simulasi");
        System.out.println("Menu");
        System.out.println("1. Random Data");
        System.out.println("2. Simulasi Bubble Sort - Ascending");
        System.out.println("3. Simulasi Selection Sort - Ascending");
        System.out.println("4. Simulasi Bubble Sort - Descending");
        System.out.println("5. Simulasi Selection Sort - Descending");
        System.out.println("6. Keluar");
        System.out.println("Masukkan Pilihan Anda");
        in = sc.nextInt();

        switch(in){
            case 1:
                randomData();
                break;
            case 2:
                bubbleSortAsc();
                break;
            case 3:
                selectionSortAsc();
                break;
            case 4:
                bubbleSortDesc();
                break;
            case 5:
                selectionSortDesc();
                break;
            case 6:
                System.out.println("Terima Kasih Telah Menggunakan Program Simulasi");
                break;
            default:
                System.out.println("Angka yang Anda masukkan tidak valid");
                break;
        }

    }

    //METHOD RANDOM DATA
    private static void randomData(){
        int bawah, atas;

        System.out.print("\nBatas Bawah = ");
        bawah = sc.nextInt();
        System.out.print("Batas Atas = ");
        atas = sc.nextInt();

        int[] randomData = getRandomData(bawah, atas);

        for(int x=0; x<randomData.length; x++){
            System.out.print(randomData[x]+"\t");
        }
    }

    //METHOD GENERATE RANDOM DATA
    private static int[] getRandomData(int bawah, int atas){
        int[] randomData = new int[5];
        for(int x=0; x<5; x++){
            randomData[x] = (int) (Math.random() * (atas - bawah)) + bawah;
        }
        return randomData;
    }

    //METHOD BUBBLE SORT ASCENDING
    private static void bubbleSortAsc(){
        int[] randomData = getRandomData(30, 300);
        // int[] randomData = {237, 84, 122, 260, 169};
        int size = randomData.length;

        for(int x=1; x<size; x++){
            System.out.println("\nPass "+(x));
            showData(randomData);

            for(int y=0; y<(size-x); y++){

                if(randomData[y] > randomData[y+1]){
                    //swap data
                    int temp = randomData[y];
                    randomData[y] = randomData[y + 1];
                    randomData[y + 1] = temp;
                }
                showData(randomData);
            }

            System.out.println("\n  Result of Pass "+(x+1));
            showData(randomData);
        }
    }

    //METHOD BUBBLE SORT DESCENDING
    private static void bubbleSortDesc(){
        int[] randomData = getRandomData(30, 300);
        // int[] randomData = {237, 84, 122, 260, 169};
        int size = randomData.length;

        for(int x=0; x<size; x++){
            System.out.println("\nPass "+(x+1));
            showData(randomData);

            for(int y=0; y<(size-x-1); y++){

                if(randomData[y] < randomData[y+1]){
                    //swap data
                    int temp = randomData[y];
                    randomData[y] = randomData[y + 1];
                    randomData[y + 1] = temp;
                }
                showData(randomData);
            }

            System.out.println("\n  Result of Pass "+(x+1));
            showData(randomData);
        }
    }

    //METHOD SELECTION SORT ASCENDING
    private static void selectionSortAsc(){
        int[] randomData = getRandomData(30, 300);
        int size = randomData.length;

        System.out.println("\nSelection Sort Ascending\n");

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step + 1; i < size; i++) {
                if (randomData[i] < randomData[min_idx]) {
                    min_idx = i;
                }
            }
            int temp = randomData[step];
            randomData[step] = randomData[min_idx];
            randomData[min_idx] = temp;
            showData(randomData);
        }
    }

    //METHOD SELECTION SORT DESCENDING
    private static void selectionSortDesc(){
        int[] randomData = getRandomData(30, 300);
        int size = randomData.length;

        System.out.println("\nSelection Sort Descending\n");

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step + 1; i < size; i++) {
                if (randomData[i] > randomData[min_idx]) {
                    min_idx = i;
                }
            }
            int temp = randomData[step];
            randomData[step] = randomData[min_idx];
            randomData[min_idx] = temp;
            showData(randomData);
        }
    }

    //METHOD UNTUK MENAMPILKAN DATA
    private static void showData(int[] data){
        for(int x=0; x<data.length; x++){
            System.out.print(data[x]+"\t");
        }
        System.out.print("\n");
    }

}