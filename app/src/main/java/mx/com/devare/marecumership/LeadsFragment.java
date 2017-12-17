package mx.com.devare.marecumership;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LeadsFragment extends Fragment {
    ListView mLeadsList;
    LeadsAdapter mLeadsAdapter;

    public LeadsFragment() {

    }

    public static LeadsFragment newInstance() {
        LeadsFragment fragment = new LeadsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_leads, container, false);

        // Instancia del ListView.
        mLeadsList = (ListView) root.findViewById(R.id.lv_leads);

       /* String[] leadsNames = {
                "Sheryl Sandberg",
                "Bill Gates",
                "Jimmy Wales",
                "Ursula Burns",
                "Marissa Mayer",
                "Vincent Cerf",
                "Steve Jobs",
                "Katie Cotton",
                "Meg Whitman",
                "Alan Turing",
                "Mark Zuckerberg",
                "Steve Ballmer",
                "Michael Dell",
                "Paul Allen",
                "Azim Premji"
        };*/

        //Inicializar el adaptador con la fuente de datos.
        mLeadsAdapter = new LeadsAdapter(getActivity(),LeadsRepository.getInstance().getLeads());

        //Relacionando la lista con el adaptador
        mLeadsList.setAdapter(mLeadsAdapter);
        inicializarEscuchaEventos();
        return root;
    }

    private void inicializarEscuchaEventos() {
        // Eventos
        mLeadsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Lead currentLead = mLeadsAdapter.getItem(position);
                Toast.makeText(getActivity(),
                        "Seleccionastes: " + currentLead.getmNombre(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
