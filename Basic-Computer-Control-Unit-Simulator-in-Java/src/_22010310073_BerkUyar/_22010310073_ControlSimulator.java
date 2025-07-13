package _22010310073_BerkUyar;

import java.io.*;
import java.util.*;

public class _22010310073_ControlSimulator {
    private List<String> controlFunctions;

    public _22010310073_ControlSimulator() {
        controlFunctions = new ArrayList<>();
    }

    public void loadControlFunctions(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                controlFunctions.add(line.trim());
            }
            System.out.println("denetim_fonksiyonlari.txt dosyası okundu.");
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }

    public void processControlFunctions() {
        for (String function : controlFunctions) {
            System.out.println("\nDenetim fonksiyonu: " + function);

            String[] signals = function.split(" ");

            for (String signal : signals) {
                switch (signal) {
                    case "D0":
                        System.out.println("DR register'ının Load girişi aktif edilir.");
                        break;
                    case "R'":
                        System.out.println("IR register'ının Load girişi aktif edilir. PC register'ının Increment girişi aktif edilir.");
                        break;
                    case "D5":
                        System.out.println("AR register'ının Increment girişi aktif edilir.");
                        break;
                    case "D7":
                        System.out.println("S bayrağının D girişine 0 uygulanır.");
                        break;
                    case "T4":
                        System.out.println("T4 zamanlama sinyali çalıştırılıyor.");
                        break;
                    case "T1":
                        System.out.println("T1 zamanlama sinyali çalıştırılıyor.");
                        break;
                    case "I'":
                        System.out.println("I sinyali DEĞİL durumu için işlem yapılıyor.");
                        break;
                    case "B0":
                        System.out.println("B0 bayrağı işlem için aktif hale getiriliyor.");
                        break;
                    default:
                        System.out.println(signal + " için işlem bulunamadı.");
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        _22010310073_ControlSimulator simulator = new _22010310073_ControlSimulator();
        simulator.loadControlFunctions("denetim_fonksiyonlari.txt");
        simulator.processControlFunctions();
    }
}