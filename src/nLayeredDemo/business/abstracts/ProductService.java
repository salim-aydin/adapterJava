package nLayeredDemo.business.abstracts;

import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface ProductService { // service görürsen bir yerde , bu Interface demektir...
    void add(Product product);
    List<Product> getAll();
}
