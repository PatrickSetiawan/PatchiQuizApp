package com.patchi.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patchi.quizapp.Question;

/* this is the DAO Layer, which is responsible for retrieving data from the database and passing it back to the Service Layer */

// @Repository indicates that this class is used for storage, retrieval, search, update and delete operation on objects
// it is an interface and extends from JpaRepository which basically says that Jpa handles all the fetching of data etc.
// To do that, jpaRepo asks what type of table working with, and the type of the primary key. In this case, it is <Question, Integer>
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    // we don't need to run any additional SQL/HQL query sinc JPA does it knows when we type "findByCategory", it wants us to
    // search based on the "category" column in our table. So smart!
    List<Question> findByCategory(String category);
}
