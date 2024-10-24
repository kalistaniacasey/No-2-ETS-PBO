class Buku {
    private String judulBuku;
    private String namaPenulis;
    private int tahunRilis;
    private String penerbitBuku;
    private String jenisBuku;

    public Buku(String judul, String penulis, int tahun, String penerbit, String kategori) {
        this.judulBuku = judul;
        this.namaPenulis = penulis;
        this.tahunRilis = tahun;
        this.penerbitBuku = penerbit;
        this.jenisBuku = kategori;
    }

    public void tampilkanInfo() {
        System.out.println("Detail Buku:");
        System.out.println("Judul      : " + judulBuku);
        System.out.println("Penulis    : " + namaPenulis);
        System.out.println("Tahun Rilis: " + tahunRilis);
        System.out.println("Penerbit   : " + penerbitBuku);
        System.out.println("Kategori   : " + jenisBuku);
    }
}
