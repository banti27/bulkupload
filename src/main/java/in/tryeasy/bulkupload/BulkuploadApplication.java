package in.tryeasy.bulkupload;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class BulkuploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(BulkuploadApplication.class, args);
    }
}
