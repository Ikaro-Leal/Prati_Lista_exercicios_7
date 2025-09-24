// Uma interface é um contrato.
// Qualquer classe que implementar IMeioTransporte será obrigada
// a ter os métodos acelerar() e frear().
//Fazendo uma analogia ao react, é como se fosse o trio que arquivos de que fiz em .js, no AuthPage


public interface IMeioTransporte {
    void acelerar();
    void frear();
}