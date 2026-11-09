package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.palmpay.lib.webview.container.PPWebActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12039a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12040b = Color.argb(128, 27, 27, 27);

    public static void a(PPWebActivity pPWebActivity) {
        EdgeToEdgeImpl qVar;
        L l5 = M.f12010e;
        M statusBarStyle = L.auto$default(l5, 0, 0, null, 4, null);
        M navigationBarStyle = L.auto$default(l5, f12039a, f12040b, null, 4, null);
        Intrinsics.checkNotNullParameter(pPWebActivity, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = pPWebActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Function1 function1 = statusBarStyle.f12014d;
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
        Function1 function2 = navigationBarStyle.f12014d;
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) function2.invoke(resources2)).booleanValue();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            qVar = new t();
        } else if (i7 >= 29) {
            qVar = new s();
        } else if (i7 >= 28) {
            qVar = new r();
        } else {
            qVar = i7 >= 26 ? new q() : new p();
        }
        EdgeToEdgeImpl edgeToEdgeImpl = qVar;
        Window window = pPWebActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        edgeToEdgeImpl.setUp(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = pPWebActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        edgeToEdgeImpl.adjustLayoutInDisplayCutoutMode(window2);
    }
}
