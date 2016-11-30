import java.util.ArrayList;
import java.util.Random;

public class MagazynSingleton {
    private static MagazynSingleton instance;
    private MagazynSingleton() {
    }
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Random los = new Random();
        for (int x = 0; x < 100; x++) {
            int i = los.nextInt(3);
            switch (i) {
                case 0:
                    lista.add(x, "Komponent \n");
                    break;
                case 1:
                    lista.add(x, "Komponent2 \n");
                    break;
                case 2:
                    lista.add(x, "Komponent3 \n");
                    break;
            }
        }
        System.out.println("Cała lista = " + lista);

}
    static  {
        try {
            instance = new MagazynSingleton();
        } catch (Exception e)   {
            throw new RuntimeException("wyjątek podczas tworzenia instancji singletona");

        }
    }
    public static MagazynSingleton getInstance()    {
        return instance;
    }
}
