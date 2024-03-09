import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buscar, posicion;
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Búsqueda binaria");
        System.out.println(arr);
        System.out.println("Escriba el elemento que busca");
        buscar = sc.nextInt();
        posicion = busquedaBinaria(arr, buscar);
        System.out.println(" El elemento se encuentra en la posicion: " +posicion);

    }
    public static int busquedaBinaria(int [] arr, int x){
        int menor = 0;
        int mayor = arr.length - 1;
        while(menor <= mayor){
            int medio = (menor + mayor) / 2;
            if(arr[medio] == x){
                return medio;
            }else if (arr[medio] < x){
                menor = medio + 1;
            }else{
                mayor = medio + 1;
            }
        }
        return -1;
    }
}