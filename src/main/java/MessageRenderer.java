public interface MessageRenderer {
    void renderer();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
