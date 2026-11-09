package androidx.camera.core.imagecapture;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static Context a(int i7, Context context) {
        return context.createDeviceContext(i7);
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float c(VelocityTracker velocityTracker, int i7) {
        return velocityTracker.getAxisVelocity(i7);
    }

    public static void d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int f(Context context) {
        return context.getDeviceId();
    }

    public static int g(Context context) {
        return context.getDeviceId();
    }

    public static int h(ViewConfiguration viewConfiguration, int i7, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i7, i10, i11);
    }

    public static int i(ViewConfiguration viewConfiguration, int i7, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i7, i10, i11);
    }

    public static boolean j(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void l(TextView textView, int i7, float f10) {
        textView.setLineHeight(i7, f10);
    }
}
