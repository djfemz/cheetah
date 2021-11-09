package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Sender;

import java.util.Optional;

public class SenderRepositoryImpl implements SenderRepository {
    @Override
    public Sender save(Sender sender) {
        return null;
    }

    @Override
    public Optional<Sender> findSenderByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public void delete(Sender sender) {

    }

    @Override
    public void delete(String email) {

    }
}
