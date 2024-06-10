package business.dao;

import business.dao.api.ICoffeeDao;
import entity.Coffee;
import entity.enums.*;
import repository.CoffeeRepository;

import java.util.ArrayList;
import java.util.List;

public class CoffeSupplierDao implements ICoffeeDao {
    private CoffeeRepository repository = new CoffeeRepository();

    @Override
    public List<Coffee> getCoffeeList(){
        return repository.getCoffeeList();
    }

    @Override
    public void add(Coffee coffee) {
        repository.addCoffee(coffee);
    }

    @Override
    public void delete(Coffee coffee) {

    }
    @Override
    public Coffee getCoffeeById(int id){
        return repository.getCoffeeById(id);
    }
}
