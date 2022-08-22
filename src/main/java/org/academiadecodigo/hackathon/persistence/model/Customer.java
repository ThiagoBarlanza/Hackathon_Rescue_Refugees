package org.academiadecodigo.hackathon.persistence.model;

import javax.persistence.*;


/**
 * The customer model entity
 */
@Entity
@Table(name = "customer")
public class Customer extends AbstractModel {

    private String firstName;
    private String lastName;
    private String phone;
    private String location;
    private Integer age;
    private String gender;
    private Integer bi;

    public Integer getBi() {
        return bi;
    }

    public void setBi(Integer bi) {
        this.bi = bi;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the first name of the customer
     *
     * @return the customer last name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer
     *
     * @param firstName the name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the customer
     *
     * @return the customer last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer
     *
     * @param lastName the name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the phone of the customer
     *
     * @return the customer phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone of the customer
     * firstName
     *
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {

        // printing recipients with lazy loading
        // and no session will cause issues
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", bi='" + bi + '\'' +
                "} " + super.toString();
    }
}