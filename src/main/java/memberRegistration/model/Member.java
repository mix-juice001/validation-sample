package memberRegistration.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Member {
    @Min(value = 1)
    @Max(value = 999)
    @Digits(integer = 3, fraction = 0, message = "\"${validatedValue}\" is not valid.")
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
