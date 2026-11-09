package com.transsnet.palmpay.send_money.ui.activity;

import C0.G;
import Kd.C1;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.RequestMoneyReq;
import com.transsnet.palmpay.send_money.bean.SendMobileReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.req.MemberDetailReq;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import com.transsnet.palmpay.send_money.viewmodel.TransferToMobileViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.D;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p054dd.q;
import p140j8.f;
import p141j9.C1807o;
import p159kd.h;
import p173ld.o;
import p270rd.b0;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/trans_to_mobile")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/TransferToMobileActivity;", "Lcom/transsnet/palmpay/send_money/ui/activity/TransferToBaseActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToMobileViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "event", "", "onTransactionMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(message = "已废弃,这里涉及QrCard的业务,待业务方确认是否可以删除")
@SourceDebugExtension({"SMAP\nTransferToMobileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToMobileActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransferToMobileActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,504:1\n171#2,12:505\n215#2:517\n171#2,12:518\n215#2:530\n171#2,12:531\n215#2:543\n171#2,12:544\n215#2:556\n*S KotlinDebug\n*F\n+ 1 TransferToMobileActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransferToMobileActivity\n*L\n164#1:505,12\n164#1:517\n173#1:518,12\n173#1:530\n182#1:531,12\n182#1:543\n246#1:544,12\n246#1:556\n*E\n"})
public final class TransferToMobileActivity extends TransferToBaseActivity<TransferToMobileViewModel> {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f33282v0 = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SendMobileReq f33283X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f33284Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f33285Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f33286k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f33287p0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f33289r0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f33292u0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f33288q0 = 2;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f33290s0 = true;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f33291t0 = "COMMON";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransactionMessage(@Nullable TransactionEvent event) {
        ConfigReq configReq = new ConfigReq();
        configReq.setPayeeAccountType(1);
        SendMobileReq sendMobileReq = this.f33283X;
        configReq.setPhone(sendMobileReq != null ? sendMobileReq.getRecipientPhone() : null);
        SendMobileReq sendMobileReq2 = this.f33283X;
        configReq.setRecipientMemberId(sendMobileReq2 != null ? sendMobileReq2.getRecipientMemberId() : null);
        ((TransferToMobileViewModel) l()).e(configReq);
        t().setText("");
        p().setText("");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((TransferToMobileViewModel) l()).f34065i;
        if (lVar != null) {
            lVar.e(this, new q(new b0(this, this, 0), 23));
        }
        l lVar2 = ((TransferToMobileViewModel) l()).f34062e;
        if (lVar2 != null) {
            lVar2.e(this, new q(new b0(this, this, 1), 23));
        }
        l lVar3 = ((TransferToMobileViewModel) l()).f34063f;
        if (lVar3 != null) {
            lVar3.e(this, new q(new b0(this, this, 2), 23));
        }
        n.B(this, ((TransferToMobileViewModel) l()).f34064g, this, new C1807o(this, 5), new D(14), false, null, 240);
        l lVar4 = ((TransferToMobileViewModel) l()).f34066j;
        if (lVar4 != null) {
            lVar4.e(this, new q(new b0(this, this, 3), 23));
        }
        if (TextUtils.isEmpty(this.f33285Z) && !TextUtils.isEmpty(this.f33286k0)) {
            this.f33292u0 = false;
            SendMobileReq sendMobileReq = new SendMobileReq();
            this.f33283X = sendMobileReq;
            sendMobileReq.setRecipientPhone(this.f33286k0);
            z();
            return;
        }
        this.f33292u0 = true;
        TransferToMobileViewModel transferToMobileViewModel = (TransferToMobileViewModel) l();
        MemberDetailReq memberDetailReq = new MemberDetailReq(null, null, null, null, 15, null);
        int i7 = this.f33288q0;
        memberDetailReq.setAccountNo((i7 == 2 || i7 == 4) ? this.f33285Z : this.f33287p0);
        memberDetailReq.setBusinessType(Integer.valueOf(this.f33288q0));
        transferToMobileViewModel.f(memberDetailReq);
    }

    @Override // com.transsnet.palmpay.send_money.ui.activity.TransferToBaseActivity
    public final void w() {
        if (this.f33284Y == null) {
            return;
        }
        long jY = y();
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = this.f33284Y;
        if (jY < (balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L)) {
            String string = getString(h.sm_amount_must_be_above_, r0.B(balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L, false));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastUtils.showLong(string, new Object[0]);
            return;
        }
        long jY2 = y();
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = this.f33284Y;
        if (jY2 > (balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L)) {
            String string2 = getString(h.sm_amount_must_be_below_, r0.B(balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L, false));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ToastUtils.showLong(string2, new Object[0]);
            return;
        }
        String recipientPhone = null;
        if (this.f33290s0) {
            VerifyPaymentInfoReq verifyPaymentInfoReq = new VerifyPaymentInfoReq();
            verifyPaymentInfoReq.amount = y();
            SendMobileReq sendMobileReq = this.f33283X;
            verifyPaymentInfoReq.accountName = sendMobileReq != null ? sendMobileReq.getRecipientFullName() : null;
            if (this.f33288q0 == 10) {
                SendMobileReq sendMobileReq2 = this.f33283X;
                if (sendMobileReq2 != null) {
                    recipientPhone = sendMobileReq2.getAccountNo();
                }
            } else {
                SendMobileReq sendMobileReq3 = this.f33283X;
                if (sendMobileReq3 != null) {
                    recipientPhone = sendMobileReq3.getRecipientPhone();
                }
            }
            verifyPaymentInfoReq.accountNo = recipientPhone;
            verifyPaymentInfoReq.payeeMemberId = this.f33285Z;
            verifyPaymentInfoReq.businessType = this.f33288q0;
            ((TransferToMobileViewModel) l()).g(verifyPaymentInfoReq);
            return;
        }
        RequestMoneyReq requestMoneyReq = new RequestMoneyReq();
        SendMobileReq sendMobileReq4 = this.f33283X;
        if (sendMobileReq4 != null) {
            requestMoneyReq.setReceiveNickname(sendMobileReq4.getRecipientNickname());
            requestMoneyReq.setReceiveAvatar(sendMobileReq4.getRecipientAvatar());
            requestMoneyReq.setReceivePhone(sendMobileReq4.getRecipientPhone());
        }
        requestMoneyReq.setAmount(y());
        requestMoneyReq.setCountryCode(BaseApplication.getCountryLocale());
        requestMoneyReq.setCurrency(BaseApplication.getCurrency());
        requestMoneyReq.setTransferPurpose(0);
        String string3 = p().getText().toString();
        if (!TextUtils.isEmpty(string3)) {
            requestMoneyReq.setRemark(string3);
        }
        TransferToMobileViewModel transferToMobileViewModel = (TransferToMobileViewModel) l();
        TransferCreateOrderReq req = new TransferCreateOrderReq();
        req.setTransType("03");
        req.setTransferPurpose(0);
        req.setBusinessType(4);
        req.setAccountNo(requestMoneyReq.getReceivePhone());
        req.setOrderSourceType(this.f33291t0);
        req.setAmount(Long.valueOf(requestMoneyReq.getAmount()));
        req.setTransferNotes(requestMoneyReq.getRemark());
        transferToMobileViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(transferToMobileViewModel, new C1(req, null), transferToMobileViewModel.f34066j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void x() {
        String recipientPhone;
        SendMobileReq sendMobileReq = this.f33283X;
        if (sendMobileReq != null) {
            sendMobileReq.setAmount(y());
            sendMobileReq.setCountryCode(BaseApplication.getCountryLocale());
            sendMobileReq.setCurrency(BaseApplication.getCurrency());
            sendMobileReq.setTransferPurpose(0);
            String string = p().getText().toString();
            if (!TextUtils.isEmpty(string)) {
                sendMobileReq.setRemark(string);
            }
            TransferToMobileViewModel transferToMobileViewModel = (TransferToMobileViewModel) l();
            TransferCreateOrderReq transferCreateOrderReq = new TransferCreateOrderReq();
            transferCreateOrderReq.setTransType("03");
            transferCreateOrderReq.setTransferPurpose(0);
            transferCreateOrderReq.setBusinessType(Integer.valueOf(this.f33288q0));
            int i7 = this.f33288q0;
            if (i7 != 2) {
                recipientPhone = i7 != 5 ? this.f33287p0 : this.f33286k0;
            } else {
                recipientPhone = sendMobileReq.getRecipientPhone();
            }
            transferCreateOrderReq.setAccountNo(recipientPhone);
            transferCreateOrderReq.setPayeeMemberId(this.f33285Z);
            transferCreateOrderReq.setOrderSourceType(this.f33291t0);
            transferCreateOrderReq.setAmount(Long.valueOf(sendMobileReq.getAmount()));
            transferCreateOrderReq.setTransferNotes(sendMobileReq.getRemark());
            transferToMobileViewModel.d(transferCreateOrderReq);
        }
    }

    public final long y() {
        return r0.f(t().getDouble());
    }

    public final void z() {
        String strW;
        SendMobileReq sendMobileReq = this.f33283X;
        if (sendMobileReq != null) {
            t tVar = this.f33260B;
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            r0.m1(sendMobileReq.getRecipientAvatar(), (ImageView) value);
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ImageView) value2).setOnClickListener(new o(this, 19));
            if (!TextUtils.isEmpty(sendMobileReq.getRelationshipPic())) {
                Object value3 = this.t.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                r0.l1(sendMobileReq.getRelationshipPic(), (ImageView) value3);
            }
            boolean zC = Intrinsics.c(this.f33291t0, "WITHDRAW");
            t tVar2 = this.f33259A;
            if (zC) {
                Object value4 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                p220oa.h.c((ImageView) value4);
                s().setTitle(getString(h.sm_withdraw_via_palmpay_agent));
                r().setText(sendMobileReq.getRecipientFullName());
                String recipientPhone = sendMobileReq.getRecipientPhone();
                Intrinsics.checkNotNullExpressionValue(recipientPhone, "getRecipientPhone(...)");
                String strW2 = r0.w(recipientPhone);
                if (this.f33288q0 == 10) {
                    String accountNo = sendMobileReq.getAccountNo();
                    Intrinsics.checkNotNullExpressionValue(accountNo, "getAccountNo(...)");
                    strW2 = r0.w(accountNo);
                }
                G.y("Account No.", strW2, "}", u());
            } else {
                Object value5 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((ImageView) value5).setVisibility(sendMobileReq.isAuthed() ? 0 : 8);
                if (this.f33288q0 == 5) {
                    TextView textViewR = r();
                    String recipientPhone2 = sendMobileReq.getRecipientPhone();
                    Intrinsics.checkNotNullExpressionValue(recipientPhone2, "getRecipientPhone(...)");
                    textViewR.setText(r0.w(recipientPhone2));
                    PpTitleBar ppTitleBarS = s();
                    String recipientPhone3 = sendMobileReq.getRecipientPhone();
                    Intrinsics.checkNotNullExpressionValue(recipientPhone3, "getRecipientPhone(...)");
                    ppTitleBarS.setTitle(r0.w(recipientPhone3));
                    u().setText("This number have not been registered as a PalmPay member. \nPlease carefully check recipient account to avoid fund loss.");
                } else {
                    r().setText(sendMobileReq.getRecipientFullName());
                    s().setTitle(sendMobileReq.getRecipientFullName());
                    if (this.f33288q0 == 10) {
                        TextView textViewU = u();
                        int i7 = h.sm_qr_card_number_s;
                        String accountNo2 = sendMobileReq.getAccountNo();
                        Intrinsics.checkNotNullExpressionValue(accountNo2, "getAccountNo(...)");
                        textViewU.setText(getString(i7, r0.w(accountNo2)));
                    } else {
                        TextView textViewU2 = u();
                        if (this.f33289r0) {
                            String recipientPhone4 = sendMobileReq.getRecipientPhone();
                            Intrinsics.checkNotNullExpressionValue(recipientPhone4, "getRecipientPhone(...)");
                            strW = r0.u(recipientPhone4);
                        } else {
                            String recipientPhone5 = sendMobileReq.getRecipientPhone();
                            Intrinsics.checkNotNullExpressionValue(recipientPhone5, "getRecipientPhone(...)");
                            strW = r0.w(recipientPhone5);
                        }
                        textViewU2.setText(strW);
                    }
                }
            }
            SendMobileReq sendMobileReq2 = this.f33283X;
            if (sendMobileReq2 != null) {
                ConfigReq configReq = new ConfigReq();
                configReq.setPayeeAccountType(1);
                configReq.setPhone(sendMobileReq2.getRecipientPhone());
                configReq.setRecipientMemberId(sendMobileReq2.getRecipientMemberId());
                ((TransferToMobileViewModel) l()).e(configReq);
            }
        }
    }
}
