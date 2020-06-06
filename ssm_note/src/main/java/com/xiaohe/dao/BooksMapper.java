package com.xiaohe.dao;

import com.xiaohe.pojo.Books;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaohe
 */
@Repository
public interface BooksMapper {
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
