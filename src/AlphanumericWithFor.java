public class AlphanumericWithFor {
    public void main (){

        String abcUP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abcLOW = "abcdefghijklmnopqrstuvwxyz";

        char[] upCase = abcUP.toCharArray();
        char[] lowCase = abcLOW.toCharArray();

        String id_barang = "aweTYsSaA89op";
        String id_baru = "";

        // TODO: 10/11/2019 with FOR
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

        System.out.println("ID BARU forloop: " + id_baru);
    }
}
