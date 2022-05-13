package sg.edu.np.mad.MADPractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void displayAlert(View view){
        AlertDialog.Builder profile = new AlertDialog.Builder(this);

        profile.setTitle("Profile").setMessage("MADness").setCancelable(false).setPositiveButton
        ("VIEW", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id){
                Random num = new Random();
                int rand = num.nextInt(Integer.MAX_VALUE);
                Intent newPage = new Intent(ListActivity.this, MainActivity.class);
                newPage.putExtra("random",rand);
                startActivity(newPage);
            }
        });
        profile.setNegativeButton("CLOSE", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){

            }
        });
        profile.show();

    }
}