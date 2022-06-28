public class Main {
    public static void main(String[] args) {
        //void - не возвращает никуда данные
        BonusService service = new BonusService();// вызываем целевой объект БонусСервиса
        int bonus = service.calcBonus(500, true);//создаем переменную инт (коробка) и просим узнать из бонусСервиса в методе калкСервис что получим при оплате в 500р зарег пол.зоватля

        System.out.println("БОНУС СОСТАВЛЯЕТ " + bonus);

    }


}
