DROP TABLE IF EXISTS EXPERIENCE;
CREATE TABLE EXPERIENCE (
  id INTEGER PRIMARY KEY,
  company_name VARCHAR(500) NOT NULL,
  start_date VARCHAR(500) NOT NULL,
  end_date VARCHAR(500) NOT NULL,
  job_title VARCHAR(500) NOT NULL,
  job_summary VARCHAR(500) NOT NULL,
  description VARCHAR(5000) NOT NULL,
  skills_required VARCHAR(500) NOT NULL,
  detailed_achievements VARCHAR(500) NOT NULL
);
INSERT INTO EXPERIENCE (
    company_name,
    start_date,
    end_date,
    job_title,
    job_summary,
    description,
    skills_required,
    detailed_achievements
  )
VALUES
  (
    "IBM",
    "2017-07-01",
    "2017-03-01",
    "Global Technology Services: Solutions, Del, & Transf.",
    "Anthem Healthcare z/OS Mainframe Administrator and State Street Investment Bank Help Desk Admin",
    "Level 1.5 CTS Agent, administrator rights to remote into State Street virtual desktops and physical machines after initial troubleshooting as failed on other teams. Mainly services the U.S. and India. Support Active Directory and configuration of multiple server types. Support IBM mainframe z/OS systems. Write troubleshooting and DevOps documentation and SLA status templates. Deploy and maintain Windows 10 and Ent. Server 2012-16, Deploy Microsoft Office 365 via local source and configuration manager. Development of applications for z/OS utilizing various databases",
    "z/OS, MVS, JCL, SDSF, VSAM, Endevor, SyncSort, MQSeries, SQL, SPUFI, FileAid, Xpediter",
    "Master the Mainframe Part 2 Competitor"
  );