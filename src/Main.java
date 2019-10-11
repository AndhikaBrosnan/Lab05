public class Main {
    public static void main(String[] args) {

        String abcUP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abcLOW = "abcdefghijklmnopqrstuvwxyz";

        char[] upCase = abcUP.toCharArray();
        char[] lowCase = abcLOW.toCharArray();

        // TODO: 10/11/2019 KALO ASCIInya di range huruf lowercase, pindahin jadi uppercase

        System.out.println("UPPER ascii " + upCase[0] + " :" + (int) upCase[0]);
        System.out.println("UPPER ascii " + upCase[25] + " :" + (int) upCase[25]);


        System.out.println("LOWER ascii " + lowCase[0] + " :" + (int) lowCase[0]);
        System.out.println("LOWER ascii " + lowCase[25] + " :" + (int) lowCase[25]);

        String id_barang = "aweTYsSaA89op";
        String id_baru = "";

        System.out.println("IDNYA 1: " + id_barang);
        int temp = 0;
//        id_baru = id_barang.substring(0,j)+upCase[j]+id_barang.substring(j+1);
        System.out.println("Penggunaan Looping: ");

        // TODO: 10/11/2019 KALO PEMAKAIAN FOR SIH CITIL YAK :X
        for (int i = 0; i < id_barang.length(); i++) {
            if ((int) id_barang.charAt(i) < 123 && (int) id_barang.charAt(i) > 96) {
                for (int j = 0; j < lowCase.length; j++) {
                    if (id_barang.charAt(i) == lowCase[j]) {
                        id_baru += upCase[j];
                    }
                }
            } else {
                id_baru += id_barang.charAt(i);
            }
        }
        System.out.println("ID BARU: " + id_baru);
        System.out.println("\n"+"Hasil Recrusive:");
        System.out.println(recursiveUpper(id_barang,""));
    }

    private static String recursiveUpper(String obj,String objbaru) {
        String abcUP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abcLOW = "abcdefghijklmnopqrstuvwxyz";

        char[] upCase = abcUP.toCharArray();
        char[] lowCase = abcLOW.toCharArray();

        String id_lama = obj;
        String id_baru = objbaru;
        String id_fix = "";

        if (id_lama.length() == 0) {
            return id_baru;
        }else if (id_lama.length() == 1){
            if ((int) id_lama.charAt(id_lama.length()-1) < 123 && (int) id_lama.charAt(id_lama.length()-1) > 96) {
                for (int j = 0; j < lowCase.length; j++) {
                    if (id_lama.charAt(0) == lowCase[j]) {
                        id_baru = upCase[j]+id_baru;
                    }
                }

                id_fix = id_baru;

                System.out.println("1. id lama(if): "+ id_lama);
                System.out.println("1. id baru(if): " + id_baru);
                return id_baru;
            }else {
                id_baru = id_lama.charAt(0)+id_baru;
                id_fix = id_baru;

                System.out.println("2. id lama(else): "+ id_lama);
                System.out.println("2. id baru(else): " + id_baru);
                return id_baru;
            }
        }
        else {
            if ((int) id_lama.charAt(id_lama.length()-1) < 123 && (int) id_lama.charAt(id_lama.length()-1) > 96) {
                for (int j = 0; j < lowCase.length; j++) {
                    if (id_lama.charAt(id_lama.length()-1) == lowCase[j]) {
//                        id_baru = id_lama.substring(0,id_lama.length()-1);
                        id_baru = upCase[j] + id_baru;
                    }
                }

                recursiveUpper(id_lama.substring(0,id_lama.length() - 1),id_baru);

                System.out.println("3. id lama(if): "+ id_lama);
                System.out.println("3. id baru(if): " + id_baru);
                return id_baru;

            }else {
                id_baru = objbaru;
                id_baru = id_lama.charAt(id_lama.length()-1)+id_baru;

                recursiveUpper(id_lama.substring(0,id_lama.length() - 1), id_baru);

                System.out.println("4. id lama(else): "+ id_lama);
                System.out.println("4. id baru(else): " + id_baru);
                return id_baru;
            }
        }
    }
}
