package memberRegistration.model.owner;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Car {

    @NotEmpty
    private String color;

    @NotEmpty(groups = CarOwner.GroupMale.class)
    @Length(max = 10)
    private String model;

    @Max(value = 2015)
    @Min(value = 1960)
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
