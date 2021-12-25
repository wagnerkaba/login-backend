package com.wagner.loginBackend.email;

public interface EmailSender {

    void send(String to, String email);
}
