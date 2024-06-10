package business.dao.api;

import entity.Coffee;
import java.util.List;

public interface ICoffeeDao {
    List<Coffee> getCoffeeList();
    Coffee getCoffeeById(int id);
    void add(Coffee coffee);
    void delete(Coffee coffee);
}
