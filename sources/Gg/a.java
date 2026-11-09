package Gg;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.U;
import okhttp3.e0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3406a = new a();

    @Override // okhttp3.Interceptor
    public final e0 intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Hg.f chain2 = (Hg.f) chain;
        i iVar = chain2.f3934a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (iVar) {
            if (!iVar.f3437A) {
                throw new IllegalStateException("released");
            }
            if (iVar.f3453w) {
                throw new IllegalStateException("Check failed.");
            }
            if (iVar.f3452v) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f38893a;
        }
        e eVar = iVar.f3449j;
        Intrinsics.e(eVar);
        U client = iVar.f3441a;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            D.d dVar = new D.d(iVar, iVar.f3445e, eVar, eVar.a(chain2.f3939f, client.f40658f, !Intrinsics.c(chain2.f3938e.f40686b, "GET"), chain2.f3940g, chain2.f3941h).j(client, chain2));
            iVar.t = dVar;
            iVar.f3439C = dVar;
            synchronized (iVar) {
                iVar.f3452v = true;
                iVar.f3453w = true;
            }
            if (iVar.f3438B) {
                throw new IOException("Canceled");
            }
            return Hg.f.a(chain2, 0, dVar, null, 0, 0, 0, 61).proceed(chain2.f3938e);
        } catch (q e10) {
            eVar.c(e10.f3484b);
            throw e10;
        } catch (IOException e11) {
            eVar.c(e11);
            throw new q(e11);
        }
    }
}
