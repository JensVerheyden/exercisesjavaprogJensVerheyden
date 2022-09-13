package be.abis.courseadmin.enums;

public enum Gender {
    MALE("m", "his", "himself", "he"),
    FEMALE("f", "her", "herself", "she"),
    OTHER("o", "theirs", "itself", "they");

    String genderAbbreviation;
    String possessivePronoun;
    String reflexivePronoun;
    String personalPronoun;

    Gender(String genderAbbreviation, String possessivePronoun, String reflexivePronoun, String personalPronoun) {
        this.genderAbbreviation = genderAbbreviation;
        this.possessivePronoun = possessivePronoun;
        this.reflexivePronoun = reflexivePronoun;
        this.personalPronoun = personalPronoun;
    }

    public String getGenderAbbreviation() {
        return genderAbbreviation;
    }

    public String getPossessivePronoun() {
        return possessivePronoun;
    }

    public String getReflexivePronoun() {
        return reflexivePronoun;
    }

    public String getPersonalPronoun() {
        return personalPronoun;
    }
}




