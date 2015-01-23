package memberRegistration.model.owner;

import memberRegistration.model.owner.validation.Sufficient;
import memberRegistration.model.owner.validation.Necessary;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class CarOwner {

    @Min(value = 1, groups = {Sufficient.class, Necessary.class}, message = "年齢は1から120の範囲で入力してください。")
    @Max(value = 120, groups = {Sufficient.class, Necessary.class}, message = "年齢は1から120の範囲で入力してください。")
    @NotNull(groups = {Sufficient.class, Necessary.class}, message = "年齢は必ず入力してください。")
    private Integer age;

    @Size(min = 4, max = 12, groups = {Sufficient.class, Necessary.class}, message = "名前は4文字から12文字の範囲で入力してください。")
    @NotEmpty(groups = {Sufficient.class, Necessary.class}, message = "名前は必ず入力してください。")
    private String name;

    @NotNull(groups = {Sufficient.class, Necessary.class}, message = "性別は必ず入力してください。")
    private GenderType genderType;

    @Valid
    private Car car;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
