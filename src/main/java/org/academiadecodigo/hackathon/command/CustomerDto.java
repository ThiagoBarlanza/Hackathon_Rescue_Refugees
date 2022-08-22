package org.academiadecodigo.hackathon.command;

import org.academiadecodigo.hackathon.persistence.model.Customer;

import jakarta.validation.constraints.*;

/**
 * The {@link Customer} data transfer object
 */
public class CustomerDto {

    private Integer id;

    private Integer bi;

    public Integer getBi() {
        return bi;
    }

    public void setBi(Integer bi) {
        this.bi = bi;
    }

    @NotNull(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    @Size(min = 3, max = 64)
    private String firstName;

    @NotNull(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    @Size(min = 3, max = 64)
    private String lastName;

    @Pattern(regexp = "^\\+?[0-9]*$", message = "Phone number contains invalid characters")
    @Size(min = 9, max = 16)
    private String phone;

    @NotNull(message = "Location is mandatory")
    @NotBlank(message = "Location is mandatory")
    private String location;
    @NotNull(message = "Age is mandatory")
    @NotBlank(message = "Age is mandatory")
    private Integer age;


    @NotNull(message = "Gender is mandatory")
    @NotBlank(message = "Gender is mandatory")
    private String gender;

    /**
     * Gets the id of the customer DTO
     *
     * @return the customer DTO id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id of the customer DTO
     *
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the first name of the customer DTO
     *
     * @return the customer DTO first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer DTO
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the customer DTO
     *
     * @return the customer DTO last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer DTO
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the phone of the customer DTO
     *
     * @return the customer DTO phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone of the customer DTP
     *
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * @see Object#toString()
     */
    @Override
    public String toString() {
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
