//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Power_ranger {
    String name;
    String color;
    String helmet;
    String weapon;

    Power_ranger(String name, String color, String helmet, String weapon) {
        this.name = name;
        this.color = color;
        this.helmet = helmet;
        this.weapon = weapon;
    }

 void fight(){
     System.out.println("Power_ranger can fight" );
 }
 void kick(){
     System.out.println("Power_ranger can kick");
 }

}



