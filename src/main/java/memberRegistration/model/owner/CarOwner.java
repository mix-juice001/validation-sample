package memberRegistration.model.owner;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class CarOwner {

    @Min(value = 1, groups = {Register.class, Suspend.class})
    @Max(value = 120, groups = {Register.class, Suspend.class})
    @Digits(integer = 3, fraction = 0, groups = {Register.class, Suspend.class})
    @NotNull(groups = {Register.class, Suspend.class})
    private Integer age;

    @Size(min = 4, max = 12, groups = {Register.class, Suspend.class})
    @NotEmpty(groups = {Register.class, Suspend.class})
    private String name;

    @NotNull(groups = {Register.class, Suspend.class})
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
