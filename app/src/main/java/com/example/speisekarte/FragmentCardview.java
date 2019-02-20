package com.example.speisekarte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.OnClick;

public class FragmentCardview extends Fragment {

    @BindView(R.id.spaghetti)
    protected CardView spaghetti;

    @BindView(R.id.spaghetti_title)
    protected View spaghettiTitle;

    @BindView(R.id.spaghetti_price)
    protected View spaghettiPrice;

    @BindView(R.id.spaghetti_picture)
    protected View spaghettiPicture;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cardviews, container, false);
    }

    //shared Elements Activity transition
    @OnClick(R.id.spaghetti)
    protected void onCardviewClicked() {
        Intent intent = new Intent(getActivity(), FragmentDetailedCardview.class);
        Pair<View, String> p1 = Pair.create((View) spaghetti, "transition_spaghetti_cardview");
        Pair<View, String> p2 = Pair.create(spaghettiTitle, "transition_spaghetti_title");
        Pair<View, String> p3 = Pair.create(spaghettiPrice, "transition_spaghetti_price");
        Pair<View, String> p4 = Pair.create(spaghettiPicture, "transition_spaghetti_picture");
        ActivityOptionsCompat options =
            ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), p1, p2, p3, p4);
        startActivity(intent, options.toBundle());
    }

}
