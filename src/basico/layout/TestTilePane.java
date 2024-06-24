package basico.layout;

import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class TestTilePane extends TilePane {
    public TestTilePane(){
        List<Quadrado> quadradoList = new ArrayList<>();

        for (int i = 0;i <20; i++){
       quadradoList.add(new Quadrado());
        }

        getChildren().addAll(quadradoList);
    }
}
