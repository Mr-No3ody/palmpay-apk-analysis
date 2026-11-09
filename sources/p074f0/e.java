package p074f0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f36362a;

    public e(g gVar) {
        this.f36362a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        d dVarA = this.f36362a.a(i7);
        if (dVarA == null) {
            return null;
        }
        return dVarA.f36360a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        this.f36362a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        d dVarB = this.f36362a.b(i7);
        if (dVarB == null) {
            return null;
        }
        return dVarB.f36360a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        return this.f36362a.c(i7, i10, bundle);
    }
}
