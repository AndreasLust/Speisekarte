package com.example.speisekarte;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentCardview extends Fragment {

    private static final String TAG = "FragmentCardview";

    @BindView(R.id.spaghetti)
    protected CardView spaghetti;

    @BindView(R.id.spaghetti_title)
    protected View spaghettiTitle;

    @BindView(R.id.spaghetti_price)
    protected View spaghettiPrice;

    @BindView(R.id.spaghetti_picture)
    protected View spaghettiPicture;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cardviews, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    //shared Elements Activity transition
    @OnClick(R.id.spaghetti)
    protected void onCardviewClicked() {
        Log.d(TAG, "onCardviewClicked: snjgihesfighsfdjglkk");
        ((MainActivity) getActivity()).showDetailedCardview(R.id.spaghetti);
    }

}
