import java.util.*;
/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
Реализовать, с учетом ооп подхода, приложение
Для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
модель человека и модель семейного дерева для хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
У дерева обязательно реализовать метод добавления нового человека в семейное дерево, поиск человека по имени и вывод всех людей из дерева.
У человека можно реализовать методы вывода всех сестер или всех детей.
Проект сдать либо в виде репозитория либо в виде PullRequest к проекту: https://github.com/Liberate520/homeWork
Если делаете PR, то в качестве ответа укажите ссылку на конкретный PR
Инструкция на то как сделать PR https://youtu.be/veMDnBt30pk
По вопросам домашки писать @Liberate520
Обязательно пробуем свои силы, в дальнейшем будем этот проект развивать
 */

public class drevo {

    public static void main(String[] args) {


        List<BaseHuman> Humanlist = new ArrayList<>(); //создаем лист и записываем всех туда //взрослые
        Humanlist.add(new BaseHuman("Илья", 40, "мужской", BaseHuman);
        Humanlist.add(new BaseHuman("Ольга", 42, "женский", "Иван"));
//        Humanlist.addAll((Collection<? extends BaseHuman>) new BaseHuman(VV, V1,V2,V3));


//        List<cilderen> cilderenlist = new ArrayList<>();
//        cilderenlist.add(new cilderen("Семен", 10, "мужской", "Илья"));
//        cilderenlist.add(new cilderen("Ксения", 12, "женский", "Илья"));
//
//
//        List<brozers> broo = new ArrayList<>();
//        broo.add(new brozers("Андрей", 43, "мужской", "Илья"));
//        broo.add(new brozers("Света", 33, "женский", "Ольга"));
//


    }

}