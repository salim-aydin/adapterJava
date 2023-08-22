package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.abstracts.Entity;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        //ToDo: Spring IOC ile çözülecek...
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());


        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product); //

    }
    }
