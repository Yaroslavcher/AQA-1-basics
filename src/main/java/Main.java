import ru.netology.service.CashbackHackService;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;  //Потрачено 1000 рублей
        System.out.println("Докупите ненужного нам и вам на " + service.remain(1000) + " рублей");
    }
}
