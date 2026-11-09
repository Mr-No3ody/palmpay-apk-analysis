package j4;

import com.flexibank.sdk.core.callback.FlexiBankArgument0Callback;
import com.flexibank.sdk.core.callback.FlexiBankArgument1Callback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements FlexiBankArgument0Callback, FlexiBankArgument1Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f38310b;

    public /* synthetic */ q(t tVar, int i7) {
        this.f38309a = i7;
        this.f38310b = tVar;
    }

    @Override // com.flexibank.sdk.core.callback.FlexiBankArgument1Callback
    public void invoke(Object obj) {
        V3.c settingsLauncher = (V3.c) obj;
        Intrinsics.checkNotNullParameter(settingsLauncher, "settingsLauncher");
        this.f38310b.c(settingsLauncher);
    }

    @Override // com.flexibank.sdk.core.callback.FlexiBankArgument0Callback
    public void invoke() {
        switch (this.f38309a) {
            case 0:
                this.f38310b.b();
                break;
            default:
                this.f38310b.c(null);
                break;
        }
    }
}
