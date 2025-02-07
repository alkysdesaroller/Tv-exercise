/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivotv;


 public class ArchivoTv {
    private String marca; // Marca del televisor
    private int tamaño; // Tamaño de la pantalla en pulgadas
    private boolean encendido; // Estado del televisor
    private int volumen; // Nivel de volumen
    private int canal; // Canal actual

    /*
      Constructor de la clase Tv.
     */
    public ArchivoTv(String marca, int tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.encendido = false;
        this.volumen = 10;
        this.canal = 1;
    }

    /*
      Método para encender o apagar la televisión.
     */
    public void encender() {
        encendido = !encendido;
        System.out.println("El televisor " + marca + (encendido ? " está encendido." : " está apagado."));
    }

    /*
      Método para cambiar al siguiente canal.
     */
    public void cambiarCanal() {
        if (encendido) {
            canal++;
            System.out.println("Cambiando al canal: " + canal);
        } else {
            System.out.println("Encienda el televisor primero.");
        }
    }

    /*
      Método para subir el volumen.
     */
    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Subiendo volumen a: " + volumen);
        } else {
            System.out.println("Encienda el televisor primero.");
        }
    }

    /*
      Método para bajar el volumen.
     */
    public void bajarVolumen() {
        if (encendido) {
            volumen--;
            System.out.println("Bajando volumen a: " + volumen);
        } else {
            System.out.println("Encienda el televisor primero.");
        }
    }
}