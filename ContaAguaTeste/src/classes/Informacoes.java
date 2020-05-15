package classes;

public class Informacoes {

    //inicia as variaveis
    private double pessoas;
    private double chuveiro;
    private double privada;
    private double piaB;
    private double MaquinaR;
    private double tanque;
    private double piaC;
    private double MaquinaL;
    private double total;
    private double totalm3;
    private double valorRS;

    //inicia os getters e setters
    public double getPessoas() {
        return pessoas;
    }

    public void setPessoas(double pessoas) {
        this.pessoas = pessoas;
    }

    public double getChuveiro() {
        return chuveiro;
    }

    public void setChuveiro(double chuveiro) {
        this.chuveiro = chuveiro;
    }

    public double getPrivada() {
        return privada;
    }

    public void setPrivada(double privada) {
        this.privada = privada;
    }

    public double getPiaB() {
        return piaB;
    }

    public void setPiaB(double piaB) {
        this.piaB = piaB;
    }

    public double getMaquinaR() {
        return MaquinaR;
    }

    public void setMaquinaR(double MaquinaR) {
        this.MaquinaR = MaquinaR;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getPiaC() {
        return piaC;
    }

    public void setPiaC(double piaC) {
        this.piaC = piaC;
    }

    public double getMaquinaL() {
        return MaquinaL;
    }

    public void setMaquinaL(double MaquinaL) {
        this.MaquinaL = MaquinaL;
    }

    //inicia os métodos de calculos de gastos
    public double calcularChuveiroC(int info) {
        return info * 3 * 30 * getPessoas();
    }

    public double calcularChuveiroA(int info) {
        return info * 9.6 * 30 * getPessoas();
    }

    public double calcularPrivada(int info) {
        return info * 10 * 30 * getPessoas();
    }

    public double calcularPiaB(int info) {
        return info * 9 * 30 * getPessoas();
    }

    public double calcularMaquinaR(int info) {
        return info * 135 * 30 * getPessoas();
    }

    public double calcularTanque(int info) {
        return info * 18.6 * 30 * getPessoas();
    }

    public double calcularPiaC(int info) {
        return info * 7.8 * 30 * getPessoas();
    }

    public double calcularMaquinaL(int info) {
        return info * 40 * 30 * getPessoas();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalm3() {
        return totalm3;
    }

    public void setTotalm3(double totalm3) {
        this.totalm3 = totalm3;
    }

    public void calcularTotal() {
        setTotal(getChuveiro() + getPrivada() + getMaquinaL() + getMaquinaR() + getPiaB() + getPiaC() + getTanque());
        setTotalm3(getTotal() / 1000);
    }

    public double getValorRS() {
        return valorRS;
    }

    public void setValorRS(double valorRS) {
        this.valorRS = valorRS;
    }

}
