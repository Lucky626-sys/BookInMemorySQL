//自訂的例外類別，用來處理書籍操作中的錯誤。
//好處：可以用更有意義的錯誤訊息來處理書籍錯誤，例如：throw new BookException("找不到書")
package com.example.demo.exception;

public class BookException extends Exception {
	public BookException(String message) {
		super(message);
	}
}