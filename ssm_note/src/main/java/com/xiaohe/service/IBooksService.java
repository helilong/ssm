package com.xiaohe.service;

import com.xiaohe.pojo.Books;

import java.util.List;

public interface IBooksService {
    //查询方法
    List<Books> findAll();
    //添加方法
    int addBook(Books books);
    //删除
    int deleteBook(int id);
    //修改
    int updateBook(Books books);
    //根据id查询
    Books findId(int id);
}
