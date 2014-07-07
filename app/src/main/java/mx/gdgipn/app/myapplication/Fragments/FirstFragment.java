package mx.gdgipn.app.myapplication.Fragments;

import android.app.Fragment;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.gdgipn.app.myapplication.R;

/**
 * Created by thespianartist on 7/6/14.
 */
public class FirstFragment extends Fragment{

    public  FirstFragment(){

    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
        Outline outline = new Outline();
        outline.setOval(0, 0, size, size);
        getActivity().findViewById(R.id.fab_1).setOutline(outline);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);
        return rootView;

    }
}
