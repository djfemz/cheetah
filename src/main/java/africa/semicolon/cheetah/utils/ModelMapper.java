package africa.semicolon.cheetah.utils;

import africa.semicolon.cheetah.data.models.Package;
import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;

public class ModelMapper {
    public static Package map(AddPackageRequest addPackageRequest){
        Package packageToAdd = new Package();
        packageToAdd.setReceiverPhone(addPackageRequest.getReceiverPhone());
        packageToAdd.setSenderEmail(addPackageRequest.getSenderEmail());
        packageToAdd.setDeliveryAddress(addPackageRequest.getDeliveryAddress());
        packageToAdd.setNetWeight(addPackageRequest.getWeight());
        packageToAdd.setName(addPackageRequest.getPackageDescription());
        packageToAdd.setReceiverName(addPackageRequest.getReceiversName());
        return packageToAdd;
    }

    public  static AddPackageResponse map(Package savedPackage){
        AddPackageResponse packageResponse = new AddPackageResponse();
        packageResponse.setWeight(savedPackage.getNetWeight());
        packageResponse.setDeliveryAddress(savedPackage.getDeliveryAddress());
        packageResponse.setPackageDescription(savedPackage.getName());
        packageResponse.setReceiversName(savedPackage.getReceiverName());
        packageResponse.setReceiverPhone(savedPackage.getReceiverPhone());
        packageResponse.setSenderEmail(savedPackage.getSenderEmail());
        return packageResponse;
    }
}
