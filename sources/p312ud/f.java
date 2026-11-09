package p312ud;

import M1.j;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferHomeResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateActivity f42971a;

    public f(ScheduleTransferCreateActivity scheduleTransferCreateActivity) {
        this.f42971a = scheduleTransferCreateActivity;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public final void onItemClick(j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42971a;
        ScheduleTransferHomeResp.Payment payment = (ScheduleTransferHomeResp.Payment) ScheduleTransferCreateActivity.n(scheduleTransferCreateActivity).getItem(i7);
        if (Intrinsics.c(payment.getPaymentType(), scheduleTransferCreateActivity.f33364v0)) {
            return;
        }
        scheduleTransferCreateActivity.f33364v0 = payment.getPaymentType();
        Iterator<Object> it = ScheduleTransferCreateActivity.n(scheduleTransferCreateActivity).getData().iterator();
        while (it.hasNext()) {
            ScheduleTransferHomeResp.Payment payment2 = (ScheduleTransferHomeResp.Payment) it.next();
            payment2.setDefaultOption(Boolean.valueOf(Intrinsics.c(payment2.getPaymentType(), scheduleTransferCreateActivity.f33364v0)));
        }
        ScheduleTransferCreateActivity.n(scheduleTransferCreateActivity).notifyDataSetChanged();
    }
}
