package Util.mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.bean.BeanContacto;

public class enviarMail {

    //String asunto, String nombre, String apellidos, String telefono, String email, String mensaje
    public int Enviar(BeanContacto contacto) {
        int valor = 0;
        try {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "ludwig.marusic.h@gmail.com");
            props.setProperty("mail.smtp.auth", "true");

            // Preparamos la sesion que contenga al objeto props y sus elementos que guardamos arriba :
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ludwig.marusic.h@gmail.com"));
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress("ludwig_9_2@hotmail.com"));//direccion de la empresa
            message.setSubject(contacto.getAsunto());
            message.setText("El usuario " + contacto.getNombre() + " " + contacto.getApellido() + " solicita informacion, "
                    + "sus datos son: " + contacto.getCelular()
                    + " // " + contacto.getCorreo() + ".....comentarios : " + contacto.getMensaje());

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect("ludwig.marusic.h@gmail.com", "rambito1992");//(usuario , clave)
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            t.close();
            //cambio de valor , para el control
            valor = 1;
        } catch (MessagingException e) {
            e.getMessage();
        }
        return valor;
    }

}
