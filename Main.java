

class Main {
  public static void main(String[] args) {
    /*Create customer1*/
    driverLicense customer1 = new driverLicense();
    customer1.setDriverAddress("123 Anywhere Lane");
    customer1.setDriverHeight(5.5);
    customer1.setDriverName("John Smith");
    customer1.setDriverWeight(140);
    customer1.setDriverHairColor("brown");
    customer1.setDriverEyeColor("blue");
    customer1.generateDriverLicenseNumber("CA");

    /* Output driver info for customer1*/
    System.out.println();
    System.out.println("--------------------------");
    System.out.println("        Customer 1        ");
    System.out.println("--------------------------");
    System.out.print("Name: ");
    System.out.println(customer1.getDriverName());
    System.out.print("DL Number: ");
    System.out.println(customer1.getDriverLicenseNumber());
    System.out.print("Address: ");
    System.out.println(customer1.getDriverAddress());
    System.out.print("Height in feet: ");
    System.out.println(customer1.getDriverHeight());
    System.out.print("Weight in pounds: ");
    System.out.println(customer1.getDriverWeight());
    System.out.print("Hair Color: ");
    System.out.println(customer1.getDriverHairColor());
    System.out.print("Eye Color: ");
    System.out.println(customer1.getDriverEyeColor());
    
    /*Create customer2*/
    driverLicense customer2 = new driverLicense();
    customer2.setDriverAddress("8888 Maple Drive");
    customer2.setDriverHeight(4.7);
    customer2.setDriverName("Sarah Johnson");
    customer2.setDriverWeight(185);
    customer2.setDriverHairColor("Blonde");
    customer2.setDriverEyeColor("green");
    customer2.generateDriverLicenseNumber("TX");

    /* Output driver info for customer2*/
    System.out.println();
    System.out.println("--------------------------");
    System.out.println("        Customer 2        ");
    System.out.println("--------------------------");
    System.out.print("Name: ");
    System.out.println(customer2.getDriverName());
    System.out.print("DL Number: ");
    System.out.println(customer2.getDriverLicenseNumber());
    System.out.print("Address: ");
    System.out.println(customer2.getDriverAddress());
    System.out.print("Height in feet: ");
    System.out.println(customer2.getDriverHeight());
    System.out.print("Weight in pounds: ");
    System.out.println(customer2.getDriverWeight());
    System.out.print("Hair Color: ");
    System.out.println(customer2.getDriverHairColor());
    System.out.print("Eye Color: ");
    System.out.println(customer2.getDriverEyeColor());

    /*Create customer 3*/
    driverLicense customer3 = new driverLicense();
    customer3.setDriverAddress("613 Torah Avenue");
    customer3.setDriverHeight(6.2);
    customer3.setDriverName("Chananya Yom Tov Lipa Katzelenbogenstein");
    customer3.setDriverWeight(210);
    customer3.setDriverHairColor("black");
    customer3.setDriverEyeColor("brown");
    customer3.generateDriverLicenseNumber("NJ");

    /* Output driver info for customer3*/
    System.out.println();
    System.out.println("--------------------------");
    System.out.println("        Customer 3        ");
    System.out.println("--------------------------");
    System.out.print("Name: ");
    System.out.println(customer3.getDriverName());
    System.out.print("DL Number: ");
    System.out.println(customer3.getDriverLicenseNumber());
    System.out.print("Address: ");
    System.out.println(customer3.getDriverAddress());
    System.out.print("Height in feet: ");
    System.out.println(customer3.getDriverHeight());
    System.out.print("Weight in pounds: ");
    System.out.println(customer3.getDriverWeight());
    System.out.print("Hair Color: ");
    System.out.println(customer3.getDriverHairColor());
    System.out.print("Eye Color: ");
    System.out.println(customer3.getDriverEyeColor());
  }

  
}

