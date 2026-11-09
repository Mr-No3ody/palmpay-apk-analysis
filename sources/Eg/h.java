package Eg;

import Pg.o;
import java.io.IOException;
import kotlin.Unit;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f2447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Source source, l lVar, i iVar) {
        super(source);
        this.f2446b = lVar;
        this.f2447c = iVar;
    }

    @Override // Pg.o, okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f2445a) {
            return;
        }
        this.f2445a = true;
        l lVar = this.f2446b;
        i iVar = this.f2447c;
        synchronized (lVar) {
            try {
                int i7 = iVar.f2455h - 1;
                iVar.f2455h = i7;
                if (i7 == 0 && iVar.f2453f) {
                    lVar.k(iVar);
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
