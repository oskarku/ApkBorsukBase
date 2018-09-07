package menu.gird.example.com.myfragmenttut;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener {

    MenuFragment menuf = new MenuFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragmento1();




        //GridView gridview = (GridView) view.findViewById(R.id.mainGrid);






    }




    public void Fragmento1(){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frameFragment, menuf );
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
