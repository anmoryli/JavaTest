package com.anmory.bookmanage.controller;

import com.anmory.bookmanage.model.BookInfo;
import com.anmory.bookmanage.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 上午8:19
 */

@RequestMapping("/book")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/getList")
    public List<BookInfo> getList() {
        return bookService.getList();
    }
}
