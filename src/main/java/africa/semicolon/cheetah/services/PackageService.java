package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.data.models.Package;

public interface PackageService {
    AddPackageResponse addPackage(AddPackageRequest addPackageRequest);
    Package findById(String id);
}
