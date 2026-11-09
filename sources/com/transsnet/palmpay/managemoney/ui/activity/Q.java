package com.transsnet.palmpay.managemoney.ui.activity;

import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements PickStateDialogFragment.OnAreaSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectStateActivity f32184a;

    public Q(SelectStateActivity selectStateActivity) {
        this.f32184a = selectStateActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment.OnAreaSelectedListener
    public final void onAreaSelected(Object obj) {
        SelectStateActivity selectStateActivity = this.f32184a;
        selectStateActivity.f32190f = (GetBeforeOrderResp.StateInfo) obj;
        IconicsTextView iconicsTextViewN = selectStateActivity.n();
        GetBeforeOrderResp.StateInfo stateInfo = selectStateActivity.f32190f;
        iconicsTextViewN.setText(stateInfo != null ? stateInfo.getStateName() : null);
    }
}
