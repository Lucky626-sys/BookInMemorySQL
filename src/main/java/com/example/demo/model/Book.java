//代表「一本書」的資料結構（Java Bean），用來封裝書籍的資訊
package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private Integer id;
	private String name;
	private Double price;
	private Integer amount;
	private Boolean pub = false;//是否出刊，如果這裡設定false就不需要在BookRepositoryJDBCImpl檢查book.getPub()是否為null
}
