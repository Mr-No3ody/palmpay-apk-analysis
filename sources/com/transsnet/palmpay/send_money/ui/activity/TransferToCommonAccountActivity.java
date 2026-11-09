package com.transsnet.palmpay.send_money.ui.activity;

import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.req.MemberDetailReq;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBaseViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.D;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p054dd.q;
import p141j9.C1807o;
import p159kd.h;
import p270rd.a0;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/trans_to_common_account")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/TransferToCommonAccountActivity;", "Lcom/transsnet/palmpay/send_money/ui/activity/TransferToBaseActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBaseViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "event", "", "onTransactionMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToCommonAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToCommonAccountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransferToCommonAccountActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,286:1\n171#2,12:287\n215#2:299\n171#2,12:300\n215#2:312\n171#2,12:313\n215#2:325\n*S KotlinDebug\n*F\n+ 1 TransferToCommonAccountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransferToCommonAccountActivity\n*L\n93#1:287,12\n93#1:299\n104#1:300,12\n104#1:312\n139#1:313,12\n139#1:325\n*E\n"})
public final class TransferToCommonAccountActivity extends TransferToBaseActivity<TransferToBaseViewModel> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f33276q0 = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MemberDetailResp f33277X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f33278Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f33279Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f33280k0 = 14;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f33281p0 = "COMMON";

    public static final void x(TransferToCommonAccountActivity transferToCommonAccountActivity) {
        if (transferToCommonAccountActivity.f33277X != null) {
            TransferCreateOrderReq transferCreateOrderReq = new TransferCreateOrderReq();
            transferCreateOrderReq.setAmount(Long.valueOf(transferToCommonAccountActivity.y()));
            transferCreateOrderReq.setAccountNo(transferToCommonAccountActivity.f33279Z);
            transferCreateOrderReq.setBusinessType(Integer.valueOf(transferToCommonAccountActivity.f33280k0));
            transferCreateOrderReq.setTransType("03");
            transferCreateOrderReq.setOrderSourceType(transferToCommonAccountActivity.f33281p0);
            String string = transferToCommonAccountActivity.p().getText().toString();
            if (!TextUtils.isEmpty(string)) {
                transferCreateOrderReq.setTransferNotes(string);
            }
            ((TransferToBaseViewModel) transferToCommonAccountActivity.l()).d(transferCreateOrderReq);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransactionMessage(@Nullable TransactionEvent event) {
        ConfigReq configReq = new ConfigReq();
        configReq.setPayeeAccountType(4);
        ((TransferToBaseViewModel) l()).e(configReq);
        t().setText("");
        p().setText("");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((TransferToBaseViewModel) l()).f34065i;
        if (lVar != null) {
            lVar.e(this, new q(new a0(this, this, 0), 22));
        }
        l lVar2 = ((TransferToBaseViewModel) l()).f34062e;
        if (lVar2 != null) {
            lVar2.e(this, new q(new a0(this, this, 1), 22));
        }
        l lVar3 = ((TransferToBaseViewModel) l()).f34063f;
        if (lVar3 != null) {
            lVar3.e(this, new q(new a0(this, this, 2), 22));
        }
        n.B(this, ((TransferToBaseViewModel) l()).f34064g, this, new C1807o(this, 4), new D(13), false, null, 240);
        ((TransferToBaseViewModel) l()).f(new MemberDetailReq(this.f33279Z, Integer.valueOf(this.f33280k0), null, null, 12, null));
    }

    @Override // com.transsnet.palmpay.send_money.ui.activity.TransferToBaseActivity
    public final void w() {
        if (this.f33278Y == null) {
            return;
        }
        long jY = y();
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = this.f33278Y;
        if (jY < (balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L)) {
            String string = getString(h.sm_amount_must_be_above_, r0.B(balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L, false));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastUtils.showLong(string, new Object[0]);
            return;
        }
        long jY2 = y();
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = this.f33278Y;
        if (jY2 > (balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L)) {
            String string2 = getString(h.sm_amount_must_be_below_, r0.B(balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L, false));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ToastUtils.showLong(string2, new Object[0]);
            return;
        }
        VerifyPaymentInfoReq verifyPaymentInfoReq = new VerifyPaymentInfoReq();
        verifyPaymentInfoReq.amount = y();
        MemberDetailResp memberDetailResp = this.f33277X;
        String memberId = null;
        verifyPaymentInfoReq.accountName = memberDetailResp != null ? memberDetailResp.getFullName() : null;
        if (this.f33280k0 == 14) {
            MemberDetailResp memberDetailResp2 = this.f33277X;
            if (memberDetailResp2 != null) {
                memberId = memberDetailResp2.getAccountNo();
            }
        } else {
            MemberDetailResp memberDetailResp3 = this.f33277X;
            if (memberDetailResp3 != null) {
                memberId = memberDetailResp3.getMemberId();
            }
        }
        verifyPaymentInfoReq.payeeMemberId = memberId;
        verifyPaymentInfoReq.businessType = this.f33280k0;
        ((TransferToBaseViewModel) l()).g(verifyPaymentInfoReq);
    }

    public final long y() {
        return r0.f(t().getDouble());
    }
}
