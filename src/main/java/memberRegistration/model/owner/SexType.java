package memberRegistration.model.owner;

public enum SexType {
    MALE(new Sex("1", "Male")),
    FEMALE(new Sex("2", "Female")),;

    private Sex sex;

    SexType(Sex sex) {
        this.sex = sex;
    }

    public String getId() {
        return sex.getId();
    }

    public String getValue() {
        return sex.getValue();
    }

    public void setId(String id) {
        sex.setId(id);
    }

    public void setValue(String value) {
        sex.setValue(value);
    }

    public String getName() {
        return this.name();
    }
}
