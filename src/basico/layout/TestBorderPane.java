package basico.layout;

import javafx.scene.layout.BorderPane;

public class TestBorderPane extends BorderPane {
    public TestBorderPane(){
        Caixa c1  = new Caixa().comTexto("Topo");
        setTop(c1);
        Caixa c2 = new Caixa().comTexto("Esquerda");
        setLeft(c2);
        Caixa c3 = new Caixa().comTexto("Direita");
        setRight(c3);
        Caixa c4 = new Caixa().comTexto("fundo");
        setBottom(c4);

        Caixa c5 = new Caixa().comTexto("Centro");
        setCenter(c5);
    }
}
