public class BissextoAplication {

    public boolean application(int ano){
        // ser multiplo de 400; ex: 1600
        if (ano % 400 == 0) {
            return true;
            // ser múltiplo de 4, exceto se for múltiplo de 100; ex: 2004
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            return true;
            // os demais não são são bissextos
        } else {
            return false;
        }
    }
}
