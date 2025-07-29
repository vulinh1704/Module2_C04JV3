package management;

import java.util.List;

public interface IManager<T> { // khai báo interface chứa tập hợp các tính năng chung quản lý
    // và T sẽ đại diện kiểu dữ liệu đươc lý
    void add(T t);

    void update(int id, T t);

    void delete(int id);

    List<T> findAll();

    T findById(int id);
}
