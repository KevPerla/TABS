package Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerControler extends FragmentPagerAdapter {
    int numtab;

    public PagerControler(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numtab = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new fragment_quiensoy();
            case 1:
                return new frangment_queestudio();
            case 2:
                return new frangment_tecno();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numtab;
    }
}
