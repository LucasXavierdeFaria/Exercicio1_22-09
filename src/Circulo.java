public class Circulo {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    public double armazenarRaio(){
        return raio;
    }

    public void exibirArea(){
        System.out.println("Raio Digitado: " + raio);
        System.out.println("Area do círculo conforme o raio digitado:" +calcularArea());
    }

    public void exibirPerimetro(){
        System.out.println("Raio Digitado: " + raio);
        System.out.println("Perímetro do círculo conforme o raio digitado: " + calcularPerimetro());
    }
}
