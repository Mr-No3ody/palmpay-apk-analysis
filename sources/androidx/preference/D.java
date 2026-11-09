package androidx.preference;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class D implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f17509a;

    public D(SeekBarPreference seekBarPreference) {
        this.f17509a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f17509a;
        if ((!seekBarPreference.f17607J0 && (i7 == 21 || i7 == 22)) || i7 == 23 || i7 == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.f17605H0;
        if (seekBar != null) {
            return seekBar.onKeyDown(i7, keyEvent);
        }
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    }
}
