package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f40862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f40863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f40864h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(String str, u uVar, int i7, Object obj, int i10) {
        super(str, true);
        this.f40861e = i10;
        this.f40862f = uVar;
        this.f40863g = i7;
        this.f40864h = obj;
    }

    @Override // Fg.a
    public final long a() {
        switch (this.f40861e) {
            case 0:
                this.f40862f.f40891p.onReset(this.f40863g, (EnumC1932c) this.f40864h);
                synchronized (this.f40862f) {
                    this.f40862f.f40889k0.remove(Integer.valueOf(this.f40863g));
                    Unit unit = Unit.f38893a;
                }
                return -1L;
            case 1:
                u uVar = this.f40862f;
                try {
                    int i7 = this.f40863g;
                    EnumC1932c statusCode = (EnumC1932c) this.f40864h;
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    uVar.f40878Y.g(i7, statusCode);
                    break;
                } catch (IOException e10) {
                    uVar.b(e10);
                }
                return -1L;
            default:
                this.f40862f.f40891p.onRequest(this.f40863g, (List) this.f40864h);
                try {
                    this.f40862f.f40878Y.g(this.f40863g, EnumC1932c.CANCEL);
                    synchronized (this.f40862f) {
                        this.f40862f.f40889k0.remove(Integer.valueOf(this.f40863g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
        }
    }
}
