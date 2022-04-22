package QuanLyHocSinh;

public class BlockA extends Block{
    public static final String Mon_Toan="Math";
    public static final String Mon_Ly="Physical";
    public static final String Mon_Hoa="Chemistry";

    public BlockA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "BlockA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';
    }
}
