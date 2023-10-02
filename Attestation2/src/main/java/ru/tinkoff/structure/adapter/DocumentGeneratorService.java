package ru.tinkoff.structure.adapter;

import ru.tinkoff.structure.adapter.printer.vodniy.PrinterService;

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
