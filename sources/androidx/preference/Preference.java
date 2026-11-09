package androidx.preference;

import C9.ViewOnClickListenerC0146m;
import N8.q0;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.N;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f17539A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public SummaryProvider f17540A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f17541B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f17542B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f17543C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f17544H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Object f17545L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f17546M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f17547Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f17548X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f17549Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final boolean f17550Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f17552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnPreferenceClickListener f17555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f17557g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f17558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17559j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f17560k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f17561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f17562p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f17563p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f17564q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f17565r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f17566s0;
    public Intent t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f17567t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f17568u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f17569v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public p f17570v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Bundle f17571w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f17572w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public PreferenceGroup f17573x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f17574y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public k f17575z0;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new j();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    public interface OnPreferenceChangeInternalListener {
        void onPreferenceChange(Preference preference);

        void onPreferenceHierarchyChange(Preference preference);

        void onPreferenceVisibilityChange(Preference preference);
    }

    public interface OnPreferenceChangeListener {
        boolean onPreferenceChange(Preference preference, Object obj);
    }

    public interface OnPreferenceClickListener {
        boolean onPreferenceClick(Preference preference);
    }

    public interface SummaryProvider<T extends Preference> {
        CharSequence provideSummary(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.f17556f = Integer.MAX_VALUE;
        this.f17539A = true;
        this.f17541B = true;
        this.f17543C = true;
        this.f17546M = true;
        this.f17547Q = true;
        this.f17548X = true;
        this.f17549Y = true;
        this.f17550Z = true;
        this.f17563p0 = true;
        this.f17566s0 = true;
        this.f17567t0 = y.preference;
        this.f17542B0 = new ViewOnClickListenerC0146m(this, 18);
        this.f17551a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.Preference, i7, i10);
        this.f17559j = typedArrayObtainStyledAttributes.getResourceId(B.Preference_icon, typedArrayObtainStyledAttributes.getResourceId(B.Preference_android_icon, 0));
        int i11 = B.Preference_key;
        int i12 = B.Preference_android_key;
        String string = typedArrayObtainStyledAttributes.getString(i11);
        this.f17562p = string == null ? typedArrayObtainStyledAttributes.getString(i12) : string;
        int i13 = B.Preference_title;
        int i14 = B.Preference_android_title;
        CharSequence text = typedArrayObtainStyledAttributes.getText(i13);
        this.f17557g = text == null ? typedArrayObtainStyledAttributes.getText(i14) : text;
        int i15 = B.Preference_summary;
        int i16 = B.Preference_android_summary;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(i15);
        this.f17558i = text2 == null ? typedArrayObtainStyledAttributes.getText(i16) : text2;
        this.f17556f = typedArrayObtainStyledAttributes.getInt(B.Preference_order, typedArrayObtainStyledAttributes.getInt(B.Preference_android_order, Integer.MAX_VALUE));
        int i17 = B.Preference_fragment;
        int i18 = B.Preference_android_fragment;
        String string2 = typedArrayObtainStyledAttributes.getString(i17);
        this.f17569v = string2 == null ? typedArrayObtainStyledAttributes.getString(i18) : string2;
        this.f17567t0 = typedArrayObtainStyledAttributes.getResourceId(B.Preference_layout, typedArrayObtainStyledAttributes.getResourceId(B.Preference_android_layout, y.preference));
        this.f17568u0 = typedArrayObtainStyledAttributes.getResourceId(B.Preference_widgetLayout, typedArrayObtainStyledAttributes.getResourceId(B.Preference_android_widgetLayout, 0));
        this.f17539A = typedArrayObtainStyledAttributes.getBoolean(B.Preference_enabled, typedArrayObtainStyledAttributes.getBoolean(B.Preference_android_enabled, true));
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(B.Preference_selectable, typedArrayObtainStyledAttributes.getBoolean(B.Preference_android_selectable, true));
        this.f17541B = z3;
        this.f17543C = typedArrayObtainStyledAttributes.getBoolean(B.Preference_persistent, typedArrayObtainStyledAttributes.getBoolean(B.Preference_android_persistent, true));
        int i19 = B.Preference_dependency;
        int i20 = B.Preference_android_dependency;
        String string3 = typedArrayObtainStyledAttributes.getString(i19);
        this.f17544H = string3 == null ? typedArrayObtainStyledAttributes.getString(i20) : string3;
        int i21 = B.Preference_allowDividerAbove;
        this.f17549Y = typedArrayObtainStyledAttributes.getBoolean(i21, typedArrayObtainStyledAttributes.getBoolean(i21, z3));
        int i22 = B.Preference_allowDividerBelow;
        this.f17550Z = typedArrayObtainStyledAttributes.getBoolean(i22, typedArrayObtainStyledAttributes.getBoolean(i22, z3));
        if (typedArrayObtainStyledAttributes.hasValue(B.Preference_defaultValue)) {
            this.f17545L = n(typedArrayObtainStyledAttributes, B.Preference_defaultValue);
        } else if (typedArrayObtainStyledAttributes.hasValue(B.Preference_android_defaultValue)) {
            this.f17545L = n(typedArrayObtainStyledAttributes, B.Preference_android_defaultValue);
        }
        this.f17566s0 = typedArrayObtainStyledAttributes.getBoolean(B.Preference_shouldDisableView, typedArrayObtainStyledAttributes.getBoolean(B.Preference_android_shouldDisableView, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(B.Preference_singleLineTitle);
        this.f17560k0 = zHasValue;
        if (zHasValue) {
            this.f17563p0 = typedArrayObtainStyledAttributes.getBoolean(B.Preference_singleLineTitle, typedArrayObtainStyledAttributes.getBoolean(B.Preference_android_singleLineTitle, true));
        }
        this.f17564q0 = typedArrayObtainStyledAttributes.getBoolean(B.Preference_iconSpaceReserved, typedArrayObtainStyledAttributes.getBoolean(B.Preference_android_iconSpaceReserved, false));
        int i23 = B.Preference_isPreferenceVisible;
        this.f17548X = typedArrayObtainStyledAttributes.getBoolean(i23, typedArrayObtainStyledAttributes.getBoolean(i23, true));
        int i24 = B.Preference_enableCopying;
        this.f17565r0 = typedArrayObtainStyledAttributes.getBoolean(i24, typedArrayObtainStyledAttributes.getBoolean(i24, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void u(View view, boolean z3) {
        view.setEnabled(z3);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                u(viewGroup.getChildAt(childCount), z3);
            }
        }
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.f17562p) || (parcelable = bundle.getParcelable(this.f17562p)) == null) {
            return;
        }
        this.f17574y0 = false;
        p(parcelable);
        if (!this.f17574y0) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void b(Bundle bundle) {
        if (TextUtils.isEmpty(this.f17562p)) {
            return;
        }
        this.f17574y0 = false;
        Parcelable parcelableQ = q();
        if (!this.f17574y0) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableQ != null) {
            bundle.putParcelable(this.f17562p, parcelableQ);
        }
    }

    public long c() {
        return this.f17553c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i7 = this.f17556f;
        int i10 = preference2.f17556f;
        if (i7 != i10) {
            return i7 - i10;
        }
        CharSequence charSequence = this.f17557g;
        CharSequence charSequence2 = preference2.f17557g;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f17557g.toString());
    }

    public final String d(String str) {
        return !w() ? str : this.f17552b.b().getString(this.f17562p, str);
    }

    public CharSequence e() {
        SummaryProvider summaryProvider = this.f17540A0;
        return summaryProvider != null ? summaryProvider.provideSummary(this) : this.f17558i;
    }

    public boolean f() {
        return this.f17539A && this.f17546M && this.f17547Q;
    }

    public void g() {
        p pVar = this.f17570v0;
        if (pVar != null) {
            pVar.onPreferenceChange(this);
        }
    }

    public void h(boolean z3) {
        ArrayList arrayList = this.f17572w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Preference preference = (Preference) arrayList.get(i7);
            if (preference.f17546M == z3) {
                preference.f17546M = !z3;
                preference.h(preference.v());
                preference.g();
            }
        }
    }

    public void i() {
        PreferenceScreen preferenceScreen;
        String str = this.f17544H;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        r rVar = this.f17552b;
        Preference preferenceX = null;
        if (rVar != null && (preferenceScreen = rVar.f17664g) != null) {
            preferenceX = preferenceScreen.x(str);
        }
        if (preferenceX == null) {
            StringBuilder sbQ = q0.q("Dependency \"", str, "\" not found for preference \"");
            sbQ.append(this.f17562p);
            sbQ.append("\" (title: \"");
            sbQ.append((Object) this.f17557g);
            sbQ.append("\"");
            throw new IllegalStateException(sbQ.toString());
        }
        if (preferenceX.f17572w0 == null) {
            preferenceX.f17572w0 = new ArrayList();
        }
        preferenceX.f17572w0.add(this);
        boolean zV = preferenceX.v();
        if (this.f17546M == zV) {
            this.f17546M = !zV;
            h(v());
            g();
        }
    }

    public final void j(r rVar) {
        long j6;
        this.f17552b = rVar;
        if (!this.f17554d) {
            synchronized (rVar) {
                j6 = rVar.f17659b;
                rVar.f17659b = 1 + j6;
            }
            this.f17553c = j6;
        }
        if (w()) {
            r rVar2 = this.f17552b;
            if ((rVar2 != null ? rVar2.b() : null).contains(this.f17562p)) {
                r(null);
                return;
            }
        }
        Object obj = this.f17545L;
        if (obj != null) {
            r(obj);
        }
    }

    public void k(u uVar) {
        Integer numValueOf;
        View view = uVar.itemView;
        view.setOnClickListener(this.f17542B0);
        view.setId(0);
        TextView textView = (TextView) uVar.findViewById(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceE = e();
            if (TextUtils.isEmpty(charSequenceE)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceE);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) uVar.findViewById(R.id.title);
        boolean z3 = this.f17541B;
        if (textView2 != null) {
            CharSequence charSequence = this.f17557g;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f17560k0) {
                    textView2.setSingleLine(this.f17563p0);
                }
                if (!z3 && f() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) uVar.findViewById(R.id.icon);
        boolean z8 = this.f17564q0;
        if (imageView != null) {
            int i7 = this.f17559j;
            if (i7 != 0 || this.f17561o != null) {
                if (this.f17561o == null) {
                    this.f17561o = p264r5.a.q(i7, this.f17551a);
                }
                Drawable drawable = this.f17561o;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f17561o != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z8 ? 4 : 8);
            }
        }
        View viewFindViewById = uVar.findViewById(x.icon_frame);
        if (viewFindViewById == null) {
            viewFindViewById = uVar.findViewById(R.id.icon_frame);
        }
        if (viewFindViewById != null) {
            if (this.f17561o != null) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(z8 ? 4 : 8);
            }
        }
        if (this.f17566s0) {
            u(view, f());
        } else {
            u(view, true);
        }
        view.setFocusable(z3);
        view.setClickable(z3);
        uVar.f17673b = this.f17549Y;
        uVar.f17674c = this.f17550Z;
        boolean z10 = this.f17565r0;
        if (z10 && this.f17575z0 == null) {
            this.f17575z0 = new k(this);
        }
        view.setOnCreateContextMenuListener(z10 ? this.f17575z0 : null);
        view.setLongClickable(z10);
        if (!z10 || z3) {
            return;
        }
        WeakHashMap weakHashMap = N.f16168a;
        view.setBackground(null);
    }

    public void l() {
    }

    public void m() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f17544H;
        if (str != null) {
            r rVar = this.f17552b;
            Preference preferenceX = null;
            if (rVar != null && (preferenceScreen = rVar.f17664g) != null) {
                preferenceX = preferenceScreen.x(str);
            }
            if (preferenceX == null || (arrayList = preferenceX.f17572w0) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object n(TypedArray typedArray, int i7) {
        return null;
    }

    public void p(Parcelable parcelable) {
        this.f17574y0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable q() {
        this.f17574y0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void r(Object obj) {
    }

    public void s(View view) {
        Intent intent;
        PreferenceFragmentCompat preferenceFragmentCompat;
        if (f() && this.f17541B) {
            l();
            OnPreferenceClickListener onPreferenceClickListener = this.f17555e;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.onPreferenceClick(this)) {
                r rVar = this.f17552b;
                if ((rVar == null || (preferenceFragmentCompat = rVar.f17665h) == null || !preferenceFragmentCompat.onPreferenceTreeClick(this)) && (intent = this.t) != null) {
                    this.f17551a.startActivity(intent);
                }
            }
        }
    }

    public final void t(String str) {
        if (w() && !TextUtils.equals(str, d(null))) {
            SharedPreferences.Editor editorA = this.f17552b.a();
            editorA.putString(this.f17562p, str);
            if (this.f17552b.f17662e) {
                return;
            }
            editorA.apply();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f17557g;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence charSequenceE = e();
        if (!TextUtils.isEmpty(charSequenceE)) {
            sb2.append(charSequenceE);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public boolean v() {
        return !f();
    }

    public final boolean w() {
        return (this.f17552b == null || !this.f17543C || TextUtils.isEmpty(this.f17562p)) ? false : true;
    }

    public void o(p074f0.d dVar) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.a(context, v.preferenceStyle, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
