package africa.semicolon.cheetah.dtos.responses;

import lombok.Data;

@Data
public class AddPackageResponse {
    private  String senderEmail;
    private String receiversName;
    private String deliveryAddress;
    private double weight;
    private String packageDescription;
    private String receiverPhone;
}
