package calculator.gb;

public class Presenter {
    Model model;
    View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startOperation(){
        int x = view.getValue("Введите первое число: ");
        int y = view.getValue("Введите второе число: ");
        model.setX(x);
        model.setY(y);
        int result = model.result();
        view.print(result, "Результат: ");
    }
}
