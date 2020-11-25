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


public class CharacterActivity extends AppCompatActivity {

    ImageView andrew, mantonio, mcaroline, mford, mkelly, mkla, mmaxim, mmiguel, mmisha, mnikita,
            mwukung, molivia, mpaloma, mhayato, mmcoc;

    ImageView rate;




    public static ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        andrew = findViewById(R.id.andrew);
        mantonio = findViewById(R.id.mantonio);
        mcaroline = findViewById(R.id.mcaroline);
        mford = findViewById(R.id.mford);
        mkelly = findViewById(R.id.mkelly);
        mkla = findViewById(R.id.mkla);
        mmaxim = findViewById(R.id.mmaxim);
        mmiguel = findViewById(R.id.mmiguel);
        mmisha = findViewById(R.id.mmisha);
        mnikita = findViewById(R.id.mnikita);
        mwukung = findViewById(R.id.mwukung);
        molivia = findViewById(R.id.molivia);
        mpaloma = findViewById(R.id.mpaloma);
        mhayato = findViewById(R.id.mhayato);
        mmcoc = findViewById(R.id.mmcoc);
        rate = findViewById(R.id.rate);

        progressDialog = new ProgressDialog(CharacterActivity.this);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.shake);
        rate.setAnimation(animation);


        andrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                andrew_dialog();

            }
        });

        mantonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mantonio_dialog();
            }
        });

        mcaroline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mcaroline_dialog();
            }
        });

        mford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mford_dialog();
            }
        });

        mkelly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mkelly_dialog();

            }
        });

        mkla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mkla_dialog();

            }
        });

        mmaxim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mmaxim_dialog();

            }
        });

        mmiguel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mmiguel_dialog();

            }
        });

        mmisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mmisha_dialog();

            }
        });

        mnikita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mnikita_dialog();

            }
        });

        mwukung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mwukung_dialog();

            }
        });

        molivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                molivia_dialog();

            }
        });

        mpaloma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mpaloma_dialog();

            }
        });

        mhayato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mhayato_dialog();

            }
        });

        mmcoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mmcoc_dialog();

            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CharacterActivity.this, "Available Soon!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void andrew_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_andrew);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mantonio_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_antonio);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mcaroline_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_caroline);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mford_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_ford);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mkelly_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_kelly);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mkla_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_kla);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mmaxim_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_maxim);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mmiguel_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_miguel);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mmisha_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_misha);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mnikita_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_nikita);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mwukung_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_wukong);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void molivia_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_olivia);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mpaloma_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_poloma);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mhayato_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_hayato);
        dialog.setCancelable(true);

        ((ViewGroup)dialog.getWindow().getDecorView())
                .getChildAt(0).startAnimation(AnimationUtils.loadAnimation(
                this,R.anim.bounce));

        dialog.show();
    }

    public void mmcoc_dialog() {
        final Dialog dialog = new Dialog(this, R.style.creativeDialogTheme);
        dialog.setContentView(R.layout.character_moco);
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