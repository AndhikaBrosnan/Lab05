import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nm_barang;
        String hrg_barang;
        String cmd;

        Scanner input = new Scanner(System.in);
        Barang brg = null;

        String id_barang = "aweTYsSaA89op";
        String id_baru = "";
        System.out.println("\n=-=-=-=-=-=-=-=-=-=Lab05=-=-=-=-=-=-=-=-=-=");
        System.out.print("Masukan ID barang: ");
        id_barang = input.nextLine();

        System.out.println("Hasil FORMATTING:");
        recursiveUpper(id_barang, "");

        loop:
        do {
            System.out.print("Masukan perintah(lowercase): ");
            cmd = input.nextLine();
            String[] c = cmd.split(" ");

            switch (c[0]) {
                case "exit":
                    System.out.println("Terimakasih!");
                    break loop;
                case "ubah":
                    id_barang = c[2];
                    recursiveUpper(id_barang, "");
                    break;
                case "tambah":
                    nm_barang = c[2];
                    hrg_barang = c[3];

                    if (brg == null) {

                        brg = new Barang(nm_barang, hrg_barang);

                        System.out.println("Sukses menambahkan barang dengan nama "+ nm_barang+", harga "+ hrg_barang);
                    } else {
                        System.out.println("Sudah ada barang di dalam memori ");
                    }
                    break;
                default:
                    System.out.println("Input tidak valid!");
                    break;
            }

        } while (true);

    }

    private static String recursiveUpper(String obj, String objbaru) {
        String abcUP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abcLOW = "abcdefghijklmnopqrstuvwxyz";

        char[] upCase = abcUP.toCharArray();
        char[] lowCase = abcLOW.toCharArray();

        String id_lama = obj;
        String id_baru = objbaru;
        String id_fix = "";

        if (id_lama.length() == 0) {
            return id_baru;
        } else if (id_lama.length() == 1) {
            if ((int) id_lama.charAt(id_lama.length() - 1) < 123 && (int) id_lama.charAt(id_lama.length() - 1) > 96) {
                for (int j = 0; j < lowCase.length; j++) {
                    if (id_lama.charAt(0) == lowCase[j]) {
                        id_baru = upCase[j] + id_baru;
                    }
                }

                id_fix = id_baru;
//
//                System.out.println("1. id lama(if): "+ id_lama);
                System.out.println("ID RECURSIVE BARU: " + id_baru);
                return id_baru;
            } else {
                id_baru = id_lama.charAt(0) + id_baru;
                id_fix = id_baru;

//                System.out.println("2. id lama(else): "+ id_lama);
                System.out.println("ID RECURSIVE BARU: " + id_baru);
                return id_baru;
            }
        } else {
            if ((int) id_lama.charAt(id_lama.length() - 1) < 123 && (int) id_lama.charAt(id_lama.length() - 1) > 96) {
                for (int j = 0; j < lowCase.length; j++) {
                    if (id_lama.charAt(id_lama.length() - 1) == lowCase[j]) {
//                        id_baru = id_lama.substring(0,id_lama.length()-1);
                        id_baru = upCase[j] + id_baru;
                    }
                }

                recursiveUpper(id_lama.substring(0, id_lama.length() - 1), id_baru);

//                System.out.println("3. id lama(if): "+ id_lama);
//                System.out.println("3. id baru(if): " + id_baru);
                return id_baru;

            } else {
                id_baru = objbaru;
                id_baru = id_lama.charAt(id_lama.length() - 1) + id_baru;

                recursiveUpper(id_lama.substring(0, id_lama.length() - 1), id_baru);

//                System.out.println("4. id lama(else): "+ id_lama);
//                System.out.println("4. id baru(else): " + id_baru);
                return id_baru;
            }
        }
    }
}
