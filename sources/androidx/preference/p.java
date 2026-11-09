package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.N;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p extends RecyclerView.Adapter implements Preference.OnPreferenceChangeInternalListener, PreferenceGroup.PreferencePositionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PreferenceGroup f17646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f17647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f17648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f17649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f17650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.customview.widget.e f17651f;

    public final ArrayList a(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Preference> arrayList2 = new ArrayList();
        int size = preferenceGroup.f17593D0.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Preference preferenceY = preferenceGroup.y(i10);
            if (preferenceY.f17548X) {
                int i11 = preferenceGroup.f17597H0;
                if (i11 == Integer.MAX_VALUE || i7 < i11) {
                    arrayList.add(preferenceY);
                } else {
                    arrayList2.add(preferenceY);
                }
                if (preferenceY instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceY;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.f17597H0 != Integer.MAX_VALUE && preferenceGroup2.f17597H0 != Integer.MAX_VALUE) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : a(preferenceGroup2)) {
                            int i12 = preferenceGroup.f17597H0;
                            if (i12 == Integer.MAX_VALUE || i7 < i12) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i7++;
                        }
                    }
                } else {
                    i7++;
                }
            }
        }
        int i13 = preferenceGroup.f17597H0;
        if (i13 == Integer.MAX_VALUE || i7 <= i13) {
            return arrayList;
        }
        long j6 = preferenceGroup.f17553c;
        C1219d c1219d = new C1219d(preferenceGroup.f17551a);
        c1219d.f17567t0 = y.expand_button;
        int i14 = w.ic_arrow_down_24dp;
        Context context = c1219d.f17551a;
        Drawable drawableQ = p264r5.a.q(i14, context);
        if (c1219d.f17561o != drawableQ) {
            c1219d.f17561o = drawableQ;
            c1219d.f17559j = 0;
            c1219d.g();
        }
        c1219d.f17559j = i14;
        String string = context.getString(z.expand_button_title);
        if ((string == null && c1219d.f17557g != null) || (string != null && !string.equals(c1219d.f17557g))) {
            c1219d.f17557g = string;
            c1219d.g();
        }
        if (999 != c1219d.f17556f) {
            c1219d.f17556f = 999;
            p pVar = c1219d.f17570v0;
            if (pVar != null) {
                pVar.onPreferenceHierarchyChange(c1219d);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        CharSequence string2 = null;
        for (Preference preference2 : arrayList2) {
            CharSequence charSequence = preference2.f17557g;
            boolean z3 = preference2 instanceof PreferenceGroup;
            if (z3 && !TextUtils.isEmpty(charSequence)) {
                arrayList3.add((PreferenceGroup) preference2);
            }
            if (arrayList3.contains(preference2.f17573x0)) {
                if (z3) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string2 = string2 == null ? charSequence : c1219d.f17551a.getString(z.summary_collapsed_preference_list, string2, charSequence);
            }
        }
        if (c1219d.f17540A0 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (!TextUtils.equals(c1219d.f17558i, string2)) {
            c1219d.f17558i = string2;
            c1219d.g();
        }
        c1219d.f17629C0 = j6 + 1000000;
        c1219d.f17555e = new n(this, preferenceGroup);
        arrayList.add(c1219d);
        return arrayList;
    }

    public final void b(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f17593D0);
        }
        int size = preferenceGroup.f17593D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            Preference preferenceY = preferenceGroup.y(i7);
            arrayList.add(preferenceY);
            o oVar = new o(preferenceY);
            if (!this.f17649d.contains(oVar)) {
                this.f17649d.add(oVar);
            }
            if (preferenceY instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceY;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    b(arrayList, preferenceGroup2);
                }
            }
            preferenceY.f17570v0 = this;
        }
    }

    public final Preference c(int i7) {
        if (i7 < 0 || i7 >= this.f17648c.size()) {
            return null;
        }
        return (Preference) this.f17648c.get(i7);
    }

    public final void d() {
        Iterator it = this.f17647b.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).f17570v0 = null;
        }
        ArrayList arrayList = new ArrayList(this.f17647b.size());
        this.f17647b = arrayList;
        PreferenceGroup preferenceGroup = this.f17646a;
        b(arrayList, preferenceGroup);
        this.f17648c = a(preferenceGroup);
        notifyDataSetChanged();
        Iterator it2 = this.f17647b.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f17648c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        if (hasStableIds()) {
            return c(i7).c();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        o oVar = new o(c(i7));
        ArrayList arrayList = this.f17649d;
        int iIndexOf = arrayList.indexOf(oVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(oVar);
        return size;
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public final int getPreferenceAdapterPosition(String str) {
        int size = this.f17648c.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (TextUtils.equals(str, ((Preference) this.f17648c.get(i7)).f17562p)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        c(i7).k((u) viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        o oVar = (o) this.f17649d.get(i7);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, B.BackgroundStyle);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(B.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = p264r5.a.q(R.drawable.list_selector_background, viewGroup.getContext());
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(oVar.f17643a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = N.f16168a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i10 = oVar.f17644b;
            if (i10 != 0) {
                layoutInflaterFrom.inflate(i10, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new u(viewInflate);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public final void onPreferenceChange(Preference preference) {
        int iIndexOf = this.f17648c.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public final void onPreferenceHierarchyChange(Preference preference) {
        Handler handler = this.f17650e;
        androidx.customview.widget.e eVar = this.f17651f;
        handler.removeCallbacks(eVar);
        handler.post(eVar);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public final void onPreferenceVisibilityChange(Preference preference) {
        onPreferenceHierarchyChange(preference);
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public final int getPreferenceAdapterPosition(Preference preference) {
        int size = this.f17648c.size();
        for (int i7 = 0; i7 < size; i7++) {
            Preference preference2 = (Preference) this.f17648c.get(i7);
            if (preference2 != null && preference2.equals(preference)) {
                return i7;
            }
        }
        return -1;
    }
}
