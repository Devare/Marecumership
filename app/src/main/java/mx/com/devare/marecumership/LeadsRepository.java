package mx.com.devare.marecumership;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeadsRepository {
    private static LeadsRepository repository = new LeadsRepository();
    private HashMap<String, Lead> leads = new HashMap<>();

    public static LeadsRepository getInstance() {
        return repository;
    }

    private LeadsRepository() {

        guardarLead(new Lead("Sheryl Sandberg", "Jefa de operaciones", "Facebook", R.drawable.sheryl_sanberg));
        guardarLead(new Lead("Bill Gates", "Cofundador y CEO", "Microsoft", R.drawable.bill_gates));
        guardarLead(new Lead("Jimmy Wales", "Cofundador", "Wikipedia", R.drawable.jimmy_wales));
        guardarLead(new Lead("Ursula Burns", "CEO", " Xerox", R.drawable.ursula_burns));
        guardarLead(new Lead("Marissa Mayer", "Vicepresidenta del área de servicios locales", "Google", R.drawable.marissa_mayer));
        guardarLead(new Lead("Vincent Cerf", "Vice presidente y Evangelista en jefe de Internet", "Google", R.drawable.vicent_cerf));
        guardarLead(new Lead("Steve Jobs", "Cofundador", "Apple", R.drawable.steve_jobs));
        guardarLead(new Lead("Katie Cotton", "Vicepresidenta de Comunicaciones", "Apple", R.drawable.katie_cotton));
        guardarLead(new Lead("Meg Whitman", "Presidenta y CEO", "Hewlett-Packard", R.drawable.meg_whitman));
        guardarLead(new Lead("Mark Zuckerberg", "Presidente General", "Facebook", R.drawable.mark_zuckerberg));
        guardarLead(new Lead("Steve Ballmer", "Presidente General", "Microsoft ", R.drawable.steve_ballmer));
        guardarLead(new Lead("Michael Dell", "Presidente General", "DELL", R.drawable.michael_dell));
        guardarLead(new Lead("Paul Allen", "Director de fondos de inversión", "Microsoft", R.drawable.paull_allen));
        guardarLead(new Lead("Azim Premji", "Presidente General", "Wipro", R.drawable.ajim_premji));
    }

    private void guardarLead(Lead mlead) {
        leads.put(mlead.getmId(), mlead);
    }

    public List<Lead> getLeads() {
        return new ArrayList<>(leads.values());
    }
}