package Models.fachada;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
import org.apache.commons.mail.EmailAttachment;
import Models.controladores.ControladorEmpresa;

import static Models.fachada.Fachada.getInstance;

public class AdapterEmail  {
    SubSistemaEmail sistemaEmail;

      public void sendEmail(String autor, String destinatario, String titulo, String mensagem){
          Email email = new Email()
                  .setSubject(titulo)
                  .setFrom(autor)
                  .addTo(destinatario)
                  .setBodyText(mensagem);

          sistemaEmail.enviarEmail(email);
      }

}
