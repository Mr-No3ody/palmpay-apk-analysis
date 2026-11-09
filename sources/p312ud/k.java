package p312ud;

import M1.j;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferHomeResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateV2Activity f42980a;

    public k(ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity) {
        this.f42980a = scheduleTransferCreateV2Activity;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public final void onItemClick(j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42980a;
        ScheduleTransferHomeResp.Payment payment = (ScheduleTransferHomeResp.Payment) ScheduleTransferCreateV2Activity.n(scheduleTransferCreateV2Activity).getItem(i7);
        if (Intrinsics.c(payment.getPaymentType(), scheduleTransferCreateV2Activity.f33380L)) {
            return;
        }
        scheduleTransferCreateV2Activity.f33380L = payment.getPaymentType();
        Iterator<Object> it = ScheduleTransferCreateV2Activity.n(scheduleTransferCreateV2Activity).getData().iterator();
        while (it.hasNext()) {
            ScheduleTransferHomeResp.Payment payment2 = (ScheduleTransferHomeResp.Payment) it.next();
            payment2.setDefaultOption(Boolean.valueOf(Intrinsics.c(payment2.getPaymentType(), scheduleTransferCreateV2Activity.f33380L)));
        }
        ScheduleTransferCreateV2Activity.n(scheduleTransferCreateV2Activity).notifyDataSetChanged();
    }
}
