package p377z5;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import com.google.android.material.color.a;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f44462h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f44463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f44464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f44468f = new h(this, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f44469g = new h(this, 1);

    public i(ContextWrapper contextWrapper, b bVar) {
        this.f44463a = bVar;
        this.f44465c = contextWrapper.getPackageName();
    }

    public static void a(i iVar, View view) {
        AccessibilityEvent accessibilityEventObtain;
        iVar.getClass();
        Context context = view.getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityEventObtain = a.h();
                accessibilityEventObtain.setEventType(64);
            } else {
                accessibilityEventObtain = AccessibilityEvent.obtain(64);
            }
            accessibilityEventObtain.setClassName(Toast.class.getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            view.dispatchPopulateAccessibilityEvent(accessibilityEventObtain);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    public final void b() {
        if (this.f44466d) {
            Handler handler = f44462h;
            handler.removeCallbacks(this.f44468f);
            boolean z3 = Looper.myLooper() == Looper.getMainLooper();
            h hVar = this.f44469g;
            if (z3) {
                hVar.run();
            } else {
                handler.removeCallbacks(hVar);
                handler.post(hVar);
            }
        }
    }
}
