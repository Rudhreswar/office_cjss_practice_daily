package com.tasks.task2.data;

public class Benefits {

    private long benifitId;
    private String benefitName;
    private String descriptionOfBenefits;


    Benefits() {

    }

    public Benefits(long benifitId, String benefitName, String descriptionOfBenefits) {
        this.benifitId = benifitId;
        this.benefitName = benefitName;
        this.descriptionOfBenefits = descriptionOfBenefits;
    }


    public long getBenifitId() {
        return benifitId;
    }

    public void setBenifitId(long benifitId) {
        this.benifitId = benifitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getDescriptionOfBenefits() {
        return descriptionOfBenefits;
    }

    public void setDescriptionOfBenefits(String descriptionOfBenefits) {
        this.descriptionOfBenefits = descriptionOfBenefits;
    }


}
