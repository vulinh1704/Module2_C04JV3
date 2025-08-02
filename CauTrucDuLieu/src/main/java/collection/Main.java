package collection;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(4);
//        linkedList.add(65);
//        linkedList.add(-3);
//        linkedList.showAll();

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(65);
        linkedList.add(-3);
        for(Integer e: linkedList) {
            System.out.println(e);
        }

        String name = "Linh";
//        System.out.println(name.);

        // duyệt các phần tử, xóa đầu, xóa cuối (qua các node)
        // Arraylist truy xuất 1 phần tử tại vị trí nào (index)

        // Chèn, xóa cuối, xóa vị trí bất kỳ (Nâng cao)
    }
}
