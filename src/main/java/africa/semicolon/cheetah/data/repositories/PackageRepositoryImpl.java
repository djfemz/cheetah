package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PackageRepositoryImpl implements PackageRepository{
    private final Map<Integer, Package> database = new HashMap<>();
    @Override
    public Package save(Package aPackage) {
        Integer id = database.size()+1;
        aPackage.setId(id);
        database.put(id, aPackage);
        return database.get(id);
    }

    @Override
    public List<Package> findAll() {
        List<Package> packages = new ArrayList<>();
        for (Integer key: database.keySet()) {
            packages.add(database.get(key));
        }
        return packages;
    }

    @Override
    public void deleteByTrackingNumber(Integer trackingNumber) {
        database.remove(trackingNumber);
    }

    @Override
    public void delete(Package apackage) {
        deleteByTrackingNumber(apackage.getId());
    }



    @Override
    public Package findPackageTracking(Integer trackingNumber) {
        return database.get(trackingNumber);
    }
}
