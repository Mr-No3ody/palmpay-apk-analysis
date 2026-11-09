package Z;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void e(Window window, boolean z3) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-257) : systemUiVisibility | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        window.setDecorFitsSystemWindows(z3);
    }

    public static void f(Window window, boolean z3) {
        window.setDecorFitsSystemWindows(z3);
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
