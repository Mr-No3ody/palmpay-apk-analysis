package p312ud;

import L6.b;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p118hf.a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferOrderDetailActivity f42982b;

    public /* synthetic */ l(ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity, int i7) {
        this.f42981a = i7;
        this.f42982b = scheduleTransferOrderDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity = this.f42982b;
        IconicsDrawable apply = (IconicsDrawable) obj;
        switch (this.f42981a) {
            case 0:
                int i7 = ScheduleTransferOrderDetailActivity.f33409p;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                a.I(apply, 16);
                D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorTextAssist, scheduleTransferOrderDetailActivity));
                break;
            default:
                int i10 = ScheduleTransferOrderDetailActivity.f33409p;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                a.I(apply, 16);
                D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorTextAssist, scheduleTransferOrderDetailActivity));
                break;
        }
        return Unit.f38893a;
    }
}
