package ru.tinkoff.adapter.printer.vodniy;

public class VodniyPrinterServiceImpl implements PrinterService {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
