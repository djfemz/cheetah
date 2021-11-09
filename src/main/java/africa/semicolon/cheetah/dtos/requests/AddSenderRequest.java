package africa.semicolon.cheetah.dtos.requests;

import lombok.Data;

@Data
public class AddSenderRequest {
    private String emailAddress;
    private String senderName;
    private String senderPhone;
}
