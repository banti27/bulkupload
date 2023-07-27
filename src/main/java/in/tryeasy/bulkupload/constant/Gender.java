package in.tryeasy.bulkupload.constant;

public enum Gender {
    M("Male"), F("Female");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
