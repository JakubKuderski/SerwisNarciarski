package sample;

import javafx.beans.property.*;

import java.sql.Date;

public class Usluga_zrealizowana {
    private IntegerProperty zrusluga_id;
    private IntegerProperty zrpracownik_id;
    private IntegerProperty zrklient_id;
    private IntegerProperty zrnarty_id;
    private IntegerProperty zrprodukt_id;
    private SimpleObjectProperty<Date> zrdata_przyjecia_zlecenia;
    private SimpleObjectProperty<Date> zrdata_rozpoczecia_zlecenia;
    private SimpleObjectProperty<Date> zrdata_zakonczenia_zlecenia;
    private FloatProperty zrcena;
    private StringProperty zrstan_realizacji;


    public Usluga_zrealizowana() {
        this.zrusluga_id = new SimpleIntegerProperty();
        this.zrpracownik_id = new SimpleIntegerProperty();
        this.zrklient_id = new SimpleIntegerProperty();
        this.zrnarty_id = new SimpleIntegerProperty();
        this.zrprodukt_id = new SimpleIntegerProperty();
        this.zrdata_przyjecia_zlecenia = new SimpleObjectProperty<Date>();
        this.zrdata_rozpoczecia_zlecenia = new SimpleObjectProperty<Date>();
        this.zrdata_zakonczenia_zlecenia = new SimpleObjectProperty<Date>();
        this.zrcena = new SimpleFloatProperty();
        this.zrstan_realizacji = new SimpleStringProperty();
    }

    public int getZrusluga_id() {
        return zrusluga_id.get();
    }

    public IntegerProperty zrusluga_idProperty() {
        return zrusluga_id;
    }

    public void setZrusluga_id(int zrusluga_id) {
        this.zrusluga_id.set(zrusluga_id);
    }

    public int getZrpracownik_id() {
        return zrpracownik_id.get();
    }

    public IntegerProperty zrpracownik_idProperty() {
        return zrpracownik_id;
    }

    public void setZrpracownik_id(int zrpracownik_id) {
        this.zrpracownik_id.set(zrpracownik_id);
    }

    public int getZrklient_id() {
        return zrklient_id.get();
    }

    public IntegerProperty zrklient_idProperty() {
        return zrklient_id;
    }

    public void setZrklient_id(int zrklient_id) {
        this.zrklient_id.set(zrklient_id);
    }

    public int getZrnarty_id() {
        return zrnarty_id.get();
    }

    public IntegerProperty zrnarty_idProperty() {
        return zrnarty_id;
    }

    public void setZrnarty_id(int zrnarty_id) {
        this.zrnarty_id.set(zrnarty_id);
    }

    public int getZrprodukt_id() {
        return zrprodukt_id.get();
    }

    public IntegerProperty zrprodukt_idProperty() {
        return zrprodukt_id;
    }

    public void setZrprodukt_id(int zrprodukt_id) {
        this.zrprodukt_id.set(zrprodukt_id);
    }

    public Date getZrdata_przyjecia_zlecenia() {
        return zrdata_przyjecia_zlecenia.get();
    }

    public SimpleObjectProperty<Date> zrdata_przyjecia_zleceniaProperty() {
        return zrdata_przyjecia_zlecenia;
    }

    public void setZrdata_przyjecia_zlecenia(Date zrdata_przyjecia_zlecenia) {
        this.zrdata_przyjecia_zlecenia.set(zrdata_przyjecia_zlecenia);
    }

    public Date getZrdata_rozpoczecia_zlecenia() {
        return zrdata_rozpoczecia_zlecenia.get();
    }

    public SimpleObjectProperty<Date> zrdata_rozpoczecia_zleceniaProperty() {
        return zrdata_rozpoczecia_zlecenia;
    }

    public void setZrdata_rozpoczecia_zlecenia(Date zrdata_rozpoczecia_zlecenia) {
        this.zrdata_rozpoczecia_zlecenia.set(zrdata_rozpoczecia_zlecenia);
    }

    public Date getZrdata_zakonczenia_zlecenia() {
        return zrdata_zakonczenia_zlecenia.get();
    }

    public SimpleObjectProperty<Date> zrdata_zakonczenia_zleceniaProperty() {
        return zrdata_zakonczenia_zlecenia;
    }

    public void setZrdata_zakonczenia_zlecenia(Date zrdata_zakonczenia_zlecenia) {
        this.zrdata_zakonczenia_zlecenia.set(zrdata_zakonczenia_zlecenia);
    }

    public float getZrcena() {
        return zrcena.get();
    }

    public FloatProperty zrcenaProperty() {
        return zrcena;
    }

    public void setZrcena(float zrcena) {
        this.zrcena.set(zrcena);
    }

    public String getZrstan_realizacji() {
        return zrstan_realizacji.get();
    }

    public StringProperty zrstan_realizacjiProperty() {
        return zrstan_realizacji;
    }

    public void setZrstan_realizacji(String zrstan_realizacji) {
        this.zrstan_realizacji.set(zrstan_realizacji);
    }
}
