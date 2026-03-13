/**
 * CLASSE REFATORADA FIAPRIDE
 * Mudanças realizadas:
 * 1. Encapsulamento: Atributos alterados para private para segurança de dados.
 * 2. Clean Code: Nomenclatura de variáveis e métodos atualizada
 * 3. Tipagem: Alterado nivelCombustivel para double -> gera maior precisão
 * 4. Validação: Adicionada lógica nos métodos para impedir valores negativos.
 */
package br.com.fiapride.model;

public class Veiculo {
    // Atributos, privados para proteção
    private String proprietario;
    private String placa;
    private double nivelCombustivel;

    // Métodos publicos
    //Função adicionar combustivel, não permite adicionar valores negativos (isso é feito pela função gastar).
    // - Não permite que o combustivel fique negativo (incondizente com a realidade)
    public void adicionarCombustivel(double v) {
        if (v > 0) {
            nivelCombustivel += v;
        } else {
            System.out.println("Erro: Valor de abastecimento inválido.");
        }
    }
    //Função de gastar combustivel. Não permite valor negativo.
    public void gastarCombustivel(double v) {
        if (v > 0 && (nivelCombustivel - v >= 0)) {
            nivelCombustivel -= v;
        } else {
            System.out.println("Combustível insuficiente ou valor inválido");
        }
    }

// Getters e Setters, criados automaticamente. Encapsulamento e proteção dos atributos
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

}