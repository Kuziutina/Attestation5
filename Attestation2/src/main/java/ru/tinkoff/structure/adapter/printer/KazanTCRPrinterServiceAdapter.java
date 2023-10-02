package ru.tinkoff.structure.adapter.printer;

import ru.tinkoff.structure.adapter.printer.vodniy.PrinterService;

public class KazanTCRPrinterServiceAdapter implements PrinterService {

    ru.tinkoff.structure.adapter.printer.kazantcr.PrinterService kazanPrinterService;

    public KazanTCRPrinterServiceAdapter(ru.tinkoff.structure.adapter.printer.kazantcr.PrinterService printerService) {
        this.kazanPrinterService = printerService;
    }

    @Override
    public void print(String text) {
        kazanPrinterService.print(text.getBytes());
    }
}
