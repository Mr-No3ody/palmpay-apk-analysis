package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final boolean f17599I0;

    @RestrictTo({p192n.c.f39802c})
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, Y.a.a(context, v.preferenceScreenStyle, R.attr.preferenceScreenStyle));
        this.f17599I0 = true;
    }

    @Override // androidx.preference.Preference
    public final void l() {
        PreferenceFragmentCompat preferenceFragmentCompat;
        if (this.t != null || this.f17569v != null || this.f17593D0.size() == 0 || (preferenceFragmentCompat = this.f17552b.f17667j) == null) {
            return;
        }
        preferenceFragmentCompat.onNavigateToScreen(this);
    }
}
