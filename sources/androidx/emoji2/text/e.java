package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f16883a;

    public e(f fVar) {
        this.f16883a = fVar;
    }

    @Override // androidx.emoji2.text.h
    public final void a(Throwable th) {
        this.f16883a.f16884a.f(th);
    }

    @Override // androidx.emoji2.text.h
    public final void b(O2.a aVar) {
        f fVar = this.f16883a;
        fVar.f16886c = aVar;
        O2.a aVar2 = fVar.f16886c;
        i iVar = fVar.f16884a;
        fVar.f16885b = new p(aVar2, iVar.f16895g, iVar.f16897i, Build.VERSION.SDK_INT >= 34 ? l.a() : G8.a.v());
        i iVar2 = fVar.f16884a;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        iVar2.f16889a.writeLock().lock();
        try {
            iVar2.f16891c = 1;
            arrayList.addAll(iVar2.f16890b);
            iVar2.f16890b.clear();
            iVar2.f16889a.writeLock().unlock();
            iVar2.f16892d.post(new androidx.core.provider.a(arrayList, iVar2.f16891c, (Throwable) null));
        } catch (Throwable th) {
            iVar2.f16889a.writeLock().unlock();
            throw th;
        }
    }
}
