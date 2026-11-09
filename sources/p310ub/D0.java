package p310ub;

import Ya.e;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcProtocolActivity f42747b;

    public /* synthetic */ D0(OcProtocolActivity ocProtocolActivity, int i7) {
        this.f42746a = i7;
        this.f42747b = ocProtocolActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OcProtocolActivity ocProtocolActivity = this.f42747b;
        switch (this.f42746a) {
            case 0:
                OcProtocolActivity.a aVar = OcProtocolActivity.f29647H;
                return (PpTitleBar) ocProtocolActivity.findViewById(e.protocol_mtb);
            case 1:
                OcProtocolActivity.a aVar2 = OcProtocolActivity.f29647H;
                ocProtocolActivity.n();
                return Unit.f38893a;
            default:
                OcProtocolActivity.a aVar3 = OcProtocolActivity.f29647H;
                ocProtocolActivity.n();
                return Unit.f38893a;
        }
    }
}
