public class PrinterExample {
    public static void main(String[] args) {
        Printer printer = new Printer.PrinterImpl();
        // Повідомлення з відправником
        Printer.PrinterImpl.Message message1 = new Printer.PrinterImpl.Message("Hello, world!", "Alice");
        printer.print(message1);

        // Повідомлення без відправника
        Printer.PrinterImpl.Message message2 = new Printer.PrinterImpl.Message("This is a test message.", null);
        printer.print(message2);

        // Пусте повідомлення
        Printer.PrinterImpl.Message message3 = new Printer.PrinterImpl.Message(null, null);
        printer.print(message3);

        // Повідомлення без тексту та відправника
        Printer.PrinterImpl.Message message4 = new Printer.PrinterImpl.Message("", "");
        printer.print(message4);
    }
}
