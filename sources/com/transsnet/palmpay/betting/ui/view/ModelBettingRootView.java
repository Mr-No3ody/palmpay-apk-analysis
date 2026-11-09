package com.transsnet.palmpay.betting.ui.view;

import Bc.f;
import Gb.M;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Wf.AbstractC0780y;
import Wf.C0759d0;
import Wf.I;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.H;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p282s9.l;
import p338w9.h;
import t9.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00112\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0013J\u0015\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010 \u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b \u0010\u0013J\u001d\u0010#\u001a\u00020\u00112\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0016¢\u0006\u0004\b#\u0010\u001a¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/view/ModelBettingRootView;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getAmount", "()J", "", "getCustomerId", "()Ljava/lang/String;", "msg", "", "setAmountError", "(Ljava/lang/String;)V", "customerId", "setHistoryBiller", "", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "billers", "setBillerList", "(Ljava/util/List;)V", "billerId", "setBillerAd", "amount", "setInputAmount", "setCustomerIdError", "setCustomerId", "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponItemBean;", "coupons", "setCouponList", "BettingRootCallback", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelBettingRootView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelBettingRootView.kt\ncom/transsnet/palmpay/betting/ui/view/ModelBettingRootView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,548:1\n1#2:549\n116#3:550\n*S KotlinDebug\n*F\n+ 1 ModelBettingRootView.kt\ncom/transsnet/palmpay/betting/ui/view/ModelBettingRootView\n*L\n504#1:550\n*E\n"})
public final class ModelBettingRootView extends BaseConstraintLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f26741w = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f26742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f26743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f26745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H f26746g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public H f26747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H f26748j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f26749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public M f26750p;
    public Oe.a t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0759d0 f26751v;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/view/ModelBettingRootView$BettingRootCallback;", "", "onBillerClick", "", "onBillerItemSelected", "biller", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "onGoNextClick", "onContactsClick", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BettingRootCallback {
        void onBillerClick();

        void onBillerItemSelected(@NotNull BettingBillerListItemBean biller);

        void onContactsClick();

        void onGoNextClick();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBettingRootView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean c() {
        f fVar = this.f26742c;
        if (fVar == null) {
            return false;
        }
        ModelBillerSelection modelBillerSelection = (ModelBillerSelection) fVar.f698d;
        if ((modelBillerSelection != null ? modelBillerSelection.getSelectedBiller() : null) == null) {
            return false;
        }
        ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
        if (TextUtils.isEmpty(modelNumberInputLayout != null ? modelNumberInputLayout.getNumber() : null)) {
            return false;
        }
        PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
        if (TextUtils.isEmpty(ppAmountEditText != null ? ppAmountEditText.getAmountString() : null)) {
            return false;
        }
        return (ppAmountEditText != null ? ppAmountEditText.getLongAmount() : 0L) > 0;
    }

    public final void d() {
        if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            p042cg.f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new h(null, this), 2));
        }
    }

    public final void e() {
        BettingBillerListItemBean bettingBillerListItemBean;
        Integer status;
        f fVar = this.f26742c;
        KeyboardUtils.hideSoftInput(fVar != null ? (PpAmountEditText) fVar.f699e : null);
        if (!BaseApplication.hasLogin()) {
            i0.K(null, null);
            return;
        }
        H h7 = this.f26745f;
        if (h7 != null && (bettingBillerListItemBean = (BettingBillerListItemBean) h7.invoke()) != null && ((status = bettingBillerListItemBean.getStatus()) == null || status.intValue() != 1)) {
            Context context = getContext();
            String string = getContext().getString(Pd.f.qt_service_temporarily_unavailable_3, bettingBillerListItemBean);
            ToastDialog toastDialog = new ToastDialog(context, t.cv_toast_dialog);
            toastDialog.setMessage(string);
            toastDialog.setTitle((String) null);
            toastDialog.setIcon(0);
            toastDialog.setIcon((Drawable) null);
            toastDialog.setBackground(0);
            toastDialog.show(4000L);
            return;
        }
        long amount = getAmount();
        H h10 = this.f26747i;
        long jLongValue = h10 != null ? ((Number) h10.invoke()).longValue() : 0L;
        H h11 = this.f26748j;
        long jLongValue2 = h11 != null ? ((Number) h11.invoke()).longValue() : Long.MAX_VALUE;
        if (amount <= 0 || amount < jLongValue || amount > jLongValue2) {
            String string2 = getContext().getString(Pd.f.qt_msg_amount_above_below_desc, r0.B(jLongValue, false), r0.B(jLongValue2, false));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            setAmountError(string2);
        } else {
            l lVar = this.f26743d;
            if (lVar != null) {
                lVar.onGoNextClick();
            }
            n0.g().l("PPay_Betting_Btn_Pay");
        }
    }

    public final void f() {
        f fVar = this.f26742c;
        if (fVar != null) {
            PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
            boolean zC = c();
            TextView textView = ppAmountEditText.f24371i;
            if (textView != null) {
                textView.setEnabled(zC);
            }
        }
    }

    public final void g(BettingBillerListItemBean selected) {
        f fVar;
        if (selected == null || (fVar = this.f26742c) == null) {
            return;
        }
        ModelBillerSelection modelBillerSelection = (ModelBillerSelection) fVar.f698d;
        Intrinsics.checkNotNullParameter(selected, "selected");
        ArrayList arrayList = modelBillerSelection.f26753a;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) it.next();
            if (Intrinsics.c(bettingBillerListItemBean != null ? bettingBillerListItemBean.getBillerId() : null, selected.getBillerId())) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0 && i7 < 3) {
            modelBillerSelection.d(i7, false);
            return;
        }
        arrayList.set(2, arrayList.get(1));
        arrayList.set(1, arrayList.get(0));
        arrayList.set(0, selected);
        modelBillerSelection.c(true);
        modelBillerSelection.d(0, false);
    }

    public final long getAmount() {
        PpAmountEditText ppAmountEditText;
        f fVar = this.f26742c;
        if (fVar == null || (ppAmountEditText = (PpAmountEditText) fVar.f699e) == null) {
            return 0L;
        }
        return ppAmountEditText.getLongAmount();
    }

    @Nullable
    public final String getCustomerId() {
        ModelNumberInputLayout modelNumberInputLayout;
        f fVar = this.f26742c;
        if (fVar == null || (modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f) == null) {
            return null;
        }
        return modelNumberInputLayout.getNumber();
    }

    public final void setAmountError(@NotNull String msg) {
        PpAmountEditText ppAmountEditText;
        Intrinsics.checkNotNullParameter(msg, "msg");
        f fVar = this.f26742c;
        if (fVar == null || (ppAmountEditText = (PpAmountEditText) fVar.f699e) == null) {
            return;
        }
        ppAmountEditText.setError(msg);
    }

    public final void setBillerAd(@NotNull String billerId) {
        SingleAdView singleAdView;
        SingleAdView singleAdView2;
        Intrinsics.checkNotNullParameter(billerId, "billerId");
        f fVar = this.f26742c;
        if (fVar != null && (singleAdView2 = (SingleAdView) fVar.f702i) != null) {
            singleAdView2.appendExtra("billerId", billerId);
        }
        if (fVar != null && (singleAdView = (SingleAdView) fVar.f702i) != null) {
            singleAdView.refreshData();
        }
        org.chromium.support_lib_boundary.util.b.c(fVar != null ? (SingleAdView) fVar.f702i : null);
    }

    public final void setBillerList(@Nullable List<BettingBillerListItemBean> billers) {
        f fVar;
        ModelBillerSelection modelBillerSelection;
        if (billers == null || (fVar = this.f26742c) == null || (modelBillerSelection = (ModelBillerSelection) fVar.f698d) == null) {
            return;
        }
        modelBillerSelection.setBillers(billers);
    }

    public final void setCouponList(@Nullable List<BillerCouponItemBean> coupons) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        List<BillerCouponItemBean> list = coupons;
        f fVar = this.f26742c;
        if (list == null || list.isEmpty()) {
            if (fVar == null || (recyclerView = (RecyclerView) fVar.f696b) == null) {
                return;
            }
            p220oa.h.s(recyclerView, false);
            return;
        }
        if (fVar != null && (recyclerView4 = (RecyclerView) fVar.f696b) != null) {
            p220oa.h.s(recyclerView4, true);
        }
        M m7 = this.f26750p;
        if (m7 != null) {
            m7.setList(list);
        }
        int size = coupons.size();
        ViewGroup.LayoutParams layoutParams = (fVar == null || (recyclerView3 = (RecyclerView) fVar.f696b) == null) ? null : recyclerView3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (size == 1) {
            if (marginLayoutParams != null) {
                marginLayoutParams.width = -1;
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.width = -2;
        }
        if (fVar != null && (recyclerView2 = (RecyclerView) fVar.f696b) != null) {
            recyclerView2.setLayoutParams(marginLayoutParams);
        }
        n0.g().v("PPay_Betting_Coupon");
    }

    public final void setCustomerId(@Nullable String customerId) {
        ModelNumberInputLayout modelNumberInputLayout;
        f fVar = this.f26742c;
        if (fVar == null || (modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f) == null) {
            return;
        }
        if (customerId == null) {
            customerId = "";
        }
        modelNumberInputLayout.setNumber(customerId);
    }

    public final void setCustomerIdError(@NotNull String msg) {
        ModelNumberInputLayout modelNumberInputLayout;
        Intrinsics.checkNotNullParameter(msg, "msg");
        f fVar = this.f26742c;
        if (fVar == null || (modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f) == null) {
            return;
        }
        modelNumberInputLayout.setErrorMessage(msg);
    }

    public final void setHistoryBiller(@Nullable String customerId) {
        PpAmountEditText ppAmountEditText;
        ModelNumberInputLayout modelNumberInputLayout;
        f fVar = this.f26742c;
        if (fVar != null && (modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f) != null) {
            if (customerId == null) {
                customerId = "";
            }
            modelNumberInputLayout.setNumber(customerId);
        }
        if (fVar == null || (ppAmountEditText = (PpAmountEditText) fVar.f699e) == null) {
            return;
        }
        ppAmountEditText.clearFocus();
    }

    public final void setInputAmount(@NotNull String amount) {
        PpAmountEditText ppAmountEditText;
        Intrinsics.checkNotNullParameter(amount, "amount");
        f fVar = this.f26742c;
        if (fVar == null || (ppAmountEditText = (PpAmountEditText) fVar.f699e) == null) {
            return;
        }
        ppAmountEditText.setAmount(amount);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBettingRootView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelBettingRootView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBettingRootView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, d.qt_layout_betting_root, this);
        int i10 = c.amountRoot;
        if (((LinearLayout) p059e1.a.m(i10, viewInflate)) != null) {
            i10 = c.billerSelection;
            ModelBillerSelection modelBillerSelection = (ModelBillerSelection) p059e1.a.m(i10, viewInflate);
            if (modelBillerSelection != null) {
                i10 = c.inputAmount;
                PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i10, viewInflate);
                if (ppAmountEditText != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i10 = c.modelInputCustomer;
                    ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) p059e1.a.m(i10, viewInflate);
                    if (modelNumberInputLayout != null) {
                        i10 = c.operatorMsgLayout;
                        ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) p059e1.a.m(i10, viewInflate);
                        if (modelBillerTipsInfo != null) {
                            i10 = c.qfhdAdView;
                            SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i10, viewInflate);
                            if (singleAdView != null) {
                                i10 = c.rvBettingAmount;
                                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
                                if (recyclerView != null) {
                                    i10 = c.rvCouponList;
                                    RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i10, viewInflate);
                                    if (recyclerView2 != null) {
                                        i10 = c.space_ad_mid;
                                        if (((Space) p059e1.a.m(i10, viewInflate)) != null) {
                                            this.f26742c = new f(constraintLayout, modelBillerSelection, ppAmountEditText, modelNumberInputLayout, modelBillerTipsInfo, singleAdView, recyclerView, recyclerView2, 14);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
