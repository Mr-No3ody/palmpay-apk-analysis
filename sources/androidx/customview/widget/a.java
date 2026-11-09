package androidx.customview.widget;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p074f0.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f16383b;

    public a(b bVar) {
        this.f16383b = bVar;
    }

    @Override // p074f0.g
    public final p074f0.d a(int i7) {
        return new p074f0.d(AccessibilityNodeInfo.obtain(this.f16383b.obtainAccessibilityNodeInfo(i7).f36360a));
    }

    @Override // p074f0.g
    public final p074f0.d b(int i7) {
        b bVar = this.f16383b;
        int i10 = i7 == 2 ? bVar.mAccessibilityFocusedVirtualViewId : bVar.mKeyboardFocusedVirtualViewId;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i10);
    }

    @Override // p074f0.g
    public final boolean c(int i7, int i10, Bundle bundle) {
        return this.f16383b.performAction(i7, i10, bundle);
    }
}
