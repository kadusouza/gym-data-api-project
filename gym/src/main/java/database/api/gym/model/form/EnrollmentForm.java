package database.api.gym.model.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentForm {

    @NotNull(message = "Field id cannot be empty.")
    @Positive(message = "Member id should be a positive number.")
    private Long id;
}
