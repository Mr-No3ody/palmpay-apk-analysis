package A1;

import android.content.Context;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Transformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f30b = new e();

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource transform(Context context, Resource resource, int i7, int i10) {
        return resource;
    }
}
