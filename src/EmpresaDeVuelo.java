import java.util.Scanner;

public class EmpresaDeVuelo {
    public static void main(String[] args) {
        String reserva = "si";
        int matriz[][] = new int[6][3];
        int ndestino,nvuelo,nboletos,asientosdispo;


        Scanner inreserva = new Scanner(System.in);
        Scanner inasientos = new Scanner(System.in);
        Scanner indestino = new Scanner(System.in);
        Scanner invuelo = new Scanner(System.in);
        Scanner inboletos = new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0;j<3;j++){
                System.out.println("Porfavor ingrese la cantidad de asiento disponibles para el vuelo");
                matriz[i][j] = inasientos.nextInt();
            }
        }

        while(!reserva.equalsIgnoreCase("finish") && reserva.equalsIgnoreCase("si")){

            System.out.println("Si desea hacer una reserva ingrese 'si");
            reserva = inreserva.next();

            System.out.println("Ingrese el destino al que desea viajar:");
            System.out.println("0 - Rio De Janeiro\n1 - Cancun\n2 - Madrid\n3 - Roma\n4 - Milan\n5 - Iguazu");
            ndestino = indestino.nextInt();

            System.out.println("Ingrese el vuelo que desea tomar:");
            System.out.println("0 - Manana\n1 - Mediodia\n2 - Noche");
            nvuelo = invuelo.nextInt();

            System.out.println("Ingrese la cantidad de boletos que desea:");
            nboletos = inboletos.nextInt();

            if (ndestino==0){
                if (nvuelo==0 && matriz[0][0] >= nboletos){
                    matriz[0][0] = matriz[0][0] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==1 && matriz[0][1] >= nboletos) {
                    matriz[0][1] = matriz[0][1] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==2 && matriz[0][2] >= nboletos) {
                    matriz[0][2] = matriz[0][2] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                }
                else System.out.println("Disculpe, no se pudo completar su operacion debido a que nob hay asientos disponibles");

            }

            else if (ndestino==1) {
                if (nvuelo==0 && matriz[1][0] >= nboletos){
                    matriz[1][0] = matriz[1][0] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==1 && matriz[1][1] >= nboletos) {
                    matriz[1][1] = matriz[1][1] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==2 && matriz[0][2] >= nboletos) {
                    matriz[1][2] = matriz[1][2] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                }
                else System.out.println("Disculpe, no se pudo completar su operacion debido a que nob hay asientos disponibles");
            }

            else if (ndestino==2) {
                if (nvuelo==0 && matriz[2][0] >= nboletos){
                    matriz[2][0] = matriz[2][0] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==1 && matriz[2][1] >= nboletos) {
                    matriz[2][1] = matriz[2][1] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==2 && matriz[2][2] >= nboletos) {
                    matriz[2][2] = matriz[2][2] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                }
                else System.out.println("Disculpe, no se pudo completar su operacion debido a que nob hay asientos disponibles");
            }

            else if (ndestino==3) {
                if (nvuelo==0 && matriz[3][0] >= nboletos){
                    matriz[3][0] = matriz[3][0] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==1 && matriz[3][1] >= nboletos) {
                    matriz[3][1] = matriz[3][1] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==2 && matriz[3][2] >= nboletos) {
                    matriz[3][2] = matriz[3][2] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                }
                else System.out.println("Disculpe, no se pudo completar su operacion debido a que nob hay asientos disponibles");
            }

            else if (ndestino==4) {
                if (nvuelo==0 && matriz[4][0] >= nboletos){
                    matriz[4][0] = matriz[4][0] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==1 && matriz[4][1] >= nboletos) {
                    matriz[4][1] = matriz[4][1] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==2 && matriz[4][2] >= nboletos) {
                    matriz[4][2] = matriz[4][2] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                }
                else System.out.println("Disculpe, no se pudo completar su operacion debido a que nob hay asientos disponibles");
            }

            else if (ndestino==5) {
                if (nvuelo==0 && matriz[5][0] >= nboletos){
                    matriz[5][0] = matriz[5][0] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==1 && matriz[5][1] >= nboletos) {
                    matriz[5][1] = matriz[5][1] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                } else if (nvuelo==2 && matriz[5][2] >= nboletos) {
                    matriz[5][2] = matriz[5][2] - nboletos;
                    System.out.println("Su reserva fue realizada con exito");
                }
                else System.out.println("Disculpe, no se pudo completar su operacion debido a que nob hay asientos disponibles");
            }

            else System.out.println("Numero no registrado");
        }

        System.out.println("Gracias por preferirnos");

    }
}
