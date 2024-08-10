package chat;


import chat.MessageType;

public class ChatMessage {
    private MessageType type;
    private String sender;
    private String content; // Optional, if you want to store message content

    // Getters and Setters
    // Builder pattern for easy instantiation

    public static ChatMessageBuilder builder() {
        return new ChatMessageBuilder();
    }

    public static class ChatMessageBuilder {
        private MessageType type;
        private String sender;
        private String content;

        public ChatMessageBuilder type(MessageType type) {
            this.type = type;
            return this;
        }

        public ChatMessageBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public ChatMessageBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ChatMessage build() {
            ChatMessage chatMessage = new ChatMessage();
            chatMessage.type = this.type;
            chatMessage.sender = this.sender;
            chatMessage.content = this.content;
            return chatMessage;
        }
    }
}
