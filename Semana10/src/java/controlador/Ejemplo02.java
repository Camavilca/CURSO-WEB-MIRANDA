
package controlador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class Ejemplo02 {

    private int n1;
    private int n2;
    private int res;
    private String operacion;

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

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public String procesar(){
        String destino;
        try {
            validar(n1);
            validar(n2);
            if(operacion.equals("SUMA")){
                res = n1+n2;
            }else if(operacion.equals("PRODUCTO")){
                res = n1*n2;
            }
            destino = "resultado3";
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Error en el proceso",
                    e.getMessage());
                    
            FacesContext.getCurrentInstance().addMessage(null, msg);
            destino = "registro3";
        }
        return destino;
    }
    
    public void validar(int num){
        if(num<0){
            throw new RuntimeException("no permide valores negativos");
        }
        if(num>100){
            throw new RuntimeException("no permide valores mayores a 100");
        }
    }
}
