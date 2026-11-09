package H1;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteViews f3591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Notification f3594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3595e;

    public h(Context context, int i7, RemoteViews remoteViews, Notification notification, int i10) {
        super(0);
        J1.g.c(context, "Context must not be null!");
        this.f3592b = context;
        J1.g.c(notification, "Notification object can not be null!");
        this.f3594d = notification;
        this.f3591a = remoteViews;
        this.f3595e = i7;
        this.f3593c = i10;
    }

    public final void a(Bitmap bitmap) {
        this.f3591a.setImageViewBitmap(this.f3595e, bitmap);
        NotificationManager notificationManager = (NotificationManager) this.f3592b.getSystemService("notification");
        J1.g.c(notificationManager, "Argument must not be null");
        notificationManager.notify(null, this.f3593c, this.f3594d);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
        a(null);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        a((Bitmap) obj);
    }
}
