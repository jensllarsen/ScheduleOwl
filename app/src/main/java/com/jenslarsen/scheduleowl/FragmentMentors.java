package com.jenslarsen.scheduleowl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.jenslarsen.scheduleowl.db.Datasource;
import com.jenslarsen.scheduleowl.model.Mentor;

public class FragmentMentors extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_mentors, container, false);

        ListView listView = rootView.findViewById(R.id.listViewMentors);

        ArrayAdapter<Mentor> adapter = new ArrayAdapter<>(getContext(), R.layout.listitem_tab,
                R.id.textViewListItem, Datasource.mentors);
        listView.setAdapter(adapter);

        Button buttonAddMentor = rootView.findViewById(R.id.buttonAddMentor);
        buttonAddMentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAddMentorClicked();
            }
        });

        return rootView;
    }

    public void buttonAddMentorClicked(){
        Toast.makeText(getContext(), "Add Mentor clicked", Toast.LENGTH_SHORT).show();
    }
}
