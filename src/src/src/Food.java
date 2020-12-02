package src;

import java.util.ArrayList;

public class Food {

    private ArrayList<String> FoodQ;
    private ArrayList<String> FoodA;

    public Food() {
        FoodQ = new ArrayList<>();

        FoodQ.add("Ποιό φρούτο Θεωρείται σύμβολο της γωνιμότητας");
        FoodQ.add("Σε ποιά βιταμίνη είναι πλούσιο το πορτοκάλι");
        FoodQ.add("Από ποιά συστατικά αποτελείται το κοκτέιλ cuba libre");
        FoodQ.add("Τί είναι η σουμάδα");
        FoodQ.add("Από που 'Κατάγεται' η πίτσα");
        FoodQ.add("Τι είναι η μπαγκέτα");
        FoodQ.add("Τι χρώμα είναι στο εσωτερικό τους τα φιστίκια Αιγίνης");
        FoodQ.add("Τι σχήμα έχει η πίτσα κααλτσόνε");
        FoodQ.add("Από ποιά χώρα προέρχεται το μπρέτσελ");
        FoodQ.add("Ποιό απο τα παρακάτω είναι φαγητό");
        FoodQ.add("Ποιά χώρα έχει τη μεγαλύτερη παραγωγή λαδιού στον κόσμο");
        FoodQ.add("Ποιό από τα παρακάτω τυριά προέρχεται από την Κύπρο");
        FoodQ.add("Από ποιά χώρα προέρχεται η κρέπα");
        FoodQ.add("Τι είδος φαγητού είναι οι τορτίγιας");
        FoodQ.add("Τι είναι τα μπατόν σαλέ");


        FoodA = new ArrayList<>();

        FoodA.add("Ρόδι");
        FoodA.add("Πορτοκάλι");
        FoodA.add("Κεράσι");
        FoodA.add("Καρύδι");
        FoodA.add("C");
        FoodA.add("A");
        FoodA.add("B");
        FoodA.add("D");
        FoodA.add("Ρούμι-κοκα κόλα");
        FoodA.add("Βότκα-Πορτοκαλάδα");
        FoodA.add("Ουίσκι-σόδα");
        FoodA.add("Τζίν-Τόνικ");
        FoodA.add("Ποτό");
        FoodA.add("Κρέμα");
        FoodA.add("Σάλτσα");
        FoodA.add("Σούπα");
        FoodA.add("Ιταλία");
        FoodA.add("Γαλλία");
        FoodA.add("Ελλάδα");
        FoodA.add("Ισπανία");
        FoodA.add("Είδος ψωμιού");
        FoodA.add("Είδος τοστ");
        FoodA.add("Είδος πίτας");
        FoodA.add("Είδος μπισκότου");
        FoodA.add("Πράσινο");
        FoodA.add("Άσπρα");
        FoodA.add("Καφέ");
        FoodA.add("Μπέζ");
        FoodA.add("Μισοφέγγαρο");
        FoodA.add("Τετράγωνο");
        FoodA.add("Κυκλικό");
        FoodA.add("Τρίγωνο");
        FoodA.add("Γερμανία");
        FoodA.add("Τσεχία");
        FoodA.add("Αυστρία");
        FoodA.add("Ουγγαρία");
        FoodA.add("Ρόστο");
        FoodA.add("Ραγή");
        FoodA.add("Ρότα");
        FoodA.add("Ρούγα");
        FoodA.add("Ισπανία");
        FoodA.add("Συρλια");
        FoodA.add("Ελλάδα");
        FoodA.add("Ιταλία");
        FoodA.add("Χαλούμι");
        FoodA.add("Κατίκι");
        FoodA.add("Σφέλα");
        FoodA.add("Μανούρι");
        FoodA.add("Γαλλία");
        FoodA.add("Ολλανδία");
        FoodA.add("Ισπανία");
        FoodA.add("Ιταλία");
        FoodA.add("Ψωμί");
        FoodA.add("Ζυμαρικό");
        FoodA.add("Κρέας");
        FoodA.add("Ρύζι");
        FoodA.add("Αλμυρά κουλουράκια");
        FoodA.add("Κρουασάν");
        FoodA.add("Καναπεδάκια");
        FoodA.add("Γλυκά κουλουράκια");

    }


    public String getFoodQ(int position){
        return FoodQ.get(position);
    }
    public String getFoodA(int position){
        return FoodA.get(position);
    }

    public int getFoodQSize(){
        return FoodQ.size();
    }

    public int getFoodASize(){
        return FoodA.size();
    }
}