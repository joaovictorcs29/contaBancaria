package model.excecoes;

public class ExcecoesDeDominio extends RuntimeException {
    private static final long serialVersion = 1L;

    public ExcecoesDeDominio(String msg) {
        super(msg);
    }
}
