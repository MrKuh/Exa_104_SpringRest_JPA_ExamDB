package at.kaindorf.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JsonExam {
    private Integer examId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfExam;
    private Integer duration;
    private Integer studentId;
    private Integer subjectId;
}
