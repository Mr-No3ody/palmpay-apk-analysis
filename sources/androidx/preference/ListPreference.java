package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final CharSequence[] f17523I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final CharSequence[] f17524J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public String f17525K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final String f17526L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f17527M0;

    public ListPreference(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.ListPreference, i7, 0);
        int i11 = B.ListPreference_entries;
        int i12 = B.ListPreference_android_entries;
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(i11);
        this.f17523I0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(i12) : textArray;
        int i13 = B.ListPreference_entryValues;
        int i14 = B.ListPreference_android_entryValues;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(i13);
        this.f17524J0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(i14) : textArray2;
        int i15 = B.ListPreference_useSimpleSummaryProvider;
        if (typedArrayObtainStyledAttributes.getBoolean(i15, typedArrayObtainStyledAttributes.getBoolean(i15, false))) {
            if (C1221f.f17630a == null) {
                C1221f.f17630a = new C1221f();
            }
            this.f17540A0 = C1221f.f17630a;
            g();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, B.Preference, i7, 0);
        int i16 = B.Preference_summary;
        int i17 = B.Preference_android_summary;
        String string = typedArrayObtainStyledAttributes2.getString(i16);
        this.f17526L0 = string == null ? typedArrayObtainStyledAttributes2.getString(i17) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence e() {
        int length;
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        Preference.SummaryProvider summaryProvider = this.f17540A0;
        if (summaryProvider != null) {
            return summaryProvider.provideSummary(this);
        }
        String str = this.f17525K0;
        if (str != null && (charSequenceArr2 = this.f17524J0) != null) {
            length = charSequenceArr2.length - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (charSequenceArr2[length].equals(str)) {
                    break;
                }
                length--;
            }
        } else {
            length = -1;
            break;
        }
        CharSequence charSequence = (length < 0 || (charSequenceArr = this.f17523I0) == null) ? null : charSequenceArr[length];
        CharSequence charSequenceE = super.e();
        String str2 = this.f17526L0;
        if (str2 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str3 = String.format(str2, charSequence);
            if (!TextUtils.equals(str3, charSequenceE)) {
                return str3;
            }
        }
        return charSequenceE;
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
        x(savedState.f17528a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f17543C) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f17528a = this.f17525K0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        x(d((String) obj));
    }

    public final void x(String str) {
        boolean zEquals = TextUtils.equals(this.f17525K0, str);
        if (zEquals && this.f17527M0) {
            return;
        }
        this.f17525K0 = str;
        this.f17527M0 = true;
        t(str);
        if (zEquals) {
            return;
        }
        g();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1220e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17528a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f17528a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.f17528a);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.a(context, v.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
