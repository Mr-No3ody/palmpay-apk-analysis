package p061e3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f36007b;

    public /* synthetic */ e(h hVar, int i7) {
        this.f36006a = i7;
        this.f36007b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36006a) {
            case 0:
                h this$0 = this.f36007b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new g(this$0);
            case 1:
                h this$1 = this.f36007b;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                return this$1.f36017a.get(this$1.f36022f);
            default:
                h this$2 = this.f36007b;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                return this$2.f36017a.get(this$2.f36023g);
        }
    }
}
