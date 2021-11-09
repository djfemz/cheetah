package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Sender;

import java.util.Optional;

public interface SenderRepository {
    Sender save(Sender sender);

    Optional<Sender> findSenderByEmail(String email);

    void delete(Sender sender);
    void delete(String email);
}
