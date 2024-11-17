// • Escribe y prueba una clase que represente una Fecha (dia, mes, año). La clase debe incluir:
// • Variables de instancia para el dia, mes y año.
// • Métodos getters y setters, que verifiquen valores válidos.
// • Un método mostrarfecha() que muestre en la pantalla la fecha, por ejemplo: 3 de enero de 2022.
// • Un método toString.

class Fecha{
    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year){
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getyear(){
        return year;
    }

    public void setDia(int dia){
        if(dia > 0 && dia <= 31){
            this.dia = dia;
        }
    }

    public void setMes(int mes){
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }
    }

    public void setyear(int year){
        if(year > 0){
            this.year = year;
        }
    }

    public void mostrarFecha(){
        String mesString = "";
        switch(mes){
            case 1:
                mesString = "enero";
                break;
            case 2:
                mesString = "febrero";
                break;
            case 3:
                mesString = "marzo";
                break;
            case 4:
                mesString = "abril";
                break;
            case 5:
                mesString = "mayo";
                break;
            case 6:
                mesString = "junio";
                break;
            case 7:
                mesString = "julio";
                break;
            case 8:
                mesString = "agosto";
                break;
            case 9:
                mesString = "septiembre";
                break;
            case 10:
                mesString = "octubre";
                break;
            case 11:
                mesString = "noviembre";
                break;
            case 12:
                mesString = "diciembre";
                break;
        }
        System.out.println(dia + " de " + mesString + " de " + year);
    }

    public String toString(){
        return dia + "/" + mes + "/" + year;
    }
}

public class Main{
    public static void main(String[] args){
        Fecha f = new Fecha(3, 1, 2022);
        System.out.println(f);
        f.mostrarFecha();
        f.setDia(4);
        f.setMes(2);
        f.setyear(2023);
        System.out.println(f);
        f.mostrarFecha();
    }
}