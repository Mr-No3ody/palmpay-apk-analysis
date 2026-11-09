package p074f0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f36363a;

    public g() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36363a = new f(this);
        } else {
            this.f36363a = new e(this);
        }
    }

    public d a(int i7) {
        return null;
    }

    public d b(int i7) {
        return null;
    }

    public boolean c(int i7, int i10, Bundle bundle) {
        return false;
    }

    public g(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f36363a = accessibilityNodeProvider;
    }
}
