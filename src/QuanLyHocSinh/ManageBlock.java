package QuanLyHocSinh;
import java.util.ArrayList;
public class ManageBlock {
    ArrayList<Block> block;
    public ManageBlock() {
        this.block = new ArrayList<>();
    }

    public void add(Block block) {
        this.block.add(block);
    }

    public void showInfor() {
        this.block.forEach(block -> System.out.println(block.toString()));
    }

    public Block searchById(String id) {
        Block block1 = this.block.stream().filter(block -> block.getId().equals(id)).findFirst().orElse(null);
        return block1;
    }


}