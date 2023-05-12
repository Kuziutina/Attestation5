package ru.tinkoff.adapter;

import ru.tinkoff.adapter.printer.kazantcr.KazanTCRPrinterServiceImpl;
import ru.tinkoff.adapter.printer.KazanTCRPrinterServiceAdapter;
import ru.tinkoff.adapter.printer.vodniy.PrinterService;
import ru.tinkoff.adapter.printer.vodniy.VodniyPrinterServiceImpl;

public class Main {

    public static void main(String[] args) {
        //У нас есть сервис, который умеет генерировать документы
        //и отправлять их в печать на принтер через интерфейс PrinterServiceInterface
        //Далее в Казани тоже появился принтер, но у него другой сервис и чтобы
        //использовать сервис по генерации доков в Казани - пишем адаптер
        PrinterService printerService = new VodniyPrinterServiceImpl();
        DocumentGeneratorService documentGeneratorService = new DocumentGeneratorService(printerService);
        documentGeneratorService.generateAndPrintDocument();

        KazanTCRPrinterServiceAdapter kazanTCRPrinterServiceAdapter = new KazanTCRPrinterServiceAdapter(new KazanTCRPrinterServiceImpl());
        DocumentGeneratorService documentGeneratorService2 = new DocumentGeneratorService(kazanTCRPrinterServiceAdapter);
        documentGeneratorService2.generateAndPrintDocument();
    }
}
