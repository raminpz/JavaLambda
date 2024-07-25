package e01b_implementa;

import e01a_planifica.Aritmetica;

import java.util.function.Predicate;

public class Baldor {

    public static Double suma(Predicate<Double> predicate, Object... args){
        Aritmetica.MuchosValores suma = vs ->{
            Double sum = 0d;

            for (Object v: vs) {
                Double x = toDouble(v);
                if (x == null){
                    sum = null;
                    break;
                }

                if (predicate != null){
                    sum += predicate.test(x) ? x : 0d;
                }else{
                    sum += x;
                }
            }
          return  sum;
        };
        return suma.procesa(args);
    }


    public static Double resta(Object a, Object b){
        Aritmetica.DosValores obj = (x, y) ->{
            Double v1 = toDouble(x);
            Double v2 = toDouble(y);

            Double result = (v1 != null && v2 != null) ? v1 -v2 : null;

            return result;

        };
        return obj.procesa(a, b);
    }

    public static Double multiplica(Object a, Object b){
        Aritmetica.DosValores obj = (x, y) ->{
            Double v1 = toDouble(x);
            Double v2 = toDouble(y);

            Double result = (v1 != null && v2 != null) ? v1 * v2 : null;

            return result;

        };
        return obj.procesa(a, b);
    }

    public static Double divide(Object a, Object b){
        Aritmetica.DosValores obj = (x, y) ->{
            Double v1 = toDouble(x);
            Double v2 = toDouble(y);

            Double result = (v1 != null && v2 != null) ? v1 / v2 : null;

            return result;

        };
        return obj.procesa(a, b);
    }

    public static Double modulo(Object a, Object b){
        Aritmetica.DosValores obj = (x, y) ->{
            Double v1 = toDouble(x);
            Double v2 = toDouble(y);

            Double result = (v1 != null && v2 != null) ? v1 % v2 : null;

            return result;

        };
        return obj.procesa(a, b);
    }

    public static Double promedio(Predicate<Double> predicate, Object... args){
        Aritmetica.MuchosValores suma = vs ->{
            Double sum = 0d;
            Integer ctos = 0;

            for (Object v: vs) {
                Double x = toDouble(v);
                if (x == null){
                    sum = null;
                    break;
                }

                if (predicate != null){

                    sum += predicate.test(x) ? x : 0d;
                    ctos += predicate.test(x) ? 1 : 0;

                } else {
                    sum += x;
                    ++ctos;
                }

            }
            return  (sum != null) ? (sum / ctos) : null;
        };
        return suma.procesa(args);
    }

    public static Double maximo(Predicate<Double> predicate, Object... args){
        Aritmetica.MuchosValores suma = vs ->{
            Double max = Double.NEGATIVE_INFINITY;

            for (Object v: vs) {
                Double x = toDouble(v);
                if (x == null){
                    max = null;
                    break;
                }
                if (predicate != null){
                    if (predicate.test(x)){
                        max = (x > max) ? x : max;
                    }
                } else {
                    max = (x > max) ? x : max;
                }
            }
            return  max;
        };
        return suma.procesa(args);
    }

    public static Double minimo(Predicate<Double> predicate, Object... args){
        Aritmetica.MuchosValores suma = vs ->{
            Double min = Double.POSITIVE_INFINITY;

            for (Object v: vs) {
                Double x = toDouble(v);
                if (x == null){
                    min = null;
                    break;
                }

                if (predicate != null){
                    if (predicate.test(x)){
                        min = (x < min) ? x : min;
                    }

                } else {
                    min = (x < min) ? x : min;
                }

            }
            return  min;
        };
        return suma.procesa(args);
    }


    public static Double cuantos(Predicate<Double> predicate, Object... args){

        Aritmetica.MuchosValores obj = (Object[] vs) ->{

            Integer ctos = 0;

            for (Object v: vs ) {
                Double x = toDouble(v);

                if (x != null){
                    if (predicate != null){
                        ctos += predicate.test(x) ? 1 : 0;
                    } else {
                        ++ctos;
                    }
                }
            }

            return ctos.doubleValue();
        };
        return obj.procesa(args);
    }

    /**
     *
     */

        public static Double toDouble(Object obj){

            Aritmetica .ToDouble result = x -> {

                Double r = null;

                try {
                    r = Double.valueOf(x.toString());
                }catch (NumberFormatException | NullPointerException e){

                }
                return r;
            };
            return result.toDouble(obj);
        }

}
