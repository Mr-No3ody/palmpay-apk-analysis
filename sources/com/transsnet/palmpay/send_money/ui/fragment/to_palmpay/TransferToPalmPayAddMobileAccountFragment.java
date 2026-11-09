package com.transsnet.palmpay.send_money.ui.fragment.to_palmpay;

import Ab.i;
import C0.G;
import C9.C0144k;
import Fd.C0246a;
import Fd.C0247b;
import Kd.D1;
import Kd.E1;
import Kd.F1;
import Kd.G1;
import Kd.H1;
import L6.b;
import Pa.r0;
import Rd.k0;
import android.animation.ObjectAnimator;
import android.content.Context;
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
import android.widget.TextView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.input.MaxLengthFilter;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.send_money.bean.AddRecipientReq;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.req.QueryRecipientMemberInfoReq;
import com.transsnet.palmpay.send_money.bean.resp.LabelBean;
import com.transsnet.palmpay.send_money.bean.resp.QueryRecipientMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayAddAccountViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p159kd.d;
import p159kd.e;
import p220oa.h;
import p223od.m;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayAddMobileAccountFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayAddAccountViewModel;", "Lod/m;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayAddMobileAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayAddMobileAccountFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayAddMobileAccountFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n152#2:457\n169#2:458\n152#2:459\n169#2:460\n171#2,12:461\n215#2:473\n171#2,12:474\n215#2:486\n115#2,8:487\n145#2:495\n1#3:496\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayAddMobileAccountFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayAddMobileAccountFragment\n*L\n136#1:457\n136#1:458\n141#1:459\n141#1:460\n146#1:461,12\n146#1:473\n154#1:474,12\n154#1:486\n161#1:487,8\n161#1:495\n*E\n"})
public final class TransferToPalmPayAddMobileAccountFragment extends BaseMvvmVBFragment<TransferToPalmPayAddAccountViewModel, m> implements View.OnClickListener {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f33787L = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AddFromContactsDialog f33788A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f33789B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f33790C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public k0 f33791H;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LabelBean f33792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecipientListResp.RecipientBean f33793p;
    public final BankInfo t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public QueryRecipientMemberInfoResp.Data f33794v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f33795w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransferToPalmPayAddMobileAccountFragment newInstance() {
            return new TransferToPalmPayAddMobileAccountFragment();
        }

        private a() {
        }
    }

    public TransferToPalmPayAddMobileAccountFragment() {
        BankInfo bankInfo = new BankInfo();
        bankInfo.bankUrl = "https://transsnet-app-images-prod.s3.eu-west-1.amazonaws.com/20230608/6481dd92ba53c2102104399a.png";
        bankInfo.bankCode = "100033";
        bankInfo.bankName = "PalmPay";
        this.t = bankInfo;
        this.f33789B = C2131j.b(new Aa.a(26));
        this.f33790C = C2131j.b(new Aa.a(27));
    }

    public final void A(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            k0 k0Var = this.f33791H;
            if (k0Var != null) {
                h.c((LinearLayout) k0Var.f8378p);
                return;
            }
            return;
        }
        k0 k0Var2 = this.f33791H;
        if (k0Var2 != null) {
            h.C((LinearLayout) k0Var2.f8378p);
        }
        k0 k0Var3 = this.f33791H;
        if (k0Var3 != null) {
            k0Var3.f8373f.setText(str);
        }
        if (!z3) {
            k0 k0Var4 = this.f33791H;
            if (k0Var4 != null) {
                ((ImageView) k0Var4.f8376j).setImageResource(d.sm_icon_query_recipient_bank_succ);
            }
            k0 k0Var5 = this.f33791H;
            if (k0Var5 != null) {
                k0Var5.f8373f.setTextColor(requireContext().getColor(b.ppColorTextPrimary));
            }
            k0 k0Var6 = this.f33791H;
            if (k0Var6 != null) {
                k0Var6.f8373f.setTypeface(Typeface.create("sans-serif-medium", 0));
                return;
            }
            return;
        }
        k0 k0Var7 = this.f33791H;
        if (k0Var7 != null) {
            ((ImageView) k0Var7.f8376j).setImageResource(d.sm_icon_query_recipient_bank_fail);
        }
        k0 k0Var8 = this.f33791H;
        if (k0Var8 != null) {
            k0Var8.f8373f.setTextColor(requireContext().getColor(b.ppColorError));
        }
        k0 k0Var9 = this.f33791H;
        if (k0Var9 != null) {
            k0Var9.f8373f.setTypeface(Typeface.create("sans-serif", 0));
        }
        k0 k0Var10 = this.f33791H;
        LinearLayout linearLayout = k0Var10 != null ? (LinearLayout) k0Var10.f8378p : null;
        if (linearLayout != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_X.getName(), 0.0f, 8.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(4.0f));
            objectAnimatorOfFloat.start();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        l lVar = transferToPalmPayAddAccountViewModel != null ? transferToPalmPayAddAccountViewModel.f34067e : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0246a(this, 1), 25));
        }
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel2 = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        l lVar2 = transferToPalmPayAddAccountViewModel2 != null ? transferToPalmPayAddAccountViewModel2.f34068f : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new C0246a(this, 2), 25));
        }
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel3 = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        l lVar3 = transferToPalmPayAddAccountViewModel3 != null ? transferToPalmPayAddAccountViewModel3.f34069g : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new C0247b(this, this, 0), 25));
        }
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel4 = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        l lVar4 = transferToPalmPayAddAccountViewModel4 != null ? transferToPalmPayAddAccountViewModel4.f34070i : null;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new C0247b(this, this, 1), 25));
        }
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel5 = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        l lVar5 = transferToPalmPayAddAccountViewModel5 != null ? transferToPalmPayAddAccountViewModel5.f34071j : null;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new C0246a(this, 0), 25));
        }
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        k0 k0Var;
        k0 k0Var2 = this.f33791H;
        BankInfo bankInfo = this.t;
        if (k0Var2 != null) {
            k0Var2.f8370c.setText(bankInfo.bankName);
        }
        requireContext();
        String str = bankInfo.bankUrl;
        k0 k0Var3 = this.f33791H;
        p002a.a.r(str, k0Var3 != null ? (ImageView) k0Var3.f8374g : null);
        w();
        RecipientListResp.RecipientBean recipientBean = this.f33793p;
        if (recipientBean != null && (k0Var = this.f33791H) != null) {
            EditText editText = (EditText) k0Var.f8375i;
            String recipientPhone = recipientBean.getRecipientPhone();
            Intrinsics.checkNotNullExpressionValue(recipientPhone, "getRecipientPhone(...)");
            editText.setText(r0.w(recipientPhone));
        }
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        if (transferToPalmPayAddAccountViewModel != null) {
            f.s(transferToPalmPayAddAccountViewModel, new G1(1, null), transferToPalmPayAddAccountViewModel.f34071j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel2 = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        if (transferToPalmPayAddAccountViewModel2 != null) {
            f.s(transferToPalmPayAddAccountViewModel2, new H1(1, null), transferToPalmPayAddAccountViewModel2.f34070i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        m mVar = (m) this.f27335j;
        k0 k0Var = mVar != null ? mVar.f40425c : null;
        this.f33791H = k0Var;
        if (k0Var != null) {
            ((EditText) k0Var.f8375i).setFilters(new InputFilter[]{new MaxLengthFilter(13)});
        }
        k0 k0Var2 = this.f33791H;
        if (k0Var2 != null) {
            ((EditText) k0Var2.f8375i).setHint(G.i("").append(getString(p159kd.h.sm_enter_mobile_number)).setFontFamily("sans-serif").create());
        }
        k0 k0Var3 = this.f33791H;
        if (k0Var3 != null) {
            ((EditText) k0Var3.f8375i).setInputType(2);
        }
        k0 k0Var4 = this.f33791H;
        if (k0Var4 != null) {
            h.r((EditText) k0Var4.f8375i, new i(this, 9), null);
        }
        m mVar2 = (m) this.f27335j;
        if (mVar2 != null) {
            mVar2.f40426d.setOnClickListener(this);
        }
        k0 k0Var5 = this.f33791H;
        if (k0Var5 != null) {
            k0Var5.f8371d.setOnClickListener(this);
        }
        return 1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AddFromContactsDialog addFromContactsDialog;
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        if (id2 == e.iivContacts) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            AddFromContactsDialog addFromContactsDialog2 = new AddFromContactsDialog(contextRequireContext, false);
            addFromContactsDialog2.setRecentData((ArrayList) this.f33789B.getValue());
            addFromContactsDialog2.setPhoneContactData((ArrayList) this.f33790C.getValue());
            addFromContactsDialog2.setOnAddFromContactsListener(new Dg.a(this, 10));
            this.f33788A = addFromContactsDialog2;
            if (addFromContactsDialog2.isShowing() || (addFromContactsDialog = this.f33788A) == null) {
                return;
            }
            addFromContactsDialog.show();
            return;
        }
        if (id2 == e.save) {
            if (x().length() < 10) {
                k0 k0Var = this.f33791H;
                if (k0Var != null) {
                    ((ModelErrorDivider) k0Var.f8379v).setErrorMessage("Please enter 10 digits account number.");
                    return;
                }
                return;
            }
            k0 k0Var2 = this.f33791H;
            if (k0Var2 != null) {
                ((ModelErrorDivider) k0Var2.f8379v).setErrorMessage("");
            }
            if (this.f33794v != null) {
                u();
            } else {
                v(true);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p159kd.f.sm_add_palmpay_account_fragment_new, viewGroup, false);
        int i7 = e.flRelation;
        FlexboxLayout flexboxLayout = (FlexboxLayout) p059e1.a.m(i7, viewInflate);
        if (flexboxLayout != null && (viewM = p059e1.a.m((i7 = e.layoutSearchToPalmPay), viewInflate)) != null) {
            k0 k0VarB = k0.b(viewM);
            i7 = e.save;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = e.tvRelationTip;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    m mVar = new m((LinearLayout) viewInflate, flexboxLayout, k0VarB, textView, textView2);
                    Intrinsics.checkNotNullExpressionValue(mVar, "inflate(...)");
                    return mVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void u() {
        AddRecipientReq req = new AddRecipientReq();
        req.setRecipientMobileNo(r0.v0(r0.L0(x())));
        req.setRecipientType(1);
        LabelBean labelBean = this.f33792o;
        if (labelBean != null) {
            req.setLabel(labelBean.getLabel());
        }
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        if (transferToPalmPayAddAccountViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(transferToPalmPayAddAccountViewModel, new E1(req, null), transferToPalmPayAddAccountViewModel.f34069g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void v(boolean z3) {
        y();
        String strX = x();
        if (strX.length() < 10) {
            return;
        }
        String string = getString(p159kd.h.sm_looking_for_this_user_name);
        k0 k0Var = this.f33791H;
        if (k0Var != null) {
            h.C((LinearLayout) k0Var.f8377o);
        }
        k0 k0Var2 = this.f33791H;
        if (k0Var2 != null) {
            k0Var2.f8372e.setText(string);
        }
        k0 k0Var3 = this.f33791H;
        if (k0Var3 != null) {
            h.c((LinearLayout) k0Var3.f8378p);
        }
        QueryRecipientMemberInfoReq queryRecipientMemberInfoReq = new QueryRecipientMemberInfoReq(r0.v0(strX), 10);
        if (z3) {
            TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel = (TransferToPalmPayAddAccountViewModel) this.f27333i;
            if (transferToPalmPayAddAccountViewModel != null) {
                f.s(transferToPalmPayAddAccountViewModel, new D1(queryRecipientMemberInfoReq, null), transferToPalmPayAddAccountViewModel.f34068f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
            return;
        }
        TransferToPalmPayAddAccountViewModel transferToPalmPayAddAccountViewModel2 = (TransferToPalmPayAddAccountViewModel) this.f27333i;
        if (transferToPalmPayAddAccountViewModel2 != null) {
            f.s(transferToPalmPayAddAccountViewModel2, new F1(queryRecipientMemberInfoReq, null), transferToPalmPayAddAccountViewModel2.f34067e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void w() {
        TextView textView;
        m mVar = (m) this.f27335j;
        if (mVar == null || (textView = mVar.f40426d) == null) {
            return;
        }
        textView.setEnabled((x().length() <= 0 || this.t == null || this.f33792o == null) ? false : true);
    }

    public final String x() {
        k0 k0Var = this.f33791H;
        return y.k(String.valueOf(k0Var != null ? ((EditText) k0Var.f8375i).getText() : null), " ", "");
    }

    public final void y() {
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.f(new Fade(1));
            transitionSet.f(new ChangeBounds());
            k0 k0Var = this.f33791H;
            if (k0Var != null) {
                X.a((LinearLayout) k0Var.t, transitionSet);
            }
        } catch (Exception unused) {
        }
        k0 k0Var2 = this.f33791H;
        if (k0Var2 != null) {
            h.c((LinearLayout) k0Var2.f8377o);
        }
        k0 k0Var3 = this.f33791H;
        if (k0Var3 != null) {
            h.c((LinearLayout) k0Var3.f8378p);
        }
    }

    public final void z(QueryRecipientMemberInfoResp queryRecipientMemberInfoResp, boolean z3) {
        y();
        k0 k0Var = this.f33791H;
        if (k0Var != null) {
            ((ModelErrorDivider) k0Var.f8379v).setErrorMessage("");
        }
        if (!queryRecipientMemberInfoResp.isSuccess()) {
            k0 k0Var2 = this.f33791H;
            if (k0Var2 != null) {
                h.C((LinearLayout) k0Var2.f8378p);
            }
            this.f33794v = null;
            A(queryRecipientMemberInfoResp.getRespMsg(), true);
            return;
        }
        QueryRecipientMemberInfoResp.Data data = queryRecipientMemberInfoResp.getData();
        if (data != null) {
            this.f33794v = data;
            if (!TextUtils.isEmpty(data.getRecipientNickname())) {
                k0 k0Var3 = this.f33791H;
                if (k0Var3 != null) {
                    h.C((LinearLayout) k0Var3.f8378p);
                }
                A(data.getRecipientNickname(), false);
            }
            if (z3) {
                u();
            }
        }
    }
}
