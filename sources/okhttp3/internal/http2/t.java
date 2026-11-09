package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f40865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f40867g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, u uVar, int i7, long j6) {
        super(str, true);
        this.f40865e = uVar;
        this.f40866f = i7;
        this.f40867g = j6;
    }

    @Override // Fg.a
    public final long a() {
        u uVar = this.f40865e;
        try {
            uVar.f40878Y.h(this.f40866f, this.f40867g);
            return -1L;
        } catch (IOException e10) {
            uVar.b(e10);
            return -1L;
        }
    }
}
