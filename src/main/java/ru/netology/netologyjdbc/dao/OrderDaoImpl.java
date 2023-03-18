package ru.netology.netologyjdbc.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static ru.netology.netologyjdbc.utils.SqlUtils.read;

@Repository
public class OrderDaoImpl implements OrderDao {

    String scriptFileName = "select_product.sql";
    String sqlScript;
    public OrderDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
        sqlScript = read(scriptFileName);
    }

    private final NamedParameterJdbcTemplate template;

    @Override
    public List<String> getProductNameByCustomerName(String name) {

        MapSqlParameterSource param = new MapSqlParameterSource("name", name);

        return template.queryForList(sqlScript, param, String.class);
    }
}
