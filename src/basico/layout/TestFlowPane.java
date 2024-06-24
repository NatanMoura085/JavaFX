package basico.layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TestFlowPane extends FlowPane {
    public TestFlowPane(){
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();
        Quadrado q4 = new Quadrado();
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(10));
        setAlignment(Pos.CENTER);
        setOrientation(Orientation.VERTICAL);

        getChildren().addAll(q1,q2,q3,q4);
    }
}
