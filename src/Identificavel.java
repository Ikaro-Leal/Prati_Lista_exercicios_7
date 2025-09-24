// Esta interface também é genérica. O ID pode ser um Long, String, etc.
// Qualquer classe que implementar esta interface precisa ter um método getId().



public interface Identificavel<ID> {
    ID getId();
}