import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.List;
import java.util.function.Predicate;
import java.util.Map;
import java.util.*;
//Librerias necesarias para poder ejecutar distintos metodos, funciones y lambdas. Utilizamos util* en caso de que falte alguna, ya que esa importa todas

public class Factura{
    //comenzamos creando los atributos que hay dentro de las columnas del archivo csv, son 25 datos, por lo tanto hay 25 atributos
    //luego de esto haremos los getters y setters por cada atributo, para luego crear contructores.
    private int orderNumber;
    private int quantityOrdered;
    private double priceEach;
    private int orderLineNumber;
    private double sales;
    private String orderDate;
    private String status;
    private int qtrId;
    private int monthId;
    private int yearId;
    private String productLine;
    private int msrp;
    private String productCode;
    private String customerName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String territory;
    private String contactLastName;
    private String contactFirstName;
    private String dealSize;
    
    //comenzamos con los getters y setters por cada uno de los atributos
    public int getorderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    
    public int getquantityOrdered() {
        return quantityOrdered;
    }
    public void setquantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }
    
    
    public double getpriceEach() {
        return priceEach;
    }
    public void setpriceEach(double priceEach) {
        this.priceEach = priceEach;
    }    
    
    
    public int getorderLineNumber() {
        return orderLineNumber;
    }
    public void setorderLineNumber(int orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }    
    
    
    public double getsales() {
        return sales;
    }
    public void setsales(double sales) {
        this.sales = sales;
    } 
    
    
    public String getorderDate() {
        return orderDate;
    }
    public void setorderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    
    
    public String getstatus() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }
    
    
    public int getqtrId() {
        return qtrId;
    }
    public void setqtrId(int qtrId) {
        this.qtrId = qtrId;
    }
    
    
    public int getmonthId() {
        return monthId;
    }
    public void setmonthId(int monthId) {
        this.monthId = monthId;
    }
    
    
    public int getyearId() {
        return yearId;
    }
    public void setyearId(int yearId) {
        this.yearId = yearId;
    }
    
    
    public String getproductLine() {
        return productLine;
    }
    public void setproductLine(String productLine) {
        this.productLine = productLine;
    }
    
    
    public int getmsrp() {
        return msrp;
    }
    public void setmsrp(int msrp) {
        this.msrp = msrp;
    }
    
    
    public String getproductCode() {
        return productCode;
    }
    public void setproductCode(String productCode) {
        this.productCode = productCode;
    }
    
    
    public String getcustomerName() {
        return customerName;
    }
    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }
    
    
    public String getaddressLine1() {
        return addressLine1;
    }
    public void setaddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
        
    
    public String getaddressLine2() {
        return addressLine2;
    }
    public void setaddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
    
    public String getcity() {
        return city;
    }
    public void setcity(String city) {
        this.city = city;
    }
    
    
    public String getstate() {
        return state;
    }
    public void setstate(String state) {
        this.state = state;
    }
    
    public String getpostalCode() {
        return postalCode;
    }
    public void setpostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    
    public String getcountry() {
        return country;
    }
    public void setcountry(String country) {
        this.country = country;
    }
    
    
    public String getterritory() {
        return territory;
    }
    public void setterritory(String territory) {
        this.territory = territory;
    }
    
    
    public String getcontactLastName() {
        return contactLastName;
    }
    public void setcontactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }
    
    
    public String getcontactFirstName() {
        return contactFirstName;
    }
    public void setcontactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }
    
    
    public String getdealSize() {
        return dealSize;
    }
    public void setdealSize(String dealSize) {
        this.dealSize = dealSize;
    }
    //finalizamos los getters y setters, comenzamos con los contructores para los atributos. 
    
    //parte del constructos, donde inicializamos los atributos como vacios, para luego al cargar el archivo rellenarlos con los datos del csv
    public Factura(){
        this.orderNumber = 0;
        this.quantityOrdered = 0;
        this.priceEach = 0;
        this.orderLineNumber = 0;
        this.sales = 0;
        this.orderDate = "";
        this.status = "";
        this.qtrId = 0;
        this.monthId = 0;
        this.yearId = 0;
        this.productLine = "";
        this.msrp = 0;
        this.productCode = "";
        this.customerName = "";
        this.phone = "";
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.city = "";
        this.state = "";
        this.postalCode = "";
        this.country = "";
        this.territory = "";
        this.contactLastName = "";
        this.contactFirstName = "";
        this.dealSize = "";
    }
    
    //Creamos el constructos que reciba los 25 atributos del csv, y les del el valor previamente asignado con los getters y setters. 
    public Factura(int orderNumber, int quantityOrdered, double priceEach, int orderLineNumber, double sales, String orderDate, String status, int qtrId, int monthId, int yearId,
    String productLine, int msrp, String productCode, String customerName, String phone, String addressLine1, String addressLine2, String city, String state, String postalCode,
    String country, String territory, String contactLastName, String contactFirstName, String dealSize){
        this.orderNumber = orderNumber;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.orderLineNumber = orderLineNumber;
        this.sales = sales;
        this.orderDate = orderDate;
        this.status = status;
        this.qtrId = qtrId;
        this.monthId = monthId;
        this.yearId = yearId;
        this.productLine = productLine;
        this.msrp = msrp;
        this.productCode = productCode;
        this.customerName = customerName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.territory = territory;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.dealSize = dealSize;
    }    
    
    public static void main(String[] args) {
                
        List<Factura> facturas = new ArrayList<>(); //para esto creamos la clase ListParametersFilter, para poder incializar variables tipo Factura, que contengan los datos del constructos
        ListParametersFilter filters = new ListParametersFilter();

        //comenzamos con la lectura del archivo csv
        //comenzamos nombrando el archivo csv que queremos importar junto con variable que necesitamos en la lectura de este. 
        String csvFile = "sales_data1.csv";
        String line;
        int contador = 0;
        String cvsSplitBy = ";";
        
        ArrayList<String> lista = new ArrayList<String>(); //utilizamos un try catcha para la lectura del csv. 
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(cvsSplitBy); //lo leemos linea por linea
                
                if(contador!=0){ //ponemos el contador distinto de 0 para que no lea la primera linea que tiene los titulos
                    facturas.add(new Factura(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Double.parseDouble(datos[2]), Integer.parseInt(datos[3]), 
                    Double.parseDouble(datos[4]), datos[5], datos[6], Integer.parseInt(datos[7]), Integer.parseInt(datos[8]), 
                    Integer.parseInt(datos[9]), datos[10], Integer.parseInt(datos[11]), datos[12], datos[13], datos[14], datos[15], datos[16], datos[17], datos[18], 
                    datos[19], datos[20], datos[21], datos[22], datos[23], datos[24]));
                    //agregamos cada dato a un contructor Factura 
                }
                
                contador = contador + 1; //subimos la cuenta del contador para que recorra cada fila del csv y lo pueda guardar con el condicional de arriba
                
                //Este despues de almacenar cada columna por cada fila, lo guarda en un arreglo
                lista.add(datos[0] + " | " + datos[1] + " | " + datos[2] + " | " + datos[3] + " | " + datos[4] + " | " + datos[5] 
                + " | " + datos[6] 
                + " | " + datos[7] + " | " + datos[8] + " | " + datos[9] + " | " + datos[10] + " | " + datos[11] + " | " + datos[12] 
                + " | " + datos[13] + " | " + datos[14] + " | " + datos[15] + " | " + datos[16] + " | " + datos[17] + " | " + datos[18]
                + " | " + datos[19] + " | " + datos[20] + " | " + datos[21] + " | " + datos[22] + " | " + datos[23] + " | " + datos[24]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

          Scanner scanner = new Scanner(System.in);
          int choice;
    
          do {
             //creamos el menu
             System.out.println("\nMENU FACTURAS");
             System.out.println("1 --> Colección de ventas de la ciudad de New York");
             System.out.println("2 --> ¿Cuánto fue el total de ventas de New York?");
             System.out.println("3 --> ¿Cuántos autos clásicos vendió New York?");
             System.out.println("4 --> ¿Cuánto fue el total de ventas de Autos Clásicos en New York?");
             System.out.println("5 --> ¿Cuántas Motocicletas vendió New York?");
             System.out.println("6 --> ¿Cuánto fue el total de ventas de Motocicletas en New York?");
             System.out.println("7 --> ¿Cuál fue el cliente de New York qué más autos compró?");
             System.out.println("8 --> ¿Cuál fue el cliente de todo el archivo qué más compró?");
             System.out.println("9 --> ¿Cuál fue el cliente de todo el archivo qué menos compró?");
             System.out.println("0 --> Salir del programa");
             System.out.print("Ingrese su elección: ");
             
             //leemos la opcion que el usuario solicite
             choice = scanner.nextInt();
    
             switch (choice) {
                //cada caso resuelve cada problematica propuesta por el profesor en la practica 2
                
                case 1:
                   System.out.println("\n---Colección de ventas de la ciudad de New York--- \n");
                   System.out.println("Numero de orden | Cliente  \n");
                   //primero filtra dentro de factura, segun lo que necesita, en este caso que la ciudad sea NYC, una vez filtrado tiene todos los datos de las compras hechas en
                   //NYC asi que decidimos mostrar el numero de orden y el nombre del comprador de las compras hechas en NY
                   facturas.stream().filter(Factura -> (Factura.getcity().equals("NYC"))).forEach(p -> System.out.println("      " + p.getorderNumber() + "     |   " + p.getcustomerName()));                   
                   break;
                   
                case 2:
                   System.out.println("\n---¿Cuánto fue el total de ventas de New York?--- \n");
                   //filtra por ciudad NYC, una vez realizada, suma todos los datos de la columna Sales con el getsales() y el .sum que actua como sumatoria de los valores 
                   //de esta columna 
                   double sumaNYC = facturas.stream().filter(factura -> factura.getcity().equals("NYC"))
                       .mapToDouble(Factura::getsales).sum();
                   System.out.println("El total de ventas de New York City fue: $" + sumaNYC);
                   break;
                   
                case 3:
                   System.out.println("\n---¿Cuántos autos clásicos vendió New York?---\n");
                   //filtra por ciudad NYC y que sean carros clasicos, una vez realizada, con el .count cuenta cuantos carros segun el filtro fueron vendidos 
                   double sumaNYC1 = facturas.stream().filter((Factura -> Factura.getcity().equals("NYC") && (Factura.getproductLine().equals("Classic Cars"))))
                       .mapToDouble(Factura::getorderNumber).count();
                   System.out.println("El total de autos clasicos vendidos en New York City fue: " + (int)sumaNYC1); //convertirmos el dato a int ya que era double
                   break;
                   
                case 4:
                   System.out.println("\n---¿Cuánto fue el total de ventas de Autos Clásicos en New York?---");
                   //filtra por ciudad NYC y que sean carros clasicos, una vez realizada, con el .sum cuenta suma el total de las ventas realizadas
                   double sumaNYC2 = facturas.stream().filter(factura -> ((factura.getcity().equals("NYC")) && (factura.getproductLine().equals("Classic Cars"))))
                       .mapToDouble(Factura::getsales).sum();
                   System.out.println("El total de ventas en autos clasicos en New York City fue: $" + sumaNYC2);
                   break;
                   
                case 5:
                   System.out.println("\n---¿Cuántas Motocicletas vendió New York?---");
                   //filtra por ciudad NYC y que sean motocicletas, una vez realizada, con el .count cuenta cuantas motocicletas segun el filtro fueron vendidos 
                   double sumaNYC3 = facturas.stream().filter((Factura -> Factura.getcity().equals("NYC") && (Factura.getproductLine().equals("Motorcycles"))))
                       .mapToDouble(Factura::getorderNumber).count();
                   System.out.println("El total de motocicletas vendidas en New York City fue: " + (int)sumaNYC3); //convertirmos el dato a int ya que era double
                   break;
                   
                case 6:
                   System.out.println("\n---¿Cuánto fue el total de ventas de Motocicletas en New York?---");
                   //filtra por ciudad NYC y que sean motocicletas, una vez realizada, con el .sum cuenta suma el total de las ventas realizadas de motos en NY
                   double sumaNYC4 = facturas.stream().filter(factura -> ((factura.getcity().equals("NYC")) && (factura.getproductLine().equals("Motorcycles"))))
                       .mapToDouble(Factura::getsales).sum();
                   System.out.println("El total de ventas en motocicletas en New York City fue: $" + sumaNYC4);
                   break;
                   
                case 7:
                    System.out.println("\n---¿Cuál fue el cliente de New York qué más autos compró?---");
                    //inicializamos un dato de la lista tipo factura.
                    Map<String, List<Factura>> clienteMasVentasNYC = facturas.stream()
                    //filtramos por los carros que se vendieron en NYC. Tanto clasicos como vintage, que eran los unicos carros disponibles
                    .filter(factura -> ((factura.getcity().equals("NYC")) && ((factura.getproductLine().equals("Vintage Cars")) || (factura.getproductLine().equals("Classic Cars")))))
                    //utilizamos collectors para usar el grouping y filtrar por el nombre del comprador segun los filtros mencionados anteriormente.
                    //este se encarga de agrupar segun el comprador, es decir agrupa por el nombre del cliente asi haya realizado distintas compras
                    //de esta manera podemos tener un control de cuantos carros compro cada cliente
                    .collect(Collectors.groupingBy(Factura::getcustomerName));
                    Map.Entry<String, List<Factura>> clienteMayorVenta = clienteMasVentasNYC.entrySet().stream()
                            //suma todas las compras filtradas anteriormente y compara cual es la mayor
                            .max(Comparator.comparingDouble(entry -> entry.getValue().stream().mapToDouble(Factura::getsales).sum()))
                            .orElse(null); //realizamos el null para que ejecute el condicional inferior y muestre toda la informacion completa
                    
                    if (clienteMayorVenta != null) { //muestra segun los filtros anteriores quien fue el que mayor compras realizo en NY
                        System.out.println("Cliente de New York City que mas autos compro fue: " + clienteMayorVenta.getKey() + " con una cantidad de: " + clienteMayorVenta.getValue().size()
                                + " por un valor de " + clienteMayorVenta.getValue().stream().mapToDouble(Factura::getsales).sum());
                    }
                    break;
                   
                case 8:
                   System.out.println("\n---¿Cuál fue el cliente de todo el archivo qué más compró?---");
                    //inicializamos un dato de la lista tipo factura.
                    Map<String, List<Factura>> clienteMasVentas = facturas.stream()
                    //no filtramos ya que es con respecto a todo el documento csv
                    //utilizamos collectors para usar el grouping
                    //este se encarga de agrupar segun el comprador con mas ventas con el .max                    
                    .collect(Collectors.groupingBy(Factura::getcustomerName));
                    Map.Entry<String, List<Factura>> mayorCliente = clienteMasVentas.entrySet().stream()
                            .max(Comparator.comparingDouble(entry -> entry.getValue().stream().mapToDouble(Factura::getsales).sum()))
                            .orElse(null); //realizamos el null para que ejecute el condicional inferior y muestre toda la informacion completa
                    
                    if (mayorCliente != null) { //muestra toda la informacion sobre el comprador con mas compras de todo el documento. 
                        System.out.println("Cliente de todo el archivo que mas compro fue: " + mayorCliente.getKey() + " con una cantidad de: " + mayorCliente.getValue().size()
                                + " por un valor de " + mayorCliente.getValue().stream().mapToDouble(Factura::getsales).sum());
                    }
                    break;
                   
                case 9:
                   System.out.println("\n---¿Cuál fue el cliente de todo el archivo qué más compró?---");
                    //inicializamos un dato de la lista tipo factura.
                    Map<String, List<Factura>> clienteMenosVentas = facturas.stream()
                    //no filtramos ya que es con respecto a todo el documento csv
                    //utilizamos collectors para usar el grouping
                    //este se encarga de agrupar segun el comprador con menos ventas con el .min
                    .collect(Collectors.groupingBy(Factura::getcustomerName));
                    Map.Entry<String, List<Factura>> menorCliente = clienteMenosVentas.entrySet().stream()
                            .min(Comparator.comparingDouble(entry -> entry.getValue().stream().mapToDouble(Factura::getsales).sum()))
                            .orElse(null); //realizamos el null para que ejecute el condicional inferior y muestre toda la informacion completa
                    
                    if (menorCliente != null) { //muestra toda la informacion sobre el comprador con menos compras de todo el documento.
                        System.out.println("Cliente de todo el archivo que mas compro fue: " + menorCliente.getKey() + " con una cantidad de: " + menorCliente.getValue().size()
                                + " por un valor de " + menorCliente.getValue().stream().mapToDouble(Factura::getsales).sum());
                    }
                    break;
                   
                case 0: //para cerrar y salir del menu
                   System.out.println("Saliendo del programa...");
                   break;
                   
                default: //por si el usuario ingresa un valor que no este en las opciones
                   System.out.println("Opción no válida, intente nuevamente");
                   break;
             }
          } while (choice != 0); //fin del menu cuando el usuario ingrese 0
    }
}
