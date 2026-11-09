package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f17600C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f17601D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f17602E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f17603F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f17604G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public SeekBar f17605H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public TextView f17606I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final boolean f17607J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final boolean f17608K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final boolean f17609L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final C f17610M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final D f17611N0;

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        this.f17610M0 = new C(this);
        this.f17611N0 = new D(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.SeekBarPreference, i7, 0);
        this.f17601D0 = typedArrayObtainStyledAttributes.getInt(B.SeekBarPreference_min, 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(B.SeekBarPreference_android_max, 100);
        int i11 = this.f17601D0;
        i10 = i10 < i11 ? i11 : i10;
        if (i10 != this.f17602E0) {
            this.f17602E0 = i10;
            g();
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(B.SeekBarPreference_seekBarIncrement, 0);
        if (i12 != this.f17603F0) {
            this.f17603F0 = Math.min(this.f17602E0 - this.f17601D0, Math.abs(i12));
            g();
        }
        this.f17607J0 = typedArrayObtainStyledAttributes.getBoolean(B.SeekBarPreference_adjustable, true);
        this.f17608K0 = typedArrayObtainStyledAttributes.getBoolean(B.SeekBarPreference_showSeekBarValue, false);
        this.f17609L0 = typedArrayObtainStyledAttributes.getBoolean(B.SeekBarPreference_updatesContinuously, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void k(u uVar) {
        super.k(uVar);
        uVar.itemView.setOnKeyListener(this.f17611N0);
        this.f17605H0 = (SeekBar) uVar.findViewById(x.seekbar);
        TextView textView = (TextView) uVar.findViewById(x.seekbar_value);
        this.f17606I0 = textView;
        if (this.f17608K0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f17606I0 = null;
        }
        SeekBar seekBar = this.f17605H0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f17610M0);
        this.f17605H0.setMax(this.f17602E0 - this.f17601D0);
        int i7 = this.f17603F0;
        if (i7 != 0) {
            this.f17605H0.setKeyProgressIncrement(i7);
        } else {
            this.f17603F0 = this.f17605H0.getKeyProgressIncrement();
        }
        this.f17605H0.setProgress(this.f17600C0 - this.f17601D0);
        int i10 = this.f17600C0;
        TextView textView2 = this.f17606I0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i10));
        }
        this.f17605H0.setEnabled(f());
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i7) {
        return Integer.valueOf(typedArray.getInt(i7, 0));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.p(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.p(savedState.getSuperState());
        this.f17600C0 = savedState.f17612a;
        this.f17601D0 = savedState.f17613b;
        this.f17602E0 = savedState.f17614c;
        g();
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f17543C) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f17612a = this.f17600C0;
        savedState.f17613b = this.f17601D0;
        savedState.f17614c = this.f17602E0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (w()) {
            iIntValue = this.f17552b.b().getInt(this.f17562p, iIntValue);
        }
        x(iIntValue, true);
    }

    public final void x(int i7, boolean z3) {
        int i10 = this.f17601D0;
        if (i7 < i10) {
            i7 = i10;
        }
        int i11 = this.f17602E0;
        if (i7 > i11) {
            i7 = i11;
        }
        if (i7 != this.f17600C0) {
            this.f17600C0 = i7;
            TextView textView = this.f17606I0;
            if (textView != null) {
                textView.setText(String.valueOf(i7));
            }
            if (w()) {
                int i12 = ~i7;
                if (w()) {
                    i12 = this.f17552b.b().getInt(this.f17562p, i12);
                }
                if (i7 != i12) {
                    SharedPreferences.Editor editorA = this.f17552b.a();
                    editorA.putInt(this.f17562p, i7);
                    if (!this.f17552b.f17662e) {
                        editorA.apply();
                    }
                }
            }
            if (z3) {
                g();
            }
        }
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new E();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17614c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f17612a = parcel.readInt();
            this.f17613b = parcel.readInt();
            this.f17614c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17612a);
            parcel.writeInt(this.f17613b);
            parcel.writeInt(this.f17614c);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v.seekBarPreferenceStyle);
    }
}
