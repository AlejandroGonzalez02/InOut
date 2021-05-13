package com.company;

import Libreria.*;

/**
 * @author Alejandro Gonzalez Alonso
 * @version 1.0
 * @date    2021-05-13
 */

public class Main {

    public static void main(String[] args) {

        //Instanciamos o factory para que nos saque os mensaxes
        Factory factory= new Factory();
        factory.getProduto();

    }
}
