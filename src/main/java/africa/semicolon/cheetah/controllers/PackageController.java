package africa.semicolon.cheetah.controllers;

import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.services.PackageService;
import africa.semicolon.cheetah.services.PackageServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {
    private final PackageService packageService = new PackageServiceImpl();
    @PostMapping("/api/v1/addpackage")
    public AddPackageResponse addPackage(@RequestBody AddPackageRequest addPackageRequest){
        return packageService.addPackage(addPackageRequest);
    }
}
