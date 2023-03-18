package ru.netology.netologyjdbc.dao;

import java.util.List;

public interface OrderDao {

    List<String> getProductNameByCustomerName(String name);
}
