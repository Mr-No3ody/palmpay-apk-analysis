package Y0;

import com.transsnet.mtn.sdk.http.resp.CommonResult;
import p016b.b$a;
import p134j.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b$a f11269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f11270c;

    public /* synthetic */ a(b$a b_a, e eVar, int i7) {
        this.f11268a = i7;
        this.f11269b = b_a;
        this.f11270c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11268a) {
            case 0:
                this.f11269b.a(this.f11270c.b().getMessage());
                break;
            default:
                this.f11269b.a((CommonResult) this.f11270c.get());
                break;
        }
    }
}
