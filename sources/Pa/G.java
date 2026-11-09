package Pa;

import com.didiglobal.booster.instrument.ShadowThread;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f7014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f7015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f7016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f7017d;

    public G(File cacheDir, int i7) {
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
                this.f7014a = cacheDir;
                Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
                Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(...)");
                this.f7017d = mapSynchronizedMap;
                this.f7015b = new AtomicLong();
                this.f7016c = new AtomicInteger();
                ShadowThread.setThreadName(new ShadowThread(new androidx.customview.widget.e(this, 28), "\u200bcom.flexibank.sdk.core.util.FlexiBankPalmPayCache$BookCacheManager"), "\u200bcom.flexibank.sdk.core.util.FlexiBankPalmPayCache$BookCacheManager").start();
                break;
            default:
                this.f7017d = Collections.synchronizedMap(new HashMap());
                this.f7014a = cacheDir;
                this.f7015b = new AtomicLong();
                this.f7016c = new AtomicInteger();
                new Thread(new B5.c(this, 17)).start();
                break;
        }
    }
}
