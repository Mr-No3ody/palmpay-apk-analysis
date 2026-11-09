package androidx.slidingpanelayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e extends C1050b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f17862a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SlidingPaneLayout f17863b;

    public e(SlidingPaneLayout slidingPaneLayout) {
        this.f17863b = slidingPaneLayout;
    }

    @Override // androidx.core.view.C1050b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    @Override // androidx.core.view.C1050b
    public final void onInitializeAccessibilityNodeInfo(View view, p074f0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(dVar.f36360a);
        super.onInitializeAccessibilityNodeInfo(view, new p074f0.d(accessibilityNodeInfoObtain));
        Rect rect = this.f17862a;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect);
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
        accessibilityNodeInfo.setBoundsInScreen(rect);
        accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
        accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
        dVar.k(accessibilityNodeInfoObtain.getClassName());
        dVar.o(accessibilityNodeInfoObtain.getContentDescription());
        accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
        dVar.l(accessibilityNodeInfoObtain.isClickable());
        accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
        accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
        accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
        accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
        accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
        dVar.a(accessibilityNodeInfoObtain.getActions());
        accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
        dVar.k("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        dVar.f36361b = -1;
        accessibilityNodeInfo.setSource(view);
        WeakHashMap weakHashMap = N.f16168a;
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            accessibilityNodeInfo.setParent((View) parentForAccessibility);
        }
        SlidingPaneLayout slidingPaneLayout = this.f17863b;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = slidingPaneLayout.getChildAt(i7);
            if (!slidingPaneLayout.b(childAt) && childAt.getVisibility() == 0) {
                childAt.setImportantForAccessibility(1);
                accessibilityNodeInfo.addChild(childAt);
            }
        }
    }

    @Override // androidx.core.view.C1050b
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.f17863b.b(view)) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
