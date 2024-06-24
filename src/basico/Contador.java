package basico;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.concurrent.atomic.AtomicBoolean;

public class Contador extends Application {
    private int num = 0;
    Label label2 = new Label("0");
  Button incremento = new Button();
    Button decremento = new Button();
    public void label2Color() {
        label2.getStylesheets().add("numero");


    }



    public void incrementoo(){
  AtomicBoolean isActive = new AtomicBoolean(true);
  incremento.setOnMouseClicked(event -> {
     if (isActive.get()){
         incremento.getStyleClass().add("verde");
         isActive.set(false);

         PauseTransition pause = new PauseTransition(Duration.seconds(2));

         pause.setOnFinished(evento->incremento.getStyleClass().remove("verde"));
        pause.play();

     }
  });



        int valor =  this.num +=1;
        label2.setText(valor + " ");

    }



    public void decrementoo(){
        boolean isActive2 = true;

        if (isActive2 ==true){
            decremento.getStyleClass().add("red");

            isActive2 =false;
            PauseTransition pause = new PauseTransition(Duration.seconds(2));

            pause.setOnFinished(evento->decremento.getStyleClass().remove("red"));
            pause.play();
        }

       int valor = this.num-=1;
       label2.setText((valor !=-1 ? 0 : valor) + "");

    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label1 = new Label("Contador");
        label1.getStyleClass().add("titulo");

       
         this.incremento = new Button("+");
        incremento.setOnAction(a->incrementoo() );
         this.decremento = new Button("-");
        decremento.setOnAction(a->decrementoo());




        HBox telaBotoes = new HBox(10);
        telaBotoes.getStyleClass().add("botoes");
        telaBotoes.setSpacing(20);
        telaBotoes.setAlignment(Pos.CENTER);
        telaBotoes.getChildren().add(decremento);
        telaBotoes.getChildren().add(incremento);



        VBox telaPrincipal = new VBox();
        telaPrincipal.getStyleClass().add("conteudo");
        telaPrincipal.getChildren().add(label1);
        telaPrincipal.getChildren().add(label2);
        telaPrincipal.getChildren().add(telaBotoes);
        telaPrincipal.setSpacing(20);
        telaPrincipal.setAlignment(Pos.CENTER);


       String caminhoCSS = getClass().getResource("/basico/conteudo.css").toExternalForm();
        Scene cena = new Scene(telaPrincipal,400,400);
        cena.getStylesheets().add(caminhoCSS);
        cena.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

        primaryStage.setScene(cena);



        primaryStage.show();
    }

    public static void main(String[] args) {

  launch(args);
    }
}
