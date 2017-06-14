package muzinda.sharon.servicecontract;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import muzinda.sharon.servicecontract.fragments.SignatureFragment;
import muzinda.sharon.servicecontract.fragments.TermsFragment;

public class TermsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
// Generic toolbar code
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        //Implements fragments for menu options.  Uses replace instead of add to avoid savedInstanceState errors
        if (id == R.id.reviewOption) {
            TermsFragment fragment = new TermsFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.placeholder, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.signContract){
            SignatureFragment fragment = new SignatureFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.placeholder, fragment);
            fragmentTransaction.commit();
        }else if (id == R.id.closeApp)
        {
           finish();        //Finishes this activity, and since parent activity is also finished, app should finish.
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_terms, menu);
        return true;
    }
}
