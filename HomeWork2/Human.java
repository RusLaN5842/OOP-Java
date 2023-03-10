package HomeWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human {
    private String name, sex;
    private Integer yers;
    private Human Father;

    private Human mother;
    private List<Human> children;

    public Human(String name) {
        this.name = name;
        this.children = new ArrayList<>();
        // Father.getChildren().add(this);
        // mother.getChildren().add(this);

    }

    public Human(String name, int yers, String sex, Human Father, Human mother) { // конструктор класса имя и возраст
        this.name = name;
        this.yers = yers;
        this.sex = sex;
        this.Father = Father;
        this.mother = mother;

        this.children = new ArrayList<>();
        Father.getChildren().add(this);
        mother.getChildren().add(this);

    }

    // public Human(String name, int yers, String sex,Human Father,Human mother){
    // this.name = name;
    // this.yers = yers;
    // this.sex = sex;
    // this.Father = Father;
    // this.mother = mother;
    //
    // this.children = new ArrayList<>();
    // Father.getChildren().add(this);
    //
    //
    // }

    // public Human(String name, int yers, String sex, Human Father, Human mother) {
    // //конструктор класса имя и возраст
    // this.name = name;
    // this.yers = yers;
    // this.sex = sex;
    // this.Father = null;
    // this.mother = null;
    //
    // this.children = new ArrayList<>();
    // Father.getChildren().add(this);
    // mother.getChildren().add(this);

    //
    //
    // }

    // public Human(String ff, int yers, String wdd, String sddf, String wwdsadsa) {
    //
    // }

    // public Human(String name,Human mother){
    // this.name = name;
    // this.yers = yers;
    // this.sex = sex;
    // this.mother = mother;
    // this.children = new ArrayList<>();
    //// Father.getChildren().add(this);
    // }
    public List<Human> getChildren() {
        return this.children;
    }

    public String getName() { // возращение
        return name;
    }

    public Integer getYers() {
        return yers;
    }

    public String getSex() { // возращение
        return sex;

    }

    public Human getFather() {
        return Father;
    }

    public Human getmother() {
        return mother;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getYers() + " Пол : " + getSex() + "Папа : " + this.Father + "Мама "
                +
                this.mother;
    }

    public static StringBuilder getNAMEe(Human[] Baza, String name) {
        StringBuilder result = new StringBuilder();
        for (Human c : Baza) {
            if (Objects.equals(c.name, name)) {
                result.append("Имя: ").append(c.name);
                result.append(" Возраст : ").append(c.yers);
                result.append(" пол : ").append(c.sex);
                result.append(" Папа : ").append(c.Father.getName());
                result.append(" Мама : ").append(c.mother.getName());
                result.append("\n");
            }
        }
        return result;
    }

}