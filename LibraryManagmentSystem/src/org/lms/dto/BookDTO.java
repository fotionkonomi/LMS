package org.lms.dto;

public class BookDTO {

	private Integer bookId;

	private String bookTitle;

	private String bookAuthor;

	private CategoryDTO categoryOfTheBook;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public CategoryDTO getCategoryOfTheBook() {
		return categoryOfTheBook;
	}

	public void setCategoryOfTheBook(CategoryDTO categoryOfTheBook) {
		this.categoryOfTheBook = categoryOfTheBook;
	}

}
