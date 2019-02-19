package com.example.speisekarte;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.spaghetti)
    protected CardView spaghetti;

    @BindView(R.id.spaghetti_title)
    protected View spaghettiTitle;

    @BindView(R.id.spaghetti_price)
    protected View spaghettiPrice;

    @BindView(R.id.spaghetti_picture)
    protected View spaghettiPicture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.spaghetti)
    protected void onCardviewClicked() {
        Intent intent = new Intent(this, DetailedCardview.class);
        Pair<View, String> p1 = Pair.create((View) spaghetti, "transition_spaghetti_cardview");
        Pair<View, String> p2 = Pair.create(spaghettiTitle, "transition_spaghetti_title");
        Pair<View, String> p3 = Pair.create(spaghettiPrice, "transition_spaghetti_price");
        Pair<View, String> p4 = Pair.create(spaghettiPicture, "transition_spaghetti_picture");
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, p1, p2, p3, p4);
        startActivity(intent, options.toBundle());
    }

}
