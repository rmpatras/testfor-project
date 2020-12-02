import java.util.ArrayList;

public class History {

    private ArrayList<String> HistQ;
    private ArrayList<String> HistA;

    public History() {
        HistQ=new ArrayList<>();

        HistQ.add("Ποιός είπε την φράση 'Μολών Λαβέ'");
        HistQ.add("Ο Αριστοτέλης ήταν πολύ σημαντικός ...");
        HistQ.add("Ποιό ήταν το ψευδώνυμο του Ρήγα Βελεστινλή?");
        HistQ.add("Πότε γιορτάζουμε το 'ΟΧΙ' των Ελλήνων στους Ιταλούς?");
        HistQ.add("Ποιός αναφώνησε το 'ΕΥΡΗΚΑ' ?");
        HistQ.add("Τον Λευκό Πύργο έχτισαν οι ... ");
        HistQ.add("Πότε απελευθερώθηκε η Θεσσαλονίκη");
        HistQ.add("Στην αρχαιότητα 'παιδοτρίβης' ονομαζόταν ο εκπαιδευτής...");
        HistQ.add("Τίνος ήταν ετεροθαλής αδελφή η Θεσσαλονίκη");
        HistQ.add("Ποιός ήταν ο πρωθυπουργός της Ελλάδας όταν υπεγράφη η 'Συνθήκη των Πρεσπών' για το όνομα των Σκοπίων");
        HistQ.add("Ο Τζώρτζ Πάττον ήταν Αμερικάνος...");
        HistQ.add("Ποιός αιώνας είναι γνωστός και ως 'Χρυσός Αιώνας' ");
        HistQ.add("Ποιά ήταν η σύζυγος του Σουλτάνου της Οθωμανικής Αυτοκρατορίας Σουλεϊμάν του μεγαλοπρεπούς");
        HistQ.add("Ποιός έγραψε την Ιλιάδα");
        HistQ.add("Ποιά ελληνική πόλη ονόμαζαν οι Φράγκοι Μαλβαζία");


        HistA=new ArrayList<>();

        HistA.add("Λεωνίδας");
        HistA.add("Αριστείδης");
        HistA.add("Περικλής");
        HistA.add("Αγαμέμνωνας");
        HistA.add("φιλόσοφος");
        HistA.add("φυσικός");
        HistA.add("μαθηματικός");
        HistA.add("στρατηγός");
        HistA.add("Φεραίος");
        HistA.add("Αντώνιος");
        HistA.add("Κατακτητής");
        HistA.add("Λόγιος");
        HistA.add("28η Οκτωμβρίου");
        HistA.add("17η Νοέμβρη");
        HistA.add("25η Μαρτίου");
        HistA.add("1η Μαίου");
        HistA.add("Αρχιμήδης");
        HistA.add("Λεωνίδας");
        HistA.add("Διομήδης");
        HistA.add("Θουκιδίδης");
        HistA.add("Τούρκοι");
        HistA.add("Έλληνες");
        HistA.add("Βενετοί");
        HistA.add("Φράγκοι");
        HistA.add("1912");
        HistA.add("1917");
        HistA.add("1915");
        HistA.add("1921");
        HistA.add("της Γυμναστικής");
        HistA.add("των μαθηματικών");
        HistA.add("της μουσικής");
        HistA.add("του καράτε");
        HistA.add("Μ. Αλεξάνδρου");
        HistA.add("Κασσάνδρου");
        HistA.add("Περδίκκα");
        HistA.add("Φιλίππου Β' ");
        HistA.add("Α. Τσίπρας");
        HistA.add("Α. Σαμαράς");
        HistA.add("Κ. Μητσοτάκης");
        HistA.add("Α. Παπανδρέου");
        HistA.add("στρατηγός");
        HistA.add("επιστήμονας");
        HistA.add("συγγραφέας");
        HistA.add("πολιτικός");
        HistA.add("5ος αι. π.Χ.");
        HistA.add("7ος αι. π.Χ.");
        HistA.add("6ος αι. π.Χ.");
        HistA.add("4ος αι. π.Χ.");
        HistA.add("Χιουρέμ");
        HistA.add("Αϊσέ Χαφσά Σουλτάν");
        HistA.add("Μιχριμάχ");
        HistA.add("Μαχιντεβράν");
        HistA.add("Όμηρος");
        HistA.add("Πυθαγόρας");
        HistA.add("Ηρόδοτος");
        HistA.add("Ησίοδος");
        HistA.add("Μονεμβασιά");
        HistA.add("Πάτρα");
        HistA.add("Κέρκυρα");
        HistA.add("Ρόδο");
    }
    public String getHistQ(int position){
        return HistQ.get(position);
    }

    public int getHistQSize(){
        return HistQ.size();
    }

    public String getHistA(int position){
        return HistA.get(position);
    }

    public int getHistASize(){
        return HistA.size();
    }

}