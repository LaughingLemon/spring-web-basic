CREATE TABLE audit_log (
    audit_log_id INTEGER NOT NULL AUTO_INCREMENT,
    tag_skill VARCHAR(50) NOT NULL,
    client VARCHAR(50),
    practice VARCHAR(50),
    created DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (audit_log_id)
);

CREATE TABLE tags (
    tag_id INTEGER NOT NULL AUTO_INCREMENT,
    tag_words VARCHAR(50) NOT NULL,
    client VARCHAR(50),
    practice VARCHAR(50),
    PRIMARY KEY (tag_id)
);

CREATE TABLE skills (
    skill_id INTEGER NOT NULL AUTO_INCREMENT,
    skill_words VARCHAR(50) NOT NULL,
    client VARCHAR(50),
    practice VARCHAR(50),
    PRIMARY KEY (skill_id)
);
