package com.transsnet.palmpay.send_money.ui.view;

import Ad.c0;
import Bc.E;
import C0.G;
import Ce.ViewOnClickListenerC0159a;
import Ed.ViewOnFocusChangeListenerC0235o;
import F6.d;
import Gb.T;
import Gd.n;
import Gd.o;
import Gd.q;
import Gd.r;
import Kd.A0;
import Kd.B0;
import Kd.C0430y0;
import Kd.L0;
import M1.j;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.CycleInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.model.BaseFrameLayout;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.req.MatchBankReq;
import com.transsnet.palmpay.send_money.bean.req.TransferMatchMemberReq;
import com.transsnet.palmpay.send_money.bean.resp.MatchBankRecipientsResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferMatchMemberRsp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmRecipientInfoDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.viewmodel.TransferAddBankAccountViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.f;
import p159kd.e;
import p159kd.h;
import p173ld.C1894a;
import p173ld.w;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferToBankAccountView;", "Lcom/transsnet/palmpay/custom_view/model/BaseFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "event", "", "onTransactionMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;)V", "", "Lcom/transsnet/palmpay/core/bean/BankInfo;", "bankInfos", "setMatchBank", "(Ljava/util/List;)V", "", "getBankAccount", "()Ljava/lang/String;", "Lld/w;", "j", "Lkotlin/Lazy;", "getBankMatchAdapter", "()Lld/w;", "bankMatchAdapter", "Lld/a;", "Lcom/transsnet/palmpay/send_money/bean/resp/MatchBankRecipientsResp;", "o", "getMatchedRecipientsAdapter", "()Lld/a;", "matchedRecipientsAdapter", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankAccountView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankAccountView.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferToBankAccountView\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,851:1\n152#2:852\n169#2:853\n152#2:854\n169#2:855\n152#2:856\n169#2:857\n152#2:858\n169#2:859\n774#3:860\n865#3,2:861\n295#3,2:863\n*S KotlinDebug\n*F\n+ 1 TransferToBankAccountView.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferToBankAccountView\n*L\n284#1:852\n284#1:853\n291#1:854\n291#1:855\n306#1:856\n306#1:857\n317#1:858\n317#1:859\n373#1:860\n373#1:861,2\n615#1:863,2\n*E\n"})
public final class TransferToBankAccountView extends BaseFrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f33899A = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f33900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TransferToBankHomeFragment f33901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TransferAddBankAccountViewModel f33902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L0 f33903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33904g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConfirmRecipientInfoDialog f33905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33906j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f33908p;
    public final r t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f33909v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final T f33910w;

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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToBankAccountView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(TransferToBankAccountView transferToBankAccountView, ConfirmRecipientInfoDialog confirmRecipientInfoDialog, Boolean bool) {
        BankInfo bankInfo;
        if (bool.booleanValue()) {
            L0 l5 = transferToBankAccountView.f33903f;
            if (l5 == null) {
                Intrinsics.n("sharedViewModel");
                throw null;
            }
            TransferMatchMemberRsp.DataBean dataBean = l5.f5078g;
            if (dataBean == null || (bankInfo = l5.f5076e) == null) {
                return;
            }
            if (bankInfo.accountType == BankInfo.ACCOUNT_TYPE_PALMPAY) {
                r0.O0(dataBean.getTransType(), Integer.valueOf(dataBean.getBusinessType()), dataBean.getAccountNo(), p002a.a.e(new Pair("core_order_source_type", "COMMON"), new Pair("MEMBER_ID", dataBean.getPayeeMemberId()), TextUtils.isEmpty(dataBean.getPpAccountNo()) ? new Pair("extra_data", null) : new Pair("extra_data", dataBean.getPpAccountNo())));
                return;
            }
            TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
            Context context = confirmRecipientInfoDialog.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String bankAccount = transferToBankAccountView.getBankAccount();
            String accountName = dataBean.getAccountName();
            String str = transferToBankAccountView.f33904g;
            Boolean bool2 = transferToBankAccountView.f33909v;
            aVar.startAct(context, bankAccount, bankInfo, accountName, str, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        }
    }

    public static void b(TransferToBankAccountView transferToBankAccountView, Context context, View view) {
        try {
            int id2 = view.getId();
            if (id2 == e.rlSelectBank) {
                Postcard postcardBuild = ARouter.getInstance().build("/sm/select_bank_for_to_bank_activity");
                String bankAccount = transferToBankAccountView.getBankAccount();
                if (!TextUtils.isEmpty(bankAccount) && bankAccount.length() >= 10) {
                    postcardBuild.withString("core_extra_bank_account_data", transferToBankAccountView.getBankAccount());
                }
                TransferToBankHomeFragment transferToBankHomeFragment = transferToBankAccountView.f33901d;
                if (transferToBankHomeFragment != null) {
                    ARouter aRouter = ARouter.getInstance();
                    Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                    Intrinsics.e(postcardBuild);
                    r0.x(aRouter, transferToBankHomeFragment, postcardBuild, 2);
                }
                n0.g().l("Transfer_ToBank_SelectBank_Click");
                return;
            }
            if (id2 == e.tv_next) {
                if (transferToBankAccountView.getBankAccount().length() < 10) {
                    E e10 = transferToBankAccountView.f33900c;
                    if (e10 != null) {
                        ((ModelErrorDivider) e10.f633M).setErrorMessage(context.getString(h.sm_enter_10_digit_account_number));
                        return;
                    }
                    return;
                }
                E e11 = transferToBankAccountView.f33900c;
                if (e11 != null) {
                    ((ModelErrorDivider) e11.f633M).setErrorMessage("");
                }
                L0 l5 = transferToBankAccountView.f33903f;
                if (l5 == null) {
                    Intrinsics.n("sharedViewModel");
                    throw null;
                }
                if (l5.f5076e == null) {
                    E e12 = transferToBankAccountView.f33900c;
                    if (e12 != null) {
                        ((ModelErrorDivider) e12.f634Q).setErrorMessage(context.getString(h.sm_select_your_bank));
                        return;
                    }
                    return;
                }
                E e13 = transferToBankAccountView.f33900c;
                if (e13 != null) {
                    ((ModelErrorDivider) e13.f634Q).setErrorMessage("");
                }
                L0 l6 = transferToBankAccountView.f33903f;
                if (l6 == null) {
                    Intrinsics.n("sharedViewModel");
                    throw null;
                }
                TransferMatchMemberRsp.DataBean dataBean = l6.f5078g;
                if (dataBean == null) {
                    transferToBankAccountView.i(true);
                } else if (l6.f5076e != null) {
                    Integer recipientTradeStatus = dataBean.getRecipientTradeStatus();
                    if (recipientTradeStatus != null && recipientTradeStatus.intValue() == 0) {
                        transferToBankAccountView.r();
                    } else {
                        Integer recipientTradeStatus2 = dataBean.getRecipientTradeStatus();
                        if (recipientTradeStatus2 != null && recipientTradeStatus2.intValue() == 2) {
                            transferToBankAccountView.r();
                        } else {
                            L0 l8 = transferToBankAccountView.f33903f;
                            if (l8 == null) {
                                Intrinsics.n("sharedViewModel");
                                throw null;
                            }
                            BankInfo bankInfo = l8.f5076e;
                            if (bankInfo != null) {
                                if (bankInfo.accountType == BankInfo.ACCOUNT_TYPE_PALMPAY) {
                                    r0.O0(dataBean.getTransType(), Integer.valueOf(dataBean.getBusinessType()), dataBean.getAccountNo(), p002a.a.e(new Pair("core_order_source_type", "COMMON"), new Pair("MEMBER_ID", dataBean.getPayeeMemberId()), TextUtils.isEmpty(dataBean.getPpAccountNo()) ? new Pair("extra_data", null) : new Pair("extra_data", dataBean.getPpAccountNo())));
                                } else {
                                    TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                                    String bankAccount2 = transferToBankAccountView.getBankAccount();
                                    String accountName = dataBean.getAccountName();
                                    String str = transferToBankAccountView.f33904g;
                                    Boolean bool = transferToBankAccountView.f33909v;
                                    aVar.startAct(context, bankAccount2, bankInfo, accountName, str, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                                }
                            }
                        }
                    }
                }
                n0.g().l("Transfer_ToBank_Next_Click");
            }
        } catch (Exception unused) {
        }
    }

    public static void c(TransferToBankAccountView transferToBankAccountView, j jVar, View view, int i7) {
        CustomAutoCompleteTextView customAutoCompleteTextView;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        MatchBankRecipientsResp matchBankRecipientsResp = (MatchBankRecipientsResp) transferToBankAccountView.getMatchedRecipientsAdapter().getItem(i7);
        n0.g().l("Transfer_ToBank_AccountSuggestion_Click");
        BankInfo bankInfo = new BankInfo();
        bankInfo.bankCode = matchBankRecipientsResp.getRecipientBankCode();
        bankInfo.bankName = matchBankRecipientsResp.getRecipientBankName();
        bankInfo.bankUrl = matchBankRecipientsResp.getRecipientHeadImage();
        bankInfo.accountType = matchBankRecipientsResp.getAccountType();
        transferToBankAccountView.m(bankInfo);
        E e10 = transferToBankAccountView.f33900c;
        if (e10 != null && (customAutoCompleteTextView = (CustomAutoCompleteTextView) e10.f648w) != null) {
            CommonViewExtKt.setTextAndSelection(customAutoCompleteTextView, matchBankRecipientsResp.getAccount());
        }
        transferToBankAccountView.k();
        d.h("TransferToBankAccountView", 3, G.o("OnItemClick= ", matchBankRecipientsResp.getAccount()));
    }

    public static void d(TransferToBankAccountView transferToBankAccountView, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        transferToBankAccountView.m((BankInfo) transferToBankAccountView.getBankMatchAdapter().getItem(i7));
    }

    public static final void f(TransferToBankAccountView transferToBankAccountView, CommonListResultV2 commonListResultV2) {
        transferToBankAccountView.getClass();
        if (!commonListResultV2.isSuccess()) {
            transferToBankAccountView.f33908p = z.f38935a;
            transferToBankAccountView.k();
            return;
        }
        List list = commonListResultV2.data;
        if (list == null) {
            list = z.f38935a;
        }
        transferToBankAccountView.f33908p = list;
        L0 l5 = transferToBankAccountView.f33903f;
        if (l5 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        l5.f5079i = list;
        transferToBankAccountView.t(transferToBankAccountView.getBankAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBankAccount() {
        E e10 = this.f33900c;
        return y.k(String.valueOf(e10 != null ? ((CustomAutoCompleteTextView) e10.f648w).getText() : null), " ", "");
    }

    private final w getBankMatchAdapter() {
        return (w) this.f33906j.getValue();
    }

    private final C1894a getMatchedRecipientsAdapter() {
        return (C1894a) this.f33907o.getValue();
    }

    public static void q(LinearLayout linearLayout) {
        if (linearLayout != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_X.getName(), 0.0f, 8.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(4.0f));
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMatchBank(List<? extends BankInfo> bankInfos) {
        RecyclerView recyclerView;
        E e10 = this.f33900c;
        if (e10 != null && (recyclerView = e10.f640e) != null) {
            p220oa.h.C(recyclerView);
        }
        getBankMatchAdapter().setList(bankInfos);
    }

    public final void h(TransferToBankHomeFragment fragment, LifecycleOwner lifecycleOwner, String str) {
        int i7 = 3;
        final int i10 = 1;
        final int i11 = 0;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f33901d = fragment;
        this.f33904g = str;
        this.f33902e = (TransferAddBankAccountViewModel) new androidx.camera.video.internal.c(fragment).h(TransferAddBankAccountViewModel.class);
        AbstractC1205o lifecycle = fragment.getLifecycle();
        TransferAddBankAccountViewModel transferAddBankAccountViewModel = this.f33902e;
        if (transferAddBankAccountViewModel == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        lifecycle.a(transferAddBankAccountViewModel);
        androidx.fragment.app.E eRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
        this.f33903f = (L0) new androidx.camera.video.internal.c(eRequireActivity).h(L0.class);
        if (!org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().j(this);
        }
        E e10 = this.f33900c;
        T t = this.f33910w;
        if (e10 != null) {
            e10.f639d.setOnClickListener(t);
        }
        E e11 = this.f33900c;
        if (e11 != null) {
            e11.f643i.setOnClickListener(t);
        }
        E e12 = this.f33900c;
        if (e12 != null) {
            e12.f640e.setAdapter(getBankMatchAdapter());
        }
        E e13 = this.f33900c;
        if (e13 != null) {
            e13.f640e.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        E e14 = this.f33900c;
        if (e14 != null) {
            RecyclerView recyclerView = e14.f640e;
            C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, getContext()), CommonViewExtKt.getDp(1));
            c1548f.f31336e = false;
            recyclerView.addItemDecoration(c1548f);
        }
        E e15 = this.f33900c;
        if (e15 != null) {
            ((RecyclerView) e15.f635X).setAdapter(getMatchedRecipientsAdapter());
        }
        E e16 = this.f33900c;
        if (e16 != null) {
            ((RecyclerView) e16.f635X).setLayoutManager(new LinearLayoutManager(getContext()));
        }
        getBankMatchAdapter().setOnItemClickListener(new OnItemClickListener(this) { // from class: Gd.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankAccountView f3365b;

            {
                this.f3365b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i12) {
                switch (i11) {
                    case 0:
                        TransferToBankAccountView.d(this.f3365b, jVar, view, i12);
                        break;
                    default:
                        TransferToBankAccountView.c(this.f3365b, jVar, view, i12);
                        break;
                }
            }
        });
        getMatchedRecipientsAdapter().setOnItemClickListener(new OnItemClickListener(this) { // from class: Gd.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankAccountView f3365b;

            {
                this.f3365b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i12) {
                switch (i10) {
                    case 0:
                        TransferToBankAccountView.d(this.f3365b, jVar, view, i12);
                        break;
                    default:
                        TransferToBankAccountView.c(this.f3365b, jVar, view, i12);
                        break;
                }
            }
        });
        E e17 = this.f33900c;
        if (e17 != null) {
            e17.f646p.setHint(G.i("").append(getContext().getString(h.sm_select_your_bank)).setFontSize(14, true).setFontFamily("sans-serif").create());
        }
        E e18 = this.f33900c;
        if (e18 != null) {
            ((CustomAutoCompleteTextView) e18.f648w).setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
        }
        E e19 = this.f33900c;
        if (e19 != null) {
            ((CustomAutoCompleteTextView) e19.f648w).setHint(G.i("").append(getContext().getString(h.sm_enter_10_digits_account_number)).setFontSize(14, true).setFontFamily("sans-serif").create());
        }
        E e20 = this.f33900c;
        r rVar = this.t;
        if (e20 != null) {
            ((CustomAutoCompleteTextView) e20.f648w).addTextChangedListener(rVar);
        }
        E e21 = this.f33900c;
        if (e21 != null) {
            ((CustomAutoCompleteTextView) e21.f648w).setVerticalScrollBarEnabled(false);
        }
        L0 l5 = this.f33903f;
        if (l5 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        if (!TextUtils.isEmpty(l5.f5075d)) {
            E e22 = this.f33900c;
            if (e22 != null) {
                ((CustomAutoCompleteTextView) e22.f648w).setText(l5.f5075d);
            }
            E e23 = this.f33900c;
            if (e23 != null) {
                CustomAutoCompleteTextView customAutoCompleteTextView = (CustomAutoCompleteTextView) e23.f648w;
                Editable text = customAutoCompleteTextView.getText();
                customAutoCompleteTextView.setSelection(text != null ? text.length() : 0);
            }
            BankInfo bankInfo = l5.f5076e;
            if (bankInfo != null) {
                m(bankInfo);
            } else {
                List list = l5.f5077f;
                if (list == null || !(!list.isEmpty())) {
                    String str2 = l5.f5075d;
                    if ((str2 != null ? str2.length() : 0) >= 10) {
                        i(false);
                    }
                } else {
                    setMatchBank(l5.f5077f);
                }
            }
        }
        u();
        E e24 = this.f33900c;
        if (e24 != null) {
            ((CustomAutoCompleteTextView) e24.f648w).removeTextChangedListener(rVar);
        }
        E e25 = this.f33900c;
        if (e25 != null) {
            p220oa.h.r((CustomAutoCompleteTextView) e25.f648w, new r(this, i11), new ViewOnFocusChangeListenerC0235o(this, i10));
        }
        TransferAddBankAccountViewModel transferAddBankAccountViewModel2 = this.f33902e;
        if (transferAddBankAccountViewModel2 == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        l lVar = transferAddBankAccountViewModel2.f34030i;
        if (lVar != null) {
            lVar.e(lifecycleOwner, new Fd.G(new q(this, i11), 3));
        }
        TransferAddBankAccountViewModel transferAddBankAccountViewModel3 = this.f33902e;
        if (transferAddBankAccountViewModel3 == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        l lVar2 = transferAddBankAccountViewModel3.f34029g;
        if (lVar2 != null) {
            lVar2.e(lifecycleOwner, new Fd.G(new q(this, i10), 3));
        }
        TransferAddBankAccountViewModel transferAddBankAccountViewModel4 = this.f33902e;
        if (transferAddBankAccountViewModel4 == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        l lVar3 = transferAddBankAccountViewModel4.f34027e;
        if (lVar3 != null) {
            lVar3.e(lifecycleOwner, new Fd.G(new q(this, 2), 3));
        }
        TransferAddBankAccountViewModel transferAddBankAccountViewModel5 = this.f33902e;
        if (transferAddBankAccountViewModel5 == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        l lVar4 = transferAddBankAccountViewModel5.f34028f;
        if (lVar4 != null) {
            lVar4.e(lifecycleOwner, new Fd.G(new q(this, i7), 3));
        }
        L0 l6 = this.f33903f;
        if (l6 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        List list2 = l6.f5079i;
        if (list2 == null || list2.isEmpty()) {
            TransferAddBankAccountViewModel transferAddBankAccountViewModel6 = this.f33902e;
            if (transferAddBankAccountViewModel6 != null) {
                transferAddBankAccountViewModel6.d();
                return;
            } else {
                Intrinsics.n("requestViewModel");
                throw null;
            }
        }
        L0 l8 = this.f33903f;
        if (l8 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        List list3 = l8.f5079i;
        if (list3 == null) {
            list3 = z.f38935a;
        }
        this.f33908p = list3;
        t(getBankAccount());
    }

    public final void i(boolean z3) {
        Object next;
        l();
        String bankAccount = getBankAccount();
        if (bankAccount.length() < 10) {
            j();
            return;
        }
        L0 l5 = this.f33903f;
        if (l5 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        List list = l5.f5079i;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.c(((MatchBankRecipientsResp) next).getRecipientAccountNumber(), bankAccount));
            this.f33909v = Boolean.valueOf(((MatchBankRecipientsResp) next) != null);
        }
        L0 l6 = this.f33903f;
        if (l6 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        BankInfo bankInfo = l6.f5076e;
        if (bankInfo == null) {
            s(getContext().getString(h.sm_matching_banks));
            TransferAddBankAccountViewModel transferAddBankAccountViewModel = this.f33902e;
            if (transferAddBankAccountViewModel == null) {
                Intrinsics.n("requestViewModel");
                throw null;
            }
            MatchBankReq matchBankReq = new MatchBankReq();
            matchBankReq.setAccountNo(getBankAccount());
            matchBankReq.setSourceType(1);
            f.s(transferAddBankAccountViewModel, new B0(matchBankReq, null), transferAddBankAccountViewModel.f34029g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            return;
        }
        s(getContext().getString(h.sm_looking_for_this_user_name));
        TransferMatchMemberReq transferMatchMemberReq = new TransferMatchMemberReq();
        transferMatchMemberReq.setSourceType(1);
        transferMatchMemberReq.setAccountNo(bankAccount);
        transferMatchMemberReq.setAccountType(bankInfo.accountType);
        transferMatchMemberReq.setBankCode(bankInfo.bankCode);
        transferMatchMemberReq.setExistRecipient(this.f33909v);
        if (z3) {
            TransferAddBankAccountViewModel transferAddBankAccountViewModel2 = this.f33902e;
            if (transferAddBankAccountViewModel2 != null) {
                f.s(transferAddBankAccountViewModel2, new C0430y0(transferMatchMemberReq, null), transferAddBankAccountViewModel2.f34028f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            } else {
                Intrinsics.n("requestViewModel");
                throw null;
            }
        }
        if (this.f33903f == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        TransferAddBankAccountViewModel transferAddBankAccountViewModel3 = this.f33902e;
        if (transferAddBankAccountViewModel3 != null) {
            f.s(transferAddBankAccountViewModel3, new A0(transferMatchMemberReq, null), transferAddBankAccountViewModel3.f34027e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        } else {
            Intrinsics.n("requestViewModel");
            throw null;
        }
    }

    public final void j() {
        L0 l5 = this.f33903f;
        if (l5 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        l5.f5078g = null;
        if (l5 != null) {
            return;
        }
        Intrinsics.n("sharedViewModel");
        throw null;
    }

    public final void k() {
        RecyclerView recyclerView;
        getMatchedRecipientsAdapter().a("", z.f38935a);
        E e10 = this.f33900c;
        if (e10 == null || (recyclerView = (RecyclerView) e10.f635X) == null) {
            return;
        }
        p220oa.h.c(recyclerView);
    }

    public final void l() {
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.f(new Fade(1));
            transitionSet.f(new ChangeBounds());
            E e10 = this.f33900c;
            if (e10 != null) {
                X.a((LinearLayout) e10.f632L, transitionSet);
            }
        } catch (Exception unused) {
        }
        E e11 = this.f33900c;
        if (e11 != null) {
            p220oa.h.c((LinearLayout) e11.f630C);
        }
        E e12 = this.f33900c;
        if (e12 != null) {
            p220oa.h.c((LinearLayout) e12.f631H);
        }
        E e13 = this.f33900c;
        if (e13 != null) {
            p220oa.h.c((LinearLayout) e13.f629B);
        }
        E e14 = this.f33900c;
        if (e14 != null) {
            p220oa.h.c(e14.f640e);
        }
    }

    public final void m(BankInfo bankInfo) {
        if (bankInfo == null) {
            return;
        }
        L0 l5 = this.f33903f;
        if (l5 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        l5.f5076e = bankInfo;
        E e10 = this.f33900c;
        if (e10 != null) {
            p220oa.h.C((Group) e10.f628A);
        }
        L0 l6 = this.f33903f;
        if (l6 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        BankInfo bankInfo2 = l6.f5076e;
        if (bankInfo2 != null) {
            E e11 = this.f33900c;
            if (e11 != null) {
                TextView textView = e11.f646p;
                textView.setText(bankInfo2.bankName);
                textView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, textView.getContext()));
            }
            E e12 = this.f33900c;
            if (e12 != null) {
                r0.o1(bankInfo2.bankUrl, e12.f637b);
            }
            String str = (!i0.V(this) || TextUtils.isEmpty(bankInfo2.bankDarkMark)) ? bankInfo2.bankMark : bankInfo2.bankDarkMark;
            if (TextUtils.isEmpty(str)) {
                E e13 = this.f33900c;
                if (e13 != null) {
                    p220oa.h.c(e13.f638c);
                }
            } else {
                E e14 = this.f33900c;
                if (e14 != null) {
                    r0.i1(e14.f638c, str, Integer.MIN_VALUE, CommonViewExtKt.getDp(18));
                }
            }
        }
        u();
        i(false);
    }

    public final void n(TransferMatchMemberRsp transferMatchMemberRsp, boolean z3) {
        if (this.f33903f == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        l();
        E e10 = this.f33900c;
        if (e10 != null) {
            ((ModelErrorDivider) e10.f633M).setErrorMessage("");
        }
        E e11 = this.f33900c;
        if (e11 != null) {
            ((ModelErrorDivider) e11.f634Q).setErrorMessage("");
        }
        if (transferMatchMemberRsp == null || !transferMatchMemberRsp.isSuccess()) {
            E e12 = this.f33900c;
            if (e12 != null) {
                p220oa.h.C((LinearLayout) e12.f631H);
            }
            j();
            p(transferMatchMemberRsp != null ? transferMatchMemberRsp.getRespMsg() : null, true);
            return;
        }
        TransferMatchMemberRsp.DataBean data = transferMatchMemberRsp.getData();
        if (data != null) {
            L0 l5 = this.f33903f;
            if (l5 == null) {
                Intrinsics.n("sharedViewModel");
                throw null;
            }
            l5.f5078g = data;
            if (!TextUtils.isEmpty(data.getBankToPhoneTransPrefixTips()) && !TextUtils.isEmpty(data.getBankToPhoneTransSuffixTips())) {
                E e13 = this.f33900c;
                if (e13 != null) {
                    p220oa.h.c((LinearLayout) e13.f631H);
                }
                SpanUtils spanUtils = new SpanUtils();
                String bankToPhoneTransPrefixTips = data.getBankToPhoneTransPrefixTips();
                if (bankToPhoneTransPrefixTips == null) {
                    bankToPhoneTransPrefixTips = "";
                }
                SpanUtils spanUtilsAppend = spanUtils.append(bankToPhoneTransPrefixTips);
                String bankToPhoneTransSuffixTips = data.getBankToPhoneTransSuffixTips();
                p(spanUtilsAppend.append(bankToPhoneTransSuffixTips != null ? bankToPhoneTransSuffixTips : "").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext())).create(), false);
                return;
            }
            if (TextUtils.isEmpty(data.getAccountName())) {
                return;
            }
            E e14 = this.f33900c;
            if (e14 != null) {
                p220oa.h.c((LinearLayout) e14.f629B);
            }
            E e15 = this.f33900c;
            if (e15 != null) {
                p220oa.h.C((LinearLayout) e15.f631H);
            }
            E e16 = this.f33900c;
            if (e16 != null) {
                e16.f645o.setText(data.getAccountName());
            }
            E e17 = this.f33900c;
            if (e17 != null) {
                e17.f645o.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, getContext()));
            }
            if (z3) {
                L0 l6 = this.f33903f;
                if (l6 == null) {
                    Intrinsics.n("sharedViewModel");
                    throw null;
                }
                if (l6.f5076e != null) {
                    r();
                }
            }
        }
    }

    public final void o() {
        TextView textView;
        Group group;
        E e10 = this.f33900c;
        if (e10 != null && (group = (Group) e10.f628A) != null) {
            p220oa.h.c(group);
        }
        E e11 = this.f33900c;
        if (e11 != null && (textView = e11.f646p) != null) {
            textView.setText(h.sm_select_your_bank);
            textView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, textView.getContext()));
        }
        l();
        L0 l5 = this.f33903f;
        if (l5 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        l5.f5076e = null;
        l5.f5077f = null;
        l5.f5078g = null;
        u();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransactionMessage(@Nullable TransactionEvent event) {
        CustomAutoCompleteTextView customAutoCompleteTextView;
        E e10 = this.f33900c;
        if (e10 == null || (customAutoCompleteTextView = (CustomAutoCompleteTextView) e10.f648w) == null) {
            return;
        }
        customAutoCompleteTextView.setText("");
    }

    public final void p(CharSequence charSequence, boolean z3) {
        if (TextUtils.isEmpty(charSequence)) {
            E e10 = this.f33900c;
            if (e10 != null) {
                p220oa.h.c((LinearLayout) e10.f629B);
                return;
            }
            return;
        }
        E e11 = this.f33900c;
        if (e11 != null) {
            p220oa.h.C((LinearLayout) e11.f629B);
        }
        E e12 = this.f33900c;
        if (e12 != null) {
            e12.f644j.setText(charSequence);
        }
        if (z3) {
            E e13 = this.f33900c;
            q(e13 != null ? (LinearLayout) e13.f629B : null);
            E e14 = this.f33900c;
            if (e14 != null) {
                ((LinearLayout) e14.f629B).setOnClickListener(null);
                return;
            }
            return;
        }
        E e15 = this.f33900c;
        q(e15 != null ? (LinearLayout) e15.f629B : null);
        E e16 = this.f33900c;
        if (e16 != null) {
            ((LinearLayout) e16.f629B).setOnClickListener(new ViewOnClickListenerC0159a(this, 24));
        }
    }

    public final void r() {
        Integer recipientTradeStatus;
        ConfirmRecipientInfoDialog confirmRecipientInfoDialog = this.f33905i;
        if (confirmRecipientInfoDialog == null || !confirmRecipientInfoDialog.isShowing()) {
            E e10 = this.f33900c;
            String strValueOf = String.valueOf(e10 != null ? ((CustomAutoCompleteTextView) e10.f648w).getText() : null);
            ConfirmRecipientInfoDialog confirmRecipientInfoDialog2 = new ConfirmRecipientInfoDialog(getContext(), "Transfer_ToBank_RecipientConfirm");
            this.f33905i = confirmRecipientInfoDialog2;
            confirmRecipientInfoDialog2.show();
            L0 l5 = this.f33903f;
            if (l5 == null) {
                Intrinsics.n("sharedViewModel");
                throw null;
            }
            BankInfo bankInfo = l5.f5076e;
            TransferMatchMemberRsp.DataBean dataBean = l5.f5078g;
            String accountName = dataBean != null ? dataBean.getAccountName() : null;
            L0 l6 = this.f33903f;
            if (l6 == null) {
                Intrinsics.n("sharedViewModel");
                throw null;
            }
            TransferMatchMemberRsp.DataBean dataBean2 = l6.f5078g;
            confirmRecipientInfoDialog2.updateUi(bankInfo, strValueOf, accountName, (dataBean2 == null || (recipientTradeStatus = dataBean2.getRecipientTradeStatus()) == null || recipientTradeStatus.intValue() != 2) ? false : true);
            confirmRecipientInfoDialog2.setResultCallback(new c0(19, this, confirmRecipientInfoDialog2));
            confirmRecipientInfoDialog2.setRecheckCallback(new o(confirmRecipientInfoDialog2, 0));
        }
    }

    public final void s(String str) {
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        TextView textView;
        LinearLayout linearLayout2;
        E e10 = this.f33900c;
        if (e10 != null && (linearLayout2 = (LinearLayout) e10.f630C) != null) {
            p220oa.h.C(linearLayout2);
        }
        E e11 = this.f33900c;
        if (e11 != null && (textView = e11.f642g) != null) {
            textView.setText(str);
        }
        E e12 = this.f33900c;
        if (e12 != null && (linearLayout = (LinearLayout) e12.f631H) != null) {
            p220oa.h.c(linearLayout);
        }
        E e13 = this.f33900c;
        if (e13 == null || (recyclerView = e13.f640e) == null) {
            return;
        }
        p220oa.h.c(recyclerView);
    }

    public final void t(String str) {
        String strK;
        String strK2 = y.k(str, " ", "");
        if (strK2.length() == 0) {
            k();
            return;
        }
        List list = this.f33908p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String recipientAccountNumber = ((MatchBankRecipientsResp) obj).getRecipientAccountNumber();
            if (recipientAccountNumber != null && (strK = y.k(recipientAccountNumber, " ", "")) != null && y.m(strK, strK2, false)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            k();
            return;
        }
        getMatchedRecipientsAdapter().a(strK2, CollectionsKt.U(arrayList, 2));
        E e10 = this.f33900c;
        if (e10 != null) {
            p220oa.h.C((RecyclerView) e10.f635X);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    public final void u() {
        TextView textView;
        boolean z3;
        E e10 = this.f33900c;
        if (e10 == null || (textView = e10.f643i) == null) {
            return;
        }
        if (getBankAccount().length() <= 0) {
            z3 = false;
        } else {
            L0 l5 = this.f33903f;
            if (l5 == null) {
                Intrinsics.n("sharedViewModel");
                throw null;
            }
            if (l5.f5076e != null) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        textView.setEnabled(z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToBankAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferToBankAccountView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToBankAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(p159kd.f.sm_view_transfer_to_bank_account, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = e.account_bank_icon;
        ImageView imageView = (ImageView) p059e1.a.m(i10, viewInflate);
        if (imageView != null) {
            i10 = e.clipboard_account_prompt;
            ClipboardAccountPromptView clipboardAccountPromptView = (ClipboardAccountPromptView) p059e1.a.m(i10, viewInflate);
            if (clipboardAccountPromptView != null) {
                i10 = e.et_bank_account;
                CustomAutoCompleteTextView customAutoCompleteTextView = (CustomAutoCompleteTextView) p059e1.a.m(i10, viewInflate);
                if (customAutoCompleteTextView != null) {
                    i10 = e.g_selected_bank;
                    Group group = (Group) p059e1.a.m(i10, viewInflate);
                    if (group != null) {
                        i10 = e.indicatorView;
                        if (((CircularProgressIndicator) p059e1.a.m(i10, viewInflate)) != null) {
                            i10 = e.iv_arrow_right;
                            if (((IconicsImageView) p059e1.a.m(i10, viewInflate)) != null) {
                                i10 = e.iv_label;
                                ImageView imageView2 = (ImageView) p059e1.a.m(i10, viewInflate);
                                if (imageView2 != null) {
                                    i10 = e.iv_query_status;
                                    if (((IconicsImageView) p059e1.a.m(i10, viewInflate)) != null) {
                                        i10 = e.iv_recipient_status;
                                        if (((IconicsImageView) p059e1.a.m(i10, viewInflate)) != null) {
                                            i10 = e.ll_bank_account;
                                            if (((LinearLayout) p059e1.a.m(i10, viewInflate)) != null) {
                                                i10 = e.ll_query_status;
                                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                                if (linearLayout != null) {
                                                    i10 = e.ll_recipient_loading;
                                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                                    if (linearLayout2 != null) {
                                                        i10 = e.ll_recipient_name;
                                                        LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                                        if (linearLayout3 != null) {
                                                            LinearLayout linearLayout4 = (LinearLayout) viewInflate;
                                                            i10 = e.ll_status;
                                                            LinearLayout linearLayout5 = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                                            if (linearLayout5 != null) {
                                                                i10 = e.med_account;
                                                                ModelErrorDivider modelErrorDivider = (ModelErrorDivider) p059e1.a.m(i10, viewInflate);
                                                                if (modelErrorDivider != null) {
                                                                    i10 = e.med_bank;
                                                                    ModelErrorDivider modelErrorDivider2 = (ModelErrorDivider) p059e1.a.m(i10, viewInflate);
                                                                    if (modelErrorDivider2 != null) {
                                                                        i10 = e.rlSelectBank;
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i10, viewInflate);
                                                                        if (constraintLayout != null) {
                                                                            i10 = e.rv_matched_bank;
                                                                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
                                                                            if (recyclerView != null) {
                                                                                i10 = e.rv_matched_recipients;
                                                                                RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i10, viewInflate);
                                                                                if (recyclerView2 != null) {
                                                                                    i10 = e.tvBankLabel;
                                                                                    TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                    if (textView != null) {
                                                                                        i10 = e.tv_loading_text;
                                                                                        TextView textView2 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                        if (textView2 != null) {
                                                                                            i10 = e.tv_next;
                                                                                            TextView textView3 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                            if (textView3 != null) {
                                                                                                i10 = e.tv_query_content;
                                                                                                TextView textView4 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                                if (textView4 != null) {
                                                                                                    i10 = e.tv_recipient_name;
                                                                                                    TextView textView5 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                                    if (textView5 != null) {
                                                                                                        i10 = e.tvSelectBank;
                                                                                                        TextView textView6 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                                        if (textView6 != null) {
                                                                                                            this.f33900c = new E(linearLayout4, imageView, clipboardAccountPromptView, customAutoCompleteTextView, group, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout5, modelErrorDivider, modelErrorDivider2, constraintLayout, recyclerView, recyclerView2, textView, textView2, textView3, textView4, textView5, textView6);
                                                                                                            this.f33904g = "COMMON";
                                                                                                            this.f33906j = C2131j.b(new Ae.j(this, 20));
                                                                                                            this.f33907o = C2131j.b(new n(context, 0));
                                                                                                            this.f33908p = z.f38935a;
                                                                                                            this.t = new r(this, 1);
                                                                                                            this.f33910w = new T(2, this, context);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
