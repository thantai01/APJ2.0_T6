package demo;

public interface Manager <T>{
    void add(T item);
    void edit(T item);
    void delete(T item);
    T[] getAll();
}
