package model;

import java.util.ArrayList;

public class Espetaculos {
    private ArrayList<Espetaculo> espetaculos;

    public Espetaculos(){
        espetaculos = new ArrayList<>();
    }

    public void adicionar(Espetaculo espetaculo){
        espetaculos.add(espetaculo);
    }
}
