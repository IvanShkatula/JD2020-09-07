package by.it.trukhanovich.jd02_03;

public interface IBuyer {
    void enterToMarket(); //вошел в магазин (мгновенно)
    void chooseGoods(); //выбрал товар (от 0,5 до 2 секунд)
    void goToQueue(); //покупатель становится в очередь
    void goOut(); //отправился на выход(мгновенно)
}
