package memberRegistration.model.member;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;

public class Member {
    @NotNull(message = "IDは必ず入力してください。")
    @Min(value = 1, message = "IDは1から999の範囲で入力してください。")
    @Max(value = 999, message= "IDは1から999の範囲で入力してください。")
    private Integer id;

    @Size(min = 4, max = 12, message = "名前は4文字から12文字の範囲で入力してください。")
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
