package QuanLyHocSinh;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageBlock managerCandidate = new ManageBlock();
        while (true) {
            System.out.println("Application Manager Block");
            System.out.println("Enter 1: To insert block");
            System.out.println("Enter 2: To show information of block: ");
            System.out.println("Enter 3: To search block by id");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Block A");
                    System.out.println("Enter b: to insert Block B");
                    System.out.println("Enter c: to insert Block C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            managerCandidate.add(createBlock(scanner, "a"));
                            break;

                        }
                        case "b": {
                            managerCandidate.add(createBlock(scanner, "b"));
                            break;
                        }
                        case "c": {
                            managerCandidate.add(createBlock(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerCandidate.showInfor();
                    break;
                }
                case "3": {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    Block block = ManageBlock.searchById(id);
                    if (block == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(block.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

    public static Block createBlock(Scanner scanner, String cate) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Priotity: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new BlockA(id, name,address,priority);
        } else if (cate.equals("b")) {
            return new BlockB(id, name,address,priority);
        } else {
            return new BlockC(id, name,address,priority);
        }

    }
}
