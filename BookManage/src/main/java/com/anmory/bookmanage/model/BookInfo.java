package com.anmory.bookmanage.model;

import java.math.BigDecimal;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-02-22 上午6:12
 */

public class BookInfo {
    private Integer bookId;
    private String bookName;
    private String author;
    private Integer num;
    private BigDecimal price;
    private String publisher;
    private Boolean status;
    private String statusCN;

    public BookInfo(Integer bookId, String bookName, String author, Integer num, BigDecimal price, String publisher, Boolean status, String statusCN) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.num = num;
        this.price = price;
        this.publisher = publisher;
        this.status = status;
        this.statusCN = statusCN;
    }

    public BookInfo() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getStatusCN() {
        return statusCN;
    }

    public void setStatusCN(String statusCN) {
        this.statusCN = statusCN;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", status=" + status +
                ", statusCN='" + statusCN + '\'' +
                '}';
    }
}
