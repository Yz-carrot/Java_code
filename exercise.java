import java.util.Arrays;

public class exercise {

    public static void main(String[] args){
        City bj = new City();
        String []name=new String []{"Beijing","Beiping"};
        bj.getName(name[0]);
        name[0]="Tianjing";
        bj.printName();
        City.number=1;
        System.out.println(City.number);
        Class<City> cityClass = City.class;
        City.number=1;
        System.out.println(Math.abs(-1.0));
    }

}
/*City为非静态类，需要依附于对象存在，
而main为静态函数，不需要依附对象存在，因此无法访问同文件中的非静态类
 */
class City{
    public static double number;
    private String name;
    private double latitude;
    private double longitude;
    public City(String name,int latitude){
        this.name=name; this.latitude=latitude;
    }
    public City(int latitude){
        this("Null",latitude);
    }
    public City(){}

    public void printName(){
        System.out.println(name);
    }
    public void getName(String name){
        this.name=name;
    }


}
