package com.ashhellwig.ashhellwigspring;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Experience {
    private @Id @GeneratedValue Long id;
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String description;

    Experience() {
    }

    Experience(String company, String jobTitle, String startDate, String endDate, String description) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }
}
