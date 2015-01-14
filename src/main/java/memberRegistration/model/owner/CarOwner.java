package memberRegistration.model.owner;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class CarOwner {

    public interface GroupMale {
    }
    ;

    public interface GroupFemale {
    }
    ;

    @Min(value = 1)
    @Max(value = 120)
    @Digits(integer = 3, fraction = 0)
    private Integer age;

    @Size(min = 4, max = 12)
    private String name;

    private SexType sex;

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

    public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
