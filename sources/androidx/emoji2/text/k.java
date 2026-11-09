package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f16902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f16903b;

    public k(h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f16902a = hVar;
        this.f16903b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.h
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f16903b;
        try {
            this.f16902a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.h
    public final void b(O2.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f16903b;
        try {
            this.f16902a.b(aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
