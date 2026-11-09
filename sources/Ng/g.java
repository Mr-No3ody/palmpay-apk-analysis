package Ng;

import C0.G;
import Pg.m;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f6404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, h hVar, long j6) {
        super(str, true);
        this.f6404e = hVar;
        this.f6405f = j6;
    }

    @Override // Fg.a
    public final long a() {
        l lVar;
        h hVar = this.f6404e;
        synchronized (hVar) {
            try {
                if (!hVar.f6426u && (lVar = hVar.f6417k) != null) {
                    int i7 = hVar.f6428w ? hVar.f6427v : -1;
                    hVar.f6427v++;
                    hVar.f6428w = true;
                    Unit unit = Unit.f38893a;
                    if (i7 != -1) {
                        StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                        sb2.append(hVar.f6410d);
                        sb2.append("ms (after ");
                        hVar.b(new SocketTimeoutException(G.n(i7 - 1, " successful ping/pongs)", sb2)), null);
                    } else {
                        try {
                            m payload = m.f7360e;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            lVar.a(payload, 9);
                        } catch (IOException e10) {
                            hVar.b(e10, null);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6405f;
    }
}
