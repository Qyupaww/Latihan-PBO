/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author Faisal Rahman
 */
public class Bank {
    int saldo = 100000;
    
    public void simpanUang(int jumlah){
        saldo += jumlah;
        System.out.println("Simpan uang: Rp."+jumlah);
        getsaldo();
    }
    
    public void ambilUang(int jumlah){
        saldo -= jumlah;
        System.out.println("Ambil uang: Rp."+jumlah);
        getsaldo();
    }
    
    public void getsaldo(){
        System.out.println("Sisa saldo saat ini: Rp."+saldo);
    }
}
