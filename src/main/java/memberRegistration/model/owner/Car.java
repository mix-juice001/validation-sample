package memberRegistration.model.owner;

import memberRegistration.model.owner.validation.Sufficient;
import memberRegistration.model.owner.validation.Necessary;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Car {

    @NotEmpty(groups = Sufficient.class, message = "色は必ず入力してください。")
    private String color;

    @NotEmpty(groups = Sufficient.class, message = "モデルは必ず入力してください。")
    @Length(max = 10, groups = {Sufficient.class, Necessary.class}, message = "モデルは10文字以内で入力してください。")
    private String model;

    @Range(min = 1960, max = 2015, groups = {Sufficient.class, Necessary.class}, message = "製造年は1960から2015の範囲で入力してください。")
    @NotNull(groups = {Sufficient.class}, message = "製造年は必ず入力してください。")
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
