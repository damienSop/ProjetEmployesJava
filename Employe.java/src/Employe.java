import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.time.LocalDate;  // import the LocalDate class
import java.util.Calendar;   // Import the calendar class
import java.util.Date;

public class Employe {
    // Définition des attributs de la classe et leurs mode d'accès (Getter et Setter)

    private String mMatricule;
        // Getter 
        public String getmMatricule() {
            return mMatricule;
        } 
        // Setter
        public void setmMatricule(String newmMatricule) {
            this.mMatricule = newmMatricule;
        }

    private String mNom;
        //Getter
        public String getmNom() {
            return mNom;
        }
        //Setter
        public void setmNom(String newmNom) {
            this.mNom = newmNom;
        }

    private String mPrenom;
        //Getter
        public String getmPrenom() {
            return mPrenom;
        }
        //Setter
        public void setmPrenom(String newmPrenom) {
            this.mPrenom = newmPrenom;
        }
    
    private double mSalaireBase;
        //Getter
        public double getmSalaireBase() {
            return mSalaireBase; 
        }
        //Setter
        public void setmSalaireBase(double newmSalaireBase) {
            this.mSalaireBase = newmSalaireBase;
        }
    
    private Calendar mDateNaissance;
        // Getter
        public Calendar getmDateNaissance() {
            return mDateNaissance;
        }
        // Setter
        public void setmDateNaissance(Calendar newmDateNaissance) {
            this.mDateNaissance = newmDateNaissance;
        }

    private Calendar mDateEmbauche;
        // Getter
        public Calendar getmDateEmbauche() {
            return mDateEmbauche;
        }
        // Setter
        public void setmDateEmbauche(Calendar newmDateEmbauche) {
            this.mDateEmbauche = newmDateEmbauche;
        }

    /*private int mAnciennete;
        // Getter
        public int getmAnciennete() {
            return mAnciennete;
        }
        // Setter
        public void setmAnciennete(int newmAnciennete) {
            this.mAnciennete = newmAnciennete;
        } */

    //*******  Définition du constructeur ****************//

    public Employe(String matricule, String nom, String prenom, Calendar dateNaissance, Calendar dateEmbauche, double salaireBase) {
        mMatricule = matricule;
        mNom = nom;
        mPrenom = prenom;
        mDateNaissance = dateNaissance;
        mDateEmbauche = dateEmbauche;
        mSalaireBase = salaireBase;

    }

    //****** Définition des méthodes de la classe  ********//

    // Méthode  Calcul age()
    public int calculAge() {
        
        LocalDate dateActuelle = LocalDate.now(); // Définition date actuelle
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = simpleDateFormat.parse("20/11/1982");
        cal.setTime(date.);
        cal.;
    }

    try {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
         Date date = simpleDateFormat.parse("20/11/1982");
         cal.setTime(date);
         
          
          System.out.println(myObj.getYear());
           System.out.println(cal.YEAR);
            System.out.println(myObj.getYear()-cal.YEAR);
             } catch (ParseException e) {
            e.printStackTrace();
          }

}