package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
    }

    @Override // androidx.preference.Preference
    public final boolean f() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void k(u uVar) {
        super.k(uVar);
        if (Build.VERSION.SDK_INT >= 28) {
            uVar.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final void o(p074f0.d dVar) {
        if (Build.VERSION.SDK_INT < 28) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = dVar.f36360a.getCollectionItemInfo();
            p045d3.k kVar = collectionItemInfo != null ? new p045d3.k(collectionItemInfo, 22) : null;
            if (kVar == null) {
                return;
            }
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) kVar.f35518b;
            dVar.n(p045d3.k.h(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), true, collectionItemInfo2.isSelected()));
        }
    }

    @Override // androidx.preference.Preference
    public final boolean v() {
        return !super.f();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.a(context, v.preferenceCategoryStyle, R.attr.preferenceCategoryStyle));
    }
}
