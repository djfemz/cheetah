package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Sender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderRepositoryImplTest {
    private final SenderRepository senderRepository =new SenderRepositoryImpl();

    @Test
    void saveTest() {
        Sender sender = new Sender();
        sender.setEmailAddress("jerrymadman@gmail.com");
        sender.setSenderPhone("0908654321");
        sender.setSenderName("Jerry");

        Sender savedUser = senderRepository.save(sender);
        assertEquals(savedUser, sender);
    }

    @Test
    void findSenderByEmailTest() {
        Sender sender = new Sender();
        sender.setEmailAddress("jerrymadman@gmail.com");
        sender.setSenderPhone("0908654321");
        sender.setSenderName("Jerry");
        senderRepository.save(sender);
        assertEquals(sender, senderRepository.findSenderByEmail("jerrymadman@gmail.com"));
    }

    @Test
    void deleteByEmailTest() {
        Sender sender = new Sender();
        sender.setEmailAddress("jerrymadman@gmail.com");
        sender.setSenderPhone("0908654321");
        sender.setSenderName("Jerry");
        senderRepository.save(sender);
        assertEquals(1, senderRepository.findAll().size());
        senderRepository.delete(sender.getEmailAddress());
        assertEquals(0, senderRepository.findAll().size());
    }

    @Test
    void testDeleteSender() {
        Sender sender = new Sender();
        sender.setEmailAddress("jerrymadman@gmail.com");
        sender.setSenderPhone("0908654321");
        sender.setSenderName("Jerry");
        senderRepository.save(sender);
        assertEquals(1, senderRepository.findAll().size());
        senderRepository.delete(sender);
        assertEquals(0, senderRepository.findAll().size());
    }
}