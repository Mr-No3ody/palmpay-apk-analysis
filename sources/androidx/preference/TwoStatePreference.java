package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f17621C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public String f17622D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f17623E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f17624F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f17625G0;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
    }

    @Override // androidx.preference.Preference
    public final void l() {
        x(!this.f17621C0);
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i7) {
        return Boolean.valueOf(typedArray.getBoolean(i7, false));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.p(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.p(savedState.getSuperState());
        x(savedState.f17626a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f17543C) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f17626a = this.f17621C0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (w()) {
            zBooleanValue = this.f17552b.b().getBoolean(this.f17562p, zBooleanValue);
        }
        x(zBooleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean v() {
        boolean z3;
        if (this.f17625G0) {
            z3 = this.f17621C0;
        } else {
            z3 = !this.f17621C0;
        }
        return z3 || super.v();
    }

    public final void x(boolean z3) {
        boolean z8 = this.f17621C0 != z3;
        if (z8 || !this.f17624F0) {
            this.f17621C0 = z3;
            this.f17624F0 = true;
            if (w()) {
                boolean z10 = !z3;
                if (w()) {
                    z10 = this.f17552b.b().getBoolean(this.f17562p, z10);
                }
                if (z3 != z10) {
                    SharedPreferences.Editor editorA = this.f17552b.a();
                    editorA.putBoolean(this.f17562p, z3);
                    if (!this.f17552b.f17662e) {
                        editorA.apply();
                    }
                }
            }
            if (z8) {
                h(v());
                g();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void y(View view) {
        boolean z3;
        int i7;
        CharSequence charSequenceE;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f17621C0 || TextUtils.isEmpty(this.f17622D0)) {
                if (this.f17621C0 || TextUtils.isEmpty(this.f17623E0)) {
                    z3 = true;
                } else {
                    textView.setText(this.f17623E0);
                }
                if (z3) {
                    charSequenceE = e();
                    if (!TextUtils.isEmpty(charSequenceE)) {
                        textView.setText(charSequenceE);
                        z3 = false;
                    }
                }
                i7 = z3 ? 8 : 0;
                if (i7 != textView.getVisibility()) {
                    textView.setVisibility(i7);
                }
            }
            textView.setText(this.f17622D0);
            z3 = false;
            if (z3) {
                charSequenceE = e();
                if (!TextUtils.isEmpty(charSequenceE)) {
                    textView.setText(charSequenceE);
                    z3 = false;
                }
            }
            if (z3) {
            }
            if (i7 != textView.getVisibility()) {
                textView.setVisibility(i7);
            }
        }
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new F();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17626a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f17626a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17626a ? 1 : 0);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
