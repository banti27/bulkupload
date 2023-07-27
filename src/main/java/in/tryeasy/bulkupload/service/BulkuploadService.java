package in.tryeasy.bulkupload.service;

import org.springframework.web.multipart.MultipartFile;

public interface BulkuploadService {

    void upload(MultipartFile file, String defaultPassword);

}
