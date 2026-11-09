package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
final class az implements StandardIntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f22659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt f22660b;

    public az(bn bnVar, bt btVar) {
        this.f22659a = bnVar;
        this.f22660b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l5) throws Exception {
        final long jB = prepareIntegrityTokenRequest.b();
        final long jLongValue = l5.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f22660b;
        final int i7 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jB, jLongValue, i7) { // from class: com.google.android.play.core.integrity.bs

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f22705b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f22706c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f22704a.a(this.f22705b, this.f22706c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jB = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f22659a.e(jB, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f22657a.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
