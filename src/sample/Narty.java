package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Narty {
    private IntegerProperty narty_id;
    private StringProperty typ_nart;
    private StringProperty marka_nart;
    private StringProperty kolor_nart;
    private StringProperty rodzaj_serwisu;


    public Narty() {

        this.narty_id = new SimpleIntegerProperty();
        this.typ_nart = new SimpleStringProperty();
        this.marka_nart = new SimpleStringProperty();
        this.kolor_nart = new SimpleStringProperty();
        this.rodzaj_serwisu = new SimpleStringProperty();
    }

    public int getnarty_id(){
        return narty_id.get();
    }

    public String getTyp_nart(){
        return typ_nart.get();
    }

    public String getMarka_nart(){
        return marka_nart.get();
    }

    public String getKolor_nart(){
        return kolor_nart.get();
    }

    public String getRodzaj_serwisu(){
        return rodzaj_serwisu.get();
    }

    public void setNarty_id(int narty_id){
        this.narty_id.set(narty_id);
    }

    public void setMarka_nart(String marka_narty){
        this.marka_nart.set(marka_narty);
    }

    public void setTyp_nart(String typ_narty){
        this.typ_nart.set(typ_narty);
    }

    public void setKolor_nart(String kolor_narty){
        this.kolor_nart.set(kolor_narty);
    }

    public void setRodzaj_serwisu(String rodzaj_serwisu){
        this.rodzaj_serwisu.set(rodzaj_serwisu);
    }

    public IntegerProperty narty_idProperty() {
        return narty_id;
    }

    public StringProperty typ_nartProperty(){
        return typ_nart;
    }

    public StringProperty marka_nartProperty(){
        return marka_nart;
    }

    public StringProperty kolor_nartProperty(){
        return kolor_nart;
    }

    public StringProperty rodzaj_serwisuProperty(){
        return rodzaj_serwisu;
    }
}
