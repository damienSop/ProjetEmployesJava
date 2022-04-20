import java.util.Scanner;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;  // import the LocalDate class
//import java.util.Calendar;
import java.util.Date;
//import java.text.ParseException;

public class App {
    public static void main(String[] args) throws Exception {
        // Insertion des données de l'employé

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrer le matricule");
        String newmMatricule = scan.nextLine();

        System.out.println("Entrer le nom");
        String newmNom = scan.nextLine();

        System.out.println("Entrer le prénom");
        String newmPrenom = scan.nextLine();

        System.out.println("Entrer la date de naissance: JJ/MM/AAAA");
        String dateNai = scan.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date newmDateNaissance = new Date();
        Date newmDateEmbauche = new Date();
        try {
            newmDateNaissance = simpleDateFormat.parse(dateNai);

            System.out.println("Entrer la date d'embauche: JJ/MM/AAAA");
            String dateEmb = scan.nextLine();
             newmDateEmbauche = simpleDateFormat.parse(dateEmb);
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        System.out.println("Entrer le salaire annuel de base");
        double newmSalaireBase = scan.nextDouble();

        scan.close();

        // Création de l'instance myEmploye
        Employe myEmploye = new Employe(newmMatricule, newmNom, newmPrenom, newmDateNaissance, newmDateEmbauche, newmSalaireBase);

        myEmploye.afficherEmployer();
    }
}
