package ru.tinkoff.adapter;

import ru.tinkoff.adapter.printer.vodniy.PrinterService;

public class DocumentGeneratorService {
    PrinterService printerService;

    public DocumentGeneratorService(PrinterService printerService) {
        this.printerService = printerService;
    }

    public void generateAndPrintDocument() {
        String textForPrint = "textForPrint";
        printerService.print(textForPrint);
    }
}
