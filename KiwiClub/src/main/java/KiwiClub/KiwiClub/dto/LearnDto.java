package KiwiClub.KiwiClub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LearnDto {
    private Long kiwiId;
    private Long trickId;
    //nem adott unique eredmenyt progressre -> több lecture progress van mint kiwiId-ra és trickId-ra
    private Long lectureProgressId;
}