package com.fundamentals.chapterxxx;

import com.fundamentals.chapterxxx.service.GetInfoClient;

public class BankCountInformation extends GetInfoClient {
    public static void main(String[] args) {
        int contClient = 3;

        for (int i = 0; i < contClient; i++) {
            BankCountInformation infBanc = new BankCountInformation();

            infBanc.ingresarNombre();
            infBanc.ingresarApellido();
            infBanc.ingresatEdad();
            infBanc.ingresarCuenta();
            infBanc.ingresarSaldo();
            infBanc.ingrearTipoCuenta();
        }
    }
}
