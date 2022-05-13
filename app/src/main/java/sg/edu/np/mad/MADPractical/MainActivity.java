package sg.edu.np.mad.MADPractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    User newUser = new User("Griffin", "Year 2 student in School of Infocomm Technology", 1, true );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.user);
        Intent receive = getIntent();
        int newInput = receive.getIntExtra("random", 1739039545);
        username.setText(newUser.Name + " " + newInput);

        TextView description = findViewById(R.id.description);
        description.setText(newUser.Description);
    }

    public void followCheck(View view){
        Button follow = findViewById(R.id.followButton);
        if (newUser.Followed == true){
            follow.setText("Unfollowed");
            newUser.Followed = false;
            Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_SHORT).show();
        }
        else{
            follow.setText("Followed");
            newUser.Followed = true;
            Toast.makeText(MainActivity.this, "Unfollowed", Toast.LENGTH_SHORT).show();
        }
    }

    public void messageClicked(View view){
        Button message = findViewById(R.id.messageButton);
        Intent messageGroup = new Intent(MainActivity.this, MessageGroup.class);
        startActivity(messageGroup);
    }
}
