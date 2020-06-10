package com.xiaohe.controller;

import com.xiaohe.pojo.Books;
import com.xiaohe.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private IBooksService booksService;
    @Autowired
    private Books books;

    @ResponseBody
    @RequestMapping("/list")
    public List<Books> list(){
        System.out.println("控制层---查询所有");
        System.out.println(booksService.findAll());
        return booksService.findAll();
    }

    @RequestMapping("/deleteBook")
    public String delete(@RequestBody Books book){
        System.out.println("控制层------删除一个");
        System.out.println(book.getBookId());
       int i= booksService.deleteBook(book.getBookId());
        System.out.println("i+++"+i);
        return "redirect:show";
    }

    @RequestMapping("/insertBook")
    public  String insert(@RequestBody Books book){
        System.out.println(book);
        System.out.println(booksService.addBook(book));
        return "show";
    }

}
