package basico.layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

import java.util.Arrays;
import java.util.List;

public class TestGridPane extends GridPane {
    public TestGridPane(){
        Caixa c1 = new Caixa().comTexto("1");
        Caixa c2 = new Caixa().comTexto("2");
        Caixa c3 = new Caixa().comTexto("3");
        Caixa c4 = new Caixa().comTexto("4");
        Caixa c5 = new Caixa().comTexto("5");
        Caixa c6 = new Caixa().comTexto("6");
        setGridLinesVisible(true);
        getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
        getRowConstraints().addAll(rc(),rc(),rc(),rc(),rc());
        setVgap(10);
        setHgap(10);
        List<Caixa> caixas = Arrays.asList(c1,c2,c4,c5,c6);
        for (int i = 0;   i < caixas.toArray().length ;i++){
            add(caixas.get(i),i,i );
        }
    }


//    List<Caixa> caixas = Arrays.asList(c1,c2,c4,c5,c6);
//        for (int l = 0;   l < caixas.toArray().length ;l++){
//        for (int c = 0; c <caixas.toArray().length ; c++){
//            add(caixas.get(l),l,c );
//        }
//
//    }
//}

    private ColumnConstraints cc(){
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(20);
        cc.setFillWidth(true);
        return cc;
    }

    private ColumnConstraints fcc(){
        ColumnConstraints fcc = new ColumnConstraints();
      //  fcc.setPercentWidth(20);
        fcc.setMinWidth(200);
        fcc.setMaxWidth(200);
        fcc.setFillWidth(true);
        return fcc;
    }

    private RowConstraints rc(){
     RowConstraints rc = new RowConstraints();
     rc.setPercentHeight(20);
     rc.setFillHeight(true);
     return rc;
    }
}
