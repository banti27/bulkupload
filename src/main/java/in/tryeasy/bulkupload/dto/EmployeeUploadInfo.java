package in.tryeasy.bulkupload.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class EmployeeUploadInfo {
    private MultipartFile file;
    private String defaultPassword;
}
