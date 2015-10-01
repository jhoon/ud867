package jota.pe.jokedemo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pe.jota.library.smith.JokeSmith;
import pe.jota.library.wizard.JokeWizard;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        JokeSmith jSmith = new JokeSmith();
        TextView txtSmith = (TextView)rootView.findViewById(R.id.txt_manual_joke);
        txtSmith.setText(jSmith.getJoke());

        JokeWizard jWizard = new JokeWizard();
        TextView txtWizard = (TextView)rootView.findViewById(R.id.txt_wizard_joke);
        txtWizard.setText(jWizard.getJoke());

        return rootView;
    }
}
