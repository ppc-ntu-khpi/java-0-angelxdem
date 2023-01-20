public class Shirt {
  public int shirtID = 1998; // стандартне значення номера моделі сорочки
  public String description = "Gentle cotton fabric provides low creasing and wearing comfort. Suitable for different people and their style."; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public char colorCode = 'U';
  public double price = 0.0; // стандартна вартість сорочки
  public int quantityInStock = 0; // стандартна кількість на складі
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt 19036: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: 50$" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу
