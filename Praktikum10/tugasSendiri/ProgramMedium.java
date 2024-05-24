/*
 *  File    : ProgramMedium.java
 *  NIM     : 24060122140104
 *  Nama    : Alwey Hakim
 */

import java.util.List;
import java.util.ArrayList;

public class ProgramMedium {
    public static void main(String[] args){
        Truck truck = new Truck();
        System.out.println(truck);
        SeaPlane sPlane = new SeaPlane();
        System.out.println(sPlane);
        Helicopter copter = new Helicopter();
        System.out.println(copter);
        System.out.println("#################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah armada Truck: " + armadaTruck.size());
        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah armada SeaPlane: " + armadaSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah armada Helicopter: " + armadaHelicopter.size());
        System.out.println("#################################");

        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        System.out.println("Menambah armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kenderaan: " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambah armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kenderaan: " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambah armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kenderaan: " + armadaKendaraan.getAllArmada().size());
    }
}
