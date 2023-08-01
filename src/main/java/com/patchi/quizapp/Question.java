package com.patchi.quizapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/* this is the Model or Entities class in the MVC. That is, the Question Class represents each row of data in the database.
 * For e.g, in pgAdmin, each row has an id, question_title and so on. That is the Question class
 */

 // if table name is different from class name, then you have to @Table as well. But since our table name is question also,
 // we don't need to add anything else.
 @Data
@Entity
public class Question {
    // while these variables have to match the databases' variable names, as Java and SQL uses different casing syntax,
    // our ORM Framework (in this case, JPA) will take care of it

    // these annotations sets the variable id as the Primary Key, and makes its values to be auto-generated
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String category;
    private String difficulty;
    private String option1;
    private String option2;
    private String option3;
    private String questionTitle;
    private String rightAnswer;
}
