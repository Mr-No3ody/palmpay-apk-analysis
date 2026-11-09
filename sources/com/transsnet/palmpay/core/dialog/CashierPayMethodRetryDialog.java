package com.transsnet.palmpay.core.dialog;

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
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.payment.SubmitPaymentRetryReq;
import com.transsnet.palmpay.core.bean.rsp.ManualCalcOfPaymentMethodBean;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p052da.C1646s;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001XB'\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001c\u0010\u0010J%\u0010\"\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u0010JE\u0010,\u001a\u00020\f2\u0006\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\u00122\b\u0010'\u001a\u0004\u0018\u00010\u00122\b\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010)\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J5\u0010/\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u00122\b\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010.\u001a\u0004\u0018\u00010\u001e2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b2\u0010\u0015J\u0015\u00105\u001a\u00020\f2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\f2\u0006\u00107\u001a\u00020 ¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u00020 ¢\u0006\u0004\b;\u00109J\u0019\u0010=\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b=\u0010\u000eJ\u000f\u0010>\u001a\u00020\fH\u0016¢\u0006\u0004\b>\u0010\u0010R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/CashierPayMethodRetryDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "", "layoutId", "styleId", "<init>", "(Landroid/content/Context;II)V", "Landroid/view/View;", "rootView", "", "limitMaxHeight", "(Landroid/view/View;)V", "clearPendingSubmitReq", "()V", "updateConfirmButtonState", "", "token", "setPaymentRetryToken", "(Ljava/lang/String;)V", "getPaymentRetryToken", "()Ljava/lang/String;", "Lcom/transsnet/palmpay/core/dialog/CashierPayMethodRetryDialog$CallBack;", "callBack", "setCallBack", "(Lcom/transsnet/palmpay/core/dialog/CashierPayMethodRetryDialog$CallBack;)V", "initViews", "", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "paymentMethods", "", "refreshInPlace", "setPayMethods", "(Ljava/util/List;Z)V", "clearPayMethods", "isSuccess", "respMsg", "orderNo", "transType", "paymentMethod", "Lcom/transsnet/palmpay/core/bean/rsp/ManualCalcOfPaymentMethodBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onManualCalcFinished", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;Lcom/transsnet/palmpay/core/bean/rsp/ManualCalcOfPaymentMethodBean;)V", "selectPayment", "handleManualCalcResult", "(Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;Lcom/transsnet/palmpay/core/bean/rsp/ManualCalcOfPaymentMethodBean;)V", "title", "setDialogTitle", "", "amount", "setPayAmount", "(J)V", "ready", "setConfirmReady", "(Z)V", "loading", "setConfirmLoading", "v", ViewProps.ON_CLICK, "show", "Lja/c;", "binding", "Lja/c;", "Lda/s;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lda/s;", "adapter", "payMethods", "Ljava/util/List;", "payAmount", "J", "titleText", "Ljava/lang/String;", "callback", "Lcom/transsnet/palmpay/core/dialog/CashierPayMethodRetryDialog$CallBack;", "paymentRetryToken", "selectedPaymentMethod", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "confirmReady", "Z", "Lcom/transsnet/palmpay/core/bean/payment/SubmitPaymentRetryReq;", "pendingPaymentRetrySubmitReq", "Lcom/transsnet/palmpay/core/bean/payment/SubmitPaymentRetryReq;", "CallBack", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashierPayMethodRetryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashierPayMethodRetryDialog.kt\ncom/transsnet/palmpay/core/dialog/CashierPayMethodRetryDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n1#2:365\n1869#3,2:366\n*S KotlinDebug\n*F\n+ 1 CashierPayMethodRetryDialog.kt\ncom/transsnet/palmpay/core/dialog/CashierPayMethodRetryDialog\n*L\n158#1:366,2\n*E\n"})
public final class CashierPayMethodRetryDialog extends com.transsnet.palmpay.custom_view.dialog.b implements View.OnClickListener {

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    @Nullable
    private p142ja.c binding;

    @Nullable
    private CallBack callback;
    private boolean confirmReady;
    private long payAmount;

    @NotNull
    private final List<CashierPaymentMethodBean> payMethods;

    @Nullable
    private String paymentRetryToken;

    @Nullable
    private SubmitPaymentRetryReq pendingPaymentRetrySubmitReq;

    @Nullable
    private CashierPaymentMethodBean selectedPaymentMethod;

    @Nullable
    private String titleText;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/CashierPayMethodRetryDialog$CallBack;", "", "onCloseClick", "", "paymentRetryToken", "", "onPaymentMethodClick", "paymentMethod", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "onConfirmClick", "submitReq", "Lcom/transsnet/palmpay/core/bean/payment/SubmitPaymentRetryReq;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onCloseClick(@Nullable String paymentRetryToken);

        void onConfirmClick(@Nullable SubmitPaymentRetryReq submitReq);

        void onPaymentMethodClick(@NotNull CashierPaymentMethodBean paymentMethod);
    }

    @JvmOverloads
    public CashierPayMethodRetryDialog(@Nullable Context context) {
        this(context, 0, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1646s adapter_delegate$lambda$1() {
        C1646s c1646s = new C1646s();
        c1646s.f35808d = true;
        return c1646s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPendingSubmitReq() {
        this.pendingPaymentRetrySubmitReq = null;
        this.confirmReady = false;
        updateConfirmButtonState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1646s getAdapter() {
        return (C1646s) this.adapter.getValue();
    }

    private final void limitMaxHeight(View rootView) {
        ViewTreeObserver viewTreeObserver;
        if (rootView == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new p185ma.a(rootView, this, 0));
    }

    public static /* synthetic */ void setPayMethods$default(CashierPayMethodRetryDialog cashierPayMethodRetryDialog, List list, boolean z3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z3 = false;
        }
        cashierPayMethodRetryDialog.setPayMethods(list, z3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010  */
    private final void updateConfirmButtonState() {
        boolean z3;
        PpButton ppButton;
        CashierPaymentMethodBean cashierPaymentMethodBean;
        if (this.confirmReady && (cashierPaymentMethodBean = this.selectedPaymentMethod) != null && cashierPaymentMethodBean != null) {
            z3 = cashierPaymentMethodBean.enable;
        }
        p142ja.c cVar = this.binding;
        if (cVar == null || (ppButton = cVar.f38456b) == null) {
            return;
        }
        ppButton.setEnabled(z3);
    }

    public final void clearPayMethods() {
        this.payMethods.clear();
        this.selectedPaymentMethod = null;
        this.pendingPaymentRetrySubmitReq = null;
        this.confirmReady = false;
        getAdapter().setList(this.payMethods);
        updateConfirmButtonState();
    }

    @Nullable
    public final String getPaymentRetryToken() {
        return this.paymentRetryToken;
    }

    public final void handleManualCalcResult(@Nullable String orderNo, @Nullable String transType, @Nullable CashierPaymentMethodBean selectPayment, @Nullable ManualCalcOfPaymentMethodBean data) {
        long jLongValue;
        Object next;
        List<CashierPaymentMethodBean> paymentMethodList;
        CashierPaymentMethodBean cashierPaymentMethodBean = null;
        Object obj = null;
        cashierPaymentMethodBean = null;
        CalcOfPaymentMethodResultBean calculationDto = data != null ? data.getCalculationDto() : null;
        if (selectPayment == null || calculationDto == null) {
            ToastUtils.showShort(getContext().getString(k.core_fail_to_pay_order), new Object[0]);
            return;
        }
        Long l5 = calculationDto.payAmount;
        if (l5 != null) {
            jLongValue = l5.longValue();
        } else {
            jLongValue = this.payAmount;
            if (jLongValue < 0) {
                jLongValue = 0;
            }
        }
        Iterator<T> it = this.payMethods.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!r0.l((CashierPaymentMethodBean) next, selectPayment));
        CashierPaymentMethodBean cashierPaymentMethodBean2 = (CashierPaymentMethodBean) next;
        if (cashierPaymentMethodBean2 != null) {
            selectPayment = cashierPaymentMethodBean2;
        }
        Intrinsics.checkNotNullParameter(selectPayment, "listItem");
        if (data != null && (paymentMethodList = data.getPaymentMethodList()) != null) {
            for (Object obj2 : paymentMethodList) {
                if (r0.l((CashierPaymentMethodBean) obj2, selectPayment)) {
                    obj = obj2;
                    break;
                }
            }
            cashierPaymentMethodBean = (CashierPaymentMethodBean) obj;
        }
        if (cashierPaymentMethodBean != null) {
            selectPayment.availableBalance = cashierPaymentMethodBean.availableBalance;
            selectPayment.enable = cashierPaymentMethodBean.enable;
        }
        this.selectedPaymentMethod = selectPayment;
        setPayAmount(jLongValue);
        Intrinsics.checkNotNullParameter(selectPayment, "method");
        if (r0.k(selectPayment, Long.valueOf(jLongValue))) {
            this.pendingPaymentRetrySubmitReq = new SubmitPaymentRetryReq(this.paymentRetryToken, Integer.valueOf(selectPayment.payType), orderNo, transType, selectPayment.accountId, Integer.valueOf(selectPayment.senderAccountType), calculationDto.cacheKey);
            setPayMethods(this.payMethods, true);
            setConfirmReady(true);
        } else {
            selectPayment.enable = false;
            clearPendingSubmitReq();
            setPayMethods(this.payMethods, true);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_cashier_pay_method_retry);
        View viewFindViewById = findViewById(p025ba.e.viewRoot);
        int i7 = p025ba.e.cpmr_btn_confirm;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = p025ba.e.cpmr_close_iv;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                i7 = p025ba.e.cpmrRcv;
                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewFindViewById);
                if (recyclerView != null) {
                    i7 = p025ba.e.cpmr_title_tv;
                    TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                    if (textView != null) {
                        this.binding = new p142ja.c((LinearLayout) viewFindViewById, ppButton, iconicsImageView, recyclerView, textView);
                        setDialogTitle(this.titleText);
                        p142ja.c cVar = this.binding;
                        if (cVar != null) {
                            cVar.f38458d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        }
                        p142ja.c cVar2 = this.binding;
                        if (cVar2 != null) {
                            cVar2.f38458d.setAdapter(getAdapter());
                        }
                        getAdapter().f35810f = new b(this);
                        showAtBottom(getWindow());
                        p142ja.c cVar3 = this.binding;
                        if (cVar3 != null) {
                            cVar3.f38457c.setOnClickListener(this);
                        }
                        p142ja.c cVar4 = this.binding;
                        if (cVar4 != null) {
                            cVar4.f38456b.setOnClickListener(this);
                        }
                        p142ja.c cVar5 = this.binding;
                        limitMaxHeight(cVar5 != null ? cVar5.f38455a : null);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        p142ja.c cVar;
        PpButton ppButton;
        CallBack callBack;
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = p025ba.e.cpmr_close_iv;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            CallBack callBack2 = this.callback;
            if (callBack2 != null) {
                callBack2.onCloseClick(this.paymentRetryToken);
            }
            dismiss();
            return;
        }
        int i10 = p025ba.e.cpmr_btn_confirm;
        if (numValueOf == null || numValueOf.intValue() != i10 || (cVar = this.binding) == null || (ppButton = cVar.f38456b) == null || !ppButton.isEnabled() || (callBack = this.callback) == null) {
            return;
        }
        callBack.onConfirmClick(this.pendingPaymentRetrySubmitReq);
    }

    public final void onManualCalcFinished(boolean isSuccess, @Nullable String respMsg, @Nullable String orderNo, @Nullable String transType, @NotNull CashierPaymentMethodBean paymentMethod, @Nullable ManualCalcOfPaymentMethodBean data) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        setConfirmLoading(false);
        if (isSuccess) {
            handleManualCalcResult(orderNo, transType, paymentMethod, data);
        } else {
            if (respMsg == null || StringsKt.F(respMsg)) {
                return;
            }
            ToastUtils.showLong(respMsg, new Object[0]);
        }
    }

    public final void setCallBack(@Nullable CallBack callBack) {
        this.callback = callBack;
    }

    public final void setConfirmLoading(boolean loading) {
        PpButton ppButton;
        p142ja.c cVar = this.binding;
        if (cVar == null || (ppButton = cVar.f38456b) == null) {
            return;
        }
        ppButton.b(loading);
    }

    public final void setConfirmReady(boolean ready) {
        this.confirmReady = ready;
        updateConfirmButtonState();
    }

    public final void setDialogTitle(@Nullable String title) {
        p142ja.c cVar;
        TextView textView;
        this.titleText = title;
        if (TextUtils.isEmpty(title) || (cVar = this.binding) == null || (textView = cVar.f38459e) == null) {
            return;
        }
        textView.setText(this.titleText);
    }

    public final void setPayAmount(long amount) {
        this.payAmount = amount;
        getAdapter().f35807c = amount;
    }

    public final void setPayMethods(@NotNull List<CashierPaymentMethodBean> paymentMethods, boolean refreshInPlace) {
        Object next;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        if (!refreshInPlace) {
            this.payMethods.clear();
            this.payMethods.addAll(paymentMethods);
            for (CashierPaymentMethodBean method : this.payMethods) {
                long j6 = this.payAmount;
                Intrinsics.checkNotNullParameter(method, "method");
                method.enable = r0.k(method, Long.valueOf(j6));
            }
        }
        if (refreshInPlace) {
            getAdapter().notifyDataSetChanged();
        } else {
            getAdapter().setList(this.payMethods);
        }
        CashierPaymentMethodBean cashierPaymentMethodBean = this.selectedPaymentMethod;
        if (cashierPaymentMethodBean != null) {
            Iterator<T> it = this.payMethods.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!r0.l((CashierPaymentMethodBean) next, cashierPaymentMethodBean));
            CashierPaymentMethodBean selectMethod = (CashierPaymentMethodBean) next;
            if (selectMethod != null) {
                this.selectedPaymentMethod = selectMethod;
                C1646s adapter = getAdapter();
                adapter.getClass();
                Intrinsics.checkNotNullParameter(selectMethod, "selectMethod");
                adapter.f35806b = selectMethod;
            } else {
                this.selectedPaymentMethod = null;
                this.confirmReady = false;
            }
        }
        updateConfirmButtonState();
    }

    public final void setPaymentRetryToken(@Nullable String token) {
        String string;
        String str = null;
        if (token != null && (string = StringsKt.V(token).toString()) != null && string.length() > 0) {
            str = string;
        }
        this.paymentRetryToken = str;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        getAdapter().f35807c = this.payAmount;
        getAdapter().setList(this.payMethods);
        this.selectedPaymentMethod = null;
        this.confirmReady = false;
        this.pendingPaymentRetrySubmitReq = null;
        setConfirmLoading(false);
        updateConfirmButtonState();
    }

    @JvmOverloads
    public CashierPayMethodRetryDialog(@Nullable Context context, int i7) {
        this(context, i7, 0, 4, null);
    }

    public /* synthetic */ CashierPayMethodRetryDialog(Context context, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? w.BaseDialogTheme : i10);
    }

    @JvmOverloads
    public CashierPayMethodRetryDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
        this.adapter = C2131j.b(new p171lb.d(17));
        this.payMethods = new ArrayList();
    }
}
