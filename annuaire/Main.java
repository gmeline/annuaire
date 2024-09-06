package annuaire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();
        boolean running = true;

        while(running){
            System.out.println("\nAnnuaire");
            System.out.println("1. Ajouter un contact");
            System.out.println("2. Supprimer un contact");
            System.out.println("3. Voir un contact");
            System.out.println("4. Quitter");
            System.out.println("Choisit une option : ");
            int choice =scanner.nextInt();
            scanner.nextLine();
            
            switch (choice){
                case 1 :
                    System.out.println("Entrer un prénom");
                    String name = scanner.nextLine();
                    System.out.println("Entrer le numéro de téléphone");
                    String phoneNumber =scanner.nextLine();
                    manager.addContact(new Contact(name, phoneNumber));
                    System.out.println("Contact ajouté");
                    break;
                case 2 : 
                    System.out.println("Entrer le nom du contact à supprimer");
                    String nameToRemove = scanner.nextLine();
                    manager.removeContact(nameToRemove);
                    System.out.println("Le contact a été supprimer si il existait");
                    break;
                case 3:
                    System.out.println("Contacts:");
                    manager.displayContacts();
                    break;
                case 4 : 
                    running=false;
                    System.out.println("En cours de fermeture");
                    break;
                default : 
                    System.out.println("Option invalide. Recommence");
                    break;
                
            }
        }
        scanner.close();
    }
}    
