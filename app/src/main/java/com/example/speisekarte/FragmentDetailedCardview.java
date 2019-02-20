package com.example.speisekarte;

import android.support.v4.app.Fragment;
import android.view.MenuItem;

public class FragmentDetailedCardview extends Fragment {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
