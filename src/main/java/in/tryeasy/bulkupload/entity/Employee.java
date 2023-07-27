package in.tryeasy.bulkupload.entity;

import in.tryeasy.bulkupload.constant.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "te_employee")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private Long id;

    private String username;

    private String password;

    private String firstName; // first_name

    private String lastName; // last_name

    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthDate;// birth_date

}
