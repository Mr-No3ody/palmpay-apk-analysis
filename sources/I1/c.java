package I1;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f3963b = new c();

    public final String toString() {
        return "EmptySignature";
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
