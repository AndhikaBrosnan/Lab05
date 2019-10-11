public class Barang {
    private String nm_barang;
    private String hrg_barang;

    public Barang(){}

    public Barang(String nm_barang, String hrg_barang) {
        this.nm_barang = nm_barang;
        this.hrg_barang = hrg_barang;
    }

    public void setNm_barang(String nm_barang) {
        this.nm_barang = nm_barang;
    }

    public void setHrg_barang(String hrg_barang) {
        this.hrg_barang = hrg_barang;
    }

    public String getNm_barang() {
        return nm_barang;
    }

    public String getHrg_barang() {
        return hrg_barang;
    }
}
