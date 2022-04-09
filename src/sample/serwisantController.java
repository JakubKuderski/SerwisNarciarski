package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class serwisantController {

    DBOperations operations = new DBOperations();
    ArrayList<String> rodzajSerwisuValues = new ArrayList<>();
    ArrayList<String> wprowadzaneProduktyValues = new ArrayList<>();

    @FXML
    private TextField imieTxtfield;

    @FXML
    private TextField nazwiskoTxtfield;

    @FXML
    private TextField nrTelefonuTxtfield;

    @FXML
    private TextField mailTxtfield;

    @FXML
    private TextField klient_idTxtfield;

    @FXML
    private TextField idNartTxtfield;

    @FXML
    private TextField typTxtfield;

    @FXML
    private TextField markaTxtfield;

    @FXML
    private TextField kolorTxtfield;

    @FXML
    private ChoiceBox<String> rodzajUsterkiChoice;

    @FXML
    private Button dodajNartyButton;

    @FXML
    private ChoiceBox<String> nazwaProduktuChoice;

    @FXML
    private Button dodajProduktButton;

    @FXML
    private TextField wpiszSwojeId;

    @FXML
    private Button dodajButton;

    @FXML
    private TableView uslugaDoRealizacjiTable;

    @FXML
    private TableColumn<Usluga_do_realizacji, Integer> udrUslugaIdColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, Integer> udrPracownikIdColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, Integer> udrKlientIdColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, Integer> udrNartyIdColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, Integer> udrProduktIdColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, Date> udrPrzyjecieColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, Date> udrRozpoczecieColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, Date> udrZakonczenieColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, Float> udrCenaColumn;

    @FXML
    private TableColumn<Usluga_do_realizacji, String> udrStanColumn;

    @FXML
    private TextField id_uslugaDoRealizacji;

    @FXML
    private Button szukajUslugaDoRealizacji;

    @FXML
    private Button usunUslugaDoRealizacji;

    @FXML
    private Button pokazUslugaDoRealizacji;

    @FXML
    private Button dodajUslugaDoZrealizowanych;

    @FXML
    private Button przelogujBtn;

    @FXML
    private TableView uslugaWRealizacjiTable;

    @FXML
    private TableColumn<Usluga_w_realizacji, Integer> urUslugaIdColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, Integer> urPracownikIdColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, Integer> urKlientIdColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, Integer> urRowerIdColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, Integer> urProduktIdColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, Date> urPrzyjecieColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, Date> urRozpoczecieColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, Date> urZakonczenieColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, Float> urCenaColumn;

    @FXML
    private TableColumn<Usluga_w_realizacji, String> urStanColumn;

    @FXML
    private TextField id_uslugaWRealizacji;

    @FXML
    private Button szukajUslugaWRealizacji;

    @FXML
    private Button pokazUslugaWRealizacji;

    @FXML
    private Button usunUslugaWRealizacji;

    @FXML
    private TableView uslugaZrealizowanaTable;

    @FXML
    private TableColumn<Usluga_zrealizowana, Integer> uzUslugaIdColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, Integer> uzPracownikIdColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, Integer> uzKlientIdColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, Integer> uzNartyIdColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, Integer> uzProduktIdColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, Date> uzPrzyjecieColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, Date> uzRozpoczecieColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, Date> uzZakonczenieColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, Float> uzCenaColumn;

    @FXML
    private TableColumn<Usluga_zrealizowana, String> uzStanColumn;

    @FXML
    private TextField id_uslugaZrealizowana;

    @FXML
    private Button szukajUslugaZrealizowana;

    @FXML
    private Button pokazUslugaZrealizowana;

    @FXML
    private TableView klientTable;

    @FXML
    private TableColumn<Klient, Integer> klientIdColumn;

    @FXML
    private TableColumn<Klient, String> imieColumn;

    @FXML
    private TableColumn<Klient, String> nazwiskoColumn;

    @FXML
    private TableColumn<Klient, Integer> nrTelefonuColumn;

    @FXML
    private TableColumn<Klient, String> mailColumn;

    @FXML
    private TableColumn<Klient, Integer> nartyIdColumn;

    @FXML
    private TextField id_klient;

    @FXML
    private TextField poleKlientTxtfield;

    @FXML
    private TextField nowaWartoscKlientTxtfield;

    @FXML
    private Button szukajKlient;

    @FXML
    private Button pokazKlient;

    @FXML
    private Button aktualizujKlient;

    @FXML
    private Tab nazwaProdukt;

    @FXML
    private TableView produktTable;

    @FXML
    private TableColumn<Produkt, Integer> produktIdColumn;

    @FXML
    private TableColumn<Produkt, String> nazwaProduktuColumn;

    @FXML
    private TableColumn<Produkt, Float> cenaProduktuColumn;

    @FXML
    private TableColumn<Produkt, String> producentColumn;

    @FXML
    private TextField id_produkt;

    @FXML
    private TextField poleProduktTxtfield;

    @FXML
    private TextField wartoscProduktTxtfield;

    @FXML
    private Button szukajProdukt;

    @FXML
    private Button pokazProdukt;

    @FXML
    private Button aktualizujProdukt;

    @FXML
    private Button usunProdukt;
    
    public void initialize()
    {
        udrKlientIdColumn.setCellValueFactory(cellData -> cellData.getValue().usluga_idProperty().asObject());
        udrPracownikIdColumn.setCellValueFactory(cellData -> cellData.getValue().pracownik_idProperty().asObject());
        udrKlientIdColumn.setCellValueFactory(cellData -> cellData.getValue().klient_idProperty().asObject());
        udrNartyIdColumn.setCellValueFactory(cellData -> cellData.getValue().narty_idProperty().asObject());
        udrProduktIdColumn.setCellValueFactory(cellData -> cellData.getValue().produkt_idProperty().asObject());
        udrPrzyjecieColumn.setCellValueFactory(cellData -> cellData.getValue().data_przyjecia_zleceniaProperty());
        udrRozpoczecieColumn.setCellValueFactory(cellData -> cellData.getValue().data_rozpoczecia_zleceniaProperty());
        udrZakonczenieColumn.setCellValueFactory(cellData -> cellData.getValue().data_zakonczenia_zleceniaProperty());
        udrCenaColumn.setCellValueFactory(cellData -> cellData.getValue().cenaProperty().asObject());
        udrStanColumn.setCellValueFactory(cellData -> cellData.getValue().stan_realizacjiProperty());

        urUslugaIdColumn.setCellValueFactory(cellData -> cellData.getValue().rusluga_idProperty().asObject());
        urPracownikIdColumn.setCellValueFactory(cellData -> cellData.getValue().rpracownik_idProperty().asObject());
        urKlientIdColumn.setCellValueFactory(cellData -> cellData.getValue().rklient_idProperty().asObject());
        urRowerIdColumn.setCellValueFactory(cellData -> cellData.getValue().rnarty_idProperty().asObject());
        urProduktIdColumn.setCellValueFactory(cellData -> cellData.getValue().rprodukt_idProperty().asObject());
        urPrzyjecieColumn.setCellValueFactory(cellData -> cellData.getValue().rdata_przyjecia_zleceniaProperty());
        urRozpoczecieColumn.setCellValueFactory(cellData -> cellData.getValue().rdata_rozpoczecia_zleceniaProperty());
        urZakonczenieColumn.setCellValueFactory(cellData -> cellData.getValue().rdata_zakonczenia_zleceniaProperty());
        urCenaColumn.setCellValueFactory(cellData -> cellData.getValue().rcenaProperty().asObject());
        urStanColumn.setCellValueFactory(cellData -> cellData.getValue().rstan_realizacjiProperty());

        uzUslugaIdColumn.setCellValueFactory(cellData -> cellData.getValue().zrusluga_idProperty().asObject());
        uzPracownikIdColumn.setCellValueFactory(cellData -> cellData.getValue().zrpracownik_idProperty().asObject());
        uzKlientIdColumn.setCellValueFactory(cellData -> cellData.getValue().zrklient_idProperty().asObject());
        uzNartyIdColumn.setCellValueFactory(cellData -> cellData.getValue().zrnarty_idProperty().asObject());
        uzProduktIdColumn.setCellValueFactory(cellData -> cellData.getValue().zrprodukt_idProperty().asObject());
        uzPrzyjecieColumn.setCellValueFactory(cellData -> cellData.getValue().zrdata_przyjecia_zleceniaProperty());
        uzRozpoczecieColumn.setCellValueFactory(cellData -> cellData.getValue().zrdata_rozpoczecia_zleceniaProperty());
        uzZakonczenieColumn.setCellValueFactory(cellData -> cellData.getValue().zrdata_zakonczenia_zleceniaProperty());
        uzCenaColumn.setCellValueFactory(cellData -> cellData.getValue().zrcenaProperty().asObject());
        uzStanColumn.setCellValueFactory(cellData -> cellData.getValue().zrstan_realizacjiProperty());

        klientIdColumn.setCellValueFactory(cellData -> cellData.getValue().klient_idProperty().asObject());
        imieColumn.setCellValueFactory(cellData -> cellData.getValue().imie_klientaProperty());
        nazwiskoColumn.setCellValueFactory(cellData -> cellData.getValue().nazwisko_klientaProperty());
        nrTelefonuColumn.setCellValueFactory(cellData -> cellData.getValue().nr_telefonyProperty().asObject());
        mailColumn.setCellValueFactory(cellData -> cellData.getValue().mailProperty());
        nartyIdColumn.setCellValueFactory(cellData -> cellData.getValue().narty_idProperty().asObject());

        produktIdColumn.setCellValueFactory(cellData -> cellData.getValue().produkt_idProperty().asObject());
        nazwaProduktuColumn.setCellValueFactory(cellData -> cellData.getValue().nazwa_produktuProperty());
        cenaProduktuColumn.setCellValueFactory(cellData -> cellData.getValue().cenaProperty().asObject());
        producentColumn.setCellValueFactory(cellData -> cellData.getValue().producentProperty());

        try {
            operations.addToChoiceBox(rodzajUsterkiChoice, rodzajSerwisuValues, "rodzaj_serwisu", "Serwis");
            operations.addToChoiceBox(nazwaProduktuChoice, wprowadzaneProduktyValues, "nazwa_produktu", "Produkt");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //jeszcze try tutaj
    }

    @FXML
    void aktualizujKlientAction(ActionEvent event) {

    }

    @FXML
    void aktualizujProduktAction(ActionEvent event) {

    }

    //metoda dodająca klienta i usluge z nim zwiazana
    @FXML
    void dodaj(ActionEvent event) throws SQLException {
        if(idNartTxtfield.getText() == "")  //jesli narty nie sa przypisane do klienta
        {
            operations.dodajKlienta(Integer.valueOf(klient_idTxtfield.getText()), imieTxtfield.getText(), nazwiskoTxtfield.getText(), Integer.valueOf(nrTelefonuTxtfield.getText()),mailTxtfield.getText(), "NULL");
            operations.dodajDoRealizacji(Integer.valueOf(klient_idTxtfield.getText()), "NULL",Integer.valueOf(wpiszSwojeId.getText()));
        }
        else {
            operations.dodajKlienta(Integer.parseInt(klient_idTxtfield.getText()), imieTxtfield.getText(), nazwiskoTxtfield.getText(), Integer.valueOf(nrTelefonuTxtfield.getText()),mailTxtfield.getText(), String.valueOf(idNartTxtfield.getText()));
            operations.dodajDoRealizacji(Integer.valueOf(klient_idTxtfield.getText()), String.valueOf(idNartTxtfield.getText()),Integer.valueOf(wpiszSwojeId.getText()));

        }

        imieTxtfield.clear();
        nazwiskoTxtfield.clear();
        nrTelefonuTxtfield.clear();
        mailTxtfield.clear();
        idNartTxtfield.clear();
        klient_idTxtfield.clear();
        markaTxtfield.clear();
        typTxtfield.clear();
        kolorTxtfield.clear();

    }

    @FXML
    void dodajProdukt(ActionEvent event) {
        String wybor = nazwaProduktuChoice.getValue();

        //if(wybor == "") operations.dodajDoWprowadzonychProdukow("NULL");
        //else operations.dodajDoWprowadzonychProdukow(wybor);

    }



    @FXML
    void dodajNarty(ActionEvent event) throws SQLException {
        String wybor = rodzajUsterkiChoice.getValue();
        operations.dodajNarty(Integer.valueOf(idNartTxtfield.getText()), typTxtfield.getText(), markaTxtfield.getText(), kolorTxtfield.getText(), wybor);
    }

    @FXML
    void dodajUslugaDoZrealizowanychAction(ActionEvent event) {
       // operations.dodajDoZrealizowanych(Integer.valueOf(id_uslugaDoRealizacji.getText()));
        //operations.UsunZRealizacji(Integer.valueOf(id_uslugaDoRealizacji.getText()));

    }





    //pokazuje wszystkich klientow
    @FXML
    void pokazKlientAction(ActionEvent event) {
       // ObservableList klientList = operations.pokazWszystkich("klient", "Klient");
       // populateValues(klientTable, klientList);

    }

    @FXML
    void pokazProduktAction(ActionEvent event) {
       // ObservableList produktList = operations.pokazWszystkich("produkt", "Produkt");
       // populateValues(produktTable, produktList);
    }

    //pokazuje wszystkie usługi do realizacji
    @FXML
    void pokazUslugaDoRealizacjiAction(ActionEvent event) {
       // ObservableList uslugaDRList = operations.pokazWszystkich("usluga_do_realizacji", "Usluga_do_realizacji");
       // populateValues(uslugaDoRealizacjiTable, uslugaDRList);

    }

    @FXML
    void pokazUslugaWRealizacjiAction(ActionEvent event) {
       // ObservableList uslugaWRList = operations.pokazWszystkich("usluga_w_realizacji", "Usluga_w_realizacji");
        //populateValues(uslugaWRealizacjiTable, uslugaWRList);
    }

    @FXML
    void pokazUslugaZrealizowana(ActionEvent event) {
       // ObservableList uslugaZRList = operations.pokazWszystkich("usluga_zrealizowana", "Usluga_zrealizowana");
        //populateValues(uslugaZrealizowanaTable, uslugaZRList);

    }



    @FXML
    void przeloguj(ActionEvent event) throws IOException {
        Parent sprzedawca_stage = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage app_stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setTitle("Login window");
        Scene scene = new Scene(sprzedawca_stage, 1000, 600);
        app_stage.setScene(scene);
        scene.getStylesheets().add
                (getClass().getResource("style.css").toExternalForm());
        app_stage.setResizable(false);
        app_stage.show();
    }

    @FXML
    void szukajKlientAction(ActionEvent event) {
        Klient klient = (Klient) operations.search(String.valueOf(id_klient.getText()), "klient", "klient_id", "Klient");
        populateValue(klientTable, (Klient) klient, "Klient");
    }

    @FXML
    void szukajProduktAction(ActionEvent event) {
        Produkt produkt = (Produkt)operations.search(String.valueOf(id_klient.getText()), "produkt", "produkt_id", "Produkt");
        populateValue(produktTable, (Produkt) produkt, "Produkt");
    }

    @FXML
    void szukajUslugaDoRealizacjiAction(ActionEvent event) {
        Usluga_do_realizacji usluga = (Usluga_do_realizacji) operations.search(String.valueOf(id_uslugaDoRealizacji.getText()), "Usluga_do_realizacji", "usluga_id", "Usluga_do_realizacji");


        populateValue(uslugaDoRealizacjiTable, (Usluga_do_realizacji) usluga, "Usluga");

    }

    @FXML
    void szukajUslugaWRealizacjiAction(ActionEvent event) {
        Usluga_w_realizacji usluga = (Usluga_w_realizacji) operations.search(String.valueOf(id_uslugaWRealizacji.getText()), "Usluga_w_realizacji", "usluga_id", "Usluga_w_realizacji");


        populateValue(uslugaWRealizacjiTable, (Usluga_w_realizacji) usluga, "Usluga_w_realizacji");

    }

    @FXML
    void szukajUslugaZrealizowanaAction(ActionEvent event) {
        Usluga_zrealizowana usluga = (Usluga_zrealizowana) operations.search(String.valueOf(id_uslugaZrealizowana.getText()), "Usluga_zrealizowana", "usluga_id", "Usluga_zrealizowana");


        populateValue(uslugaZrealizowanaTable, (Usluga_zrealizowana) usluga, "Usluga_zrealizowana");

    }

    @FXML
    void usunProduktAction(ActionEvent event) {
        operations.usun(String.valueOf(id_produkt.getText()), "produkt_id", "Produkt");

    }

    @FXML
    void usunUslugaDoRealizacjiAction(ActionEvent event) {
        operations.usun(String.valueOf(id_uslugaDoRealizacji.getText()), "usluga_id", "Usluga_do_realizacji");

    }

    @FXML
    void usunUslugaWRealizacjiAction(ActionEvent event) {
        operations.usun(String.valueOf(id_uslugaWRealizacji.getText()), "usluga_id", "Usluga_w_realizacji");

    }

    private void populateValues(TableView tableView, ObservableList<Object> observableList) {
        tableView.setItems(observableList);
    }

    //wyswietlanie tabeli z bazy danych w aplikacji
    private void populateValue(TableView tableView, Object value, String objectName) {
        if (objectName.equals("Usluga_do_realizacji")) {
            ObservableList<Usluga_do_realizacji> observableList = FXCollections.observableArrayList();
            observableList.add((Usluga_do_realizacji) value);
            tableView.setItems(observableList);
        }

        if (objectName.equals("Usluga_w_realizacji")) {
            ObservableList<Usluga_w_realizacji> observableList = FXCollections.observableArrayList();
            observableList.add((Usluga_w_realizacji) value);
            tableView.setItems(observableList);
        }
        if (objectName.equals("Usluga_zrealizowana")) {
            ObservableList<Usluga_zrealizowana> observableList = FXCollections.observableArrayList();
            observableList.add((Usluga_zrealizowana) value);
            tableView.setItems(observableList);
        }

        if (objectName.equals("Klient")) {
            ObservableList<Klient> observableList = FXCollections.observableArrayList();
            observableList.add((Klient) value);
            tableView.setItems(observableList);
            System.out.println(observableList);
            System.out.println(observableList.get(0).imie_klientaProperty());
            System.out.println(observableList.get(0).klient_idProperty());
            System.out.println(observableList.get(0).mailProperty());

        }
        if (objectName.equals("Produkt")) {

            ObservableList<Produkt> observableList = FXCollections.observableArrayList();
            observableList.add((Produkt) value);
           // System.out.println("elo");
            tableView.setItems(observableList);
            //System.out.println("siema");
           // System.out.println(observableList);
        }
    }




}

