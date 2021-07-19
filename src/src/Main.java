package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;
        String name;
        String name1;
        String name2;
        String emailAddress;
        String phoneNumber;
        String symptom1, symptom2, symptom3,symptom4,symptom5,symptom6,symptom7,symptom8,symptom9,symptom10,symptom11,symptom12;


        ArrayList<String> strings = new ArrayList<String>();

        Patient patient = new Patient(" ", "", " ", "", "");

        System.out.println("Contact Tracing Program \n");
        System.out.println("Enter a newly infected person's information" + patient.getName() + "\n");
        System.out.println("What is a patient's name? \n");
        name = input.nextLine();
        patient.setName(name);
        System.out.println("What is " + name + "'s " + "Email?" + patient.getEmailAddress() + "\n");
        emailAddress = input.nextLine();
        patient.setEmailAddress(emailAddress);
        System.out.println("What is " + name + "'s " + "Phone number?" + patient.getPhoneNumber() + "\n");
        phoneNumber = input.nextLine();
        patient.setPhoneNumber(phoneNumber);
        System.out.println("Do you have fever? (y/n) \n");
        symptom1 = input.nextLine();
        if (symptom1.equals("y")) {
            System.out.println("For how many days do you have fever? \n");
            answer = input.nextLine();
            System.out.println("Did you met or run into anyone else? (y/n) \n");
            answer = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("What is her/his name? \n");
                name1 = input.nextLine();
                System.out.println("What is " + name1 + "'s phone number?");
                answer = input.nextLine();
                System.out.println("What is " + name1 + "'s Email address?");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have cough? (y/n) \n");
            symptom2 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have cough? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have shortness of breath or difficulty breathing? (y/n) \n");
            symptom3 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have shortness of breath or difficulty breathing? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have tiredness? (y/n) \n");
            symptom4 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have tiredness? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have aches? (y/n) \n");
            symptom5 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have aches? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have chills? (y/n) \n");
            symptom6 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have chills? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have sore throat? (y/n) \n");
            symptom7 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have sore throat? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have loss of smell? (y/n) \n");
            symptom8 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have loss of smell? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have loss of taste? (y/n) \n");
            symptom9 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have loss of taste? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have headache? (y/n) \n");
            symptom10 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have headache? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have diarrhea? (y/n) \n");
            symptom11 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have diarrhea? \n");
                answer = input.nextLine();
            }
            else
            System.out.println("Do you have severe vomiting? (y/n) \n");
            symptom12 = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("For how many days do you have severe vomiting? \n");
                answer = input.nextLine();
            }
            System.out.println("Did you met anyone else? (y/n)  \n");
            if (answer.equals("y")) {
                System.out.println("What is her/his name? \n");
                name2 = input.nextLine();
                System.out.println("What is " + name2 + "'s phone number?");
                answer = input.nextLine();
                System.out.println("What is " + name2 + "'s Email address?");
                answer = input.nextLine();}

            System.out.println("***** Contact tracking report ***** \n");
            System.out.println("Name: " + name);
            System.out.println(("Phone: " + phoneNumber));
            System.out.println(("Email: " + emailAddress));

            System.out.println("** Symptoms: ");






        }

            }


    }





