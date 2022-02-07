public class Main {
    public static void main(String[] args) {
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider helloWorldMessageProvider = MessageSupportFactory.getInstance().getMessageProvider();

        messageRenderer.setMessageProvider(helloWorldMessageProvider);
        messageRenderer.renderer();
    }
}
