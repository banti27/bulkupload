package in.tryeasy.bulkupload.service.impl;

import com.opencsv.bean.CsvToBeanBuilder;
import in.tryeasy.bulkupload.dto.EmployeeDto;
import in.tryeasy.bulkupload.entity.Employee;
import in.tryeasy.bulkupload.repository.EmployeeRepository;
import in.tryeasy.bulkupload.service.BulkuploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
@Service
public class EmployeeBulkuploadService implements BulkuploadService {

    private final EmployeeRepository employeeRepository;

    public EmployeeBulkuploadService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void upload(MultipartFile file, String defaultPassword) {
        try (var reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            final var employeeList = new CsvToBeanBuilder<EmployeeDto>(reader)
                    .withType(EmployeeDto.class)
                    .build()
                    .parse();

            for (var emp : employeeList) {
                final var employeeEntity = Employee.builder()
                        .id(emp.getId())
                        .email(emp.getEmail())
                        .birthDate(emp.getBirthDate())
                        .firstName(emp.getFirstName())
                        .lastName(emp.getLastName())
                        .gender(emp.getGender())
                        .username(emp.getUsername())
                        .password(defaultPassword)
                        .build();
                this.employeeRepository.save(employeeEntity);
            }
        } catch (IOException e) {
            log.error("Error while parsing file.", e);
        }
    }

}
