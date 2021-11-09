package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.data.repositories.PackageRepository;
import africa.semicolon.cheetah.data.repositories.PackageRepositoryImpl;
import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.data.models.Package;
import africa.semicolon.cheetah.utils.ModelMapper;


public class PackageServiceImpl implements PackageService{
    private static final PackageRepository packageRepository = new PackageRepositoryImpl();

    @Override
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
        Package aPackage = ModelMapper.map(addPackageRequest);
        Package savedPackage = packageRepository.save(aPackage);
        return ModelMapper.map(savedPackage);
    }

    @Override
    public Package findById(String id) {
        return null;
    }
}
