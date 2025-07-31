package management;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StudentManager implements IManager<Student> {
    private List<Student> list;

    public StudentManager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Student newStudent) {
        this.list.add(newStudent);
    }

    public List<Student> findStudentByContainsName(String input) { // "H"
        List<Student> listData = new ArrayList<>();
        for (Student s : list) {
            String name = s.getName().toLowerCase(); // "Hưng  Hà hạ"
            input = input.toLowerCase();
            if (name.contains(input)) {
                listData.add(s);
            }
        }
        return listData;
    }

    @Override
    public void update(int id, Student newStudent) {
        int editIndex = this.findIndexById(id);
        if (editIndex == -1) {
            System.out.println("Không tìm thấy sinh viên này");
            return;
        }
        this.list.set(editIndex, newStudent);
    }

    @Override
    public void delete(int id) {
        int deleteIndex = this.findIndexById(id);
        if (deleteIndex == -1) {
            System.out.println("Không tìm thấy sinh viên này");
            return;
        }
        this.list.remove(deleteIndex);
        System.out.println("Xóa thành công!");
    }

    @Override
    public List<Student> findAll() {
        return this.list;
    }

    @Override
    public Student findById(int id) {
        int index = this.findIndexById(id); // -1
        if (index == -1) return null;
        Student studentFound = this.list.get(index);
        return studentFound;
    }

    private int findIndexById(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            Student s = this.list.get(i);
            if (s.getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
