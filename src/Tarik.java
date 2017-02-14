/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yobelchris
 */
class Tarik {
    private int saldo;
    
    public Tarik(int saldo){
        this.saldo=saldo;
    }
    
    public boolean penarikan(int jumlah){
        if(jumlah<=this.saldo && jumlah>=50000){
            this.saldo-=jumlah;
            return true;
        }else{
            return false;
        }
    }
    
    public int getSaldo(){
        return this.saldo;
    }
}
