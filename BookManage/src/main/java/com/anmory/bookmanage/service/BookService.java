package com.anmory.bookmanage.service;

import com.anmory.bookmanage.dao.BookDao;
import com.anmory.bookmanage.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 上午10:02
 */

@Service// 代表spring帮助管理这个对象
public class BookService {
    @Autowired// 属性注入
    private BookDao bookDao;
    public List<BookInfo> getList() {
        return bookDao.mock();
    }
}
