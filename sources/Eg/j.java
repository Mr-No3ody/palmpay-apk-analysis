package Eg;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f2461d;

    public j(l lVar, String key, long j6, ArrayList sources, long[] lengths) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(lengths, "lengths");
        this.f2461d = lVar;
        this.f2458a = key;
        this.f2459b = j6;
        this.f2460c = sources;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f2460c.iterator();
        while (it.hasNext()) {
            Dg.c.c((Source) it.next());
        }
    }
}
