package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Package;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {
    private static final PackageRepository packageRepository = new PackageRepositoryImpl();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveNewPackageTest() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderEmail("Jerry@gmail.com");
        aPackage.setReceiverName("Dharmy");
        aPackage.setDeliveryAddress("Yaba");
        aPackage.setNetWeight(23.5);
        aPackage.setReceiverPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, savedPackage.getId());
    }

    @Test
    void updatePackageTest() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderEmail("Jerry@gmail.com");
        aPackage.setReceiverName("Dharmy");
        aPackage.setDeliveryAddress("Yaba");
        aPackage.setNetWeight(23.5);
        aPackage.setReceiverPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, savedPackage.getId());
    }

    @Test
    void findAllTest() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderEmail("Jerry@gmail.com");
        aPackage.setReceiverName("Dharmy");
        aPackage.setDeliveryAddress("Yaba");
        aPackage.setNetWeight(23.5);
        aPackage.setReceiverPhone(aPackage.getReceiverPhone());
        packageRepository.save(aPackage);

        Package aPackageTwo = new Package();
        aPackage.setName("Sleeping pillow");
        aPackage.setSenderEmail("Nike@gmail.com");
        aPackage.setReceiverName("Dharmy");
        aPackage.setDeliveryAddress("Yaba");
        aPackage.setNetWeight(28.5);
        aPackage.setReceiverPhone(aPackage.getReceiverPhone());
        packageRepository.save(aPackage);

        assertEquals(2, packageRepository.findAll().size());
    }

    @Test
    void deleteByTrackingNumber() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderEmail("Jerry@gmail.com");
        aPackage.setReceiverName("Dharmy");
        aPackage.setDeliveryAddress("Yaba");
        aPackage.setNetWeight(23.5);
        aPackage.setReceiverPhone(aPackage.getReceiverPhone());
        aPackage.setId(1);
        packageRepository.save(aPackage);

        Package aPackageTwo = new Package();
        aPackageTwo.setName("Sleeping pillow");
        aPackageTwo.setSenderEmail("Nike@gmail.com");
        aPackageTwo.setReceiverName("Dharmy");
        aPackageTwo.setDeliveryAddress("Yaba");
        aPackageTwo.setNetWeight(28.5);
        aPackageTwo.setReceiverPhone(aPackage.getReceiverPhone());
        packageRepository.save(aPackageTwo);
        packageRepository.deleteByTrackingNumber(aPackageTwo.getId());
        assertEquals(1, packageRepository.findAll().size());
    }

    @Test
    void deleteTest() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderEmail("Jerry@gmail.com");
        aPackage.setReceiverName("Dharmy");
        aPackage.setDeliveryAddress("Yaba");
        aPackage.setNetWeight(23.5);
        aPackage.setReceiverPhone(aPackage.getReceiverPhone());
        packageRepository.save(aPackage);

        Package aPackageTwo = new Package();
        aPackage.setName("Sleeping pillow");
        aPackage.setSenderEmail("Nike@gmail.com");
        aPackage.setReceiverName("Dharmy");
        aPackage.setDeliveryAddress("Yaba");
        aPackage.setNetWeight(28.5);
        aPackage.setReceiverPhone(aPackage.getReceiverPhone());
        packageRepository.save(aPackage);

        packageRepository.delete(aPackage);

        assertEquals(1, packageRepository.findAll().size());
    }



    @Test
    void findPackageByTrackingNumberTest() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderEmail("Jerry@gmail.com");
        aPackage.setReceiverName("Dharmy");
        aPackage.setDeliveryAddress("Yaba");
        aPackage.setNetWeight(23.5);
        aPackage.setReceiverPhone(aPackage.getReceiverPhone());
        packageRepository.save(aPackage);

        Package aPackageTwo = new Package();
        aPackageTwo.setName("Sleeping pillow");
        aPackageTwo.setSenderEmail("Nike@gmail.com");
        aPackageTwo.setReceiverName("Dharmy");
        aPackageTwo.setDeliveryAddress("Yaba");
        aPackageTwo.setNetWeight(28.5);
        aPackageTwo.setReceiverPhone(aPackage.getReceiverPhone());
        packageRepository.save(aPackageTwo);

        assertEquals(aPackage, packageRepository.findPackageTracking(aPackage.getId()));
    }
}