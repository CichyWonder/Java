package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneBookController implements Initializable {
    @FXML
    private TableView<PersonData> telephoneBookTableView;

    @FXML
    private TableColumn<PersonData, String> nameColumn;

    @FXML
    private TableColumn<PersonData, String> surnameColumn;

    @FXML
    private TableColumn<PersonData, String> numberColumn;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField surnameTextField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private Button addButton;

    @FXML
    void addButtonClicked(ActionEvent event) {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
        Matcher matcher = pattern.matcher(currentPerson.getPhoneNumber());


        if (!matcher.matches()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText("Proszę wprowadzić numer telefonu w formie XXX-XXX-XXX");
            alert.showAndWait();
        } else {
            PersonData personData = new PersonData(currentPerson.getName(), currentPerson.getSurname(), currentPerson.getPhoneNumber());
            phoneBookList.add(personData);
        }
    }

    private PersonData currentPerson = new PersonData();
    private final ObservableList<PersonData> phoneBookList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Połączenie pól obiektu PersonData z wartościami wpisanymi na UI
        nameTextField.textProperty().bindBidirectional(currentPerson.nameProperty());
        surnameTextField.textProperty().bindBidirectional(currentPerson.surnameProperty());
        phoneNumberField.textProperty().bindBidirectional(currentPerson.phoneNumberProperty());

        //Połączenie listy elementów w tabeli z listą PersonData w kodzie
        telephoneBookTableView.setItems(phoneBookList);

        //Połączenie wartości rekordów z listy phoneBookList z danymi w koumnie - aby dobrze były wyświetlane
        nameColumn.setCellValueFactory(rowData -> rowData.getValue().nameProperty());
        surnameColumn.setCellValueFactory(rowData->rowData.getValue().surnameProperty());
        numberColumn.setCellValueFactory(rowData -> rowData.getValue().phoneNumberProperty());

        PersonData person1 = new PersonData("Michał", "Wiśnia", "789-123-567");
        PersonData person2 = new PersonData("Barbara", "Mazur", "777-543-987");
        phoneBookList.addAll(person1,person2);
    }
}
