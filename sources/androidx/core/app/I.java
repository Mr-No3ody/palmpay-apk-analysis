package androidx.core.app;

import android.app.Notification;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

/* JADX INFO: loaded from: classes.dex */
public final class I implements NotificationManagerCompat$Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f15925c;

    public I(String str, int i7, Notification notification) {
        this.f15923a = str;
        this.f15924b = i7;
        this.f15925c = notification;
    }

    @Override // androidx.core.app.NotificationManagerCompat$Task
    public final void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
        iNotificationSideChannel.notify(this.f15923a, this.f15924b, null, this.f15925c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f15923a);
        sb2.append(", id:");
        return C0.G.n(this.f15924b, ", tag:null]", sb2);
    }
}
