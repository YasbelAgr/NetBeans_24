package EjercicioSumaResta;
public class EjercicioSumaResta {
    public static void main(String[] args) {
       System.out.println("Suma: " +sumaResta(51));
    }
    public static int sumaResta(int numero){
        int suma=0;
        for (int i=1; i<=numero; i++){
            if(i%2==0){
                suma-=i;
            }else{
                suma+=i;
            }
        }
        return suma;
    }
}
