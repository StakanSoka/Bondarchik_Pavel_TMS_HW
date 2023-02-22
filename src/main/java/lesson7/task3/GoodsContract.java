package lesson7.task3;

import java.util.Date;

public class GoodsContract extends Document implements PrintableDocument {

    private String goodsType;
    private int goodsNumber;

    GoodsContract(int documentCode, Date date, String goodsType, int goodsNumber) {
        super(documentCode, date);
        this.goodsType = goodsType;
        this.goodsNumber = goodsNumber;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "\nGoods type: " + goodsType + "\nGoods number: " + goodsNumber;
    }

}
