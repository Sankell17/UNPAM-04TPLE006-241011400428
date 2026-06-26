/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5_sandiperdana;

import java.io.InputStream;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new scanner(System.in);
    
        int totalPertemuan = 21;
        
        //input
        system.out.print("Masukkan nilai:   ");
        int nilai = input.nextlnt();
        
        system.out.print("Masukkan jumlah kehadiran (max21); ");
        int hadir;
        
    //validasi input kehadiran
        if(hadir <0 || hadir > totalPertemuan){
            system.out.println("input kehaidran tidak valid");
        } else{
            double persen = (hadir / (double)totalPertemuan) * 100;
            if(hadir >=1{
                char grade;
                if(nilai>=85){
                    grade = 'A';
                }else if(nilai >= 70){
                    grade ='B';
                }else if{nilai >=60{
                    grade ='C';
                }else if(nilai >= 60){
                        grade ='D';
                } else {
                    grade ='E';
                }
                
// output
system.out.println("Presentase Kehadiran:" + persen + "%");
system.out.println("Nilai:" + grade);
                }

    private static class scanner extends Scanner {

        public scanner(InputStream in) {
        }
    }
