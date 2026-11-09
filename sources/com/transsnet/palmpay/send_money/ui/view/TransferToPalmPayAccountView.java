package com.transsnet.palmpay.send_money.ui.view;

import Ab.i;
import Bc.D;
import Ce.ViewOnClickListenerC0159a;
import Fd.G;
import Gd.n;
import Gd.o;
import Gd.y;
import Kd.S1;
import Kd.a2;
import M1.j;
import Pa.n0;
import Pa.r0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.CycleInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.model.BaseFrameLayout;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.resp.MatchPalmPayRecipientsResp;
import com.transsnet.palmpay.send_money.bean.resp.SearchPalmPayAccountResp;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmRecipientInfoDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
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
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.f;
import p159kd.e;
import p159kd.h;
import p173ld.C1894a;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferToPalmPayAccountView;", "Lcom/transsnet/palmpay/custom_view/model/BaseFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "event", "", "onTransactionMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;)V", "", "getAccount", "()Ljava/lang/String;", "Lld/a;", "Lcom/transsnet/palmpay/send_money/bean/resp/MatchPalmPayRecipientsResp;", "o", "Lkotlin/Lazy;", "getAdapter", "()Lld/a;", "adapter", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayAccountView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayAccountView.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferToPalmPayAccountView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,500:1\n1#2:501\n152#3:502\n169#3:503\n152#3:504\n169#3:505\n295#4,2:506\n774#4:508\n865#4,2:509\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayAccountView.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferToPalmPayAccountView\n*L\n201#1:502\n201#1:503\n208#1:504\n208#1:505\n268#1:506,2\n332#1:508\n332#1:509,2\n*E\n"})
public final class TransferToPalmPayAccountView extends BaseFrameLayout {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D f33930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TransferToPalmPayHomeViewModel f33931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S1 f33932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SearchPalmPayAccountResp f33933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33934g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f33935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ConfirmRecipientInfoDialog f33936j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f33938p;

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
    public TransferToPalmPayAccountView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(TransferToPalmPayAccountView transferToPalmPayAccountView) {
        Integer recipientTradeStatus;
        Integer recipientTradeStatus2;
        if (transferToPalmPayAccountView.getAccount().length() < 10) {
            D d2 = transferToPalmPayAccountView.f33930c;
            if (d2 != null) {
                ((ModelErrorDivider) d2.f614A).setErrorMessage(transferToPalmPayAccountView.getContext().getString(h.sm_enter_10_digit_account_number));
                return;
            }
            return;
        }
        D d10 = transferToPalmPayAccountView.f33930c;
        if (d10 != null) {
            ((ModelErrorDivider) d10.f614A).setErrorMessage("");
        }
        SearchPalmPayAccountResp searchPalmPayAccountResp = transferToPalmPayAccountView.f33933f;
        if (searchPalmPayAccountResp != null) {
            Integer recipientTradeStatus3 = searchPalmPayAccountResp.getRecipientTradeStatus();
            if ((recipientTradeStatus3 != null && recipientTradeStatus3.intValue() == 2) || ((recipientTradeStatus = searchPalmPayAccountResp.getRecipientTradeStatus()) != null && recipientTradeStatus.intValue() == 0)) {
                ConfirmRecipientInfoDialog confirmRecipientInfoDialog = transferToPalmPayAccountView.f33936j;
                if (confirmRecipientInfoDialog == null || !confirmRecipientInfoDialog.isShowing()) {
                    ConfirmRecipientInfoDialog confirmRecipientInfoDialog2 = new ConfirmRecipientInfoDialog(transferToPalmPayAccountView.getContext(), "Transfer_ToPalmPay_RecipientConfirm");
                    confirmRecipientInfoDialog2.show();
                    BankInfo bankInfo = new BankInfo();
                    bankInfo.bankName = confirmRecipientInfoDialog2.getContext().getString(h.sm_palmpay_text);
                    bankInfo.bankUrl = "https://transsnet-app-images-prod.s3.eu-west-1.amazonaws.com/20230608/6481dd92ba53c2102104399a.png";
                    SearchPalmPayAccountResp searchPalmPayAccountResp2 = transferToPalmPayAccountView.f33933f;
                    String accountNo = searchPalmPayAccountResp2 != null ? searchPalmPayAccountResp2.getAccountNo() : null;
                    SearchPalmPayAccountResp searchPalmPayAccountResp3 = transferToPalmPayAccountView.f33933f;
                    String accountName = searchPalmPayAccountResp3 != null ? searchPalmPayAccountResp3.getAccountName() : null;
                    SearchPalmPayAccountResp searchPalmPayAccountResp4 = transferToPalmPayAccountView.f33933f;
                    confirmRecipientInfoDialog2.updateUi(bankInfo, accountNo, accountName, (searchPalmPayAccountResp4 == null || (recipientTradeStatus2 = searchPalmPayAccountResp4.getRecipientTradeStatus()) == null || recipientTradeStatus2.intValue() != 2) ? false : true);
                    confirmRecipientInfoDialog2.setResultCallback(new y(transferToPalmPayAccountView));
                    confirmRecipientInfoDialog2.setRecheckCallback(new o(confirmRecipientInfoDialog2, 1));
                    transferToPalmPayAccountView.f33936j = confirmRecipientInfoDialog2;
                }
            } else {
                transferToPalmPayAccountView.g(searchPalmPayAccountResp);
            }
        }
        n0.g().l("Transfer_ToPalmPay_Next_Click");
    }

    public static void b(TransferToPalmPayAccountView transferToPalmPayAccountView, j jVar, View view, int i7) {
        CustomAutoCompleteTextView customAutoCompleteTextView;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        n0.g().l("Transfer_ToPalmPay_AccountSuggestion_Click");
        D d2 = transferToPalmPayAccountView.f33930c;
        if (d2 != null && (customAutoCompleteTextView = (CustomAutoCompleteTextView) d2.f616b) != null) {
            CommonViewExtKt.setTextAndSelection(customAutoCompleteTextView, ((MatchPalmPayRecipientsResp) transferToPalmPayAccountView.getAdapter().getItem(i7)).getAccount());
        }
        transferToPalmPayAccountView.h();
    }

    public static final void c(TransferToPalmPayAccountView transferToPalmPayAccountView) {
        MatchPalmPayRecipientsResp matchPalmPayRecipientsResp;
        Object next;
        transferToPalmPayAccountView.i();
        String account = transferToPalmPayAccountView.getAccount();
        if (account.length() >= 10) {
            if (PhoneBaseNumberUtils.INSTANCE.isValidMobileNumber(account, BaseApplication.getCountryLocale(), true)) {
                TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = transferToPalmPayAccountView.f33931d;
                if (transferToPalmPayHomeViewModel == null) {
                    Intrinsics.n("requestViewModel");
                    throw null;
                }
                List list = transferToPalmPayHomeViewModel.t;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        String accountNo = ((MatchPalmPayRecipientsResp) next).getAccountNo();
                        if (accountNo != null && StringsKt.A(accountNo, account, false)) {
                            break;
                        }
                    }
                    matchPalmPayRecipientsResp = (MatchPalmPayRecipientsResp) next;
                } else {
                    matchPalmPayRecipientsResp = null;
                }
                transferToPalmPayAccountView.f33935i = Boolean.valueOf(matchPalmPayRecipientsResp != null);
                D d2 = transferToPalmPayAccountView.f33930c;
                if (d2 != null) {
                    p220oa.h.C((LinearLayout) d2.f617c);
                }
                D d10 = transferToPalmPayAccountView.f33930c;
                if (d10 != null) {
                    p220oa.h.c((LinearLayout) d10.t);
                }
                D d11 = transferToPalmPayAccountView.f33930c;
                if (d11 != null) {
                    p220oa.h.c((LinearLayout) d11.f618d);
                }
                TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel2 = transferToPalmPayAccountView.f33931d;
                if (transferToPalmPayHomeViewModel2 != null) {
                    f.s(transferToPalmPayHomeViewModel2, new a2(account, transferToPalmPayAccountView.f33935i, null), transferToPalmPayHomeViewModel2.f34082j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                } else {
                    Intrinsics.n("requestViewModel");
                    throw null;
                }
            }
        }
    }

    public static final void e(TransferToPalmPayAccountView transferToPalmPayAccountView, CommonListResultV2 commonListResultV2) {
        transferToPalmPayAccountView.getClass();
        if (!commonListResultV2.isSuccess()) {
            transferToPalmPayAccountView.f33938p = z.f38935a;
            transferToPalmPayAccountView.h();
            return;
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = transferToPalmPayAccountView.f33931d;
        if (transferToPalmPayHomeViewModel == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        List list = commonListResultV2.data;
        transferToPalmPayHomeViewModel.t = list;
        if (list == null) {
            list = z.f38935a;
        }
        transferToPalmPayAccountView.f33938p = list;
        transferToPalmPayAccountView.k(transferToPalmPayAccountView.getAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAccount() {
        D d2 = this.f33930c;
        return kotlin.text.y.k(String.valueOf(d2 != null ? ((CustomAutoCompleteTextView) d2.f616b).getText() : null), " ", "");
    }

    private final C1894a getAdapter() {
        return (C1894a) this.f33937o.getValue();
    }

    public final void f(TransferToPalmPayHomeFragment fragment, LifecycleOwner lifecycleOwner, String str) {
        D d2;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f33934g = str;
        this.f33931d = (TransferToPalmPayHomeViewModel) new androidx.camera.video.internal.c(fragment).h(TransferToPalmPayHomeViewModel.class);
        E eRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
        this.f33932e = (S1) new androidx.camera.video.internal.c(eRequireActivity).h(S1.class);
        if (!org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().j(this);
        }
        D d10 = this.f33930c;
        if (d10 != null) {
            CustomAutoCompleteTextView customAutoCompleteTextView = (CustomAutoCompleteTextView) d10.f616b;
            SpannableString spannableString = new SpannableString(getContext().getString(h.sm_enter_10_digits_account_number_or_phone));
            spannableString.setSpan(new TypefaceSpan("sans-serif"), 0, spannableString.length(), 33);
            customAutoCompleteTextView.setHint(spannableString);
        }
        D d11 = this.f33930c;
        if (d11 != null) {
            d11.f620f.setOnClickListener(new ViewOnClickListenerC0159a(this, 25));
        }
        D d12 = this.f33930c;
        if (d12 != null) {
            ((RecyclerView) d12.f627w).setAdapter(getAdapter());
        }
        D d13 = this.f33930c;
        if (d13 != null) {
            ((RecyclerView) d13.f627w).setLayoutManager(new LinearLayoutManager(getContext()));
        }
        getAdapter().setOnItemClickListener(new y(this));
        D d14 = this.f33930c;
        if (d14 != null) {
            ((CustomAutoCompleteTextView) d14.f616b).setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(13)});
        }
        D d15 = this.f33930c;
        if (d15 != null) {
            p220oa.h.r((CustomAutoCompleteTextView) d15.f616b, new i(this, 15), null);
        }
        D d16 = this.f33930c;
        if (d16 != null) {
            ((CustomAutoCompleteTextView) d16.f616b).setVerticalScrollBarEnabled(false);
        }
        S1 s3 = this.f33932e;
        if (s3 == null) {
            Intrinsics.n("sharedViewModel");
            throw null;
        }
        String str2 = s3.f5135d;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null && (d2 = this.f33930c) != null) {
                CommonViewExtKt.setTextAndSelection((CustomAutoCompleteTextView) d2.f616b, str2);
            }
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = this.f33931d;
        if (transferToPalmPayHomeViewModel == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        l lVar = transferToPalmPayHomeViewModel.f34085v;
        if (lVar != null) {
            lVar.e(lifecycleOwner, new G(new Gd.z(this, 0), 4));
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel2 = this.f33931d;
        if (transferToPalmPayHomeViewModel2 == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        l lVar2 = transferToPalmPayHomeViewModel2.f34082j;
        if (lVar2 != null) {
            lVar2.e(lifecycleOwner, new G(new Gd.z(this, 1), 4));
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel3 = this.f33931d;
        if (transferToPalmPayHomeViewModel3 == null) {
            Intrinsics.n("requestViewModel");
            throw null;
        }
        List list = transferToPalmPayHomeViewModel3.t;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            this.f33938p = list;
            k(getAccount());
            return;
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel4 = this.f33931d;
        if (transferToPalmPayHomeViewModel4 != null) {
            transferToPalmPayHomeViewModel4.e();
        } else {
            Intrinsics.n("requestViewModel");
            throw null;
        }
    }

    public final void g(SearchPalmPayAccountResp searchPalmPayAccountResp) {
        r0.O0(searchPalmPayAccountResp.getTransType(), searchPalmPayAccountResp.getBusinessType(), searchPalmPayAccountResp.getAccountNo(), p002a.a.e(new Pair("core_order_source_type", this.f33934g), new Pair("MEMBER_ID", searchPalmPayAccountResp.getMemberId()), new Pair("extra_data", searchPalmPayAccountResp.getPpAccountNo()), new Pair("existRecipient", this.f33935i)));
    }

    public final void h() {
        RecyclerView recyclerView;
        getAdapter().a("", z.f38935a);
        D d2 = this.f33930c;
        if (d2 == null || (recyclerView = (RecyclerView) d2.f627w) == null) {
            return;
        }
        p220oa.h.c(recyclerView);
    }

    public final void i() {
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.f(new Fade(1));
            transitionSet.f(new ChangeBounds());
            D d2 = this.f33930c;
            if (d2 != null) {
                X.a((LinearLayout) d2.f626v, transitionSet);
            }
        } catch (Exception unused) {
        }
        D d10 = this.f33930c;
        if (d10 != null) {
            p220oa.h.c((LinearLayout) d10.f617c);
        }
        D d11 = this.f33930c;
        if (d11 != null) {
            p220oa.h.c((LinearLayout) d11.t);
        }
        D d12 = this.f33930c;
        if (d12 != null) {
            p220oa.h.c((LinearLayout) d12.f618d);
        }
    }

    public final void j(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            D d2 = this.f33930c;
            if (d2 != null) {
                p220oa.h.c((LinearLayout) d2.t);
            }
            D d10 = this.f33930c;
            if (d10 != null) {
                p220oa.h.c((LinearLayout) d10.f618d);
                return;
            }
            return;
        }
        if (!z3) {
            D d11 = this.f33930c;
            if (d11 != null) {
                p220oa.h.c((LinearLayout) d11.f618d);
            }
            D d12 = this.f33930c;
            if (d12 != null) {
                p220oa.h.C((LinearLayout) d12.t);
            }
            D d13 = this.f33930c;
            if (d13 != null) {
                d13.f622i.setText(str);
                return;
            }
            return;
        }
        D d14 = this.f33930c;
        if (d14 != null) {
            p220oa.h.c((LinearLayout) d14.t);
        }
        D d15 = this.f33930c;
        if (d15 != null) {
            p220oa.h.C((LinearLayout) d15.f618d);
        }
        D d16 = this.f33930c;
        if (d16 != null) {
            d16.f621g.setText(str);
        }
        D d17 = this.f33930c;
        LinearLayout linearLayout = d17 != null ? (LinearLayout) d17.f618d : null;
        if (linearLayout != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_X.getName(), 0.0f, 8.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(4.0f));
            objectAnimatorOfFloat.start();
        }
    }

    public final void k(String str) {
        String strK;
        String strK2 = kotlin.text.y.k(str, " ", "");
        if (strK2.length() == 0) {
            h();
            return;
        }
        List list = this.f33938p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String account = ((MatchPalmPayRecipientsResp) obj).getAccount();
            if (account != null && (strK = kotlin.text.y.k(account, " ", "")) != null && kotlin.text.y.m(strK, strK2, false)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            h();
            return;
        }
        getAdapter().a(strK2, CollectionsKt.U(arrayList, 2));
        D d2 = this.f33930c;
        if (d2 != null) {
            p220oa.h.C((RecyclerView) d2.f627w);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransactionMessage(@Nullable TransactionEvent event) {
        CustomAutoCompleteTextView customAutoCompleteTextView;
        D d2 = this.f33930c;
        if (d2 == null || (customAutoCompleteTextView = (CustomAutoCompleteTextView) d2.f616b) == null) {
            return;
        }
        customAutoCompleteTextView.setText("");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToPalmPayAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferToPalmPayAccountView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToPalmPayAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(p159kd.f.sm_view_transfer_to_palmpay_account, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = e.account_input_container;
        if (((LinearLayout) p059e1.a.m(i10, viewInflate)) != null) {
            i10 = e.clipboard_account_prompt;
            ClipboardAccountPromptView clipboardAccountPromptView = (ClipboardAccountPromptView) p059e1.a.m(i10, viewInflate);
            if (clipboardAccountPromptView != null) {
                i10 = e.et_bank_account;
                CustomAutoCompleteTextView customAutoCompleteTextView = (CustomAutoCompleteTextView) p059e1.a.m(i10, viewInflate);
                if (customAutoCompleteTextView != null) {
                    i10 = e.indicatorView;
                    if (((CircularProgressIndicator) p059e1.a.m(i10, viewInflate)) != null) {
                        i10 = e.iv_query_status;
                        if (((IconicsImageView) p059e1.a.m(i10, viewInflate)) != null) {
                            i10 = e.iv_recipient_status;
                            if (((IconicsImageView) p059e1.a.m(i10, viewInflate)) != null) {
                                i10 = e.ll_query_status;
                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                if (linearLayout != null) {
                                    i10 = e.ll_recipient_loading;
                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                    if (linearLayout2 != null) {
                                        i10 = e.ll_recipient_name;
                                        LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                        if (linearLayout3 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            i10 = e.ll_status;
                                            LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                            if (linearLayout4 != null) {
                                                i10 = e.med_account;
                                                ModelErrorDivider modelErrorDivider = (ModelErrorDivider) p059e1.a.m(i10, viewInflate);
                                                if (modelErrorDivider != null) {
                                                    i10 = e.rv_matched_recipients;
                                                    RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
                                                    if (recyclerView != null) {
                                                        i10 = e.tv_loading_text;
                                                        TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
                                                        if (textView != null) {
                                                            i10 = e.tv_next;
                                                            TextView textView2 = (TextView) p059e1.a.m(i10, viewInflate);
                                                            if (textView2 != null) {
                                                                i10 = e.tv_query_content;
                                                                TextView textView3 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                if (textView3 != null) {
                                                                    i10 = e.tv_recipient_name;
                                                                    TextView textView4 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                    if (textView4 != null) {
                                                                        i10 = e.tv_search_palmpay_account;
                                                                        TextView textView5 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                        if (textView5 != null) {
                                                                            this.f33930c = new D(constraintLayout, clipboardAccountPromptView, customAutoCompleteTextView, linearLayout, linearLayout2, linearLayout3, linearLayout4, modelErrorDivider, recyclerView, textView, textView2, textView3, textView4, textView5);
                                                                            this.f33934g = "COMMON";
                                                                            this.f33937o = C2131j.b(new n(context, 1));
                                                                            this.f33938p = z.f38935a;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
