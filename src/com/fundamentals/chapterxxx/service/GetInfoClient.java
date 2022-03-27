package com.fundamentals.chapterxxx.service;

import java.util.Scanner;

public class GetInfoClient implements com.fundamentals.chapterxxx.repository.GetInfoClient {
    Scanner in = new Scanner(System.in);
    float saldo1 = 0;
    String nombreCleinte;


    @Override
    public void ingresarNombre() {
        System.out.println("Ingresar el nombre del cliente");
        String nombre = in.nextLine();
        System.out.println("Ha ingresado " + nombre);
        nombreCleinte = nombre;

    }

    @Override
    public void ingresarApellido() {
        System.out.println("Ingresar el apellido del cliente");
        String apellido = in.nextLine();
        System.out.println("Ha ingresado " + apellido);

    }

    @Override
    public void ingresatEdad() {
        System.out.println("Ingresar la edad del cliente");
        int edad = in.nextInt();
        System.out.println("La edad que ingreso es " + edad);
    }

    @Override
    public void ingresarCuenta() {
        System.out.println("Ingresar el numero de cuenta del cliente");
        int cuenta = in.nextInt();
        System.out.println("el numero de cuenta ingresado es: " + cuenta);
    }

    @Override
    public void ingresarSaldo() {
        System.out.println("Ingresar el saldo del cliente");
        float saldo = in.nextFloat();
        System.out.println("El saldo ingresado es de: " + saldo);
        saldo1 = saldo;
    }

    float porcentaje = (float) (saldo1 * 0.3);

    @Override
    public void ingrearTipoCuenta() {

        System.out.println("Ingresar el tipo de cuenta del cliente");
        System.out.println("1-Cuenta Corriente, 2-Caja de Ahorros Comun," +
                " 3- Caja de Ahorros especial, 4- Plazo fijo");

        int tipo = in.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("La cuenta ingresada corresponde a la numero: " + 1);
                float porcentaje = (float) (saldo1 * 0.03);
                float saldoActual = (saldo1) - (porcentaje);
                System.out.println("Su saldo actual es de: " + saldoActual);
                break;
            case 2:
                System.out.println("La cuenta ingresada corresponde a la numero: " + 2);
                float porcentaje2 = (float) (saldo1 * 0.03);
                float saldoActual2 = (saldo1) - (porcentaje2);
                System.out.println("Su saldo actual es de: " + saldoActual2);
                break;
            case 3:
                if (saldo1 > 90.000)
                    System.out.println("El cliente " + nombreCleinte + " posee una cuenta con un " +
                            "saldo mayor a 90.000 de " + saldo1);
                break;
            case 4:
                float cuent4 = saldo1;
                System.out.println("La cuenta ingresada corresponde a la numero: " + cuent4);
                System.out.println("Su saldo actual es de: " + saldo1);
                break;
        }
    }
}
