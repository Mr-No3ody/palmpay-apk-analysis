package androidx.drawerlayout.widget;

import android.view.View;
import androidx.core.view.C1050b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C1050b {
    @Override // androidx.core.view.C1050b
    public final void onInitializeAccessibilityNodeInfo(View view, p074f0.d dVar) {
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        if (DrawerLayout.includeChildForAccessibility(view)) {
            return;
        }
        dVar.f36360a.setParent(null);
    }
}
