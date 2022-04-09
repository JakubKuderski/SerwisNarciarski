package sample;

import javafx.scene.control.ChoiceBox;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//klasa pozwalająca na wykonywanie operacji na bazie danych
//<T> Parametr typu generycznego umożliwiający wybór typu zwracanego obiektu.

public class DBOperations<T> {

    //wyszukiwanie z bazy
    public T search(String id, String tableName, String columnName, String className)
    {
        //np SELECT * FROM klient WHERE klient_id = '1'
        //String query = "SELECT * FROM " + tableName + " WHERE " + columnName + " = " + "'" + id + "'";
        String query = "SELECT * FROM " + tableName + " WHERE " + columnName + "=" + "'" + id + "'";
        try
        {
            ResultSet resultSet= DBConnection.dbExecuteQuery(query);
            T obj = extractFromResultSet(resultSet, className);
            return obj;
        }
        catch(SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    //metoda pobierająca dane z obiektu typu ResultSet
    public T extractFromResultSet(ResultSet resultSet, String className) throws ClassNotFoundException, SQLException {
        switch (className)
        {
            case "Usluga_do_realizacji":
                Usluga_do_realizacji usluga = null;
                if (resultSet.next()) {
                    usluga = new Usluga_do_realizacji();
                    usluga.setUsluga_id(resultSet.getInt("usluga_id"));
                    usluga.setPracownik_id(resultSet.getInt("pracownik_id"));
                    usluga.setKlient_id(resultSet.getInt("klient_id"));
                    usluga.setNarty_id(resultSet.getInt("narty_id"));
                    usluga.setProdukt_id(resultSet.getInt("produkt_id"));
                    usluga.setData_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                    usluga.setData_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                    usluga.setData_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                    usluga.setCena(resultSet.getFloat("cena"));
                    usluga.setStan_realizacji(resultSet.getString("stan_realizacji"));

                }
                return (T) usluga;
            case "Usluga_w_realizacji":
                Usluga_w_realizacji uslugaWRealizacji = null;
                if (resultSet.next()) {
                    uslugaWRealizacji = new Usluga_w_realizacji();
                    uslugaWRealizacji.setrUsluga_id(resultSet.getInt("usluga_id"));
                    uslugaWRealizacji.setrPracownik_id(resultSet.getInt("pracownik_id"));
                    uslugaWRealizacji.setrKlient_id(resultSet.getInt("klient_id"));
                    uslugaWRealizacji.setrNarty_id(resultSet.getInt("narty_id"));
                    uslugaWRealizacji.setrProdukt_id(resultSet.getInt("produkt_id"));
                    uslugaWRealizacji.setrData_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                    uslugaWRealizacji.setrData_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                    uslugaWRealizacji.setrData_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                    uslugaWRealizacji.setrCena(resultSet.getFloat("cena"));
                    uslugaWRealizacji.setrStan_realizacji(resultSet.getString("stan_realizacji"));
                }

                return (T) uslugaWRealizacji;
            case "Usluga_zrealizowana":
                Usluga_zrealizowana uslugaZrealizowana = null;
                if (resultSet.next()) {
                    uslugaZrealizowana = new Usluga_zrealizowana();
                    uslugaZrealizowana.setZrusluga_id(resultSet.getInt("usluga_id"));
                    uslugaZrealizowana.setZrpracownik_id(resultSet.getInt("pracownik_id"));
                    uslugaZrealizowana.setZrklient_id(resultSet.getInt("klient_id"));
                    uslugaZrealizowana.setZrnarty_id(resultSet.getInt("narty_id"));
                    uslugaZrealizowana.setZrprodukt_id(resultSet.getInt("produkt_id"));
                    uslugaZrealizowana.setZrdata_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                    uslugaZrealizowana.setZrdata_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                    uslugaZrealizowana.setZrdata_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                    uslugaZrealizowana.setZrcena(resultSet.getFloat("cena"));
                    uslugaZrealizowana.setZrstan_realizacji(resultSet.getString("stan_realizacji"));
                }

                return (T) uslugaZrealizowana;

            case "Narty":
                Narty narty = null;
                if (resultSet.next()) {
                    narty = new Narty();
                    narty.setNarty_id(resultSet.getInt("rower_id"));
                    narty.setTyp_nart(resultSet.getString("typ_roweru"));
                    narty.setMarka_nart(resultSet.getString("marka_roweru"));
                    narty.setKolor_nart(resultSet.getString("kolor"));
                    narty.setRodzaj_serwisu(resultSet.getString("rodzaj_serwisu"));

                }
                return (T) narty;


            case "Klient":
                Klient klient = null;
                if (resultSet.next()) {
                    klient = new Klient();
                    klient.setKlient_id(resultSet.getInt("klient_id"));
                    klient.setImie_klienta(resultSet.getString("imie_klienta"));
                    klient.setNazwisko_klienta(resultSet.getString("nazwisko_klienta"));
                    klient.setNr_telefonu(resultSet.getInt("nr_telefonu"));
                    klient.setMail(resultSet.getString("mail"));
                    klient.setNarty_id(resultSet.getInt("narty_id"));
                }
                return (T) klient;


            case "Pracownik":
                Pracownik pracownik = null;
                if (resultSet.next()) {
                    pracownik = new Pracownik();
                    pracownik.setPracownik_id(resultSet.getInt("pracownik_id"));
                    pracownik.setImie_pracownika(resultSet.getString("imie_pracownika"));
                    pracownik.setNazwisko_pracownika(resultSet.getString("nazwisko_pracownika"));
                    pracownik.setData_zatrudnienia(resultSet.getDate("data_zatrudnienia"));
                    pracownik.setEtat_id(resultSet.getInt("etat_id"));
                }
                return (T) pracownik;

            case "Serwis":
                Serwis serwis = null;
                if (resultSet.next()) {
                    serwis = new Serwis();
                    serwis.setRodzajSerwisu(resultSet.getString("rodzaj_serwisu"));
                    serwis.setCena_serwisu(resultSet.getFloat("cena"));
                }
                return (T) serwis;

            case "Etat":
                Etat etat = null;
                if (resultSet.next()) {
                    etat = new Etat();
                    etat.setEtat_id(resultSet.getInt("etat_id"));
                    etat.setNazwa_etatu(resultSet.getString("nazwa_etatu"));
                    etat.setStawka(resultSet.getFloat("stawka"));
                }
                return (T) etat;

            default:
                return null;

        }
    }

    /*
    public T pokazWszystkich()
    {

    }
    */


    /*
    public void aktualizuj(String tableName, String prColumn, String columnName, String id, String newValue)
    {
        String statement = "UPDATE " + tableName + " SET " + columnName + " = " + newValue + " WHERE " + prColumn = " = '" + id + "'";
        try
        {
            DBConnection.dbExecuteUpdate(statement);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    */


    //usuwanie wiersza z tabeli
    public void usun(String tableName, String prColumn, String id)
    {
        String statement = "DELETE FROM " + tableName + " WHERE " + prColumn + " = '" + id + "'";
        try
        {
            DBConnection.dbExecuteUpdate(statement);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void dodajKlienta(int klient_id, String imie, String nazwisko, int nr, String mail, String narty_id)
    {
        String statement = "exec dodajKlienta '" + klient_id + "','" + imie + "','" + nazwisko + "','" + nr + "','" + mail + "','" + narty_id + "' ";
        update(statement);
    }

    //public void insertValuesForWprowadzaneProdukty

    public void dodajNarty(int narty_id, String typ_nart, String marka_nart, String kolor_nart, String rodzaj_serwisu)
    {
        String statement = "exec dodajNarty '" + narty_id + "','" + typ_nart + "','" + marka_nart + "','" + kolor_nart + "','" + rodzaj_serwisu + "' ";
        update(statement);
    }

    public void dodajPracownika(String imie, String nazwisko) {
        String statement = "exec dodajPracownik '" + imie + "','" + nazwisko + "'";
        update(statement);

    }

    public void dodajSerwis(String rodzaj_serwisu, float cena) {
        String statement = "exec dodajSerwis '" + rodzaj_serwisu + "','" + cena + "'";
        update(statement);
    }

    public void dodajEtat(String nazwa_etatu) {
        String statement = "exec dodajWprowadzanyEtat '" + nazwa_etatu + "'";
        update(statement);
    }

    public void dodajProdukt(String nazwa_produktu, float cena, String producent) {
        String statement = "exec dodajProdukt '" + nazwa_produktu + "','" + cena + "','" + producent + "'";
        update(statement);
    }

    public void dodajDorealizowanych(int usluga_id,int pracownik_id) {
        String statement = "exec dodajDoRealizowanych '" + usluga_id + "','"+pracownik_id+"'";
        update(statement);
    }

    public void dodajDozRealizowanych(int usluga_id) {
        String statement =  "exec dodajDoZrealizowanych '" + usluga_id + "'";
        update(statement);
    }

    public void dodajDoZrealizowanychSerwisant(int usluga_id) throws SQLException {
        String statement = "exec dodajDoZrealizowanychSerwisant '" + usluga_id + "'";
        update(statement);
    }

    public void dodajDoRealizacji(int klient_id, String rower_id, int pracownik_id) throws SQLException {
        String statement =  "exec dodajDoDoRealizacji '" + klient_id + "','" + rower_id + "','"+pracownik_id+"'";
        update(statement);
    }

    public void usunUslugeDoRealizacji(int usluga_id) throws SQLException {
        String statement = "exec UsuńUsługe_do_realizacji '" + usluga_id + "'";
        update(statement);
    }

    public void usunUslugeWRealizacji(int usluga_id) throws SQLException {
        String statement = "exec UsuńUsługe_w_realizacji '" + usluga_id + "'";
        update(statement);
    }

    public void wyczyscUslugiZrealizowane() throws SQLException {
        String statement =  "DELETE FROM Usluga_zrealizowana";
        update(statement);
    }



    public void update(String statement)
    {
        try
        {
            DBConnection.dbExecuteUpdate(statement);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //dochod
    //ilosc



    public void addToChoiceBox(ChoiceBox<String> choiceBox, ArrayList<String> lista, String columnName, String tableName) throws SQLException {
        String statement = "SELECT " + columnName + " FROM " + tableName;
        ResultSet resultSet = DBConnection.dbExecuteQuery(statement);
        while(resultSet.next())
        {
            choiceBox.getItems().add(resultSet.getString(1));
        }
    }

}
