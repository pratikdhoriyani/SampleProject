package ff.guide.game;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView tips, weapons, charac, diamonds, vehical;

    public static ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tips = findViewById(R.id.tips);
        weapons = findViewById(R.id.weapons);
        charac = findViewById(R.id.charac);
        diamonds = findViewById(R.id.diamonds);
        vehical = findViewById(R.id.vehical);






        progressDialog = new ProgressDialog(MainActivity.this);



        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressBar();
                progressDialog.dismiss();
                startActivity(new Intent(MainActivity.this, TipsActivity.class));
            }
        });

        weapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressBar();
                progressDialog.dismiss();
                startActivity(new Intent(MainActivity.this, WeaponsActivity.class));
            }
        });

        charac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressBar();
                progressDialog.dismiss();
                startActivity(new Intent(MainActivity.this, CharacterActivity.class));
            }
        });

        diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressBar();
                progressDialog.dismiss();
                startActivity(new Intent(MainActivity.this, DaimondActivity.class));
            }
        });

        vehical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressBar();
                progressDialog.dismiss();
                startActivity(new Intent(MainActivity.this, VehicleActivity.class));
            }
        });

    }

    @Override
    public void onBackPressed() {
        exit_dialog();
    }

    public void exit_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.exit_dialog);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        ImageView bt_yes = dialog.findViewById(R.id.bt_yes);
        ImageView bt_no = dialog.findViewById(R.id.bt_no);

        bt_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        bt_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    public static void showProgressBar() {
        progressDialog.show();

        progressDialog.setContentView(R.layout.progress_dialog);

        progressDialog.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );

        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setCancelable(false);
    }
}
