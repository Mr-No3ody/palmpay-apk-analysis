package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final M.n f17592C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final ArrayList f17593D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f17594E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f17595F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f17596G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f17597H0;

    @RestrictTo({p192n.c.f39802c})
    public interface OnExpandButtonClickListener {
        void onExpandButtonClick();
    }

    public interface PreferencePositionCallback {
        int getPreferenceAdapterPosition(Preference preference);

        int getPreferenceAdapterPosition(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, 0);
        this.f17592C0 = new M.n(0);
        new Handler();
        this.f17594E0 = true;
        this.f17595F0 = 0;
        this.f17596G0 = false;
        this.f17597H0 = Integer.MAX_VALUE;
        this.f17593D0 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.PreferenceGroup, i7, 0);
        int i11 = B.PreferenceGroup_orderingFromXml;
        this.f17594E0 = typedArrayObtainStyledAttributes.getBoolean(i11, typedArrayObtainStyledAttributes.getBoolean(i11, true));
        if (typedArrayObtainStyledAttributes.hasValue(B.PreferenceGroup_initialExpandedChildrenCount)) {
            int i12 = B.PreferenceGroup_initialExpandedChildrenCount;
            int i13 = typedArrayObtainStyledAttributes.getInt(i12, typedArrayObtainStyledAttributes.getInt(i12, Integer.MAX_VALUE));
            if (i13 != Integer.MAX_VALUE && TextUtils.isEmpty(this.f17562p)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.f17597H0 = i13;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(Bundle bundle) {
        super.a(bundle);
        int size = this.f17593D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            y(i7).a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.f17593D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            y(i7).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void h(boolean z3) {
        super.h(z3);
        int size = this.f17593D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            Preference preferenceY = y(i7);
            if (preferenceY.f17547Q == z3) {
                preferenceY.f17547Q = !z3;
                preferenceY.h(preferenceY.v());
                preferenceY.g();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void i() {
        super.i();
        this.f17596G0 = true;
        int size = this.f17593D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            y(i7).i();
        }
    }

    @Override // androidx.preference.Preference
    public final void m() {
        super.m();
        this.f17596G0 = false;
        int size = this.f17593D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            y(i7).m();
        }
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.p(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f17597H0 = savedState.f17598a;
        super.p(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new SavedState(this.f17597H0);
    }

    public final Preference x(CharSequence charSequence) {
        Preference preferenceX;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f17562p, charSequence)) {
            return this;
        }
        int size = this.f17593D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            Preference preferenceY = y(i7);
            if (TextUtils.equals(preferenceY.f17562p, charSequence)) {
                return preferenceY;
            }
            if ((preferenceY instanceof PreferenceGroup) && (preferenceX = ((PreferenceGroup) preferenceY).x(charSequence)) != null) {
                return preferenceX;
            }
        }
        return null;
    }

    public final Preference y(int i7) {
        return (Preference) this.f17593D0.get(i7);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new m();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17598a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f17598a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17598a);
        }

        public SavedState(int i7) {
            super(AbsSavedState.EMPTY_STATE);
            this.f17598a = i7;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
