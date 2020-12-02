package src;

import java.util.ArrayList;

public class Technology {

    private ArrayList<String> TechQ;
    private ArrayList<String> TechA;

    public Technology() {
        TechQ = new ArrayList<>();

        TechQ.add("Ποίος ήταν ο πρώτος υπολογιστής με γραφικό περιβάλλον και ποντίκι ?");
        TechQ.add("Ποια από τις παρακάτω δεν είναι γλώσσα προγραμματισμού ?");
        TechQ.add("Σε ποιό σύστημα αρίθμησης εκτελούν υπολογισμούς οι υπολογιστές ?");
        TechQ.add("Ποια ΔΕΝ είναι μια διανομή του Linux ?");
        TechQ.add("Τα αρχικά DOS σημαίνουν ...");
        TechQ.add("Η κατάληξη αρχείων .mpg αναφέρεται σε αρχεία ...");
        TechQ.add("Η κατάληξη αρχείων .tmp αναφέρεται σε αρχεία ...");
        TechQ.add("Έδρα της κορυφαίας εταιρείας φωτογραφικών μηχανών Nikon είναι ...");
        TechQ.add("Ποιας εταιρείας αυτοκινήτων μοντέλο είναι το Cherokee ?");
        TechQ.add("Σε ποια χώρα κατασκευάστηκε ο πρώτος ηλεκτρονικός υπολογιστής ?");
        TechQ.add("Ποια απο τις παρακάτω μονάδες μνήμης του Η/Υ είναι πιο γρήγορη ?");
        TechQ.add("Ποια είναι η κατάληξη των διευθύνσεων των ιστοσελίδων της Γερμανίας ?");
        TechQ.add("Ποια εταιρεία έβγαλε την πρώτη μηψανή που εμφανιζει αμέσως τις φωτογραφίες ?");
        TechQ.add("Ποια απο τις παρακάτω παιχνιδομηχανές κυκλοφόρησε πρώτη ?");
        TechQ.add("Σε ποια απο τις παρακάτω χώρες χρησιμοποιείται το πρότυπο NTSC ?");

        TechA = new ArrayList<>();

        TechA.add("Apple Lisa");
        TechA.add("Commodore 64");
        TechA.add("Z1");
        TechA.add("IBM PC");
        TechA.add("Turing");
        TechA.add("C#");
        TechA.add("Basic");
        TechA.add("Java");
        TechA.add("Δυαδικό");
        TechA.add("Δεκαεξαδικό");
        TechA.add("Δεκαδικό");
        TechA.add("Οκταδικό");
        TechA.add("Mavericks");
        TechA.add("Ubuntu");
        TechA.add("Fedora");
        TechA.add("Mint");
        TechA.add("Disk Operating System");
        TechA.add("Disk Out System");
        TechA.add("Data Operating System");
        TechA.add("Data Out System");
        TechA.add("βίντεο");
        TechA.add("ήχου");
        TechA.add("κειμένου");
        TechA.add("εικόνας");
        TechA.add("προσωρινά");
        TechA.add("εικόνας");
        TechA.add("ήχου");
        TechA.add("κειμένου");
        TechA.add("η Ιαπωνία");
        TechA.add("το Ηνωμένο Βασίλειο");
        TechA.add("οι ΗΠΑ");
        TechA.add("η Ελλάδα");
        TechA.add("Jeep");
        TechA.add("Fiat");
        TechA.add("Toyota");
        TechA.add("Ferrari");
        TechA.add("Η.Π.Α");
        TechA.add("Γαλλία");
        TechA.add("Γερμανία");
        TechA.add("Ηνωμένο Βασίλειο");
        TechA.add("Μνήμη RAM");
        TechA.add("Σκληρός δίσκος");
        TechA.add("DVD ROM");
        TechA.add("BluRay");
        TechA.add(".de");
        TechA.add(".ge");
        TechA.add(".gr");
        TechA.add(".ger");
        TechA.add("Polaroid");
        TechA.add("Kodak");
        TechA.add("Sony");
        TechA.add("Nikon");
        TechA.add("Nintendo Gameboy");
        TechA.add("Microsoft Xbox");
        TechA.add("Sony Playstation");
        TechA.add("Sega Saturn");
        TechA.add("Ιαπωνία");
        TechA.add("Ελλάδα");
        TechA.add("Γερμανία");
        TechA.add("Αγγλία");
    }


    public String getTechQ(int position) {
        return TechQ.get(position);
    }

    public int getTechQSize() {
        return TechQ.size();
    }


    public String getTechA(int position) {
        return TechA.get(position);
    }

    public int getTechASize() {
        return TechA.size();
    }


}