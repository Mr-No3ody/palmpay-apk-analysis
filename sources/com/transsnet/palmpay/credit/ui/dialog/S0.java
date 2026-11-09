package com.transsnet.palmpay.credit.ui.dialog;

import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener;
import com.transsnet.palmpay.credit.ui.view.BorrowCLInfoView;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class S0 implements OneTouchBorrowManager$OneTouchBorrowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenCashSuccDialog f30021a;

    public S0(OpenCashSuccDialog openCashSuccDialog) {
        this.f30021a = openCashSuccDialog;
    }

    @Override // com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener
    public final void onOneTouchBorrowCreateOrderSuccess() {
        PpButton ppButton;
        OpenCashSuccDialog openCashSuccDialog = this.f30021a;
        openCashSuccDialog.dismiss();
        OneTouchBorrowView oneTouchBorrowView = openCashSuccDialog.oneTouchBorrowView;
        if (oneTouchBorrowView == null || (ppButton = oneTouchBorrowView.f30649d) == null) {
            return;
        }
        ppButton.b(false);
    }

    @Override // com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener
    public final void onOneTouchBorrowInfoFail() {
        PpButton ppButton;
        OpenCashSuccDialog openCashSuccDialog = this.f30021a;
        TextView textView = openCashSuccDialog.text2;
        if (textView != null) {
            p220oa.h.s(textView, true);
        }
        TextView textView2 = openCashSuccDialog.btnTv;
        if (textView2 != null) {
            p220oa.h.s(textView2, true);
        }
        OneTouchBorrowView oneTouchBorrowView = openCashSuccDialog.oneTouchBorrowView;
        if (oneTouchBorrowView != null) {
            p220oa.h.s(oneTouchBorrowView, false);
        }
        OneTouchBorrowView oneTouchBorrowView2 = openCashSuccDialog.oneTouchBorrowView;
        if (oneTouchBorrowView2 == null || (ppButton = oneTouchBorrowView2.f30649d) == null) {
            return;
        }
        ppButton.b(false);
    }

    @Override // com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener
    public final void onOneTouchBorrowInfoSuccess(CLRepaymentPlanData selectPlan) {
        BorrowCLInfoView borrowCLInfoView;
        Intrinsics.checkNotNullParameter(selectPlan, "selectPlan");
        OpenCashSuccDialog openCashSuccDialog = this.f30021a;
        TextView textView = openCashSuccDialog.text2;
        if (textView != null) {
            p220oa.h.s(textView, false);
        }
        TextView textView2 = openCashSuccDialog.btnTv;
        if (textView2 != null) {
            p220oa.h.s(textView2, false);
        }
        OneTouchBorrowView oneTouchBorrowView = openCashSuccDialog.oneTouchBorrowView;
        if (oneTouchBorrowView != null) {
            p220oa.h.s(oneTouchBorrowView, true);
        }
        OneTouchBorrowView oneTouchBorrowView2 = openCashSuccDialog.oneTouchBorrowView;
        if (oneTouchBorrowView2 != null && (borrowCLInfoView = oneTouchBorrowView2.f30650e) != null) {
            borrowCLInfoView.d(selectPlan);
        }
        OneTouchBorrowView oneTouchBorrowView3 = openCashSuccDialog.oneTouchBorrowView;
        if (oneTouchBorrowView3 != null) {
            oneTouchBorrowView3.setOneTouchBorrowListener(new R0(openCashSuccDialog, selectPlan));
        }
    }
}
