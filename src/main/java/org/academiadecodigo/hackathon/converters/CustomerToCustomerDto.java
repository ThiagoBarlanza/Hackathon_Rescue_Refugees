package org.academiadecodigo.hackathon.converters;

import org.academiadecodigo.hackathon.command.CustomerDto;
import org.academiadecodigo.hackathon.persistence.model.Customer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * A {@link Converter} implementation, responsible for {@link Customer} to {@link CustomerDto} type conversion
 */
@Component
public class CustomerToCustomerDto extends AbstractConverter<Customer, CustomerDto> {

    /**
     * Converts the customer model object into a customer DTO
     *
     * @param customer the customer
     * @return the customer DTO
     */
    @Override
    public CustomerDto convert(Customer customer) {

        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setPhone(customer.getPhone());
        customerDto.setLastName(customer.getLastName());
        customerDto.setLocation(customer.getLocation());
        customerDto.setGender(customer.getGender());
        customerDto.setAge(customer.getAge());
        customerDto.setBi(customer.getBi());
        return customerDto;
    }
}