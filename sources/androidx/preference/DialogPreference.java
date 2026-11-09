package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final CharSequence f17510C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final String f17511D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final Drawable f17512E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final String f17513F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final String f17514G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final int f17515H0;

    public interface TargetFragment {
        @Nullable
        <T extends Preference> T findPreference(@NonNull CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.DialogPreference, i7, 0);
        int i11 = B.DialogPreference_dialogTitle;
        int i12 = B.DialogPreference_android_dialogTitle;
        String string = typedArrayObtainStyledAttributes.getString(i11);
        string = string == null ? typedArrayObtainStyledAttributes.getString(i12) : string;
        this.f17510C0 = string;
        if (string == null) {
            this.f17510C0 = this.f17557g;
        }
        int i13 = B.DialogPreference_dialogMessage;
        int i14 = B.DialogPreference_android_dialogMessage;
        String string2 = typedArrayObtainStyledAttributes.getString(i13);
        this.f17511D0 = string2 == null ? typedArrayObtainStyledAttributes.getString(i14) : string2;
        int i15 = B.DialogPreference_dialogIcon;
        int i16 = B.DialogPreference_android_dialogIcon;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i15);
        this.f17512E0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(i16) : drawable;
        int i17 = B.DialogPreference_positiveButtonText;
        int i18 = B.DialogPreference_android_positiveButtonText;
        String string3 = typedArrayObtainStyledAttributes.getString(i17);
        this.f17513F0 = string3 == null ? typedArrayObtainStyledAttributes.getString(i18) : string3;
        int i19 = B.DialogPreference_negativeButtonText;
        int i20 = B.DialogPreference_android_negativeButtonText;
        String string4 = typedArrayObtainStyledAttributes.getString(i19);
        this.f17514G0 = string4 == null ? typedArrayObtainStyledAttributes.getString(i20) : string4;
        this.f17515H0 = typedArrayObtainStyledAttributes.getResourceId(B.DialogPreference_dialogLayout, typedArrayObtainStyledAttributes.getResourceId(B.DialogPreference_android_dialogLayout, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void l() {
        PreferenceFragmentCompat preferenceFragmentCompat = this.f17552b.f17666i;
        if (preferenceFragmentCompat != null) {
            preferenceFragmentCompat.onDisplayPreferenceDialog(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.a(context, v.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
