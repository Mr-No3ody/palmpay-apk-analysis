package p291t5;

import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.uc.webview.export.WebView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f42331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f42332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f42333d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f42338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f42339j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f42334e = a("com.tencent.smtt.sdk.WebView");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f42335f = a("com.uc.webview.export.WebView");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f42336g = a("androidx.recyclerview.widget.RecyclerView");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f42330a = a("androidx.viewpager.widget.ViewPager");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f42337h = a("androidx.swiperefreshlayout.widget.SwipeRefreshLayout");

    static {
        a("androidx.fragment.app.Fragment");
        a("androidx.fragment.app.FragmentActivity");
        a("androidx.appcompat.app.AlertDialog");
        f42331b = a("androidx.appcompat.view.menu.ListMenuItemView");
        f42338i = a("androidx.recyclerview.widget.RecyclerView");
        f42332c = a("androidx.viewpager.widget.ViewPager");
        f42339j = a("androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        a("androidx.fragment.app.Fragment");
        a("androidx.fragment.app.FragmentActivity");
        a("androidx.appcompat.app.AlertDialog");
        f42333d = a("androidx.appcompat.view.menu.ListMenuItemView");
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(Object obj) {
        return f42335f && (obj instanceof WebView);
    }

    public static boolean c(Object obj) {
        return f42334e && (obj instanceof com.tencent.smtt.sdk.WebView);
    }

    public static boolean d(Object obj) {
        if (obj instanceof AdapterView) {
            return true;
        }
        if (f42338i && (obj instanceof RecyclerView)) {
            return true;
        }
        if (f42332c && (obj instanceof ViewPager)) {
            return true;
        }
        if (f42336g && (obj instanceof RecyclerView)) {
            return true;
        }
        return f42330a && (obj instanceof ViewPager);
    }
}
