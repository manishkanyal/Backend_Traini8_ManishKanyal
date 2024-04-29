package com.traini8.Traini8.dtos;

import com.traini8.Traini8.entities.Address;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainingCenterDto {

    @NotBlank
    @Size(max=40,message="Center name should be less than 40 character")
    private String centerName;

    @NotBlank
    @Size(min = 12, max = 12, message="Center Code must be exactly 12 digits long")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$",message="Center Code must be exactly 12 digits long")
    private String centerCode;

    @Valid
    private AddressDto address;

    private int studentCapacity;

    private List<String> coursesOffered;

    @Pattern(regexp = "^$|^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Invalid email format")
    @Null(message = "Email must be empty or a valid email address", groups = EmptyEmailCheck.class)
    //@Pattern(regexp ="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$",message = "Invalid Email Passed!" )
    private String email;

    @NotBlank
    @Pattern(regexp="^[0-9]{10}$", message="Phone number must be 10 digits long")
    private String contactPhone;

    // Define a validation group for checking empty email
    public interface EmptyEmailCheck {}

}
