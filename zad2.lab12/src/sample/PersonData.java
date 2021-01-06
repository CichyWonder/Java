package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonData {
    StringProperty name = new SimpleStringProperty();
    StringProperty surname = new SimpleStringProperty();
    StringProperty phoneNumber = new SimpleStringProperty();

    public PersonData() {
    }

    public PersonData(String name, String surname, String phoneNumber) {
        this.name.set(name);
        this.surname.set(surname);
        this.phoneNumber.set(phoneNumber);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
        return surname.get();
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }
}

