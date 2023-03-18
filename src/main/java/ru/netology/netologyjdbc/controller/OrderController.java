package ru.netology.netologyjdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.netology.netologyjdbc.service.OrderService;

@Controller
@RequestMapping("/products")
public class OrderController {


    private final OrderService orderService;
    private OrderController(OrderService service) {
        this.orderService = service;
    }

    @GetMapping("/fetch-product")
    @ResponseBody
    public String getProductNameByCustomerName(@RequestParam(value = "name") String name) {
        return orderService.getProductNameByCustomerName(name);
    }

}
