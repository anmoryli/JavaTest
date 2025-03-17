package com.anmory.bookmanage.dao;

import com.anmory.bookmanage.model.BookInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-23 上午10:03
 */

@Repository
public class BookDao {
    public List<BookInfo> mock() {
        Random rand = new Random();
        List<BookInfo> bookInfos = new ArrayList<BookInfo>();
        for(int i = 1; i <= 10; i++) {
            BookInfo info = new BookInfo();
            info.setBookId(i);
            info.setBookName("图书" + i);
            info.setNum(rand.nextInt(100));
            info.setAuthor("作者" + i);
            info.setPrice(BigDecimal.valueOf(rand.nextInt(100)));
            info.setPublisher("出版社" + i);
            info.setStatus(rand.nextBoolean());
            String str;
            if(info.getStatus() == true) {
                str = "可借阅";
                info.setStatusCN(str);
            }
            else {
                str = "不可借阅";
                info.setStatusCN(str);
            }
            System.out.println(info.toString());
            bookInfos.add(info);
            System.out.println(bookInfos.toString());
        }
        return bookInfos;
    }
}
