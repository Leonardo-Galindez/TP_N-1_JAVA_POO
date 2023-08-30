/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_3.Ejercicio2;

/**
 *
 * @author galin
 */
public class CriaturaOscura implements Runnable {

    private Energia energia;

    public CriaturaOscura(Energia energia) {
        this.energia = energia;
    }

    @Override
    public void run() {
        synchronized (energia) {
            System.out.println("Criatura Oscura drena 3 unidades de Energia");
            energia.modificarEnergia(-3);
            System.out.println("Energia restante:" + energia.ontenerEnergia());
        }
    }
}
