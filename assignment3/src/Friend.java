class Friend extends Person {
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    @Override
    public String toString() {
        String invitedText = isInvited() ? "They are invited to the party." : "They are NOT invited to the party.";
        return getFullName() + " is bringing " + foodToBring + ". " + invitedText;
    }
}