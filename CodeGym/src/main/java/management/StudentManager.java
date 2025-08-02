package management;

import model.Student;

import java.util.*;

public class StudentManager implements IManager<Student> {
    private Map<Integer, Student> studentMap;

    public StudentManager() {
        this.studentMap = new HashMap<>();
    }

    @Override
    public void add(Student newStudent) {
        this.studentMap.put(newStudent.getId(), newStudent);
    }

    public boolean isExist(int id) {
        return this.studentMap.containsKey(id);
    }

    public List<Student> findStudentByContainsName(String input) { // "H"
        List<Student> listAll = this.findAll();
        List<Student> listData = new ArrayList<>();
        for (Student s : listAll) {
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
        this.studentMap.put(id, newStudent);
    }

    @Override
    public void delete(int id) {
        this.studentMap.remove(id);
    }

    @Override
    public List<Student> findAll() {
        Collection<Student> students = studentMap.values(); // Collection
        return new ArrayList<>(students);
    }

    @Override
    public Student findById(int id) {
        return this.studentMap.get(id);
    }
}

