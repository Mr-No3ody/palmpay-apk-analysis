package androidx.core.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.C1050b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends C1050b {
    @Override // androidx.core.view.C1050b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // androidx.core.view.C1050b
    public final void onInitializeAccessibilityNodeInfo(View view, p074f0.d dVar) {
        int scrollRange;
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        dVar.k(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        dVar.r(true);
        if (nestedScrollView.getScrollY() > 0) {
            dVar.b(p074f0.c.f36348j);
            dVar.b(p074f0.c.f36352n);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            dVar.b(p074f0.c.f36347i);
            dVar.b(p074f0.c.f36353o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    @Override // androidx.core.view.C1050b
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(view, i7, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i7 == 4096) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.o(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i7 == 8192 || i7 == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax != nestedScrollView.getScrollY()) {
                    nestedScrollView.o(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i7 == 16908346) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.o(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
        }
        return false;
    }
}
