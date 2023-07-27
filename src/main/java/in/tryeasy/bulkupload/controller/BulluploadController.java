package in.tryeasy.bulkupload.controller;

import in.tryeasy.bulkupload.service.BulkuploadService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping("/api/bulkupload")
@RequiredArgsConstructor
public class BulluploadController {

    private final BulkuploadService bulkuploadService;


    @PostMapping(path = "/employee")
    public String employeeUpload(@RequestParam("file") MultipartFile file,
                               @RequestParam("defaultPassword") String defaultPassword) {
        log.info("START: uploading employee");
        this.bulkuploadService.upload(file, defaultPassword);
        log.info("END: uploading employee");

        return "File uploaded successfully!!!";
    }

}
