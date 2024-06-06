/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.List;
import java.util.ArrayList;
import jdbc.service.MysqlMahasiswaService;
import jdbc.model.Mahasiswa;
/**
 *
 * @author user
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    public static void main(String[] args){
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        // insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        service.displayAll();
        
        // update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        service.displayAll();
        
        // delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        service.displayAll();
    }
}
