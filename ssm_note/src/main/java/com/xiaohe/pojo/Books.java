package com.xiaohe.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 实体类 使用lombok自动生成get set
 */
@Component
public class Books {
    private  int bookId;
    private  String bookName;
    private int bookCounts;
    private String detail;
}
