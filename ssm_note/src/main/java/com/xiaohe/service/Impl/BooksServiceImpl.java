package com.xiaohe.service.Impl;

import com.xiaohe.dao.BooksMapper;
import com.xiaohe.pojo.Books;
import com.xiaohe.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BooksServiceImpl implements IBooksService {
    @Autowired
    BooksMapper booksMapper;

    @Override
    public List<Books> findAll() {
        System.out.println("service层-------查询所有");
        return booksMapper.findAll();
    }

    @Override
    public int addBook(Books books) {

        return booksMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {

        return booksMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {

        return booksMapper.updateBook(books);
    }

    @Override
    public Books findId(int id) {

        return booksMapper.findId(id);
    }

}
