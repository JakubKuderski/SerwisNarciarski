package sample;

import javafx.beans.property.*;

import java.sql.Date;

public class Usluga_do_realizacji {

    private IntegerProperty usluga_id;
    private IntegerProperty pracownik_id;
    private IntegerProperty klient_id;
    private IntegerProperty narty_id;
    private IntegerProperty produkt_id;
    private SimpleObjectProperty<Date> data_przyjecia_zlecenia;
    private SimpleObjectProperty<Date> data_rozpoczecia_zlecenia;
    private SimpleObjectProperty<Date> data_zakonczenia_zlecenia;
    private FloatProperty cena;
    private StringProperty stan_realizacji;


    public Usluga_do_realizacji() {
        this.usluga_id = new SimpleIntegerProperty();
        this.pracownik_id = new SimpleIntegerProperty();
        this.klient_id = new SimpleIntegerProperty();
        this.narty_id = new SimpleIntegerProperty();
        this.produkt_id = new SimpleIntegerProperty();
        this.data_przyjecia_zlecenia = new SimpleObjectProperty<Date>();
        this.data_rozpoczecia_zlecenia = new SimpleObjectProperty<Date>();
        this.data_zakonczenia_zlecenia = new SimpleObjectProperty<Date>();
        this.cena = new SimpleFloatProperty();
        this.stan_realizacji = new SimpleStringProperty();
    }

    public int getUsluga_id() {
        return usluga_id.get();
    }

    public int getPracownik_id() {
        return pracownik_id.get();
    }

    public int getKlient_id() {
        return klient_id.get();
    }

    public int getNarty_id() {
        return narty_id.get();
    }

    public int getProdukt_id() {
        return produkt_id.get();
    }

    public Object getData_rozpoczecia_zlecenia() {
        return data_rozpoczecia_zlecenia.get();
    }

    public Object getData_przyjecia_zlecenia() {
        return data_przyjecia_zlecenia.get();
    }

    public Object getData_zakonczenia_zlecenia() {
        return data_zakonczenia_zlecenia.get();
    }

    public float getCena() {
        return cena.get();
    }

    public String getStan_realizacji() {
        return stan_realizacji.get();
    }


    public void setUsluga_id(int usluga_id) {
        this.usluga_id.set(usluga_id);

    }

    public void setPracownik_id(int pracownik_id) {
        this.pracownik_id.set(pracownik_id);
    }

    public void setKlient_id(int klient_id) {
        this.klient_id.set(klient_id);
    }

    public void setNarty_id(int narty_id) {
        this.narty_id.set(narty_id);
    }

    public void setProdukt_id(int produkt_id) {
        this.produkt_id.set(produkt_id);
    }

    public void setData_rozpoczecia_zlecenia(Date data_rozpoczecia_zlecenia) {
        this.data_rozpoczecia_zlecenia.set(data_rozpoczecia_zlecenia);
    }

    public void setData_przyjecia_zlecenia(Date data_przyjecia_zlecenia) {
        this.data_przyjecia_zlecenia.set(data_przyjecia_zlecenia);
    }

    public void setData_zakonczenia_zlecenia(Date data_zakonczenia_zlecenia) {
        this.data_zakonczenia_zlecenia.set(data_zakonczenia_zlecenia);
    }

    public void setCena(float cena) {
        this.cena.set(cena);
    }

    public void setStan_realizacji(String stan_realizacji) {
        this.stan_realizacji.set(stan_realizacji);
    }


    public IntegerProperty usluga_idProperty() {
        return usluga_id;
    }

    public IntegerProperty pracownik_idProperty() {
        return pracownik_id;
    }

    public IntegerProperty klient_idProperty() {
        return klient_id;
    }

    public IntegerProperty narty_idProperty() {
        return narty_id;
    }

    public IntegerProperty produkt_idProperty() {
        return produkt_id;
    }

    public SimpleObjectProperty<Date> data_przyjecia_zleceniaProperty() {
        return data_przyjecia_zlecenia;
    }

    public SimpleObjectProperty<Date> data_rozpoczecia_zleceniaProperty() {
        return data_rozpoczecia_zlecenia;
    }

    public SimpleObjectProperty<Date> data_zakonczenia_zleceniaProperty() {
        return data_zakonczenia_zlecenia;
    }

    public FloatProperty cenaProperty() {
        return cena;
    }

    public StringProperty stan_realizacjiProperty() {
        return stan_realizacji;
    }


}
 /*
    public int getUsluga_id() {
        return usluga_id.get();
    }

    public IntegerProperty usluga_idProperty() {
        return usluga_id;
    }

    public void setUsluga_id(int usluga_id) {
        this.usluga_id.set(usluga_id);
    }

    public int getKlient_id() {
        return klient_id.get();
    }

    public IntegerProperty klient_idProperty() {
        return klient_id;
    }

    public void setKlient_id(int klient_id) {
        this.klient_id.set(klient_id);
    }

    public int getPracownik_id() {
        return pracownik_id.get();
    }

    public IntegerProperty pracownik_idProperty() {
        return pracownik_id;
    }

    public void setPracownik_id(int pracownik_id) {
        this.pracownik_id.set(pracownik_id);
    }

    public int getnarty_id() {
        return narty_id.get();
    }

    public IntegerProperty narty_idProperty() {
        return narty_id;
    }

    public void setNarty_id(int narty_id) {
        this.narty_id.set(narty_id);
    }

    public int getProdukt_id() {
        return produkt_id.get();
    }

    public IntegerProperty produkt_idProperty() {
        return produkt_id;
    }

    public void setProdukt_id(int produkt_id) {
        this.produkt_id.set(produkt_id);
    }

    public Date getData_przyjecia_zlecenia() {
        return data_przyjecia_zlecenia.get();
    }

    public Object data_przyjecia_zleceniaProperty() {
        return data_przyjecia_zlecenia.get();
    }

    public void setData_przyjecia_zlecenia(Date data_przyjecia_zlecenia) {
        this.data_przyjecia_zlecenia.set(data_przyjecia_zlecenia);
    }

    public Date getData_rozpoczecia_zlecenia() {
        return data_rozpoczecia_zlecenia.get();
    }

    public Object data_rozpoczecia_zleceniaProperty() {
        return data_rozpoczecia_zlecenia.get();
    }

    public void setData_rozpoczecia_zlecenia(Date data_rozpoczecia_zlecenia) {
        this.data_rozpoczecia_zlecenia.set(data_rozpoczecia_zlecenia);
    }

    public Date getData_zakonczenia_zlecenia() {
        return data_zakonczenia_zlecenia.get();
    }

    public Object data_zakonczenia_zleceniaProperty() {
        return data_zakonczenia_zlecenia.get();
    }

    public void setData_zakonczenia_zlecenia(Date data_zakonczenia_zlecenia) {
        this.data_zakonczenia_zlecenia.set(data_zakonczenia_zlecenia);
    }

    public float getCena() {
        return cena.get();
    }

    public FloatProperty cenaProperty() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena.set(cena);
    }

    public String getStan_realizacji() {
        return stan_realizacji.get();
    }

    public StringProperty stan_realizacjiProperty() {
        return stan_realizacji;
    }

    public void setStan_realizacji(String stan_realizacji) {
        this.stan_realizacji.set(stan_realizacji);
    }
}
*/

