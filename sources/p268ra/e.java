package p268ra;

import androidx.camera.video.internal.c;
import org.greenrobot.eventbus.f;
import ta.q;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f41667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f41668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f41669c;

    public e a() {
        if (this.f41668b == null && this.f41669c == null) {
            throw new IllegalStateException("You need to specify one of the provider configurations. Please see GooglePlayServicesConfiguration and DefaultProviderConfiguration");
        }
        if (this.f41667a == null) {
            c cVar = new c(20);
            cVar.f14622c = new q(c.f41664a, null);
            this.f41667a = cVar.d();
        }
        e eVar = new e();
        eVar.f41667a = this.f41667a;
        eVar.f41668b = this.f41668b;
        eVar.f41669c = this.f41669c;
        return eVar;
    }
}
