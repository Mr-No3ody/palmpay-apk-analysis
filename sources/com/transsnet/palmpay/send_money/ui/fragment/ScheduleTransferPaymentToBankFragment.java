package com.transsnet.palmpay.send_money.ui.fragment;

import C9.C0144k;
import Cd.r;
import Cd.s;
import Cd.u;
import Kd.L;
import Kd.M;
import Kd.N;
import Kd.Q;
import Kd.U;
import Kd.V;
import Kd.W;
import L6.b;
import N8.q0;
import Pa.C0525w;
import Pa.r0;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.flexbox.FlexboxLayout;
import com.google.gson.Gson;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.req.MatchBankReq;
import com.transsnet.palmpay.send_money.bean.req.MemberDetailReq;
import com.transsnet.palmpay.send_money.bean.req.TransferToBankHomeRecipientsReq;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferPaymentViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p159kd.e;
import p159kd.h;
import p223od.o;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferPaymentToBankFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferPaymentViewModel;", "Lod/o;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferPaymentToBankFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferPaymentToBankFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferPaymentToBankFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,464:1\n152#2:465\n169#2:466\n152#2:467\n169#2:468\n152#2:469\n169#2:470\n171#2,12:471\n215#2:483\n152#2:484\n169#2:485\n152#2:486\n169#2:487\n152#2:488\n169#2:489\n260#2,10:490\n296#2:500\n1869#3,2:501\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferPaymentToBankFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferPaymentToBankFragment\n*L\n153#1:465\n153#1:466\n158#1:467\n158#1:468\n176#1:469\n176#1:470\n194#1:471,12\n194#1:483\n203#1:484\n203#1:485\n215#1:486\n215#1:487\n221#1:488\n221#1:489\n227#1:490,10\n227#1:500\n270#1:501,2\n*E\n"})
public final class ScheduleTransferPaymentToBankFragment extends BaseMvvmVBFragment<ScheduleTransferPaymentViewModel, o> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f33711H = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public BankInfo f33712A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f33713B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33716p;
    public AddFromContactsDialog t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33717v = C2131j.b(new Aa.a(9));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33718w = C2131j.b(new Aa.a(10));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f33714C = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScheduleTransferPaymentToBankFragment newInstance() {
            return new ScheduleTransferPaymentToBankFragment();
        }

        private a() {
        }
    }

    public static void u(ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment) {
        scheduleTransferPaymentToBankFragment.v();
        o oVar = (o) scheduleTransferPaymentToBankFragment.f27335j;
        if (oVar != null) {
            oVar.f40442f.b();
        }
        o oVar2 = (o) scheduleTransferPaymentToBankFragment.f27335j;
        String bankAccount = oVar2 != null ? oVar2.f40442f.getBankAccount() : null;
        if ((bankAccount != null ? bankAccount.length() : 0) < 10) {
            return;
        }
        BankInfo bankInfo = scheduleTransferPaymentToBankFragment.f33712A;
        int i7 = 3;
        if (bankInfo == null) {
            o oVar3 = (o) scheduleTransferPaymentToBankFragment.f27335j;
            if (oVar3 != null) {
                oVar3.f40442f.f("Matching banks");
            }
            ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel = (ScheduleTransferPaymentViewModel) scheduleTransferPaymentToBankFragment.f27333i;
            if (scheduleTransferPaymentViewModel != null) {
                MatchBankReq matchBankReq = new MatchBankReq();
                o oVar4 = (o) scheduleTransferPaymentToBankFragment.f27335j;
                matchBankReq.setAccountNo(oVar4 != null ? oVar4.f40442f.getBankAccount() : null);
                matchBankReq.setSourceType(3);
                f.s(scheduleTransferPaymentViewModel, new V(matchBankReq, null), scheduleTransferPaymentViewModel.f34005g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
            return;
        }
        boolean z3 = scheduleTransferPaymentToBankFragment.f33714C;
        if (!z3) {
            scheduleTransferPaymentToBankFragment.f33714C = !z3;
            return;
        }
        o oVar5 = (o) scheduleTransferPaymentToBankFragment.f27335j;
        if (oVar5 != null) {
            oVar5.f40442f.f(scheduleTransferPaymentToBankFragment.getString(h.sm_looking_for_this_user_name));
        }
        VerifyPaymentInfoReq verifyPaymentInfoReq = new VerifyPaymentInfoReq();
        verifyPaymentInfoReq.accountNo = bankAccount;
        int i10 = bankInfo.accountType;
        verifyPaymentInfoReq.accountType = i10;
        verifyPaymentInfoReq.payeeBankCode = bankInfo.bankCode;
        if (i10 == BankInfo.ACCOUNT_TYPE_PALMPAY) {
            i7 = 2;
        } else if (bankInfo.mmo == 1) {
            i7 = 9;
        }
        verifyPaymentInfoReq.businessType = i7;
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel2 = (ScheduleTransferPaymentViewModel) scheduleTransferPaymentToBankFragment.f27333i;
        if (scheduleTransferPaymentViewModel2 != null) {
            f.s(scheduleTransferPaymentViewModel2, new N(verifyPaymentInfoReq, null), scheduleTransferPaymentViewModel2.f34003e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar = scheduleTransferPaymentViewModel != null ? scheduleTransferPaymentViewModel.f34009p : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new Cd.t(this, 0), 5));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel2 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar2 = scheduleTransferPaymentViewModel2 != null ? scheduleTransferPaymentViewModel2.f34001A : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new Cd.t(this, 1), 5));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel3 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar3 = scheduleTransferPaymentViewModel3 != null ? scheduleTransferPaymentViewModel3.f34002B : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new Cd.t(this, 2), 5));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel4 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar4 = scheduleTransferPaymentViewModel4 != null ? scheduleTransferPaymentViewModel4.f34008o : null;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new s(this, this, 0), 5));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel5 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar5 = scheduleTransferPaymentViewModel5 != null ? scheduleTransferPaymentViewModel5.f34005g : null;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new Cd.t(this, 3), 5));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel6 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar6 = scheduleTransferPaymentViewModel6 != null ? scheduleTransferPaymentViewModel6.f34003e : null;
        if (lVar6 != null) {
            lVar6.e(this, new C0144k(new Cd.t(this, 4), 5));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel7 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar7 = scheduleTransferPaymentViewModel7 != null ? scheduleTransferPaymentViewModel7.f34004f : null;
        if (lVar7 != null) {
            lVar7.e(this, new C0144k(new Cd.t(this, 5), 5));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel8 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar8 = scheduleTransferPaymentViewModel8 != null ? scheduleTransferPaymentViewModel8.t : null;
        if (lVar8 == null) {
            return 0;
        }
        lVar8.e(this, new C0144k(new s(this, this, 1), 5));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        ConfigReq req = new ConfigReq();
        req.setPayeeAccountType(6);
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel = (ScheduleTransferPaymentViewModel) this.f27333i;
        if (scheduleTransferPaymentViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(scheduleTransferPaymentViewModel, new M(req, null), scheduleTransferPaymentViewModel.f34008o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel2 = (ScheduleTransferPaymentViewModel) this.f27333i;
        if (scheduleTransferPaymentViewModel2 != null) {
            f.s(scheduleTransferPaymentViewModel2, new L(1, null), scheduleTransferPaymentViewModel2.f34009p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel3 = (ScheduleTransferPaymentViewModel) this.f27333i;
        if (scheduleTransferPaymentViewModel3 != null) {
            TransferToBankHomeRecipientsReq transferToBankHomeRecipientsReq = new TransferToBankHomeRecipientsReq();
            transferToBankHomeRecipientsReq.pageNum = 200;
            transferToBankHomeRecipientsReq.pageSize = 1;
            transferToBankHomeRecipientsReq.setSortByName(Boolean.FALSE);
            AbstractC0780y.m(androidx.lifecycle.V.h(scheduleTransferPaymentViewModel3), null, null, new U(scheduleTransferPaymentViewModel3.f34001A, q0.y(p367ya.a.d().i(), "_queryHomeRecentlyList_", BaseApplication.getCountryLocale()), null, transferToBankHomeRecipientsReq), 3);
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel4 = (ScheduleTransferPaymentViewModel) this.f27333i;
        if (scheduleTransferPaymentViewModel4 != null) {
            AbstractC0780y.m(androidx.lifecycle.V.h(scheduleTransferPaymentViewModel4), null, null, new Q(scheduleTransferPaymentViewModel4.f34002B, q0.y(p367ya.a.d().i(), "_queryHomeFavoriteList_", BaseApplication.getCountryLocale()), null), 3);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        AppCompatEditText editText;
        super.o();
        o oVar = (o) this.f27335j;
        if (oVar != null) {
            oVar.f40442f.setListener(new u(this));
        }
        o oVar2 = (o) this.f27335j;
        if (oVar2 != null) {
            oVar2.f40440d.setTextInputListener(new r(this));
        }
        o oVar3 = (o) this.f27335j;
        if (oVar3 != null && (editText = oVar3.f40439c.getEditText()) != null) {
            editText.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext()));
        }
        o oVar4 = (o) this.f27335j;
        if (oVar4 == null) {
            return 0;
        }
        oVar4.f40438b.setOnClickListener(new A8.b(this, 28));
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        o oVar;
        SearchRecipientAccountToBankView searchRecipientAccountToBankView;
        super.onActivityResult(i7, i10, intent);
        if (i7 != 4674 || i10 != -1 || intent == null || (oVar = (o) this.f27335j) == null || (searchRecipientAccountToBankView = oVar.f40442f) == null) {
            return;
        }
        searchRecipientAccountToBankView.c((BankInfo) intent.getParcelableExtra("BANK_CARD_INFO"));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = getLayoutInflater().inflate(p159kd.f.sm_fragment_schedule_transfer_to_bank, (ViewGroup) null, false);
        int i7 = e.btnNext;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView != null) {
            i7 = e.etNote;
            PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
            if (ppFormVertical != null) {
                i7 = e.etTransferMoney;
                PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i7, viewInflate);
                if (ppAmountEditText != null) {
                    i7 = e.flNotes;
                    FlexboxLayout flexboxLayout = (FlexboxLayout) p059e1.a.m(i7, viewInflate);
                    if (flexboxLayout != null) {
                        i7 = e.vSearchToBank;
                        SearchRecipientAccountToBankView searchRecipientAccountToBankView = (SearchRecipientAccountToBankView) p059e1.a.m(i7, viewInflate);
                        if (searchRecipientAccountToBankView != null) {
                            o oVar = new o((LinearLayout) viewInflate, textView, ppFormVertical, ppAmountEditText, flexboxLayout, searchRecipientAccountToBankView);
                            Intrinsics.checkNotNullExpressionValue(oVar, "inflate(...)");
                            return oVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void v() {
        this.f33715o = null;
        this.f33716p = null;
        w();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046  */
    public final void w() {
        TextView textView;
        boolean z3;
        SearchRecipientAccountToBankView searchRecipientAccountToBankView;
        String bankAccount;
        String str;
        PpAmountEditText ppAmountEditText;
        ViewBinding viewBinding = this.f27335j;
        o oVar = (o) viewBinding;
        if (oVar == null || (textView = oVar.f40438b) == null) {
            return;
        }
        o oVar2 = (o) viewBinding;
        if (oVar2 == null || (searchRecipientAccountToBankView = oVar2.f40442f) == null || (bankAccount = searchRecipientAccountToBankView.getBankAccount()) == null || bankAccount.length() <= 0 || this.f33712A == null || (str = this.f33715o) == null || str.length() == 0) {
            z3 = false;
        } else {
            o oVar3 = (o) this.f27335j;
            if (((oVar3 == null || (ppAmountEditText = oVar3.f40440d) == null) ? 0L : ppAmountEditText.getLongAmount()) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        textView.setEnabled(z3);
    }

    public final void x() {
        if (TextUtils.isEmpty(this.f33715o)) {
            return;
        }
        o oVar = (o) this.f27335j;
        long longAmount = oVar != null ? oVar.f40440d.getLongAmount() : 0L;
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = this.f33713B;
        if (balanceAndLimitData == null) {
            return;
        }
        if (longAmount < balanceAndLimitData.minAmount) {
            o oVar2 = (o) this.f27335j;
            if (oVar2 != null) {
                PpAmountEditText ppAmountEditText = oVar2.f40440d;
                int i7 = h.sm_amount_must_be_above_;
                Intrinsics.e(balanceAndLimitData);
                ppAmountEditText.setError(getString(i7, r0.B(balanceAndLimitData.minAmount, false)));
                return;
            }
            return;
        }
        Intrinsics.e(balanceAndLimitData);
        if (longAmount > balanceAndLimitData.maxAmount) {
            o oVar3 = (o) this.f27335j;
            if (oVar3 != null) {
                PpAmountEditText ppAmountEditText2 = oVar3.f40440d;
                int i10 = h.sm_amount_must_be_below_;
                BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = this.f33713B;
                Intrinsics.e(balanceAndLimitData2);
                ppAmountEditText2.setError(getString(i10, r0.B(balanceAndLimitData2.maxAmount, false)));
                return;
            }
            return;
        }
        o oVar4 = (o) this.f27335j;
        if (oVar4 != null) {
            oVar4.f40440d.setError("");
        }
        BankInfo bankInfo = this.f33712A;
        if (bankInfo != null) {
            if (bankInfo.accountType == BankInfo.ACCOUNT_TYPE_PALMPAY) {
                ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel = (ScheduleTransferPaymentViewModel) this.f27333i;
                if (scheduleTransferPaymentViewModel != null) {
                    f.s(scheduleTransferPaymentViewModel, new W(new MemberDetailReq(this.f33716p, 2, null, null, 12, null), null), scheduleTransferPaymentViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    return;
                }
                return;
            }
            Postcard postcardBuild = ARouter.getInstance().build("/sm/schedule_transfer_create_v2");
            BankInfo bankInfo2 = this.f33712A;
            Postcard postcardWithString = postcardBuild.withInt("extra_type", (bankInfo2 == null || bankInfo2.mmo != 1) ? 3 : 9).withString("extra_data", ((Gson) C0525w.f().f7166b).toJson(this.f33712A));
            o oVar5 = (o) this.f27335j;
            Postcard postcardWithString2 = postcardWithString.withString("BANK_ACCOUNT_NUMBER", oVar5 != null ? oVar5.f40442f.getBankAccount() : null).withString("contact_name", this.f33715o);
            o oVar6 = (o) this.f27335j;
            Postcard postcardWithString3 = postcardWithString2.withString("extra_note", oVar6 != null ? oVar6.f40439c.getEditContent() : null);
            o oVar7 = (o) this.f27335j;
            postcardWithString3.withDouble("extra_amount", oVar7 != null ? oVar7.f40440d.getDoubleAmount() : 0.0d).navigation();
        }
    }

    public final void y(VerifyPaymentInfoRsp verifyPaymentInfoRsp, boolean z3) {
        v();
        if (!verifyPaymentInfoRsp.isSuccess()) {
            o oVar = (o) this.f27335j;
            if (oVar != null) {
                oVar.f40442f.d(null, verifyPaymentInfoRsp.getRespMsg());
                return;
            }
            return;
        }
        VerifyPaymentInfoRsp.DataBean dataBean = verifyPaymentInfoRsp.data;
        if (dataBean != null) {
            String str = dataBean.accountName;
            this.f33715o = str;
            this.f33716p = dataBean.payeeMemberId;
            o oVar2 = (o) this.f27335j;
            if (oVar2 != null) {
                oVar2.f40442f.d(str, null);
            }
            w();
            if (z3) {
                x();
            }
        }
    }
}
