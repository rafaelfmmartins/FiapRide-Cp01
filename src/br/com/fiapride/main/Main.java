package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();

        // Setters, usados para proteger os métodos
        v1.setProprietario("Ygor");
        v1.setPlaca("FIA-1P34");

        v1.adicionarCombustivel(50.0);
        v1.gastarCombustivel(10.0);

        // Getters, para exibir os dados encapsulados
        System.out.println("Dono: " + v1.getProprietario() + 
                           " | Placa: " + v1.getPlaca() + 
                           " | Gasolina: " + v1.getNivelCombustivel() + "L");
    }
}