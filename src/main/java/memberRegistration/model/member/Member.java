package memberRegistration.model.member;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;

public class Member {
    @NotNull
    @Min(value = 1)
    @Max(value = 999)
    @Digits(integer = 3, fraction = 0)
    private Integer id;

    @Size(min = 4, max = 12)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
