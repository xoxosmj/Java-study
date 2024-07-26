package board.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

public class BoardDTO {
    @NonNull
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String subject;
    @NonNull
    private String content;

}
