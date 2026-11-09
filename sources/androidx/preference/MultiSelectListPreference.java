package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final CharSequence[] f17532I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final CharSequence[] f17533J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final HashSet f17534K0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        this.f17534K0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.MultiSelectListPreference, i7, 0);
        int i10 = B.MultiSelectListPreference_entries;
        int i11 = B.MultiSelectListPreference_android_entries;
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(i10);
        this.f17532I0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(i11) : textArray;
        int i12 = B.MultiSelectListPreference_entryValues;
        int i13 = B.MultiSelectListPreference_android_entryValues;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(i12);
        this.f17533J0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(i13) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i7) {
        CharSequence[] textArray = typedArray.getTextArray(i7);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.p(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.p(savedState.getSuperState());
        x(savedState.f17535a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f17543C) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f17535a = this.f17534K0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (w()) {
            stringSet = this.f17552b.b().getStringSet(this.f17562p, stringSet);
        }
        x(stringSet);
    }

    public final void x(Set set) {
        HashSet hashSet = this.f17534K0;
        hashSet.clear();
        hashSet.addAll(set);
        if (w()) {
            if (!set.equals(w() ? this.f17552b.b().getStringSet(this.f17562p, null) : null)) {
                SharedPreferences.Editor editorA = this.f17552b.a();
                editorA.putStringSet(this.f17562p, set);
                if (!this.f17552b.f17662e) {
                    editorA.apply();
                }
            }
        }
        g();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet f17535a;

        public SavedState(Parcel parcel) {
            super(parcel);
            int i7 = parcel.readInt();
            this.f17535a = new HashSet();
            String[] strArr = new String[i7];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f17535a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17535a.size());
            HashSet hashSet = this.f17535a;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.a(context, v.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
