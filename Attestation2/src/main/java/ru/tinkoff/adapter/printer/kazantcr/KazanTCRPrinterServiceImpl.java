package ru.tinkoff.adapter.printer.kazantcr;

public class KazanTCRPrinterServiceImpl implements PrinterService {

    @Override
    public boolean print(byte[] text) {
        try {
            System.out.println("Kazan");
            System.out.println(text);
            return true;
        } finally {
            return false;
        }
    }
}
