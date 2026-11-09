package Pa;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.FirebaseInitTask;
import com.transsnet.palmpay.core.util.CustomGioOkhttpModule;
import okhttp3.Call;

/* JADX INFO: renamed from: Pa.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0519p implements Call.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7131a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile okhttp3.U f7132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public okhttp3.U f7133c;

    @Override // okhttp3.Call.Factory
    public final Call newCall(okhttp3.Y y8) {
        okhttp3.U u6;
        okhttp3.U u10 = this.f7132b;
        if (u10 == null) {
            synchronized (this.f7131a) {
                try {
                    if (this.f7132b != null) {
                        u6 = this.f7132b;
                    } else if (FirebaseInitTask.isReady()) {
                        this.f7132b = CustomGioOkhttpModule.a(BaseApplication.get().getHttpClient());
                        this.f7133c = null;
                        u6 = this.f7132b;
                    } else {
                        if (this.f7133c == null) {
                            this.f7133c = CustomGioOkhttpModule.a(null);
                        }
                        u6 = this.f7133c;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            u10 = u6;
        }
        return u10.newCall(y8);
    }
}
