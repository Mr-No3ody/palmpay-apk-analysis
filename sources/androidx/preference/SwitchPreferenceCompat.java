package androidx.preference;

import C9.C0145l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final C0145l f17618H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final String f17619I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final String f17620J0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        this.f17618H0 = new C0145l(this, 4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.SwitchPreferenceCompat, i7, 0);
        int i10 = B.SwitchPreferenceCompat_summaryOn;
        int i11 = B.SwitchPreferenceCompat_android_summaryOn;
        String string = typedArrayObtainStyledAttributes.getString(i10);
        this.f17622D0 = string == null ? typedArrayObtainStyledAttributes.getString(i11) : string;
        if (this.f17621C0) {
            g();
        }
        int i12 = B.SwitchPreferenceCompat_summaryOff;
        int i13 = B.SwitchPreferenceCompat_android_summaryOff;
        String string2 = typedArrayObtainStyledAttributes.getString(i12);
        this.f17623E0 = string2 == null ? typedArrayObtainStyledAttributes.getString(i13) : string2;
        if (!this.f17621C0) {
            g();
        }
        int i14 = B.SwitchPreferenceCompat_switchTextOn;
        int i15 = B.SwitchPreferenceCompat_android_switchTextOn;
        String string3 = typedArrayObtainStyledAttributes.getString(i14);
        this.f17619I0 = string3 == null ? typedArrayObtainStyledAttributes.getString(i15) : string3;
        g();
        int i16 = B.SwitchPreferenceCompat_switchTextOff;
        int i17 = B.SwitchPreferenceCompat_android_switchTextOff;
        String string4 = typedArrayObtainStyledAttributes.getString(i16);
        this.f17620J0 = string4 == null ? typedArrayObtainStyledAttributes.getString(i17) : string4;
        g();
        this.f17625G0 = typedArrayObtainStyledAttributes.getBoolean(B.SwitchPreferenceCompat_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(B.SwitchPreferenceCompat_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void k(u uVar) {
        super.k(uVar);
        z(uVar.findViewById(x.switchWidget));
        y(uVar.findViewById(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.f17551a.getSystemService("accessibility")).isEnabled()) {
            z(view.findViewById(x.switchWidget));
            y(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(View view) {
        boolean z3 = view instanceof SwitchCompat;
        if (z3) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f17621C0);
        }
        if (z3) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f17619I0);
            switchCompat.setTextOff(this.f17620J0);
            switchCompat.setOnCheckedChangeListener(this.f17618H0);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v.switchPreferenceCompatStyle);
    }
}
