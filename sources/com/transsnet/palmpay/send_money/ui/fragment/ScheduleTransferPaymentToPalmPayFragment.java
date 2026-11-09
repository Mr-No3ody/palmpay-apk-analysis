package com.transsnet.palmpay.send_money.ui.fragment;

import C9.C0144k;
import Cd.v;
import Cd.w;
import Cd.x;
import Cd.y;
import Kd.C0359a0;
import Kd.C0368d0;
import Kd.L;
import Kd.M;
import Kd.W;
import L6.b;
import N8.q0;
import Pa.r0;
import Rd.k0;
import Wf.AbstractC0780y;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.req.MemberDetailReq;
import com.transsnet.palmpay.send_money.bean.resp.QueryRecipientMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToPalmPayView;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferPaymentViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p159kd.e;
import p159kd.h;
import p223od.p;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferPaymentToPalmPayFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferPaymentViewModel;", "Lod/p;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferPaymentToPalmPayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferPaymentToPalmPayFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferPaymentToPalmPayFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n152#2:351\n169#2:352\n152#2:353\n169#2:354\n152#2:355\n169#2:356\n171#2,12:357\n215#2:369\n260#2,10:370\n296#2:380\n152#2:381\n169#2:382\n152#2:383\n169#2:384\n1869#3,2:385\n1#4:387\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferPaymentToPalmPayFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferPaymentToPalmPayFragment\n*L\n126#1:351\n126#1:352\n131#1:353\n131#1:354\n148#1:355\n148#1:356\n161#1:357,12\n161#1:369\n170#1:370,10\n170#1:380\n190#1:381\n190#1:382\n195#1:383\n195#1:384\n215#1:385,2\n*E\n"})
public final class ScheduleTransferPaymentToPalmPayFragment extends BaseMvvmVBFragment<ScheduleTransferPaymentViewModel, p> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f33719H = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final BankInfo f33720A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f33721B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f33722C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33724p;
    public AddFromContactsDialog t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33725v = C2131j.b(new Aa.a(11));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33726w = C2131j.b(new Aa.a(12));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScheduleTransferPaymentToPalmPayFragment newInstance() {
            return new ScheduleTransferPaymentToPalmPayFragment();
        }

        private a() {
        }
    }

    public ScheduleTransferPaymentToPalmPayFragment() {
        BankInfo bankInfo = new BankInfo();
        bankInfo.bankUrl = "https://transsnet-app-images-prod.s3.eu-west-1.amazonaws.com/20230608/6481dd92ba53c2102104399a.png";
        bankInfo.bankCode = "100033";
        bankInfo.bankName = "PalmPay";
        this.f33720A = bankInfo;
        this.f33722C = true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar = scheduleTransferPaymentViewModel != null ? scheduleTransferPaymentViewModel.f34009p : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new x(this, 0), 6));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel2 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar2 = scheduleTransferPaymentViewModel2 != null ? scheduleTransferPaymentViewModel2.f34010v : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new x(this, 1), 6));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel3 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar3 = scheduleTransferPaymentViewModel3 != null ? scheduleTransferPaymentViewModel3.f34011w : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new x(this, 2), 6));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel4 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar4 = scheduleTransferPaymentViewModel4 != null ? scheduleTransferPaymentViewModel4.f34008o : null;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new w(this, this, 0), 6));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel5 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar5 = scheduleTransferPaymentViewModel5 != null ? scheduleTransferPaymentViewModel5.t : null;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new w(this, this, 1), 6));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel6 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar6 = scheduleTransferPaymentViewModel6 != null ? scheduleTransferPaymentViewModel6.f34006i : null;
        if (lVar6 != null) {
            lVar6.e(this, new C0144k(new x(this, 3), 6));
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel7 = (ScheduleTransferPaymentViewModel) this.f27333i;
        l lVar7 = scheduleTransferPaymentViewModel7 != null ? scheduleTransferPaymentViewModel7.f34007j : null;
        if (lVar7 == null) {
            return 0;
        }
        lVar7.e(this, new C0144k(new x(this, 4), 6));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        ConfigReq req = new ConfigReq();
        req.setPayeeAccountType(1);
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel = (ScheduleTransferPaymentViewModel) this.f27333i;
        if (scheduleTransferPaymentViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(scheduleTransferPaymentViewModel, new M(req, null), scheduleTransferPaymentViewModel.f34008o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel2 = (ScheduleTransferPaymentViewModel) this.f27333i;
        if (scheduleTransferPaymentViewModel2 != null) {
            AbstractC0780y.m(V.h(scheduleTransferPaymentViewModel2), null, null, new C0368d0(scheduleTransferPaymentViewModel2.f34010v, q0.y(p367ya.a.d().i(), "_queryScheduleRecently_", BaseApplication.getCountryLocale()), null), 3);
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel3 = (ScheduleTransferPaymentViewModel) this.f27333i;
        if (scheduleTransferPaymentViewModel3 != null) {
            AbstractC0780y.m(V.h(scheduleTransferPaymentViewModel3), null, null, new C0359a0(scheduleTransferPaymentViewModel3.f34011w, q0.y(p367ya.a.d().i(), "_queryScheduleFavorite_", BaseApplication.getCountryLocale()), null), 3);
        }
        ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel4 = (ScheduleTransferPaymentViewModel) this.f27333i;
        if (scheduleTransferPaymentViewModel4 != null) {
            f.s(scheduleTransferPaymentViewModel4, new L(1, null), scheduleTransferPaymentViewModel4.f34009p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        AppCompatEditText editText;
        super.o();
        p pVar = (p) this.f27335j;
        if (pVar != null) {
            SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView = pVar.f40448f;
            BankInfo bankInfo = this.f33720A;
            if (bankInfo != null) {
                k0 k0Var = searchRecipientAccountToPalmPayView.f33838c;
                if (k0Var != null) {
                    k0Var.f8370c.setText(bankInfo.bankName);
                }
                searchRecipientAccountToPalmPayView.getContext();
                p002a.a.r(bankInfo.bankUrl, k0Var != null ? (ImageView) k0Var.f8374g : null);
            }
        }
        p pVar2 = (p) this.f27335j;
        if (pVar2 != null) {
            pVar2.f40448f.setListener(new y(this));
        }
        p pVar3 = (p) this.f27335j;
        if (pVar3 != null) {
            pVar3.f40446d.setTextInputListener(new v(this));
        }
        p pVar4 = (p) this.f27335j;
        if (pVar4 != null && (editText = pVar4.f40445c.getEditText()) != null) {
            editText.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext()));
        }
        p pVar5 = (p) this.f27335j;
        if (pVar5 == null) {
            return 0;
        }
        pVar5.f40444b.setOnClickListener(new A8.b(this, 29));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = getLayoutInflater().inflate(p159kd.f.sm_fragment_schedule_transfer_to_palmpay, (ViewGroup) null, false);
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
                        i7 = e.vSearchToPalmPay;
                        SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView = (SearchRecipientAccountToPalmPayView) p059e1.a.m(i7, viewInflate);
                        if (searchRecipientAccountToPalmPayView != null) {
                            p pVar = new p((LinearLayout) viewInflate, textView, ppFormVertical, ppAmountEditText, flexboxLayout, searchRecipientAccountToPalmPayView);
                            Intrinsics.checkNotNullExpressionValue(pVar, "inflate(...)");
                            return pVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    public final void u() {
        TextView textView;
        boolean z3;
        SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView;
        String phoneAccount;
        PpAmountEditText ppAmountEditText;
        ViewBinding viewBinding = this.f27335j;
        p pVar = (p) viewBinding;
        if (pVar == null || (textView = pVar.f40444b) == null) {
            return;
        }
        p pVar2 = (p) viewBinding;
        if (pVar2 == null || (searchRecipientAccountToPalmPayView = pVar2.f40448f) == null || (phoneAccount = searchRecipientAccountToPalmPayView.getPhoneAccount()) == null || phoneAccount.length() <= 0) {
            z3 = false;
        } else {
            p pVar3 = (p) this.f27335j;
            if (((pVar3 == null || (ppAmountEditText = pVar3.f40446d) == null) ? 0L : ppAmountEditText.getLongAmount()) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        textView.setEnabled(z3);
    }

    public final void v() {
        if (TextUtils.isEmpty(this.f33723o)) {
            return;
        }
        p pVar = (p) this.f27335j;
        long longAmount = pVar != null ? pVar.f40446d.getLongAmount() : 0L;
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = this.f33721B;
        if (balanceAndLimitData == null) {
            return;
        }
        if (longAmount < balanceAndLimitData.minAmount) {
            p pVar2 = (p) this.f27335j;
            if (pVar2 != null) {
                PpAmountEditText ppAmountEditText = pVar2.f40446d;
                int i7 = h.sm_amount_must_be_above_;
                Intrinsics.e(balanceAndLimitData);
                ppAmountEditText.setError(getString(i7, r0.B(balanceAndLimitData.minAmount, false)));
                return;
            }
            return;
        }
        Intrinsics.e(balanceAndLimitData);
        if (longAmount <= balanceAndLimitData.maxAmount) {
            p pVar3 = (p) this.f27335j;
            if (pVar3 != null) {
                pVar3.f40446d.setError("");
            }
            ScheduleTransferPaymentViewModel scheduleTransferPaymentViewModel = (ScheduleTransferPaymentViewModel) this.f27333i;
            if (scheduleTransferPaymentViewModel != null) {
                f.s(scheduleTransferPaymentViewModel, new W(new MemberDetailReq(this.f33724p, 2, null, null, 12, null), null), scheduleTransferPaymentViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
            return;
        }
        p pVar4 = (p) this.f27335j;
        if (pVar4 != null) {
            PpAmountEditText ppAmountEditText2 = pVar4.f40446d;
            int i10 = h.sm_amount_must_be_below_;
            BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = this.f33721B;
            Intrinsics.e(balanceAndLimitData2);
            ppAmountEditText2.setError(getString(i10, r0.B(balanceAndLimitData2.maxAmount, false)));
        }
    }

    public final void w(QueryRecipientMemberInfoResp queryRecipientMemberInfoResp, boolean z3) {
        if (!queryRecipientMemberInfoResp.isSuccess()) {
            p pVar = (p) this.f27335j;
            if (pVar != null) {
                pVar.f40448f.c(null, queryRecipientMemberInfoResp.getRespMsg());
                return;
            }
            return;
        }
        QueryRecipientMemberInfoResp.Data data = queryRecipientMemberInfoResp.getData();
        if (data != null) {
            String recipientMemberId = data.getRecipientMemberId();
            if (recipientMemberId != null) {
                if (TextUtils.isEmpty(recipientMemberId)) {
                    recipientMemberId = null;
                }
                if (recipientMemberId != null) {
                    this.f33724p = recipientMemberId;
                }
            }
            String recipientNickname = data.getRecipientNickname();
            if (recipientNickname != null) {
                if (TextUtils.isEmpty(recipientNickname)) {
                    recipientNickname = null;
                }
                if (recipientNickname != null) {
                    this.f33723o = recipientNickname;
                }
            }
            p pVar2 = (p) this.f27335j;
            if (pVar2 != null) {
                pVar2.f40448f.c(data.getRecipientNickname(), null);
            }
            if (z3) {
                v();
            }
        }
    }
}
