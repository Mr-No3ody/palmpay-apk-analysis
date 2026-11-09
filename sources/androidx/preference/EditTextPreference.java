package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public String f17519I0;

    public interface OnBindEditTextListener {
        void onBindEditText(@NonNull EditText editText);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.EditTextPreference, i7, 0);
        int i10 = B.EditTextPreference_useSimpleSummaryProvider;
        if (typedArrayObtainStyledAttributes.getBoolean(i10, typedArrayObtainStyledAttributes.getBoolean(i10, false))) {
            if (C1218c.f17628a == null) {
                C1218c.f17628a = new C1218c();
            }
            this.f17540A0 = C1218c.f17628a;
            g();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.p(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.p(savedState.getSuperState());
        x(savedState.f17520a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f17543C) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f17520a = this.f17519I0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        x(d((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean v() {
        return TextUtils.isEmpty(this.f17519I0) || super.v();
    }

    public final void x(String str) {
        boolean zV = v();
        this.f17519I0 = str;
        t(str);
        boolean zV2 = v();
        if (zV2 != zV) {
            h(zV2);
        }
        g();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1217b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17520a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f17520a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.f17520a);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.a(context, v.editTextPreferenceStyle, R.attr.editTextPreferenceStyle));
    }
}
