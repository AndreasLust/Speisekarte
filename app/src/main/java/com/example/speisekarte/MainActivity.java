package com.example.speisekarte;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.speisekarte.Fragments.FragmentCardview;
import com.example.speisekarte.Fragments.FragmentDetailedCardview;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentManager fragmentManager = new FragmentManager() {
        @NonNull
        @Override
        public FragmentTransaction beginTransaction() {
            return null;
        }

        @Override
        public boolean executePendingTransactions() {
            return false;
        }

        @Nullable
        @Override
        public Fragment findFragmentById(int i) {
            return null;
        }

        @Nullable
        @Override
        public Fragment findFragmentByTag(@Nullable String s) {
            return null;
        }

        @Override
        public void popBackStack() {

        }

        @Override
        public boolean popBackStackImmediate() {
            return false;
        }

        @Override
        public void popBackStack(@Nullable String s, int i) {

        }

        @Override
        public boolean popBackStackImmediate(@Nullable String s, int i) {
            return false;
        }

        @Override
        public void popBackStack(int i, int i1) {

        }

        @Override
        public boolean popBackStackImmediate(int i, int i1) {
            return false;
        }

        @Override
        public int getBackStackEntryCount() {
            return 0;
        }

        @NonNull
        @Override
        public BackStackEntry getBackStackEntryAt(int i) {
            return null;
        }

        @Override
        public void addOnBackStackChangedListener(
            @NonNull OnBackStackChangedListener onBackStackChangedListener) {

        }

        @Override
        public void removeOnBackStackChangedListener(
            @NonNull OnBackStackChangedListener onBackStackChangedListener) {

        }

        @Override
        public void putFragment(@NonNull Bundle bundle, @NonNull String s,
                                @NonNull Fragment fragment) {

        }

        @Nullable
        @Override
        public Fragment getFragment(@NonNull Bundle bundle, @NonNull String s) {
            return null;
        }

        @NonNull
        @Override
        public List<Fragment> getFragments() {
            return null;
        }

        @Nullable
        @Override
        public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
            return null;
        }

        @Override
        public boolean isDestroyed() {
            return false;
        }

        @Override
        public void registerFragmentLifecycleCallbacks(
            @NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean b) {

        }

        @Override
        public void unregisterFragmentLifecycleCallbacks(
            @NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {

        }

        @Nullable
        @Override
        public Fragment getPrimaryNavigationFragment() {
            return null;
        }

        @Override
        public void dump(String s, FileDescriptor fileDescriptor, PrintWriter printWriter,
                         String[] strings) {

        }

        @Override
        public boolean isStateSaved() {
            return false;
        }
    };

    // inflates Main Activity, removes standard Android Title and binds ButterKnife Framework to this class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);
        Fragment fragment = new FragmentCardview();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_main, fragment);
        transaction.commit();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void showDetailedCardview(int id) {
        Fragment fragment = new FragmentDetailedCardview();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setReorderingAllowed(true);
        transaction.addSharedElement((CardView) findViewById(R.id.spaghetti), findViewById(R.id.spaghetti).getTransitionName());
        transaction.addSharedElement((TextView) findViewById(R.id.spaghetti_title), findViewById(R.id.spaghetti_title).getTransitionName());
        transaction.addSharedElement((ImageView) findViewById(R.id.spaghetti_picture), findViewById(R.id.spaghetti_picture).getTransitionName());
        transaction.addSharedElement((TextView) findViewById(R.id.spaghetti_price), findViewById(R.id.spaghetti_price).getTransitionName());
        transaction.replace(R.id.rv_cardviews, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
