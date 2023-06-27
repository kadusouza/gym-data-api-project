package database.api.gym.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberUpdateForm {
    private String name;
    private String district;
    private LocalDate birth;

}
