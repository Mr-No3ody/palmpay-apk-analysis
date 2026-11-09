package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15897a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f15901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f15902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f15903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f15904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15906j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public D4.f f15908l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f15911o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RemoteViews f15914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RemoteViews f15915s;
    public String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f15916u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Notification f15917v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f15918w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15898b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15899c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15900d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15907k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15909m = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15912p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15913q = 0;

    public B(Context context, String str) {
        Notification notification = new Notification();
        this.f15917v = notification;
        this.f15897a = context;
        this.t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f15906j = 0;
        this.f15918w = new ArrayList();
        this.f15916u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        H h7 = new H(this);
        B b7 = h7.f15921c;
        D4.f fVar = b7.f15908l;
        if (fVar != null) {
            fVar.g(h7);
        }
        int i7 = Build.VERSION.SDK_INT;
        Notification.Builder builder = h7.f15920b;
        Notification notificationBuild = i7 >= 26 ? builder.build() : builder.build();
        RemoteViews remoteViews = b7.f15914r;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (fVar != null) {
            b7.f15908l.getClass();
        }
        if (fVar != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", fVar.n());
        }
        return notificationBuild;
    }

    public final void c(int i7) {
        Notification notification = this.f15917v;
        notification.defaults = i7;
        if ((i7 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i7, boolean z3) {
        Notification notification = this.f15917v;
        if (z3) {
            notification.flags = i7 | notification.flags;
        } else {
            notification.flags = (~i7) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f15897a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(W.b.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(W.b.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f16046k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f16048b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f15904h = iconCompat;
    }

    public final void f(D4.f fVar) {
        if (this.f15908l != fVar) {
            this.f15908l = fVar;
            if (((B) fVar.f1592b) != this) {
                fVar.f1592b = this;
                f(fVar);
            }
        }
    }
}
