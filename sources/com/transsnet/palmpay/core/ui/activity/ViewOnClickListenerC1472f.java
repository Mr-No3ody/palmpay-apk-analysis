package com.transsnet.palmpay.core.ui.activity;

import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.core.ui.activity.AddNewCardWithPaymentActivity.CheckCvvDialog;
import com.transsnet.palmpay.core.ui.dialog.OcSwitchRouterDialog;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1472f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddNewCardWithPaymentActivity f27765b;

    public /* synthetic */ ViewOnClickListenerC1472f(AddNewCardWithPaymentActivity addNewCardWithPaymentActivity, int i7) {
        this.f27764a = i7;
        this.f27765b = addNewCardWithPaymentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        MonthPickDialog monthPickDialog;
        AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27765b;
        switch (this.f27764a) {
            case 0:
                int i10 = AddNewCardWithPaymentActivity.f27421r0;
                addNewCardWithPaymentActivity.o();
                break;
            case 1:
                int i11 = AddNewCardWithPaymentActivity.f27421r0;
                new OcSwitchRouterDialog(addNewCardWithPaymentActivity, OcSwitchRouterDialog.SWITCH_BANK_ACCOUNT, addNewCardWithPaymentActivity.f27444q0).show();
                break;
            case 2:
                MonthPickDialog monthPickDialog2 = addNewCardWithPaymentActivity.f27446w;
                if (monthPickDialog2 != null) {
                    monthPickDialog2.show();
                }
                int i12 = addNewCardWithPaymentActivity.f27422A;
                if (i12 > 0 && (i7 = addNewCardWithPaymentActivity.f27423B) > 0 && (monthPickDialog = addNewCardWithPaymentActivity.f27446w) != null) {
                    monthPickDialog.setNowPickDate(i12, i7);
                }
                TextView textView = (TextView) addNewCardWithPaymentActivity.f27437g.getValue();
                Intrinsics.checkNotNullExpressionValue(textView, "<get-tvError2>(...)");
                p220oa.h.s(textView, false);
                break;
            case 3:
                int i13 = AddNewCardWithPaymentActivity.f27421r0;
                addNewCardWithPaymentActivity.onBackPressed();
                break;
            case 4:
                int i14 = AddNewCardWithPaymentActivity.f27421r0;
                addNewCardWithPaymentActivity.new CheckCvvDialog(addNewCardWithPaymentActivity).show();
                break;
            default:
                O6.d dVar = addNewCardWithPaymentActivity.f27430Y;
                if (dVar != null) {
                    SPUtils.getInstance(addNewCardWithPaymentActivity.f27427M).remove(addNewCardWithPaymentActivity.f27428Q);
                    dVar.dismiss();
                }
                break;
        }
    }
}
