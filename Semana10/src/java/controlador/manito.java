
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class manito {

    private int n1;
    private int n2;
    private int n3;
    private double prom;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }
    
    public void promedio() {
        prom = (n1+n2+n3)/3;
    }
}
