package p041ce;

import com.transsnet.palmpay.teller.ui.view.c;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f18945b;

    public /* synthetic */ i(c cVar, int i7) {
        this.f18944a = i7;
        this.f18945b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18944a) {
            case 0:
                return Boolean.valueOf(this.f18945b.f34375b);
            case 1:
                return this.f18945b.f34376c;
            case 2:
                return Boolean.valueOf(this.f18945b.f34375b);
            default:
                return this.f18945b.f34376c;
        }
    }
}
