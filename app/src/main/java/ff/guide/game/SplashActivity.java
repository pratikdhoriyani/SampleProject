package ff.guide.game;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2100;
    //Hooks

    RelativeLayout iv_splash;
    //Animations
    Animation fade_in;

    public static String TAG = "SplashLogo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        // Hooks
        iv_splash = findViewById(R.id.iv_splash);

        //Animation Calls
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        //-----------Setting Animations to the elements of SplashScreen--------
        iv_splash.setAnimation(fade_in);


        //Splash Screen Code to call new Activity after some time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, SPLASH_TIME_OUT);


    }
}
