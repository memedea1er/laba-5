import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Тест \"Как хорошо ты знаешь \"Ведьмака\"?\"");
        int a=0, s=0;
        for (int n=0; n<5; n++) {
            switch (n) {
                case 1:
                    System.out.println("Вопрос 1: Как зовут лучшего друга Геральта?\n"
                            +"1) Лютик\n"+"2) Весемир\n"+"3) Ламберт\n"+"4) Иваскик\n"+"Введите номер ответа:");
                    while (a<1 | a>4) {
                        a=in.nextInt();
                    }
                    if (a==1) {
                        System.out.println("Правильный ответ!");
                        s+=1;
                    } else {
                        System.out.println("Неправильный ответ!");
                    }
                    a=0;
                    break;
                case 2:
                    System.out.println("Вопрос 2: С кем Геральт изменял Йеннифэр в Туссенте в \"Крещении огнем\"?\n"
                            +"1) Трисс\n"+"2) Кейра\n"+"3) Фрингилья\n"+"4) Шани\n"+"Введите номер ответа:");
                    while (a<1 | a>4) {
                        a=in.nextInt();
                    }
                    if (a==3) {
                        System.out.println("Правильный ответ!");
                        s+=1;
                    } else {
                        System.out.println("Неправильный ответ!");
                    }
                    a=0;
                    break;
                case 3:
                    System.out.println("Вопрос 3: Как звали мать Цири?\n"
                            +"1) Калантэ\n"+"2) Паветта\n"+"3) Йеннифэр\n"+"4) Лара Доррен\n"+"Введите номер ответа:");
                    while (a<1 | a>4) {
                        a=in.nextInt();
                    }
                    if (a==2) {
                        System.out.println("Правильный ответ!");
                        s+=1;
                    } else {
                        System.out.println("Неправильный ответ!");
                    }
                    a=0;
                    break;
                case 4:
                    System.out.println("Вопрос 4: Какое Полное имя Лютика?\n"
                            +"1) Лютик\n"+"2) Эмиель Регис Рогеллек Терзиефф-Годфрой\n"
                            +"3) Эмгыр вар Эмрейс, Деитвен Аддан ын Карн аэп Морвудд\n"
                            +"4) Юлиан Альфред Панкрац виконт де Леттенхоф\n"+"Введите номер ответа:");
                    while (a<1 | a>4) {
                        a=in.nextInt();
                    }
                    if (a==4) {
                        System.out.println("Правильный ответ!");
                        s+=1;
                    } else {
                        System.out.println("Неправильный ответ!");
                    }
                    a=0;
                    break;
            }
        }
        System.out.println("Правильных ответ:" + s);
        switch (s) {
            case 4:
                System.out.println("Поздравляю, вы отлично знаете \"Ведьмака\"!");
                break;
            case 3:
                System.out.println("Вы хорошо знаете \"Ведьмака\".");
                break;
            case 2:
                System.out.println("Вы не очень знаете \"Ведьмака\".");
                break;
            case 1:
                System.out.println("Вы плохо знаете \"Ведьмака\".");
                break;
            case 0:
                System.out.println("Вы не знаете \"Ведьмака\".");
                break;
        }
    }
}