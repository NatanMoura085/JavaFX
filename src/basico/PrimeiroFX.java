package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");

        botaoA.setOnAction(a->System.out.print("A"));
        botaoB.setOnAction(b->System.exit(0));
        botaoC.setOnAction(c->c.notify());

        VBox box = new VBox();
        box.getChildren().add(botaoA);
        box.getChildren().add(botaoB);
        box.getChildren().add(botaoC);
        box.setAlignment(Pos.CENTER);
        box.setSpacing(20);


        Scene cena = new Scene(box,100,150);

        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
