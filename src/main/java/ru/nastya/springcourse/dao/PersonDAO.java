package ru.nastya.springcourse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.nastya.springcourse.models.Person;

import java.sql.*;
import java.util.List;

@Component
public class PersonDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Person> index() throws SQLException {
        return jdbcTemplate.query("SELECT * FROM people.person", new PersonMapper());
    }

    public Person show(int id) {
        return jdbcTemplate.query("SELECT * FROM people.person WHERE id=?", new Object[]{id}, new PersonMapper())
                .stream().findAny().orElse(null);

    }

    public void save(Person person) {

        jdbcTemplate.update("INSERT INTO people.person VALUES (1,?,?,?)",
                person.getName(), person.getAge(), person.getEmail());

    }

    public void update(int id, Person updatePerson) {

        jdbcTemplate.update("UPDATE people.person SET name=?, age=?, email=? WHERE id=?",
                updatePerson.getName(), updatePerson.getAge(), updatePerson.getEmail(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM people.person WHERE id=?", id);

    }
}

