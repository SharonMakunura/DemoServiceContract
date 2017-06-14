package muzinda.sharon.servicecontract;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.contractHeader)TextView headingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

   @OnClick (R.id.launchButton)       //Uses butterknife click instead of buttons onClickListener
    public void launchActivity(View view){
       Intent intent = new Intent(this, TermsActivity.class);
       startActivity(intent);
       MainActivity.this.finish();  //Closes this activity as it calls the new one
   }

}
