package QuanLyHocSinh;

public class BlockB extends Block {
    public static final String Mon_Toan="Math";
    public static final String Mon_Sinh="Biology";
    public static final String Mon_Hoa="Chemistry";

    public BlockB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "BlockB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA +
                '}';
    }
}
