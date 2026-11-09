package p239pf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f41307a;

    public d(Throwable th) {
        this.f41307a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f41307a;
        Throwable th = this.f41307a;
        if (th != obj2) {
            return th != null && th.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return this.f41307a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f41307a + "]";
    }
}
