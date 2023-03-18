package ru.netology.netologyjdbc.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static ru.netology.netologyjdbc.utils.SqlUtils.read;

@Repository
@RequiredArgsConstructor
public class OrderDaoImpl implements OrderDao {

    private final String scriptFileName = "select_product.sql";
    private final NamedParameterJdbcTemplate template;

    @Override
    public List<String> getProductNameByCustomerName(String name) {
        String sqlScript = read(scriptFileName);

        MapSqlParameterSource param = new MapSqlParameterSource("name", name);

        return template.query(sqlScript, param,
                (rs, rowNum) -> rs.getString("product_name"));
    }
}
