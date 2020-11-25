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

public class VehicleActivity extends AppCompatActivity {

    ImageView msports, mtruck, mmoto, mamphibian, mjeep, mtuktuk, mvan;

    ImageView rate;



    public static ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehical);

        msports = findViewById(R.id.msports);
        mtruck = findViewById(R.id.mtruck);
        mmoto = findViewById(R.id.mmoto);
        mamphibian = findViewById(R.id.mamphibian);
        mjeep = findViewById(R.id.mjeep);
        mtuktuk = findViewById(R.id.mtuktuk);
        mvan = findViewById(R.id.mvan);
        rate = findViewById(R.id.rate);

        progressDialog = new ProgressDialog(VehicleActivity.this);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.shake);
        rate.setAnimation(animation);

        msports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                msports_dialog();

            }
        });

        mtruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mtruck_dialog();

            }
        });

        mmoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mmoto_dialog();

            }
        });

        mamphibian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mamphibian_dialog();

            }
        });

        mjeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mjeep_dialog();

            }
        });

        mtuktuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mtuktuk_dialog();

            }
        });

        mvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mvan_dialog();

            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VehicleActivity.this, "Comming Soon!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void msports_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.vehicle_sports_car);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mtruck_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.vehicle_monster_truck);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mmoto_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.vehicle_motorcycle);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mamphibian_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.vehicle_amphibian);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mjeep_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.vehicle_military_jeep);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mtuktuk_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.vehicle_tuk_tuk);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mvan_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.vehicle_van);
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
