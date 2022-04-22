package QLX;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private XeMay[] danhSach = new XeMay[20];
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {

    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == danhSach[i].getTen()) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void sapXep() {

    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyXeMay ql = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Yamaha", "Xanh trắng", "R3", 120, 300);
        XeMay xm2 = new XeMay("Honda", "Bạc trắng", "R2", 250, 400);
        ql.them(xm1);
        ql.them(xm2);

        ql.print();
        XeMay xm3 = new XeMay("Honda", " trắng", "R2", 450, 350);
        ql.sua("R2", xm2);
        ql.print();
    }
}
