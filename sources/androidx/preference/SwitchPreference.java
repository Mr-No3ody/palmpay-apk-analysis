package androidx.preference;

import C9.C0145l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final C0145l f17615H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final String f17616I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final String f17617J0;

    public SwitchPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        this.f17615H0 = new C0145l(this, 3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.SwitchPreference, i7, 0);
        int i10 = B.SwitchPreference_summaryOn;
        int i11 = B.SwitchPreference_android_summaryOn;
        String string = typedArrayObtainStyledAttributes.getString(i10);
        this.f17622D0 = string == null ? typedArrayObtainStyledAttributes.getString(i11) : string;
        if (this.f17621C0) {
            g();
        }
        int i12 = B.SwitchPreference_summaryOff;
        int i13 = B.SwitchPreference_android_summaryOff;
        String string2 = typedArrayObtainStyledAttributes.getString(i12);
        this.f17623E0 = string2 == null ? typedArrayObtainStyledAttributes.getString(i13) : string2;
        if (!this.f17621C0) {
            g();
        }
        int i14 = B.SwitchPreference_switchTextOn;
        int i15 = B.SwitchPreference_android_switchTextOn;
        String string3 = typedArrayObtainStyledAttributes.getString(i14);
        this.f17616I0 = string3 == null ? typedArrayObtainStyledAttributes.getString(i15) : string3;
        g();
        int i16 = B.SwitchPreference_switchTextOff;
        int i17 = B.SwitchPreference_android_switchTextOff;
        String string4 = typedArrayObtainStyledAttributes.getString(i16);
        this.f17617J0 = string4 == null ? typedArrayObtainStyledAttributes.getString(i17) : string4;
        g();
        this.f17625G0 = typedArrayObtainStyledAttributes.getBoolean(B.SwitchPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(B.SwitchPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void k(u uVar) {
        super.k(uVar);
        z(uVar.findViewById(R.id.switch_widget));
        y(uVar.findViewById(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.f17551a.getSystemService("accessibility")).isEnabled()) {
            z(view.findViewById(R.id.switch_widget));
            y(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(View view) {
        boolean z3 = view instanceof Switch;
        if (z3) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f17621C0);
        }
        if (z3) {
            Switch r10 = (Switch) view;
            r10.setTextOn(this.f17616I0);
            r10.setTextOff(this.f17617J0);
            r10.setOnCheckedChangeListener(this.f17615H0);
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.a(context, v.switchPreferenceStyle, R.attr.switchPreferenceStyle));
    }
}
