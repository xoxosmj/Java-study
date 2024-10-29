package book;

public class BookDTO {

    private int code, price, num, tot = 0;
    private String title, author = null;

    public BookDTO() {
    }

    public BookDTO(int code, String title, String author, int price, int num) {
        this.code = code;
        this.price = price;
        this.num = num;
        this.title = title;
        this.author = author;
        this.tot = price * num;
    }

    public int getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public int getTot() {
        return tot;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return code + "\t" + title + "\t" + author + "\t" + price + "\t" + num + "\t" + tot;

    }
}
