package androidx.drawerlayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C1050b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f16827a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f16828b;

    public b(DrawerLayout drawerLayout) {
        this.f16828b = drawerLayout;
    }

    @Override // androidx.core.view.C1050b
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence drawerTitle;
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        List<CharSequence> text = accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.f16828b;
        View viewFindVisibleDrawer = drawerLayout.findVisibleDrawer();
        if (viewFindVisibleDrawer == null || (drawerTitle = drawerLayout.getDrawerTitle(drawerLayout.getDrawerViewAbsoluteGravity(viewFindVisibleDrawer))) == null) {
            return true;
        }
        text.add(drawerTitle);
        return true;
    }

    @Override // androidx.core.view.C1050b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // androidx.core.view.C1050b
    public final void onInitializeAccessibilityNodeInfo(View view, p074f0.d dVar) {
        if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(dVar.f36360a);
            super.onInitializeAccessibilityNodeInfo(view, new p074f0.d(accessibilityNodeInfoObtain));
            dVar.f36361b = -1;
            AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = N.f16168a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            Rect rect = this.f16827a;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            dVar.k(accessibilityNodeInfoObtain.getClassName());
            dVar.o(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            dVar.a(accessibilityNodeInfoObtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (DrawerLayout.includeChildForAccessibility(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        dVar.k("androidx.drawerlayout.widget.DrawerLayout");
        AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.f36360a;
        accessibilityNodeInfo2.setFocusable(false);
        accessibilityNodeInfo2.setFocused(false);
        accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) p074f0.c.f36343e.f36355a);
        accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) p074f0.c.f36344f.f36355a);
    }

    @Override // androidx.core.view.C1050b
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
