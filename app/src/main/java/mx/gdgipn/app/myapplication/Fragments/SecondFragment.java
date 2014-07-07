package mx.gdgipn.app.myapplication.Fragments;

import android.app.Fragment;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import mx.gdgipn.app.myapplication.R;

/**
 * Created by thespianartist on 7/6/14.
 */
public class SecondFragment extends Fragment {

    ImageButton btn;

    public  SecondFragment(){

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
        Outline outline = new Outline();
        outline.setOval(0, 0, size, size);
        getActivity().findViewById(R.id.fab_2).setOutline(outline);

        btn = (ImageButton) getActivity().findViewById(R.id.fab_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Soy una Notificación",Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my2, container, false);
        return rootView;

    }

}
