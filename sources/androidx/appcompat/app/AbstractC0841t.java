package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode$Callback;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.appcompat.app.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0841t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f12314a = new r(new ExecutorC0840s());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f12315b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static androidx.core.os.h f12316c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static androidx.core.os.h f12317d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f12318e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f12319f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M.g f12320g = new M.g(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f12321i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f12322j = new Object();

    public static boolean c(Context context) {
        if (f12318e == null) {
            try {
                int i7 = N.f12159a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) N.class), M.a() | 128).metaData;
                if (bundle != null) {
                    f12318e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f12318e = Boolean.FALSE;
            }
        }
        return f12318e.booleanValue();
    }

    public static void f(I i7) {
        synchronized (f12321i) {
            try {
                M.g gVar = f12320g;
                gVar.getClass();
                M.b bVar = new M.b(gVar);
                while (bVar.hasNext()) {
                    AbstractC0841t abstractC0841t = (AbstractC0841t) ((WeakReference) bVar.next()).get();
                    if (abstractC0841t == i7 || abstractC0841t == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k(int i7) {
        if ((i7 == -1 || i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3) && f12315b != i7) {
            f12315b = i7;
            synchronized (f12321i) {
                try {
                    M.g gVar = f12320g;
                    gVar.getClass();
                    M.b bVar = new M.b(gVar);
                    while (bVar.hasNext()) {
                        AbstractC0841t abstractC0841t = (AbstractC0841t) ((WeakReference) bVar.next()).get();
                        if (abstractC0841t != null) {
                            ((I) abstractC0841t).o(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract View a(View view, String str, Context context, AttributeSet attributeSet);

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i7);

    public abstract void h(int i7);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(int i7);

    public abstract void m(CharSequence charSequence);

    public abstract p343x.a n(ActionMode$Callback actionMode$Callback);

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }
}
