package T5;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f9003b = new i("sig");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f9004c = new i("enc");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9005a;

    public i(String str) {
        this.f9005a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return Objects.equals(this.f9005a, ((i) obj).f9005a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9005a);
    }

    public final String toString() {
        return this.f9005a;
    }
}
