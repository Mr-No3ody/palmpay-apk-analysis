package androidx.preference;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class C implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f17507a;

    public C(SeekBarPreference seekBarPreference) {
        this.f17507a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z3) {
        SeekBarPreference seekBarPreference = this.f17507a;
        if (!z3 || (!seekBarPreference.f17609L0 && seekBarPreference.f17604G0)) {
            int i10 = i7 + seekBarPreference.f17601D0;
            TextView textView = seekBarPreference.f17606I0;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.f17601D0;
        if (progress != seekBarPreference.f17600C0) {
            seekBarPreference.x(progress, false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f17507a.f17604G0 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.f17507a;
        seekBarPreference.f17604G0 = false;
        int progress2 = seekBar.getProgress();
        int i7 = seekBarPreference.f17601D0;
        if (progress2 + i7 == seekBarPreference.f17600C0 || (progress = seekBar.getProgress() + i7) == seekBarPreference.f17600C0) {
            return;
        }
        seekBarPreference.x(progress, false);
    }
}
