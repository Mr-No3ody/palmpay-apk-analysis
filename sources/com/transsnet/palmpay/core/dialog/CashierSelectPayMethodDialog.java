package com.transsnet.palmpay.core.dialog;

import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$CashierAddPaymentMethodItem;
import com.transsnet.palmpay.core.bean.cashier.CashierAddablePaymentMethodsBean;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierFlexiPreCreditInfoBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.viewmodel.ModelApplyOkCard;
import com.transsnet.palmpay.custom_view.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p052da.C1646s;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u00012\u00020\u0002:\u0001mB'\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b&\u0010\u001cJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u0010J\u0017\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\f2\u0006\u0010+\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00020\u0005¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\f2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020/H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020/2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u000105H\u0002¢\u0006\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010H\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010?\"\u0004\bK\u00101R\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR!\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010N\u001a\u0004\bU\u0010VR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u0002060\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR$\u0010b\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010=R\"\u0010g\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010I\u001a\u0004\bh\u0010?\"\u0004\bi\u00101R\u0018\u0010j\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010]R\u0018\u0010k\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010]R\u0018\u0010l\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010]¨\u0006n"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/CashierSelectPayMethodDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "", "layoutId", "styleId", "<init>", "(Landroid/content/Context;II)V", "Lcom/transsnet/palmpay/core/dialog/CashierSelectPayMethodDialog$CallBack;", "callBack", "", "setCallBack", "(Lcom/transsnet/palmpay/core/dialog/CashierSelectPayMethodDialog$CallBack;)V", "initViews", "()V", "", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "paymentMethods", "Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;", "combinationPayMethod", "setPayMethods", "(Ljava/util/List;Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;)V", "updatePayMethods", "", "titleText", "setDialogTitle", "(Ljava/lang/String;)V", "", "amount", "setPayAmount", "(J)V", "transType", "setTransType", "subTransType", "setSubTransType", "orderNo", "setOrderNo", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "show", "pm", "setSelectedPayMethod", "(Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;)V", "", "setShowApplyAddItem", "(Z)V", "options", "setPaymentMethodOptions", "(I)V", "", "Lcom/transsnet/palmpay/core/bean/cashier/CashierAddablePaymentMethodsBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setAddablePaymentMethods", "(Ljava/util/List;)V", "Lcom/transsnet/palmpay/core/bean/cashier/CashierFlexiPreCreditInfoBean;", com.adjust.sdk.Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "setOkCardPreCreditInfo", "(Lcom/transsnet/palmpay/core/bean/cashier/CashierFlexiPreCreditInfoBean;)V", "haveBalanceAccountItem", "()Z", "datas", "hasFlexiPaymentMethod", "(Ljava/util/List;)Z", "Lja/d;", "binding", "Lja/d;", "mCombinationPayMethod", "Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;", "mShowApplyAddItem", "Z", "getMShowApplyAddItem", "setMShowApplyAddItem", "Lda/s;", "mAdapter$delegate", "Lkotlin/Lazy;", "getMAdapter", "()Lda/s;", "mAdapter", "mPayAmount", "J", "mPayMethods$delegate", "getMPayMethods", "()Ljava/util/List;", "mPayMethods", "mAddablePaymentMethods", "Ljava/util/List;", "mNowSelectedPayMethod", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "mTitleText", "Ljava/lang/String;", "mPaymentMethodOptions", "I", "mCallBack", "Lcom/transsnet/palmpay/core/dialog/CashierSelectPayMethodDialog$CallBack;", "mFlexiPreCreditInfo", "Lcom/transsnet/palmpay/core/bean/cashier/CashierFlexiPreCreditInfoBean;", "getMFlexiPreCreditInfo", "()Lcom/transsnet/palmpay/core/bean/cashier/CashierFlexiPreCreditInfoBean;", "setMFlexiPreCreditInfo", "ignoreBalanceCheck", "getIgnoreBalanceCheck", "setIgnoreBalanceCheck", "mTransType", "mSubTransType", "mOrderNo", "CallBack", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashierSelectPayMethodDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashierSelectPayMethodDialog.kt\ncom/transsnet/palmpay/core/dialog/CashierSelectPayMethodDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"})
public final class CashierSelectPayMethodDialog extends com.transsnet.palmpay.custom_view.dialog.b implements View.OnClickListener {

    @Nullable
    private p142ja.d binding;
    private boolean ignoreBalanceCheck;

    /* JADX INFO: renamed from: mAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter;

    @NotNull
    private List<CashierAddablePaymentMethodsBean> mAddablePaymentMethods;

    @Nullable
    private CallBack mCallBack;

    @Nullable
    private CashierCombinationPaymentMethodBean mCombinationPayMethod;

    @Nullable
    private CashierFlexiPreCreditInfoBean mFlexiPreCreditInfo;

    @Nullable
    private CashierPaymentMethodBean mNowSelectedPayMethod;

    @Nullable
    private String mOrderNo;
    private long mPayAmount;

    /* JADX INFO: renamed from: mPayMethods$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPayMethods;
    private int mPaymentMethodOptions;
    private boolean mShowApplyAddItem;

    @Nullable
    private String mSubTransType;

    @Nullable
    private String mTitleText;

    @Nullable
    private String mTransType;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/CashierSelectPayMethodDialog$CallBack;", "", "onPaymentMethodClick", "", "paymentMethod", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "onAddNewBankCardClick", "onAddNewBankAccountClick", "onAddNewBankCardOrBankAccountClick", "onUseUSSDClick", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onAddNewBankAccountClick();

        void onAddNewBankCardClick();

        void onAddNewBankCardOrBankAccountClick();

        void onPaymentMethodClick(@Nullable CashierPaymentMethodBean paymentMethod);

        void onUseUSSDClick();
    }

    @JvmOverloads
    public CashierSelectPayMethodDialog(@Nullable Context context) {
        this(context, 0, 0, 6, null);
    }

    private final C1646s getMAdapter() {
        return (C1646s) this.mAdapter.getValue();
    }

    private final List<CashierPaymentMethodBean> getMPayMethods() {
        return (List) this.mPayMethods.getValue();
    }

    private final boolean hasFlexiPaymentMethod(List<? extends CashierPaymentMethodBean> datas) {
        Object next;
        if (datas == null) {
            return false;
        }
        Iterator<T> it = datas.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CashierPaymentMethodBean) next).senderAccountType != 28);
        return ((CashierPaymentMethodBean) next) != null;
    }

    private final boolean haveBalanceAccountItem() {
        Object next;
        Iterator<T> it = getMPayMethods().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CashierPaymentMethodBean) next).senderAccountType != 1);
        return ((CashierPaymentMethodBean) next) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1646s mAdapter_delegate$lambda$0() {
        return new C1646s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mPayMethods_delegate$lambda$1() {
        return new ArrayList();
    }

    public static /* synthetic */ void setPayMethods$default(CashierSelectPayMethodDialog cashierSelectPayMethodDialog, List list, CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            cashierCombinationPaymentMethodBean = null;
        }
        cashierSelectPayMethodDialog.setPayMethods(list, cashierCombinationPaymentMethodBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence show$lambda$4(CashierPaymentMethodBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strValueOf = String.valueOf(it.senderAccountType);
        return strValueOf != null ? strValueOf : "";
    }

    public final boolean getIgnoreBalanceCheck() {
        return this.ignoreBalanceCheck;
    }

    @Nullable
    public final CashierFlexiPreCreditInfoBean getMFlexiPreCreditInfo() {
        return this.mFlexiPreCreditInfo;
    }

    public final boolean getMShowApplyAddItem() {
        return this.mShowApplyAddItem;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ViewTreeObserver viewTreeObserver;
        setContentView(p025ba.g.core_dialog_cashier_select_payment_method);
        View viewFindViewById = findViewById(p025ba.e.viewRoot);
        int i7 = p025ba.e.cdspm_close_iv;
        IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
        if (iconicsImageView != null) {
            i7 = p025ba.e.cdspm_rcv;
            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewFindViewById);
            if (recyclerView != null) {
                i7 = p025ba.e.cdspm_title_tv;
                TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                if (textView != null) {
                    this.binding = new p142ja.d((LinearLayout) viewFindViewById, iconicsImageView, recyclerView, textView);
                    setDialogTitle(this.mTitleText);
                    p142ja.d dVar = this.binding;
                    if (dVar != null) {
                        dVar.f38462c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    }
                    p142ja.d dVar2 = this.binding;
                    if (dVar2 != null) {
                        dVar2.f38462c.setAdapter(getMAdapter());
                    }
                    C1646s mAdapter = getMAdapter();
                    M1.j.addFooterView$default(mAdapter, (CashierPaymentMethodAdapter$CashierAddPaymentMethodItem) mAdapter.f35811g.getValue(), 0, 0, 6, null);
                    t tVar = mAdapter.f35811g;
                    ((CashierPaymentMethodAdapter$CashierAddPaymentMethodItem) tVar.getValue()).setVisibility(0);
                    ((CashierPaymentMethodAdapter$CashierAddPaymentMethodItem) tVar.getValue()).e();
                    getMAdapter().f35808d = this.ignoreBalanceCheck;
                    getMAdapter().f35810f = new c(this);
                    showAtBottom(getWindow());
                    p142ja.d dVar3 = this.binding;
                    if (dVar3 != null) {
                        dVar3.f38463d.setOnClickListener(this);
                    }
                    p142ja.d dVar4 = this.binding;
                    if (dVar4 != null) {
                        dVar4.f38461b.setOnClickListener(this);
                    }
                    p142ja.d dVar5 = this.binding;
                    LinearLayout linearLayout = dVar5 != null ? dVar5.f38460a : null;
                    if (linearLayout == null || (viewTreeObserver = linearLayout.getViewTreeObserver()) == null) {
                        return;
                    }
                    viewTreeObserver.addOnGlobalLayoutListener(new p185ma.a(linearLayout, this, 1));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        if (v3.getId() == p025ba.e.cdspm_close_iv) {
            dismiss();
        }
    }

    public final void setAddablePaymentMethods(@Nullable List<CashierAddablePaymentMethodsBean> data) {
        if (data != null) {
            if (data.isEmpty()) {
                data = null;
            }
            if (data != null) {
                this.mAddablePaymentMethods.clear();
                this.mAddablePaymentMethods.addAll(data);
            }
        }
    }

    public final void setCallBack(@Nullable CallBack callBack) {
        this.mCallBack = callBack;
    }

    public final void setDialogTitle(@Nullable String titleText) {
        p142ja.d dVar;
        TextView textView;
        this.mTitleText = titleText;
        if (TextUtils.isEmpty(titleText) || (dVar = this.binding) == null || (textView = dVar.f38463d) == null) {
            return;
        }
        textView.setText(this.mTitleText);
    }

    public final void setIgnoreBalanceCheck(boolean z3) {
        this.ignoreBalanceCheck = z3;
    }

    public final void setMFlexiPreCreditInfo(@Nullable CashierFlexiPreCreditInfoBean cashierFlexiPreCreditInfoBean) {
        this.mFlexiPreCreditInfo = cashierFlexiPreCreditInfoBean;
    }

    public final void setMShowApplyAddItem(boolean z3) {
        this.mShowApplyAddItem = z3;
    }

    public final void setOkCardPreCreditInfo(@Nullable CashierFlexiPreCreditInfoBean info) {
        this.mFlexiPreCreditInfo = info;
    }

    public final void setOrderNo(@Nullable String orderNo) {
        this.mOrderNo = orderNo;
    }

    public final void setPayAmount(long amount) {
        this.mPayAmount = amount;
        getMAdapter().f35807c = amount;
    }

    public final void setPayMethods(@NotNull List<CashierPaymentMethodBean> paymentMethods, @Nullable CashierCombinationPaymentMethodBean combinationPayMethod) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        getMPayMethods().clear();
        this.mCombinationPayMethod = combinationPayMethod;
        if (combinationPayMethod != null) {
            getMPayMethods().add(combinationPayMethod);
        }
        getMPayMethods().addAll(paymentMethods);
        updatePayMethods();
    }

    public final void setPaymentMethodOptions(int options) {
        this.mPaymentMethodOptions = options;
        getMAdapter().getClass();
    }

    public final void setSelectedPayMethod(@Nullable CashierPaymentMethodBean pm) {
        this.mNowSelectedPayMethod = pm;
        CashierPaymentMethodBean cashierPaymentMethodBean = getMAdapter().f35806b;
        if (cashierPaymentMethodBean != null) {
            r0.l(cashierPaymentMethodBean, pm);
        }
    }

    public final void setShowApplyAddItem(boolean show) {
        this.mShowApplyAddItem = show;
    }

    public final void setSubTransType(@Nullable String subTransType) {
        this.mSubTransType = subTransType;
    }

    public final void setTransType(@Nullable String transType) {
        this.mTransType = transType;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        C1646s mAdapter = getMAdapter();
        CashierFlexiPreCreditInfoBean cashierFlexiPreCreditInfoBean = this.mFlexiPreCreditInfo;
        if (cashierFlexiPreCreditInfoBean != null) {
            if (mAdapter.hasHeaderLayout()) {
                mAdapter.removeAllHeaderView();
            }
            t tVar = mAdapter.f35812i;
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ModelApplyOkCard modelApplyOkCard = (ModelApplyOkCard) ((View) value).findViewById(p025ba.e.model_okCard);
            if (!TextUtils.isEmpty(cashierFlexiPreCreditInfoBean.okCardPreCreditDesc)) {
                String str = cashierFlexiPreCreditInfoBean.okCardPreCreditDesc;
                if (str == null) {
                    str = "";
                }
                modelApplyOkCard.d(str);
            }
            Long l5 = cashierFlexiPreCreditInfoBean.okCardPreCreditAmount;
            if ((l5 != null ? l5.longValue() : 0L) > 0) {
                Long l6 = cashierFlexiPreCreditInfoBean.okCardPreCreditAmount;
                modelApplyOkCard.c("Up to" + r0.B(l6 != null ? l6.longValue() : 0L, false));
            } else {
                modelApplyOkCard.c(mAdapter.getContext().getString(k.core_msg_credit_limit_up_to));
            }
            modelApplyOkCard.e(cashierFlexiPreCreditInfoBean.okCardPreCreditTags);
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            M1.j.addHeaderView$default(mAdapter, (View) value2, 0, 0, 6, null);
        } else if (mAdapter.hasHeaderLayout()) {
            mAdapter.removeAllHeaderView();
        }
        getMAdapter().getClass();
        getMAdapter().f35807c = this.mPayAmount;
        getMAdapter().setList(getMPayMethods());
        C1646s mAdapter2 = getMAdapter();
        List<CashierAddablePaymentMethodsBean> addablePaymentMethods = this.mAddablePaymentMethods;
        mAdapter2.getClass();
        Intrinsics.checkNotNullParameter(addablePaymentMethods, "addablePaymentMethods");
        ArrayList arrayList = mAdapter2.f35809e;
        arrayList.clear();
        arrayList.addAll(addablePaymentMethods);
        ((CashierPaymentMethodAdapter$CashierAddPaymentMethodItem) mAdapter2.f35811g.getValue()).e();
        setShowApplyAddItem(this.mShowApplyAddItem);
        CashierPaymentMethodBean selectMethod = this.mNowSelectedPayMethod;
        if (selectMethod != null) {
            C1646s mAdapter3 = getMAdapter();
            mAdapter3.getClass();
            Intrinsics.checkNotNullParameter(selectMethod, "selectMethod");
            mAdapter3.f35806b = selectMethod;
        }
        n0 n0VarG = n0.g();
        String str2 = this.mTransType;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair = new Pair("TransType", str2);
        String str3 = this.mSubTransType;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair2 = new Pair("SubTransType", str3);
        String str4 = this.mOrderNo;
        n0VarG.w("PalmPayCashierPreview_PaymentList_View", G.g(pair, pair2, new Pair("OrderNo", str4 != null ? str4 : ""), new Pair("PaymentMethod", CollectionsKt.J(getMPayMethods(), "/", null, null, new D(7), 30))));
    }

    public final void updatePayMethods() {
        getMAdapter().setList(getMPayMethods());
    }

    @JvmOverloads
    public CashierSelectPayMethodDialog(@Nullable Context context, int i7) {
        this(context, i7, 0, 4, null);
    }

    public /* synthetic */ CashierSelectPayMethodDialog(Context context, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? w.BaseDialogTheme : i10);
    }

    @JvmOverloads
    public CashierSelectPayMethodDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mShowApplyAddItem = true;
        this.mAdapter = C2131j.b(new p171lb.d(18));
        this.mPayMethods = C2131j.b(new p171lb.d(19));
        this.mAddablePaymentMethods = new ArrayList();
    }
}
