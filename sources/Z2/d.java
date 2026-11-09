package Z2;

import com.facebook.imagepipeline.cache.CountingMemoryCache;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M2.a f11505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountingMemoryCache f11506b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f11508d = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11507c = new b(this);

    public d(M2.a aVar, CountingMemoryCache countingMemoryCache) {
        this.f11505a = aVar;
        this.f11506b = countingMemoryCache;
    }
}
