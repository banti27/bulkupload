package in.tryeasy.bulkupload.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class BulkuploadMvcController {


    @GetMapping
    public String getBulkupladHomePage() {
        return "bulk-upload";
    }

}
