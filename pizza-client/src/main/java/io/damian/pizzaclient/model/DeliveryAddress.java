package io.damian.pizzaclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryAddress {
    private String street;
    private String city;
    private String country;
    private String zipcode;
}
