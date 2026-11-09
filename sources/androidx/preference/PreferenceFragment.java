package androidx.preference;

import android.app.Fragment;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class PreferenceFragment extends Fragment implements PreferenceManager$OnPreferenceTreeClickListener, PreferenceManager$OnDisplayPreferenceDialogListener, PreferenceManager$OnNavigateToScreenListener, DialogPreference.TargetFragment {

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(@NonNull PreferenceFragment preferenceFragment, Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(PreferenceFragment preferenceFragment, Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(PreferenceFragment preferenceFragment, PreferenceScreen preferenceScreen);
    }
}
