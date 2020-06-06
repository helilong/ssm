package com.xiaohe.controller;

import com.xiaohe.pojo.Books;
import com.xiaohe.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private IBooksService iBooksService;
    @Autowired
    private Books books;

    @ResponseBody
    @RequestMapping("/list")
    public List<Books> list(){
        System.out.println("控制层---查询所有");
        System.out.println(iBooksService.findAll());
        return iBooksService.findAll();
    }

    @RequestMapping("deleteBook")
    public String delete(int id){
        System.out.println("控制层------删除一个");
        System.out.println(iBooksService.deleteBook(id));
        return "redirect:/show.html";
    }
}
