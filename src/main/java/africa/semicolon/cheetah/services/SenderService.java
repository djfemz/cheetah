package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.dtos.requests.AddSenderRequest;
import africa.semicolon.cheetah.dtos.responses.AddSenderResponse;

public interface SenderService {
    AddSenderResponse createUser(AddSenderRequest request);
}
