package com.transsnet.palmpay.managemoney.ui.activity;

import android.widget.TextView;
import com.transsnet.palmpay.managemoney.ui.dialog.PickDateDialogFragment;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements PickDateDialogFragment.OnDateSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreatePlanActivity f32258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f32259b;

    public r(CreatePlanActivity createPlanActivity, long j6) {
        this.f32258a = createPlanActivity;
        this.f32259b = j6;
    }

    @Override // com.transsnet.palmpay.managemoney.ui.dialog.PickDateDialogFragment.OnDateSelectedListener
    public final void onDateSelected(long j6) {
        Date date = new Date(System.currentTimeMillis());
        Date date2 = new Date(j6);
        CreatePlanActivity createPlanActivity = this.f32258a;
        long jR = createPlanActivity.r(date, date2);
        if (jR <= this.f32259b) {
            createPlanActivity.f32075e = jR;
            Lc.a aVar = createPlanActivity.f32071H;
            if (aVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = aVar.f5645q0;
            if (textView != null) {
                textView.setText(createPlanActivity.t(j6));
            }
            Lc.a aVar2 = createPlanActivity.f32071H;
            if (aVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView2 = aVar2.f5641k0;
            if (textView2 != null) {
                textView2.setText(createPlanActivity.s(System.currentTimeMillis(), (createPlanActivity.f32075e * 86400000) + System.currentTimeMillis()) + " (" + jR + " days)");
            }
        }
        createPlanActivity.f32079j = j6;
        createPlanActivity.v();
    }
}
