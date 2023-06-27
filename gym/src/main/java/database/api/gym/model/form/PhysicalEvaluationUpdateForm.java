package database.api.gym.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalEvaluationUpdateForm {
    private double weight;
    private double height;
}
