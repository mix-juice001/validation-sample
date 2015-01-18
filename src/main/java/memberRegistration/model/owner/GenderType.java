package memberRegistration.model.owner;

public enum GenderType {
    MALE(new Gender("1", "男性")),
    FEMALE(new Gender("2", "女性")),;

    private Gender gender;

    GenderType(Gender gender) {
        this.gender = gender;
    }

    public String getId() {
        return gender.getId();
    }

    public String getValue() {
        return gender.getValue();
    }

    public String getName() {
        return this.name();
    }
}
