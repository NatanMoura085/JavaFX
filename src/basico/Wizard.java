package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private Stage janela;
    private Scene passo1;
    private Scene passo2;
    private Scene passo3;

    @Override
    public void start(Stage primaryStage) throws Exception {
        criarPasso1();
        criarPasso2();
        criarPasso3();
       janela = primaryStage;
        janela.setScene(passo1);
        janela.setTitle("Wizard");
       janela.show();
    }


    public void criarPasso1(){
        Button proximoPasso = new Button("Ir p/ passo 2 >>");
        proximoPasso.setOnAction(e->janela.setScene(passo2));
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(proximoPasso);
        passo1 = new Scene(box,400,400);
    }

    public void criarPasso2(){
        Button passoAnteriou = new Button("Ir p/ passo1");
        Button passoProximo2 = new Button("Ir p/ passo 3");
        passoAnteriou.setOnAction(e->janela.setScene(passo1));
        passoProximo2.setOnAction(e->janela.setScene(passo3));
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(passoAnteriou);
        box.getChildren().add(passoProximo2);

        this.passo2 = new Scene(box,400,400);

    }

    public void criarPasso3(){
        Button passoProximo3 = new Button("<< Volta pro passo2");
        passoProximo3.setOnAction(e-> janela.setScene(passo2));

        Button proximoPasso = new Button("Finalizar");
        proximoPasso.setOnAction(e->System.exit(0));

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(passoProximo3);
        box.getChildren().add(proximoPasso);

        passo3 = new Scene(box,400,400);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
