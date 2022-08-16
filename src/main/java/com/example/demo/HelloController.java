package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HelloController {

    //Identificadores de los campos de texto y boton de la interfaz en la ventana de datos
    @FXML
    private RadioButton juridica;

    @FXML
    private RadioButton natural;

    @FXML
    private TextField nit;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtIdentificador;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    void guardarDireccion(ActionEvent event) { //Este es el campo de texto de direccion
        String direccion = txtDireccion.getText();
        txtTelefono.requestFocus();
        System.out.println(direccion);
    }

    @FXML
    void guardarEmail(ActionEvent event) { //Campo de texto de email
        String email = txtEmail.getText();
        System.out.println(email);
    }

    @FXML
    void guardarID(ActionEvent event) { //Campo de texto de identificador
        String identificador = txtIdentificador.getText();
        txtDireccion.requestFocus();
        System.out.println(identificador);
    }

    @FXML
    void guardarNit(ActionEvent event) { //Campo de texto de nit
        String n = nit.getText();
        System.out.println(n);
    }

    @FXML
    void guardarNombre(ActionEvent event) { //Campo de texto de nombre
        String nombre = txtNombre.getText();
        txtIdentificador.requestFocus();
        System.out.println(nombre);
    }

    @FXML
    void guardarTelefono(ActionEvent event) { //Campo de texto de telefono
        String telefono = txtTelefono.getText();
        System.out.println(telefono);
    }

    @FXML
    void onActionJuridica(ActionEvent event) { //boton de juridica
        nit.setVisible(true);
        nit.requestFocus();
    }

    @FXML
    void onActionNatural(ActionEvent event) { //boton de natural
        txtEmail.setVisible(true);
        txtEmail.requestFocus();
    }

}