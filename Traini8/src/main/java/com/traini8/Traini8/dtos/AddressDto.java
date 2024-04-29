package com.traini8.Traini8.dtos;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import javax.print.DocFlavor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDto {

    //All the data member that has @NotBlank annonotation can never be send by user as an empty field . It will send error

    @NotBlank
    private String detailedAddress;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    private String pincode;

}
