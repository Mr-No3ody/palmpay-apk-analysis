package I1;

import J1.g;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3964b;

    public d(Object obj) {
        g.c(obj, "Argument must not be null");
        this.f3964b = obj;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3964b.equals(((d) obj).f3964b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f3964b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f3964b + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f3964b.toString().getBytes(Key.f20507a));
    }
}
