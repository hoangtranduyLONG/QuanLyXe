package QLX;

public class Oto extends PhuongTien{
    private int Socho;
    public Oto(){}
    public Oto(String hang, String mau, String ten, int gia, int socho) {
        super(hang, mau, ten, gia);
        this.Socho = socho;
    }

    public int getSocho() {
        return Socho;
    }

    public void setSocho(int socho) {
        this.Socho = socho;
    }
}
