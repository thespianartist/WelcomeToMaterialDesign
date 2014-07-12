package mx.gdgipn.app.myapplication.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Outline;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import mx.gdgipn.app.myapplication.MyActivity;
import mx.gdgipn.app.myapplication.R;

/**
 * Created by thespianartist on 7/6/14.
 */
public class FirstFragment extends Fragment{

    ImageButton btn;
    CardView cardView;

    public  FirstFragment(){

    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
        Outline outline = new Outline();
        outline.setOval(0, 0, size, size);
        getActivity().findViewById(R.id.fab_1).setOutline(outline);

        cardView = (CardView) getActivity().findViewById(R.id.card_view);
        cardView.setCameraDistance(2);
        cardView.setZ(2);


        btn = (ImageButton) getActivity().findViewById(R.id.fab_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Soy una Notificación",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);
        return rootView;

    }
}
