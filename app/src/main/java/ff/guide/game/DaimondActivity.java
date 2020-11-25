package ff.guide.game;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DaimondActivity extends AppCompatActivity {

    ImageView rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daimond);

        rate = findViewById(R.id.rate);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.shake);
        rate.setAnimation(animation);
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DaimondActivity.this, "Available Soon!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
