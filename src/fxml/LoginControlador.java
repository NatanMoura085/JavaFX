package fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginControlador {
    @FXML
    private TextField campoEmail;
    @FXML
    private PasswordField campoSenha;
    public void entrar(){
       boolean email = campoEmail.getText().equals("mouranatan933@gmail.com");
       boolean senha = campoSenha.getText().equals("1234");
       if (email && senha){
           Notifications.create().position(Pos.CENTER).title("Login FXML").text("Login efetuado com sucesso").showInformation();
       }else {
           Notifications.create().position(Pos.CENTER).title("Login FXML").text("Senha ou email errado").showError();
       }
    }
}
