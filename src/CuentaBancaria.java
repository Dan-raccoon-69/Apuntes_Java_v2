public class CuentaBancaria {
    String titular;
    double saldo;
    TipoDeCuenta tipodeCuenta;


    public CuentaBancaria(double saldo, TipoDeCuenta tipodeCuenta, String titular) {
        this.saldo = saldo;
        this.tipodeCuenta = tipodeCuenta;
        this.titular = titular;
    }

    double getSaldo() {
        return saldo;
    }

    public void setTipodeCuenta(TipoDeCuenta tipodeCuenta) {
        this.tipodeCuenta = tipodeCuenta;
    }

    public TipoDeCuenta getTipodeCuenta() {
        return tipodeCuenta;
    }

    String Datos() {
        return "Titular: " + titular + "\nSaldo: " + saldo + "\nTipo de Cuenta: " + tipodeCuenta;
    }
}
