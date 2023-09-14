package one.digitalinovation.laboojava.entidade.constantes;

public enum Materias {
    MATERIAS2( 2),
    MATERIAS5( 5),
    MATERIAS10( 10);

    private double fator;

    Materias (double fator){
        this.fator = fator / 10;
    }

    /**
     * Construtor.
     * @param nomePersonalizado Descrição da quantidade de matérias do caderno
     * @param fator Valor por tipo que influencia no cálculo do frete.
     */
    public double getFator() {
        return fator;
    }

}
