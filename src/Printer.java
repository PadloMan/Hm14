public interface Printer {
    void print(PrinterImpl.Message message);

    class PrinterImpl implements Printer {
        @Override
        public void print(Message message) {
            if (message == null) {
                System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                return;
            }

            String text = message.getText();
            String sender = message.getSender();

            if ((text == null || text.isEmpty()) && (sender == null || sender.isEmpty())) {
                System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
            } else if (sender == null || sender.isEmpty()) {
                System.out.println("Анонімний користувач відправив повідомлення: " + text);
            } else {
                System.out.println("Користувач " + sender + " відправив повідомлення: " + text);
            }
        }

        public static class Message {
            private String text;
            private String sender;

            public Message(String text, String sender) {
                this.text = text;
                this.sender = sender;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getSender() {
                return sender;
            }

            public void setSender(String sender) {
                this.sender = sender;
            }
        }
    }
}
