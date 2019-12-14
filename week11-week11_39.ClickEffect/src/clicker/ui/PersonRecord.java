/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

/**
 *
 * @author Warglaive
 */
public interface PersonRecord {

    void Record(Person person);

    Person get(String id);

    void delete(Person person);

    void delete(String id);

    void deleteAll();
}
