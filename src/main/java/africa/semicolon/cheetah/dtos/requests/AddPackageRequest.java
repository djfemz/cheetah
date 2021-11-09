package africa.semicolon.cheetah.dtos.requests;

import lombok.Data;

@Data
public class AddPackageRequest {
    private  String senderEmail;
    private String receiversName;
    private String deliveryAddress;
    private double weight;
    private String packageDescription;
    private String receiverPhone;
}
