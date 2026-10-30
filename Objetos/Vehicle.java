/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.company.Objetos;

/**
 *
 * @author Jonat
 */
public class Vehicle {
       
    protected String LicenseP;
    protected String OpCondition;
    protected int InterCod;
    protected int Brand;
    protected float MaxLoadCap=0.0f;
    protected float BatteryLvl=0.0f;

    public String getLicenseP() {
        return LicenseP;
    }

    public void setLicenseP(String LicenseP) {
        this.LicenseP = LicenseP;
    }

    public String getOpCondition() {
        return OpCondition;
    }

    public void setOpCondition(String OpCondition) {
        this.OpCondition = OpCondition;
    }

    public int getInterCod() {
        return InterCod;
    }

    public void setInterCod(int InterCod) {
        this.InterCod = InterCod;
    }

    public int getBrand() {
        return Brand;
    }

    public void setBrand(int Brand) {
        this.Brand = Brand;
    }

    public float getMaxLoadCap() {
        return MaxLoadCap;
    }

    public void setMaxLoadCap(float MaxLoadCap) {
        this.MaxLoadCap = MaxLoadCap;
    }

    public float getBatteryLvl() {
        return BatteryLvl;
    }

    public void setBatteryLvl(float BatteryLvl) {
        this.BatteryLvl = BatteryLvl;
    }
    
    
}
