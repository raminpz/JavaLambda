package e01a_planifica;

public interface Aritmetica {

    public interface DosValores {
        public Double procesa(Object a, Object b);
    }

    public interface MuchosValores {
        public Double procesa(Object... v);
    }

    /**
     *
     */

    public interface ToDouble {
        public Double toDouble(Object x);
    }

    public interface ToInteger {
        public Integer toInteger(Object x);
    }
}
