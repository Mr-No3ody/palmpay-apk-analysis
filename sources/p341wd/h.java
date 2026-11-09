package p341wd;

import Pa.i0;
import Pa.r0;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.adjust.sdk.network.ErrorCodes;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonBooleanResult;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankAccountActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p355xf.l;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableDetailActivity f43418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableDetailActivity f43419c;

    public /* synthetic */ h(ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity, ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity2, int i7) {
        this.f43417a = i7;
        this.f43418b = scheduleTransferForBankUnstableDetailActivity;
        this.f43419c = scheduleTransferForBankUnstableDetailActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T t;
        Integer bookStatus;
        switch (this.f43417a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = this.f43418b;
                if (z3) {
                    scheduleTransferForBankUnstableDetailActivity.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    scheduleTransferForBankUnstableDetailActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (!commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
                        ToastUtils.showShort(commonBeanResult.getRespMsg(), new Object[0]);
                    } else {
                        ScheduleTransferForBankUnstableOrderResp scheduleTransferForBankUnstableOrderResp = (ScheduleTransferForBankUnstableOrderResp) t;
                        ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity2 = this.f43419c;
                        scheduleTransferForBankUnstableDetailActivity2.f33440j = scheduleTransferForBankUnstableOrderResp;
                        t tVar = scheduleTransferForBankUnstableDetailActivity2.f33435d;
                        Object value = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ((LinearLayout) value).removeAllViews();
                        t tVar2 = scheduleTransferForBankUnstableDetailActivity2.f33436e;
                        Object value2 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((LinearLayout) value2).removeAllViews();
                        scheduleTransferForBankUnstableDetailActivity2.o().l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, scheduleTransferForBankUnstableDetailActivity2, scheduleTransferForBankUnstableOrderResp.getBookStatusDesc(), 0.0f, 4, null));
                        scheduleTransferForBankUnstableDetailActivity2.o().k(scheduleTransferForBankUnstableOrderResp.getBookStatusDesc());
                        p220oa.h.c(scheduleTransferForBankUnstableDetailActivity2.o().getOrderStatusArrow());
                        OrderResultViewReceiptModel orderResultViewReceiptModelN = scheduleTransferForBankUnstableDetailActivity2.n();
                        Integer bookStatus2 = scheduleTransferForBankUnstableOrderResp.getBookStatus();
                        p220oa.h.s(orderResultViewReceiptModelN, (bookStatus2 != null && bookStatus2.intValue() == 1) || ((bookStatus = scheduleTransferForBankUnstableOrderResp.getBookStatus()) != null && bookStatus.intValue() == 2));
                        Object value3 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        p220oa.h.s((LinearLayout) value3, true);
                        ScheduleTransferForBankUnstableOrderResp scheduleTransferForBankUnstableOrderResp2 = scheduleTransferForBankUnstableDetailActivity2.f33440j;
                        if (scheduleTransferForBankUnstableOrderResp2 != null) {
                            scheduleTransferForBankUnstableDetailActivity2.o().o(scheduleTransferForBankUnstableDetailActivity2.getString(p159kd.h.sm_bill_detail_transfer_to_s_short, scheduleTransferForBankUnstableOrderResp2.getPayeeFullName()));
                            scheduleTransferForBankUnstableDetailActivity2.o().f(scheduleTransferForBankUnstableOrderResp2.getPayeeBankUrl());
                            OrderResultHeaderModel orderResultHeaderModelO = scheduleTransferForBankUnstableDetailActivity2.o();
                            Long amount = scheduleTransferForBankUnstableOrderResp2.getAmount();
                            orderResultHeaderModelO.c(r0.B(amount != null ? amount.longValue() : 0L, false));
                            if (!TextUtils.isEmpty(scheduleTransferForBankUnstableOrderResp2.getPayeeBankName())) {
                                ScheduleTransferForBankUnstableDetailActivity.m(scheduleTransferForBankUnstableDetailActivity2, scheduleTransferForBankUnstableDetailActivity2.getString(k.core_recipient_bank), scheduleTransferForBankUnstableOrderResp2.getPayeeBankName());
                            }
                            if (!TextUtils.isEmpty(scheduleTransferForBankUnstableOrderResp2.getPayeeBankCardNo())) {
                                ScheduleTransferForBankUnstableDetailActivity.m(scheduleTransferForBankUnstableDetailActivity2, scheduleTransferForBankUnstableDetailActivity2.getString(k.core_recipient_account_number), i0.o(scheduleTransferForBankUnstableOrderResp2.getPayeeBankCardNo()));
                            }
                            if (!TextUtils.isEmpty(scheduleTransferForBankUnstableOrderResp2.getBookNo())) {
                                OrderResultItemModel orderResultItemModel = new OrderResultItemModel(scheduleTransferForBankUnstableDetailActivity2, ErrorCodes.MALFORMED_URL_EXCEPTION, scheduleTransferForBankUnstableDetailActivity2.getString(k.core_receipt_transaction_id), scheduleTransferForBankUnstableOrderResp2.getBookNo());
                                Object value4 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                                ((LinearLayout) value4).addView(orderResultItemModel);
                            }
                            if (!TextUtils.isEmpty(scheduleTransferForBankUnstableOrderResp2.getPaymentTypeDesc())) {
                                ScheduleTransferForBankUnstableDetailActivity.m(scheduleTransferForBankUnstableDetailActivity2, scheduleTransferForBankUnstableDetailActivity2.getString(k.core_payment_type), scheduleTransferForBankUnstableOrderResp2.getPaymentTypeDesc());
                            }
                            if (!TextUtils.isEmpty(scheduleTransferForBankUnstableOrderResp2.getPaymentMethodDesc())) {
                                ScheduleTransferForBankUnstableDetailActivity.m(scheduleTransferForBankUnstableDetailActivity2, scheduleTransferForBankUnstableDetailActivity2.getString(k.core_payment_method), scheduleTransferForBankUnstableOrderResp2.getPaymentMethodDesc());
                            }
                            if (!TextUtils.isEmpty(scheduleTransferForBankUnstableOrderResp2.getProcessTime())) {
                                ScheduleTransferForBankUnstableDetailActivity.m(scheduleTransferForBankUnstableDetailActivity2, scheduleTransferForBankUnstableDetailActivity2.getString(p159kd.h.sm_process_time), scheduleTransferForBankUnstableOrderResp2.getProcessTime());
                            }
                            Long createTime = scheduleTransferForBankUnstableOrderResp2.getCreateTime();
                            if ((createTime != null ? createTime.longValue() : 0L) > 0) {
                                String string = scheduleTransferForBankUnstableDetailActivity2.getString(k.core_create_time);
                                Long createTime2 = scheduleTransferForBankUnstableOrderResp2.getCreateTime();
                                ScheduleTransferForBankUnstableDetailActivity.m(scheduleTransferForBankUnstableDetailActivity2, string, r0.N(createTime2 != null ? createTime2.longValue() : 0L));
                            }
                            Long canceledTime = scheduleTransferForBankUnstableOrderResp2.getCanceledTime();
                            if ((canceledTime != null ? canceledTime.longValue() : 0L) > 0) {
                                Long canceledTime2 = scheduleTransferForBankUnstableOrderResp2.getCanceledTime();
                                ScheduleTransferForBankUnstableDetailActivity.m(scheduleTransferForBankUnstableDetailActivity2, "Canceled Time", r0.N(canceledTime2 != null ? canceledTime2.longValue() : 0L));
                            }
                        }
                    }
                } else if (it instanceof m) {
                    scheduleTransferForBankUnstableDetailActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    scheduleTransferForBankUnstableDetailActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof o;
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity3 = this.f43418b;
                if (z8) {
                    scheduleTransferForBankUnstableDetailActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    scheduleTransferForBankUnstableDetailActivity3.showLoadingDialog(false, true);
                    CommonBooleanResult commonBooleanResult = (CommonBooleanResult) ((p) it2).f27360a;
                    if (commonBooleanResult.isSuccess()) {
                        ToastUtils.showShort("Booked Transfer Canceled", new Object[0]);
                        if (ActivityUtils.isActivityExistsInStack((Class<?>) TransferToBankAccountActivity.class)) {
                            ActivityUtils.finishToActivity((Class<?>) TransferToBankAccountActivity.class, false);
                            this.f43419c.finish();
                        } else {
                            i0.H(null);
                        }
                    } else {
                        ToastUtils.showShort(commonBooleanResult.getRespMsg(), new Object[0]);
                    }
                } else if (it2 instanceof m) {
                    scheduleTransferForBankUnstableDetailActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    scheduleTransferForBankUnstableDetailActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    ((n) it2).getClass();
                }
                return Unit.f38893a;
        }
    }
}
