package androidx.webkit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import androidx.webkit.internal.o;
import androidx.webkit.internal.q;
import androidx.webkit.internal.r;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f18330a;

    static {
        Uri.parse("*");
        Uri.parse("");
        f18330a = new WeakHashMap();
    }

    public static PackageInfo a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return WebView.getCurrentWebViewPackage();
        }
        try {
            return c();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo b(Context context) {
        PackageInfo packageInfoA = a();
        if (packageInfoA != null) {
            return packageInfoA;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    public static PackageInfo c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static r d(WebView webView) {
        if (!o.f18319l.b()) {
            return new r(q.f18327a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f18330a;
        r rVar = (r) weakHashMap.get(webView);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(q.f18327a.createWebView(webView));
        weakHashMap.put(webView, rVar2);
        return rVar2;
    }
}
