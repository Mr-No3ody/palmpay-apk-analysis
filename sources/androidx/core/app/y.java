package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class y extends D4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IconCompat f16008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IconCompat f16009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16010e;

    @Override // D4.f
    public final void g(H h7) {
        Bitmap bitmapA;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(h7.f15920b).setBigContentTitle(null);
        IconCompat iconCompat = this.f16008c;
        Context context = h7.f15919a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                x.a(bigContentTitle, iconCompat.g(context));
            } else if (iconCompat.e() == 1) {
                IconCompat iconCompat2 = this.f16008c;
                int i7 = iconCompat2.f16047a;
                if (i7 == -1) {
                    Object obj = iconCompat2.f16048b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i7 == 1) {
                    bitmapA = (Bitmap) iconCompat2.f16048b;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f16048b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.f16010e) {
            IconCompat iconCompat3 = this.f16009d;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                w.a(bigContentTitle, iconCompat3.g(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            x.c(bigContentTitle, false);
            x.b(bigContentTitle, null);
        }
    }

    @Override // D4.f
    public final String n() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
