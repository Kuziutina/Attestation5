package ru.tinkoff.adapter.printer;

import ru.tinkoff.adapter.printer.vodniy.PrinterService;

public class KazanTCRPrinterServiceAdapter implements PrinterService {

    ru.tinkoff.adapter.printer.kazantcr.PrinterService kazanPrinterService;

    public KazanTCRPrinterServiceAdapter(ru.tinkoff.adapter.printer.kazantcr.PrinterService printerService) {
        this.kazanPrinterService = printerService;
    }

    @Override
    public void print(String text) {
        kazanPrinterService.print(text.getBytes());
    }
}
