package androidx.preference;

import C9.C0145l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final C0145l f17508H0;

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        this.f17508H0 = new C0145l(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.CheckBoxPreference, i7, 0);
        int i10 = B.CheckBoxPreference_summaryOn;
        int i11 = B.CheckBoxPreference_android_summaryOn;
        String string = typedArrayObtainStyledAttributes.getString(i10);
        this.f17622D0 = string == null ? typedArrayObtainStyledAttributes.getString(i11) : string;
        if (this.f17621C0) {
            g();
        }
        int i12 = B.CheckBoxPreference_summaryOff;
        int i13 = B.CheckBoxPreference_android_summaryOff;
        String string2 = typedArrayObtainStyledAttributes.getString(i12);
        this.f17623E0 = string2 == null ? typedArrayObtainStyledAttributes.getString(i13) : string2;
        if (!this.f17621C0) {
            g();
        }
        this.f17625G0 = typedArrayObtainStyledAttributes.getBoolean(B.CheckBoxPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(B.CheckBoxPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void k(u uVar) {
        super.k(uVar);
        z(uVar.findViewById(R.id.checkbox));
        y(uVar.findViewById(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.f17551a.getSystemService("accessibility")).isEnabled()) {
            z(view.findViewById(R.id.checkbox));
            y(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(View view) {
        boolean z3 = view instanceof CompoundButton;
        if (z3) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f17621C0);
        }
        if (z3) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f17508H0);
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.a(context, v.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle));
    }
}
