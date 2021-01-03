/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mycompany.casademarcat.login;
import static com.mycompany.casademarcat.login.loggedPass;
import static com.mycompany.casademarcat.login.loggedUser;
import com.mycompany.casademarcat.loginAproved;
import static com.mycompany.casademarcat.loginAproved.jTable1;
import static com.mycompany.casademarcat.loginAproved.nrBon;
import static com.mycompany.casademarcat.loginAproved.rest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;




/**
 *
 * @author kodie
 */
public class previewBon {
    
    int nrBon;
    int nrBuc;
    double rest;
    double pretUnitar;
    double pretTotal;
    String numeProdus;
    String casier;
    String metodaDePlata1; 
    String metodaDePlata2;
    String metodaDePlata3;
    String timp;

    public previewBon(int nrBon, int nrBuc, double rest, double pretUnitar, double pretTotal, String numeProdus, String casier, String metodaDePlata1, String metodaDePlata2, String metodaDePlata3, String timp) {
        this.nrBon = nrBon;
        this.nrBuc = nrBuc;
        this.rest = rest;
        this.pretUnitar = pretUnitar;
        this.pretTotal = pretTotal;
        this.numeProdus = numeProdus;
        this.casier = casier;
        this.metodaDePlata1 = metodaDePlata1;
        this.metodaDePlata2 = metodaDePlata2;
        this.metodaDePlata3 = metodaDePlata3;
        this.timp = timp;
        
 
    }

    public previewBon(int nrBon, int nrBuc, double rest, double pretUnitar, double pretTotal, String numeProdus, String casier, String metodaDePlata1, String metodaDePlata2, String timp) {
        this.nrBon = nrBon;
        this.nrBuc = nrBuc;
        this.rest = rest;
        this.pretUnitar = pretUnitar;
        this.pretTotal = pretTotal;
        this.numeProdus = numeProdus;
        this.casier = casier;
        this.metodaDePlata1 = metodaDePlata1;
        this.metodaDePlata2 = metodaDePlata2;
        this.timp = timp;
    }

    public previewBon(int nrBon, int nrBuc, double rest, double pretUnitar, double pretTotal, String numeProdus, String casier, String metodaDePlata1, String timp) {
        this.nrBon = nrBon;
        this.nrBuc = nrBuc;
        this.rest = rest;
        this.pretUnitar = pretUnitar;
        this.pretTotal = pretTotal;
        this.numeProdus = numeProdus;
        this.casier = casier;
        this.metodaDePlata1 = metodaDePlata1;
        this.timp = timp;
    }

    public void setNrBon(int nrBon) {
        this.nrBon = nrBon;
    }

    public void setNrBuc(int nrBuc) {
        this.nrBuc = nrBuc;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }

    public void setPretUnitar(double pretUnitar) {
        this.pretUnitar = pretUnitar;
    }

    public void setPretTotal(double pretTotal) {
        this.pretTotal = pretTotal;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public void setCasier(String casier) {
        this.casier = casier;
    }

    public void setMetodaDePlata1(String metodaDePlata1) {
        this.metodaDePlata1 = metodaDePlata1;
    }

    public void setMetodaDePlata2(String metodaDePlata2) {
        this.metodaDePlata2 = metodaDePlata2;
    }

    public void setMetodaDePlata3(String metodaDePlata3) {
        this.metodaDePlata3 = metodaDePlata3;
    }

    public void setTimp(String timp) {
        this.timp = timp;
    }

    public int getNrBon() {
        return nrBon;
    }

    public int getNrBuc() {
        return nrBuc;
    }

    public double getRest() {
        return rest;
    }

    public double getPretUnitar() {
        return pretUnitar;
    }

    public double getPretTotal() {
        return pretTotal;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public String getCasier() {
        return casier;
    }

    public String getMetodaDePlata1() {
        return metodaDePlata1;
    }

    public String getMetodaDePlata2() {
        return metodaDePlata2;
    }

    public String getMetodaDePlata3() {
        return metodaDePlata3;
    }

    public String getTimp() {
        return timp;
    }
    
   
    
    
            

  
  }