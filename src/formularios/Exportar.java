package formularios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janio
 */
public class Exportar {
    
    //ATRIBUTOS
    
    private String quantLanche, quantBebida,
            tipoLanche, tipoBebida;

    // MÉTODOS ESPECIAIS GETTERS E SETTERS
    
    public String getquantLanche() {
        return quantLanche;
    }
    public void setquantLanche(String quantLanche) {
        this.quantLanche = quantLanche;
    }

    public String getquantBebida() {
        return quantBebida;
    }
    public void setquantBebida(String quantBebida) {
        this.quantBebida = quantBebida;
    }

    public String getTipoLanche() {
        return tipoLanche;
    }
    public void setTipoLanche(String tipoLanche) {
        this.tipoLanche = tipoLanche;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }
    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }
    
    private String endRua, endNum, endBairro, 
                   tipoEndereco, tipoPag;

   
    
    
    // MÉTODOS ESPECIAIS GETTERS E SETTERS

    public String getEndRua() {
        return endRua;
    }
    public void setEndRua(String endRua) {
        this.endRua = endRua;
        }
    
    public String getEndNum() {
        return endNum;
    }
    public void setEndNum(String endNum) {
        this.endNum = endNum;
    }

    public String getEndBairro() {
        return endBairro;
    }
    public void setEndBairro(String endBairro) {
        this.endBairro = endBairro;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }
    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getTipoPag() {
        return tipoPag;
    }
    public void setTipoPag(String tipoPag) {
        this.tipoPag = tipoPag;
    }
    
    

}
