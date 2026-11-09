package I1;

import J1.o;
import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f3961c;

    public a(int i7, Key key) {
        this.f3960b = i7;
        this.f3961c = key;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3960b == aVar.f3960b && this.f3961c.equals(aVar.f3961c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return o.h(this.f3960b, this.f3961c);
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f3961c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3960b).array());
    }
}
