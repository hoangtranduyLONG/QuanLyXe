package QuanLyHocSinh;

public class BlockC extends Block{
    public static final String Mon_Van = "Literature";
    public static final String Mon_Su = "History";
    public static final String Mon_Dia = "Geography";

    public  BlockC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }



    @Override
    public String toString() {
        return "BlockB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA +
                '}';
    }
}