package com.ashhellwig.ashhellwigspring;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Experience {
    private @Id @GeneratedValue Long id;
    private String companyName;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String jobSummary;
    private String description;
    private String skillsRequired;
    private String detailedAchievements;

    Experience() {
    }

    Experience(String companyName, String jobTitle, String startDate, String endDate, String jobSummary,
            String description, String skillsRequired, String detailedAchievements) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobSummary = jobSummary;
        this.description = description;
        this.skillsRequired = skillsRequired;
        this.detailedAchievements = detailedAchievements;
    }
}
