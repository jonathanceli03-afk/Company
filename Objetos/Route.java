/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.company.Objetos;

/**
 *
 * @author Jonat
 */
public class Route {
   
    protected String Deliverya;
    protected int Date;
    protected int NumPackTransp;
    protected float DistanceTrv=0.0f;
    protected float TripTime=0.0f;

    public String getDeliverya() {
        return Deliverya;
    }

    public void setDeliverya(String Deliverya) {
        this.Deliverya = Deliverya;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

    public int getNumPackTransp() {
        return NumPackTransp;
    }

    public void setNumPackTransp(int NumPackTransp) {
        this.NumPackTransp = NumPackTransp;
    }

    public float getDistanceTrv() {
        return DistanceTrv;
    }

    public void setDistanceTrv(float DistanceTrv) {
        this.DistanceTrv = DistanceTrv;
    }

    public float getTripTime() {
        return TripTime;
    }

    public void setTripTime(float TripTime) {
        this.TripTime = TripTime;
    }
    
    
    
}
