package book2;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter

public class BookDTO implements Serializable {
    @NonNull
    private String code;
    @NonNull
    private String title;
    @NonNull
    private String author;
    @NonNull
    private int price;
    @NonNull
    private int qty;
    private int total;

    @Override
    public String toString() {
        return code + "\t" + title + "\t" + author + "\t" + price + "\t" + qty + "\t" + total;
    }

}
