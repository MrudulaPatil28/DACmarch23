//a. byte value into String
class Test4 {
   public static void main(String[] args) {
    byte value = 123;
    Byte bs = new Byte( value );
    String str = bs.toString();
    System.out.println(str);
//b. The number of bytes used to represent a char value



//c. String instance into Byte instance.
   public static void main2(String[] args) {
    byte value = 123;
    Byte bs = new Byte( value );
    String str = bs.toString();
    System.out.println(str);
    }

    public static void main3(String[] args) {
    String str = "123";
    Byte bs = new Byte( str );
    System.out.println(str);
    }

    public static void main4(String[] args) {
    byte value = 123;
    Byte bs = new Byte( value );
    byte number = bs.byteValue();
    System.out.println("Number  : "+number);
    }
    public static void main5(String[] args) {
    byte value = 125;
    Byte bs = new Byte(value);
    System.out.println(bs);
  }
   
   }
}