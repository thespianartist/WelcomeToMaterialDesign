package mx.gdgipn.app.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Outline;
import android.os.Bundle;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import mx.gdgipn.app.myapplication.Fragments.FirstFragment;
import mx.gdgipn.app.myapplication.Fragments.SecondFragment;


public class MyActivity extends Activity implements ActionBar.TabListener{

    Fragment[] fragments = {
                            new FirstFragment(),
                            new SecondFragment()
                           };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);



        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new FirstFragment())
                    .commit();
        }


        ActionBar bar = getActionBar();
        bar.removeAllTabs();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        bar.addTab(bar.newTab().setText("Uno").setTabListener(this));
        bar.addTab(bar.newTab().setText("Dos").setTabListener(this));

    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        fragmentTransaction.replace(R.id.container, fragments[tab.getPosition()]);

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {


    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }


}
