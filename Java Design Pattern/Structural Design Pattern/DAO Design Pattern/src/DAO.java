import java.util.List;

public interface DAO<T>
{
    public List<T> getAll();
    public T getId(long id);

    void insert(T t);

    void delete(T t);
}
