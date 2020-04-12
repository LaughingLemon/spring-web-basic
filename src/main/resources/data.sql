INSERT INTO audit_log (tag_skill) VALUES ('Slight Cough');
INSERT INTO audit_log (tag_skill, client, practice) VALUES ('Slight Cough', 'Client 1', 'Practice 1');
INSERT INTO audit_log (tag_skill, client) VALUES ('Slight Cough', 'Client 1');
INSERT INTO audit_log (tag_skill) VALUES ('Slight Cough');
INSERT INTO audit_log (tag_skill, client, practice) VALUES ('Slight Cough', 'Client 1', 'Practice 1');

INSERT INTO tags (tag_words) VALUES ('Slight Cough');
INSERT INTO tags (tag_words, client, practice) VALUES ('Slight Cough', 'Client 1', 'Practice 1');
INSERT INTO tags (tag_words, client, practice) VALUES ('Heavy Cough', 'Client 1', 'Practice 1');
INSERT INTO tags (tag_words, client, practice) VALUES ('Dry Cough', 'Client 1', 'Practice 1');

INSERT INTO skills (skill_words) VALUES ('Blood Test');
INSERT INTO skills (skill_words, client, practice) VALUES ('Blood Test', 'Client 1', 'Practice 1');
INSERT INTO skills (skill_words, client, practice) VALUES ('Urine Test', 'Client 1', 'Practice 1');
INSERT INTO skills (skill_words, client, practice) VALUES ('Blood Pressure Check', 'Client 1', 'Practice 1');
