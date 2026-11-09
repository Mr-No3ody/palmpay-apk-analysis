package com.transsnet.palmpay.credit.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g1 implements OnItemChildClickListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectKeepTimeDialogFragment f30117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f30118b;

    public /* synthetic */ g1(SelectKeepTimeDialogFragment selectKeepTimeDialogFragment, TextView textView) {
        this.f30117a = selectKeepTimeDialogFragment;
        this.f30118b = textView;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j adapter, View view, int i7) {
        CLRepaymentPlanData cLRepaymentPlanData;
        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30117a;
        List list = (List) selectKeepTimeDialogFragment.f30024H.getValue();
        if ((list == null || (cLRepaymentPlanData = (CLRepaymentPlanData) list.get(i7)) == null) ? false : Intrinsics.c(cLRepaymentPlanData.getAvailable(), Boolean.FALSE)) {
            return;
        }
        p351xb.p pVarJ = selectKeepTimeDialogFragment.j();
        pVarJ.f43803a = Integer.valueOf(i7);
        pVarJ.notifyDataSetChanged();
        Integer num = selectKeepTimeDialogFragment.j().f43803a;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer numK = selectKeepTimeDialogFragment.k();
        String string = "";
        if (numK != null && numK.intValue() == 2 && iIntValue < selectKeepTimeDialogFragment.j().getItemCount() && iIntValue > -1) {
            string = selectKeepTimeDialogFragment.getString(Ya.g.cs_cl_per_period_with_unit, com.airbnb.lottie.model.layer.d.n(new Object[]{((CLRepaymentPlanData) selectKeepTimeDialogFragment.j().getItem(iIntValue)).getTermSpan(), TextUtils.equals("D", ((CLRepaymentPlanData) selectKeepTimeDialogFragment.j().getItem(iIntValue)).getTermSpanUnit()) ? "days" : "months"}, 2, "%d %s", "format(...)"));
        }
        this.f30118b.setText(string);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j adapter, View view, int i7) {
        CLRepaymentPlanData cLRepaymentPlanData;
        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30117a;
        List list = (List) selectKeepTimeDialogFragment.f30024H.getValue();
        if ((list == null || (cLRepaymentPlanData = (CLRepaymentPlanData) list.get(i7)) == null) ? false : Intrinsics.c(cLRepaymentPlanData.getAvailable(), Boolean.FALSE)) {
            return;
        }
        p351xb.p pVarJ = selectKeepTimeDialogFragment.j();
        pVarJ.f43803a = Integer.valueOf(i7);
        pVarJ.notifyDataSetChanged();
        Integer num = selectKeepTimeDialogFragment.j().f43803a;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer numK = selectKeepTimeDialogFragment.k();
        String string = "";
        if (numK != null && numK.intValue() == 2 && iIntValue < selectKeepTimeDialogFragment.j().getItemCount() && iIntValue > -1) {
            string = selectKeepTimeDialogFragment.getString(Ya.g.cs_cl_per_period_with_unit, com.airbnb.lottie.model.layer.d.n(new Object[]{((CLRepaymentPlanData) selectKeepTimeDialogFragment.j().getItem(iIntValue)).getTermSpan(), TextUtils.equals("D", ((CLRepaymentPlanData) selectKeepTimeDialogFragment.j().getItem(iIntValue)).getTermSpanUnit()) ? "days" : "months"}, 2, "%d %s", "format(...)"));
        }
        this.f30118b.setText(string);
    }
}
