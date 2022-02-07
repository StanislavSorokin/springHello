public class StandardOutMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;
    @Override
    public void renderer() {
        if (messageProvider == null){
            throw new RuntimeException("You must set the property messageProvider");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
