package p318v1;

import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        ShadowThread shadowThread;
        shadowThread = new ShadowThread(runnable, "glide-disk-lru-cache-thread", "\u200bcom.bumptech.glide.disklrucache.DiskLruCache$DiskLruCacheThreadFactory");
        shadowThread.setPriority(1);
        return shadowThread;
    }
}
