package ff.guide.game;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

import static android.widget.ListPopupWindow.MATCH_PARENT;

public class WeaponsActivity extends AppCompatActivity {

    ImageView an94, m4a1, m14, ak47, scar, famas, groza;

    ImageView rate;




    public static ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons);

        an94 = findViewById(R.id.an94);
        m4a1 = findViewById(R.id.m4a1);
        m14 = findViewById(R.id.m14);
        ak47 = findViewById(R.id.ak47);
        scar = findViewById(R.id.scar);
        famas = findViewById(R.id.famas);
        groza = findViewById(R.id.groza);
        rate = findViewById(R.id.rate);

        progressDialog = new ProgressDialog(WeaponsActivity.this);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.shake);
        rate.setAnimation(animation);

        an94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                an94_dialog();

            }
        });

        m4a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m4a1_dialog();

            }
        });

        m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m14_dialog();

            }
        });

        ak47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ak47_dialog();

            }
        });

        scar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scar_dialog();

            }
        });

        famas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                famas_dialog();

            }
        });

        groza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                groza_dialog();

            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WeaponsActivity.this, "Comming Soon!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void an94_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.weapon_an94);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void m4a1_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.weapon_m4a1);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void m14_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.weapon_m14);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void ak47_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.weapon_ak);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void scar_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.weapon_scar);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void famas_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.weapon_famas);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void groza_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.weapon_groza);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

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
