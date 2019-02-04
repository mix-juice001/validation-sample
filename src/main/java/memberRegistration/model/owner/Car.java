package memberRegistration.model.owner;

import memberRegistration.model.owner.validation.Necessary;
import memberRegistration.model.owner.validation.Sufficient;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

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

}
