package in.tryeasy.bulkupload.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import in.tryeasy.bulkupload.constant.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDto {

    @CsvBindByName(column = "ID")
    private Long id;

    @CsvBindByName(column = "USERNAME")
    private String username;

    @CsvBindByName(column = "FIRST_NAME")
    private String firstName;

    @CsvBindByName(column = "LAST_NAME")
    private String lastName;

    @CsvBindByName(column = "EMAIL")
    private String email;

    @CsvBindByName(column = "GENDER")
    private Gender gender;

    @CsvBindByName(column = "BIRTH_DATE")
    @CsvDate("yyyy-MM-dd")
    private LocalDate birthDate;

}
