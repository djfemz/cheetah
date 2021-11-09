package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Sender;

import java.util.*;

public class SenderRepositoryImpl implements SenderRepository {
    private final Map <String, Sender> database = new HashMap<>();
    @Override
    public Sender save(Sender sender) {
        database.put(sender.getEmailAddress(), sender);
        return sender;
    }

    @Override
    public Sender findSenderByEmail(String email) {
        Set<String> keys = database.keySet();
        for (String sendersEmail:keys) {
            if (sendersEmail.equals(email)) return database.get(email);
        }
        return null;
    }

    @Override
    public void delete(Sender sender) {
        delete(sender.getEmailAddress());
    }

    @Override
    public void delete(String email) {
        database.remove(email);
    }

    @Override
    public List<Sender> findAll() {
        return new ArrayList<>(database.values());
    }
}
