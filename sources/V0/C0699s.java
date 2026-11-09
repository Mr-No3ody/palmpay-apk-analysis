package V0;

import android.app.Notification;

/* JADX INFO: renamed from: V0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0699s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f9971c;

    public C0699s(int i7, int i10, Notification notification) {
        this.f9969a = i7;
        this.f9971c = notification;
        this.f9970b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0699s.class != obj.getClass()) {
            return false;
        }
        C0699s c0699s = (C0699s) obj;
        if (this.f9969a == c0699s.f9969a && this.f9970b == c0699s.f9970b) {
            return this.f9971c.equals(c0699s.f9971c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9971c.hashCode() + (((this.f9969a * 31) + this.f9970b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f9969a + ", mForegroundServiceType=" + this.f9970b + ", mNotification=" + this.f9971c + '}';
    }
}
