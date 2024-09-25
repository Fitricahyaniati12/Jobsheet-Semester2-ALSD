class Node11 {
    String question;
    String answer;
    Node11 next;

    public Node11(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }

    public void setNext(Node11 next) {
        this.next = next;
    }

    public Node11 getNext() {
        return next;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
