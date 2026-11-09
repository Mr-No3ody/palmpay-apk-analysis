package com.transsnet.palmpay.send_money.ui.fragment.to_bank;

import Ab.i;
import Ae.j;
import C0.G;
import C9.C0144k;
import Ce.O;
import Ed.A;
import Ed.B;
import Ed.C;
import Kd.M0;
import Kd.N0;
import Kd.O0;
import Kd.P0;
import Kd.Q0;
import L6.b;
import O6.c;
import O6.d;
import Pa.r0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.CycleInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.flexbox.FlexboxLayout;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.send_money.bean.AddRecipientReq;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.req.MatchBankReq;
import com.transsnet.palmpay.send_money.bean.resp.LabelBean;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankAddBankAccountViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p159kd.e;
import p173ld.w;
import p220oa.h;
import p223od.k;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankAddBankAccountFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBankAddBankAccountViewModel;", "Lod/k;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankAddBankAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankAddBankAccountFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankAddBankAccountFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,615:1\n152#2:616\n169#2:617\n152#2:618\n169#2:619\n152#2:620\n169#2:621\n171#2,12:622\n215#2:634\n115#2,8:635\n145#2:643\n171#2,12:644\n215#2:656\n1#3:657\n1869#4,2:658\n*S KotlinDebug\n*F\n+ 1 TransferToBankAddBankAccountFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankAddBankAccountFragment\n*L\n176#1:616\n176#1:617\n189#1:618\n189#1:619\n194#1:620\n194#1:621\n199#1:622,12\n199#1:634\n207#1:635,8\n207#1:643\n215#1:644,12\n215#1:656\n376#1:658,2\n*E\n"})
public final class TransferToBankAddBankAccountFragment extends BaseMvvmVBFragment<TransferToBankAddBankAccountViewModel, k> implements View.OnClickListener {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final a f33758M = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AddFromContactsDialog f33759A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f33760B = C2131j.b(new j(this, 13));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f33761C = C2131j.b(new Aa.a(23));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f33762H = C2131j.b(new Aa.a(24));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Bc.j f33763L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LabelBean f33764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecipientListResp.RecipientBean f33765p;
    public BankInfo t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public VerifyPaymentInfoRsp.DataBean f33766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f33767w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransferToBankAddBankAccountFragment newInstance() {
            return new TransferToBankAddBankAccountFragment();
        }

        private a() {
        }
    }

    public static final void u(TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment, String str) {
        c cVar = new c(transferToBankAddBankAccountFragment.requireContext());
        cVar.e(p025ba.k.core_title_attention);
        cVar.f6605k = true;
        cVar.f6598d = str;
        cVar.d(p025ba.k.core_payment_confirm, null);
        d dVarA = cVar.a();
        if (transferToBankAddBankAccountFragment.requireActivity().isFinishing() || transferToBankAddBankAccountFragment.requireActivity().isDestroyed()) {
            return;
        }
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.setCancelable(false);
        dVarA.show();
    }

    public final void A(BankInfo bankInfo) {
        if (bankInfo == null) {
            return;
        }
        this.t = bankInfo;
        Bc.j jVar = this.f33763L;
        if (jVar != null) {
            ((TextView) jVar.f732B).setVisibility(8);
        }
        Bc.j jVar2 = this.f33763L;
        if (jVar2 != null) {
            ((ImageView) jVar2.f737d).setVisibility(0);
        }
        Bc.j jVar3 = this.f33763L;
        if (jVar3 != null) {
            ((TextView) jVar3.f733C).setVisibility(0);
        }
        BankInfo bankInfo2 = this.t;
        if (bankInfo2 != null) {
            Bc.j jVar4 = this.f33763L;
            if (jVar4 != null) {
                ((TextView) jVar4.f733C).setText(bankInfo2.bankName);
            }
            requireContext();
            String str = bankInfo2.bankUrl;
            Bc.j jVar5 = this.f33763L;
            p002a.a.r(str, jVar5 != null ? (ImageView) jVar5.f737d : null);
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel = (TransferToBankAddBankAccountViewModel) this.f27333i;
        if (transferToBankAddBankAccountViewModel != null) {
            transferToBankAddBankAccountViewModel.d(Integer.valueOf(bankInfo.accountType));
        }
        w(false);
        x();
    }

    public final void B(VerifyPaymentInfoRsp verifyPaymentInfoRsp, boolean z3) {
        z();
        Bc.j jVar = this.f33763L;
        if (jVar != null) {
            ((ModelErrorDivider) jVar.f743o).setErrorMessage("");
        }
        Bc.j jVar2 = this.f33763L;
        if (jVar2 != null) {
            ((ModelErrorDivider) jVar2.t).setErrorMessage("");
        }
        if (!verifyPaymentInfoRsp.isSuccess()) {
            Bc.j jVar3 = this.f33763L;
            if (jVar3 != null) {
                h.C((LinearLayout) jVar3.f741i);
            }
            this.f33766v = null;
            C(verifyPaymentInfoRsp.getRespMsg(), true);
            return;
        }
        VerifyPaymentInfoRsp.DataBean dataBean = verifyPaymentInfoRsp.data;
        if (dataBean != null) {
            this.f33766v = dataBean;
            if (!TextUtils.isEmpty(dataBean.accountName)) {
                Bc.j jVar4 = this.f33763L;
                if (jVar4 != null) {
                    h.C((LinearLayout) jVar4.f741i);
                }
                C(dataBean.accountName, false);
            }
            if (!z3 || this.t == null) {
                return;
            }
            v();
        }
    }

    public final void C(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            Bc.j jVar = this.f33763L;
            if (jVar != null) {
                h.c((LinearLayout) jVar.f741i);
                return;
            }
            return;
        }
        Bc.j jVar2 = this.f33763L;
        if (jVar2 != null) {
            h.C((LinearLayout) jVar2.f741i);
        }
        Bc.j jVar3 = this.f33763L;
        if (jVar3 != null) {
            ((TextView) jVar3.f731A).setText(str);
        }
        if (!z3) {
            int color = requireContext().getColor(b.ppColorSuccess);
            Bc.j jVar4 = this.f33763L;
            if (jVar4 != null) {
                ((LinearLayout) jVar4.f741i).setBackgroundTintList(ColorStateList.valueOf(requireContext().getColor(b.ppColorSuccessBackground)));
            }
            Bc.j jVar5 = this.f33763L;
            if (jVar5 != null) {
                IconicsImageView iconicsImageView = (IconicsImageView) jVar5.f739f;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext, S6.a.pay_SelectedFill);
                iconicsDrawable.a(new O(color, 2));
                iconicsImageView.setIcon(iconicsDrawable);
            }
            Bc.j jVar6 = this.f33763L;
            if (jVar6 != null) {
                ((TextView) jVar6.f731A).setTextColor(color);
            }
            Bc.j jVar7 = this.f33763L;
            if (jVar7 != null) {
                ((TextView) jVar7.f731A).setTypeface(Typeface.create("sans-serif-medium", 0));
                return;
            }
            return;
        }
        int color2 = requireContext().getColor(b.ppColorError);
        Bc.j jVar8 = this.f33763L;
        if (jVar8 != null) {
            ((LinearLayout) jVar8.f741i).setBackgroundTintList(ColorStateList.valueOf(requireContext().getColor(b.ppColorErrorBackground)));
        }
        Bc.j jVar9 = this.f33763L;
        if (jVar9 != null) {
            IconicsImageView iconicsImageView2 = (IconicsImageView) jVar9.f739f;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            IconicsDrawable iconicsDrawable2 = new IconicsDrawable(contextRequireContext2, S6.a.pay_WarningFill);
            iconicsDrawable2.a(new O(color2, 1));
            iconicsImageView2.setIcon(iconicsDrawable2);
        }
        Bc.j jVar10 = this.f33763L;
        if (jVar10 != null) {
            ((TextView) jVar10.f731A).setTextColor(color2);
        }
        Bc.j jVar11 = this.f33763L;
        if (jVar11 != null) {
            ((TextView) jVar11.f731A).setTypeface(Typeface.create("sans-serif", 0));
        }
        Bc.j jVar12 = this.f33763L;
        LinearLayout linearLayout = jVar12 != null ? (LinearLayout) jVar12.f741i : null;
        if (linearLayout != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_X.getName(), 0.0f, 8.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(4.0f));
            objectAnimatorOfFloat.start();
        }
    }

    public final void D(String str) {
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        TextView textView;
        LinearLayout linearLayout2;
        Bc.j jVar = this.f33763L;
        if (jVar != null && (linearLayout2 = (LinearLayout) jVar.f740g) != null) {
            h.C(linearLayout2);
        }
        Bc.j jVar2 = this.f33763L;
        if (jVar2 != null && (textView = (TextView) jVar2.f746w) != null) {
            textView.setText(str);
        }
        Bc.j jVar3 = this.f33763L;
        if (jVar3 != null && (linearLayout = (LinearLayout) jVar3.f741i) != null) {
            h.c(linearLayout);
        }
        Bc.j jVar4 = this.f33763L;
        if (jVar4 == null || (recyclerView = (RecyclerView) jVar4.f744p) == null) {
            return;
        }
        h.c(recyclerView);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel = (TransferToBankAddBankAccountViewModel) this.f27333i;
        l lVar = transferToBankAddBankAccountViewModel != null ? transferToBankAddBankAccountViewModel.f34043g : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new B(this, 1), 20));
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel2 = (TransferToBankAddBankAccountViewModel) this.f27333i;
        l lVar2 = transferToBankAddBankAccountViewModel2 != null ? transferToBankAddBankAccountViewModel2.f34041e : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new B(this, 2), 20));
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel3 = (TransferToBankAddBankAccountViewModel) this.f27333i;
        l lVar3 = transferToBankAddBankAccountViewModel3 != null ? transferToBankAddBankAccountViewModel3.f34042f : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new B(this, 3), 20));
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel4 = (TransferToBankAddBankAccountViewModel) this.f27333i;
        l lVar4 = transferToBankAddBankAccountViewModel4 != null ? transferToBankAddBankAccountViewModel4.f34044i : null;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new C(this, this, 0), 20));
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel5 = (TransferToBankAddBankAccountViewModel) this.f27333i;
        l lVar5 = transferToBankAddBankAccountViewModel5 != null ? transferToBankAddBankAccountViewModel5.f34045j : null;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new B(this, 0), 20));
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel6 = (TransferToBankAddBankAccountViewModel) this.f27333i;
        l lVar6 = transferToBankAddBankAccountViewModel6 != null ? transferToBankAddBankAccountViewModel6.f34046o : null;
        if (lVar6 != null) {
            lVar6.e(this, new C0144k(new C(this, this, 1), 20));
        }
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        RecipientListResp.RecipientBean recipientBean = this.f33765p;
        if (recipientBean != null) {
            BankInfo bankInfo = new BankInfo();
            bankInfo.bankCode = recipientBean.getRecipientBankCode();
            bankInfo.bankName = recipientBean.getRecipientBankName();
            bankInfo.bankUrl = recipientBean.getRecipientHeadImage();
            bankInfo.accountType = recipientBean.tagType == 2 ? 1 : 2;
            this.t = bankInfo;
            A(bankInfo);
            Bc.j jVar = this.f33763L;
            if (jVar != null) {
                EditText editText = (EditText) jVar.f735b;
                String recipientAccountNumber = recipientBean.getRecipientAccountNumber();
                Intrinsics.checkNotNullExpressionValue(recipientAccountNumber, "getRecipientAccountNumber(...)");
                editText.setText(r0.w(recipientAccountNumber));
            }
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel = (TransferToBankAddBankAccountViewModel) this.f27333i;
        if (transferToBankAddBankAccountViewModel != null) {
            f.s(transferToBankAddBankAccountViewModel, new P0(1, null), transferToBankAddBankAccountViewModel.f34046o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel2 = (TransferToBankAddBankAccountViewModel) this.f27333i;
        if (transferToBankAddBankAccountViewModel2 != null) {
            transferToBankAddBankAccountViewModel2.d(2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        k kVar = (k) this.f27335j;
        Bc.j jVar = kVar != null ? kVar.f40408c : null;
        this.f33763L = jVar;
        if (jVar != null) {
            ((TextView) jVar.f732B).setHint(G.i("").append(getString(p159kd.h.sm_select_your_bank)).setFontFamily("sans-serif").create());
        }
        if (BaseApplication.isAO()) {
            Bc.j jVar2 = this.f33763L;
            if (jVar2 != null) {
                ((EditText) jVar2.f735b).setText("AO06");
            }
            Bc.j jVar3 = this.f33763L;
            if (jVar3 != null) {
                ((EditText) jVar3.f735b).setFilters(new InputFilter[]{new InputFilter.LengthFilter(25)});
            }
        } else {
            Bc.j jVar4 = this.f33763L;
            if (jVar4 != null) {
                ((EditText) jVar4.f735b).setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
            }
        }
        Bc.j jVar5 = this.f33763L;
        if (jVar5 != null) {
            ((EditText) jVar5.f735b).setHint(G.i("").append(getString(p159kd.h.sm_enter_10_digit_account_number)).setFontFamily("sans-serif").create());
        }
        Bc.j jVar6 = this.f33763L;
        if (jVar6 != null) {
            ((EditText) jVar6.f735b).setInputType(2);
        }
        Bc.j jVar7 = this.f33763L;
        if (jVar7 != null) {
            h.r((EditText) jVar7.f735b, new i(this, 8), null);
        }
        Bc.j jVar8 = this.f33763L;
        t tVar = this.f33760B;
        if (jVar8 != null) {
            ((RecyclerView) jVar8.f744p).setAdapter((w) tVar.getValue());
        }
        Bc.j jVar9 = this.f33763L;
        if (jVar9 != null) {
            ((RecyclerView) jVar9.f744p).setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        ((w) tVar.getValue()).setOnItemClickListener(new A(this));
        k kVar2 = (k) this.f27335j;
        if (kVar2 != null) {
            kVar2.f40409d.setOnClickListener(this);
        }
        Bc.j jVar10 = this.f33763L;
        if (jVar10 != null) {
            ((RelativeLayout) jVar10.f745v).setOnClickListener(this);
        }
        Bc.j jVar11 = this.f33763L;
        if (jVar11 != null) {
            ((IconicsImageView) jVar11.f738e).setOnClickListener(this);
        }
        return 1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 2 && i10 == -1 && intent != null) {
            A((BankInfo) intent.getParcelableExtra("BANK_CARD_INFO"));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AddFromContactsDialog addFromContactsDialog;
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        if (id2 == e.iivContacts) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            AddFromContactsDialog addFromContactsDialog2 = new AddFromContactsDialog(contextRequireContext, true);
            addFromContactsDialog2.setRecentData((ArrayList) this.f33761C.getValue());
            addFromContactsDialog2.setPhoneContactData((ArrayList) this.f33762H.getValue());
            addFromContactsDialog2.setOnAddFromContactsListener(new A(this));
            this.f33759A = addFromContactsDialog2;
            if (addFromContactsDialog2.isShowing() || (addFromContactsDialog = this.f33759A) == null) {
                return;
            }
            addFromContactsDialog.show();
            return;
        }
        if (id2 == e.rlSelectBank) {
            Postcard postcardBuild = ARouter.getInstance().build("/sm/select_bank_for_to_bank_activity");
            String strY = y();
            if (!TextUtils.isEmpty(strY) && strY.length() >= 10) {
                postcardBuild.withString("core_extra_bank_account_data", y());
            }
            ARouter aRouter = ARouter.getInstance();
            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
            Intrinsics.e(postcardBuild);
            r0.x(aRouter, this, postcardBuild, 2);
            return;
        }
        if (id2 == e.save) {
            if (y().length() < 10) {
                Bc.j jVar = this.f33763L;
                if (jVar != null) {
                    ((ModelErrorDivider) jVar.f743o).setErrorMessage("Please enter 10 digits account number.");
                    return;
                }
                return;
            }
            Bc.j jVar2 = this.f33763L;
            if (jVar2 != null) {
                ((ModelErrorDivider) jVar2.f743o).setErrorMessage("");
            }
            if (this.t == null) {
                Bc.j jVar3 = this.f33763L;
                if (jVar3 != null) {
                    ((ModelErrorDivider) jVar3.t).setErrorMessage("Please select corresponding bank.");
                    return;
                }
                return;
            }
            Bc.j jVar4 = this.f33763L;
            if (jVar4 != null) {
                ((ModelErrorDivider) jVar4.t).setErrorMessage("");
            }
            if (this.f33764o == null) {
                return;
            }
            if (this.f33766v == null) {
                w(true);
            } else {
                v();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p159kd.f.sm_add_bank_account_fragment_new, viewGroup, false);
        int i7 = e.flRelation;
        FlexboxLayout flexboxLayout = (FlexboxLayout) p059e1.a.m(i7, viewInflate);
        if (flexboxLayout != null && (viewM = p059e1.a.m((i7 = e.layoutSearchToBank), viewInflate)) != null) {
            Bc.j jVarA = Bc.j.a(viewM);
            i7 = e.save;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = e.tvRelationTip;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    k kVar = new k((LinearLayout) viewInflate, flexboxLayout, jVarA, textView, textView2);
                    Intrinsics.checkNotNullExpressionValue(kVar, "inflate(...)");
                    return kVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void v() {
        BankInfo bankInfo = this.t;
        if (bankInfo != null) {
            AddRecipientReq req = new AddRecipientReq();
            req.setRecipientBankAccount(y());
            req.setRecipientBankCode(bankInfo.bankCode);
            req.setRecipientBankName(bankInfo.bankName);
            req.setRecipientImageUrl(bankInfo.bankUrl);
            req.setRecipientType(bankInfo.mmo == 1 ? 7 : 2);
            LabelBean labelBean = this.f33764o;
            if (labelBean != null) {
                req.setLabel(labelBean.getLabel());
            }
            TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel = (TransferToBankAddBankAccountViewModel) this.f27333i;
            if (transferToBankAddBankAccountViewModel != null) {
                Intrinsics.checkNotNullParameter(req, "req");
                f.s(transferToBankAddBankAccountViewModel, new N0(req, null), transferToBankAddBankAccountViewModel.f34044i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
    }

    public final void w(boolean z3) {
        z();
        String strY = y();
        if (strY.length() < 10) {
            return;
        }
        BankInfo bankInfo = this.t;
        int i7 = 3;
        if (bankInfo == null) {
            D("Matching banks");
            TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel = (TransferToBankAddBankAccountViewModel) this.f27333i;
            if (transferToBankAddBankAccountViewModel != null) {
                MatchBankReq matchBankReq = new MatchBankReq();
                matchBankReq.setAccountNo(y());
                matchBankReq.setSourceType(3);
                f.s(transferToBankAddBankAccountViewModel, new Q0(matchBankReq, null), transferToBankAddBankAccountViewModel.f34043g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
            return;
        }
        D(getString(p159kd.h.sm_looking_for_this_user_name));
        VerifyPaymentInfoReq verifyPaymentInfoReq = new VerifyPaymentInfoReq();
        verifyPaymentInfoReq.accountNo = strY;
        int i10 = bankInfo.accountType;
        verifyPaymentInfoReq.accountType = i10;
        verifyPaymentInfoReq.payeeBankCode = bankInfo.bankCode;
        if (i10 == BankInfo.ACCOUNT_TYPE_PALMPAY) {
            i7 = 2;
        } else if (bankInfo.mmo == 1) {
            i7 = 9;
        }
        verifyPaymentInfoReq.businessType = i7;
        if (z3) {
            TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel2 = (TransferToBankAddBankAccountViewModel) this.f27333i;
            if (transferToBankAddBankAccountViewModel2 != null) {
                f.s(transferToBankAddBankAccountViewModel2, new M0(verifyPaymentInfoReq, null), transferToBankAddBankAccountViewModel2.f34042f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
            return;
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel3 = (TransferToBankAddBankAccountViewModel) this.f27333i;
        if (transferToBankAddBankAccountViewModel3 != null) {
            f.s(transferToBankAddBankAccountViewModel3, new O0(verifyPaymentInfoReq, null), transferToBankAddBankAccountViewModel3.f34041e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void x() {
        TextView textView;
        k kVar = (k) this.f27335j;
        if (kVar == null || (textView = kVar.f40409d) == null) {
            return;
        }
        textView.setEnabled((y().length() <= 0 || this.t == null || this.f33764o == null) ? false : true);
    }

    public final String y() {
        Bc.j jVar = this.f33763L;
        return y.k(String.valueOf(jVar != null ? ((EditText) jVar.f735b).getText() : null), " ", "");
    }

    public final void z() {
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.f(new Fade(1));
            transitionSet.f(new ChangeBounds());
            Bc.j jVar = this.f33763L;
            if (jVar != null) {
                X.a((LinearLayout) jVar.f742j, transitionSet);
            }
        } catch (Exception unused) {
        }
        Bc.j jVar2 = this.f33763L;
        if (jVar2 != null) {
            h.c((LinearLayout) jVar2.f740g);
        }
        Bc.j jVar3 = this.f33763L;
        if (jVar3 != null) {
            h.c((LinearLayout) jVar3.f741i);
        }
        Bc.j jVar4 = this.f33763L;
        if (jVar4 != null) {
            h.c((RecyclerView) jVar4.f744p);
        }
    }
}
