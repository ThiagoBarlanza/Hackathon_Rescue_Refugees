package org.academiadecodigo.hackathon.persistence.dao;

import org.academiadecodigo.hackathon.persistence.model.Model;

import java.util.List;

/**
 * Base interface for data access objects, provides methods to manage models
 * @param <T> the model type
 */
public interface Dao<T extends Model> {

    /**
     * Gets a list of the model type
     *
     * @return the model list
     */
    List<T> findAll();

    /**
     * Gets the model
     *
     * @param id the model id
     * @return the model
     */
    T findById(Integer id);

    /**
     * Saves or updates the model
     *
     * @param modelObject the model to be saved or updated
     * @return the saved or updated model
     */
    T saveOrUpdate(T modelObject);

    /**
     * Deletes the model
     *
     * @param id the id of the model to be deleted
     */
    void delete(Integer id);

    List<T>findAllCustomer2(Integer age,String firstName,String lastName,Integer bi,String phone,String location,String gender);
}