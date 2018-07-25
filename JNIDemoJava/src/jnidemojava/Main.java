/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnidemojava;

/**
 *
 * @author paul
 */
public class Main {
    static{
        System.load("/home/paul/Code/JNI Test/JNIDemoCdl/dist/libJNIDemoCdl.so");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Main().nativePrint();
    }

    private native void nativePrint();
    
}
