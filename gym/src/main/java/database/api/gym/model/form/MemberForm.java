package database.api.gym.model.form;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberForm {

    @NotBlank(message = "Fill the field correctly")
    @NotEmpty
    @Size(min = 3, max = 50, message = "'{validatedValue}' has to be between {min} and {max} characters.")
    private String name;

    @NotBlank(message = "Fill the field correctly")
    @CPF(message = "'{validatedValue}' is invalid by the brazilian required document format." )
    private String documentId;

    @NotBlank(message = "Fill the field correctly")
    @Size(min = 3, max = 50, message = "'{validatedValue}' has to be between {min} and {max} characters.")
    private String district;

    @NotNull(message = "Date field cannot be empty")
    @Past(message = "Date '{validatedValue}' is invalid." )
    private LocalDate birth;
}
