package io.oniasfilho.weightlossapi.util;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;

public class TwilioExample {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACf1a42153f6e3cae6b56824fe5c71785c";
    public static final String AUTH_TOKEN = "[AuthToken]";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:+556581522040"),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        "Seu log semanal de peso esta pronto.")
                .create();

        System.out.println(message.getSid());
    }
}