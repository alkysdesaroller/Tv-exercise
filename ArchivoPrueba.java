/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivotv;

public class ArchivoPrueba {

    public static void main(String[] args) {
        // Crear instancias de la clase Tv
        ArchivoTv tv1 = new ArchivoTv("Samsung", 55);
        ArchivoTv tv2 = new ArchivoTv("LG", 42);
        ArchivoTv tv3 = new ArchivoTv("Sony", 65);

        // Probar los métodos en cada instancia
        tv1.encender();
        tv1.cambiarCanal();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();


        tv2.encender();
        tv2.cambiarCanal();
        tv2.subirVolumen();
        tv2.cambiarCanal();
        tv2.cambiarCanal();
        
        tv3.encender();
        tv3.cambiarCanal();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.encender();
    }
}
