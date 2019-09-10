package com.putera.controller;

import com.putera.entity.Category;
import com.putera.entity.Item;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPrice;
    @FXML
    private TextField txtCategory;
    @FXML
    private TableColumn<Item,String> col01;
    @FXML
    private TableColumn<Item,String> col02;
    @FXML
    private TableColumn col03;

    private ObservableList<Category> category;
    private ObservableList<Item> item;
    @FXML
    private ChoiceBox coboxCategory;
    @FXML
    private TableView tableDepartment;

    @FXML
    private void tableClick(MouseEvent mouseEvent) {

    }

    @FXML
    private void saveCat(ActionEvent actionEvent) {
    }

    @FXML
    private void saveAct(ActionEvent actionEvent) {
    }

    @FXML
    private void resetAct(ActionEvent actionEvent) {
    }

    @FXML
    private void updateAct(ActionEvent actionEvent) {
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        category = FXCollections.observableArrayList();
        item = FXCollections.observableArrayList();

        coboxCategory.setItems(category);
        tableDepartment.setItems(item);
        col01.setCellValueFactory(data -> {
            Item i = data.getValue();
            return new SimpleStringProperty(i.getName());
        });
        col02.setCellValueFactory(data -> {
            Item i = data.getValue();
            return new SimpleStringProperty(i.getPrice()).asObject();
        });

    }
}
