package muzinda.sharon.servicecontract.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import muzinda.sharon.servicecontract.R;

/**
 * Created by Sharon on 12/06/2017.
 */

public class TermsFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.terms_fragment, container,false);
        return view;
    }
}
