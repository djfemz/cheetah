package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Package;

import java.util.List;


public interface PackageRepository {
    Package save(Package aPackage);
    List<Package> findAll();
    void delete(Package apackage);
    void deleteByTrackingNumber(Integer trackingNumber);
    Package findPackageTracking(Integer trackingNumber);
}
