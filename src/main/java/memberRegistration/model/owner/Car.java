package memberRegistration.model.owner;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Car {

    @NotEmpty(groups = Register.class)
    private String color;

    @NotEmpty(groups = Register.class)
    @Length(max = 10, groups = {Register.class, Suspend.class})
    private String model;

    @Max(value = 2015, groups = {Register.class, Suspend.class})
    @Min(value = 1960, groups = {Register.class, Suspend.class})
    @NotNull(groups = {Register.class})
    private Integer constructionYear;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }
}
