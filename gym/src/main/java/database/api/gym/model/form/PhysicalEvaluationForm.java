package database.api.gym.model.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalEvaluationForm {

    @Positive(message = "Member id should be a positive number.")
    private Long id;

    @Positive(message = "Member '{validatedValue}' should be a positive number.")
    private double weight;

    @Positive(message = "Member '{validatedValue}' should be a positive number.")
    private double height;
}
