package bai_hoc;

public class Teacher {
    private int id; // of object
    private String name; // để truy xuất thuộc tính private phải thông qua hàm public (get/set)
    // get: lấy
    // set: sửa
    public static String nameSchool = "CodeGym";

    public Teacher() {
    }

    public Teacher(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public static void goToWork() {
        System.out.println("Đến codegym");
        System.out.println(nameSchool); // phương thức static thì có thể truy cập thuộc tính static
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { // của đối tượng
        this.name = name;
    }
}
