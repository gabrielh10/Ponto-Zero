package Models.fachada;
/*import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
import org.apache.commons.mail.EmailAttachment;
*/
public interface SubSistemaEmail {
    void enviarEmail(String remetente, String destinatario, String titulo, String mensagem);
}
