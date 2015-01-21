package memberRegistration.model.owner;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Car {

    @NotEmpty(groups = Register.class, message = "色は必ず入力してください。")
    private String color;

    @NotEmpty(groups = Register.class, message = "モデルは必ず入力してください。")
    @Length(max = 10, groups = {Register.class, Suspend.class}, message = "モデルは10文字以内で入力してください。")
    private String model;

    @Max(value = 2015, groups = {Register.class, Suspend.class}, message = "製造年は1960から2015の範囲で入力してください。")
    @Min(value = 1960, groups = {Register.class, Suspend.class}, message = "製造年は1960から2015の範囲で入力してください。")
    @NotNull(groups = {Register.class}, message = "製造年は必ず入力してください。")
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
