import javax.swing.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Friend> guestList = new ArrayList<>();


        //set title of window
        String title = new String("Party Picker");
        //set invite button
        String[] buttons = {"Invited","Not Invited"};

        //set the information frame
        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker. \n " + "\n"+
                "Enter person's name and the type of food they're likely to bring, \n"+
                "then indicate whether they are actually invited to the party or not.");
        //initial invited
        boolean isInvited1;
        // initial a flag to help loop running
        boolean flag = true;
        while (flag) {

            String firstName = JOptionPane.showInputDialog(null,"Enter first name",
                    title,JOptionPane.QUESTION_MESSAGE);

            String lastName = JOptionPane.showInputDialog(null,"Enter last name",
                    title,JOptionPane.QUESTION_MESSAGE);
            String foodToBring = JOptionPane.showInputDialog(null,"Enter the food " +
                    "the they usually bring",title,JOptionPane.QUESTION_MESSAGE);
            int isInvitedInt = JOptionPane.showOptionDialog(null,"Choose if this guested is " +
                            "Invited or Not Invited",
                    title,JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,buttons,buttons[1]);
            if(isInvitedInt == 0){
                isInvited1 = true;
            }else if (isInvitedInt==1){
                isInvited1 = false;
            }else break;
//            String isInvitedString = JOptionPane.showInputDialog("Is the guest invited? Enter 'yes' or 'no':");
//            boolean isInvited = isInvitedString.equalsIgnoreCase("yes");

            Friend newFriend = new Friend(firstName, lastName, isInvited1, foodToBring);
            guestList.add(newFriend);

            int continueAddingInt = JOptionPane.showConfirmDialog(null,
                    "Enter another guest?",title,JOptionPane.YES_NO_OPTION);
            if (continueAddingInt == 0){
                flag = true;}
            else {flag=false;}
        }
        String report = "Party guest list:\n\n";
//        for (Friend friend : guestList) {
//            report += friend.toString() + "\n\n";
//        }
//        JOptionPane.showMessageDialog(null, report);

        int invitedCount = 0;
        double totalExpenses = 0.0;
        double totalEarned = 0.0;
        for (Friend guest : guestList) {
            report += guest.toString() + "\n\n";

            if (guest.isInvited()) {
                invitedCount++;
                totalExpenses += 99.99;
            } else {
                totalEarned += 399.99;
            }
        }
        JOptionPane.showMessageDialog(null, report);
        int totalGuests = guestList.size();
        int notInvitedCount = totalGuests - invitedCount;
        double grossProfit = totalEarned - totalExpenses;

        String reportMessage = "Total Guests are: " + totalGuests + ".\n"
                + "- " + invitedCount + " invited.\n"
                + "- " + notInvitedCount + " not invited.\n"
                + "- Total Expenses: $" + String.format("%.2f", totalExpenses) + "\n"
                + "- Total Earned: $" + String.format("%.2f", totalEarned) + "\n"
                + "- Gross Profit: $" + String.format("%.2f", grossProfit) + "\n"
                + "- Done By: Niki";

        JOptionPane.showMessageDialog(null, reportMessage);
    }
}