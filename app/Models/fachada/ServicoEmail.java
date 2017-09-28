package Models.fachada;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
import org.apache.commons.mail.EmailAttachment;

public class ServicoEmail implements SubSistemaEmail{
        @Inject MailerClient mailerClient;

        public void enviarEmail(Email email) {
            mailerClient.send(email);
        }
}
