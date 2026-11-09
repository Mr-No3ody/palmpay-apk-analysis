package com.transsnet.palmpay.airtime.ui.dialog;

import N8.q0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.L;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.airtime.ui.dialog.DataPlanQuickBuyDialog;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleItemBean;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleProductBean;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p025ba.i;
import p025ba.k;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/dialog/DataPlanQuickBuyDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleItemBean;", "item", "Lkotlin/Function0;", "", "onPay", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleItemBean;Lkotlin/jvm/functions/Function0;)V", "bindProductInfo", "()V", "Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleProductBean;", "product", "", "buildProductTitle", "(Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleProductBean;)Ljava/lang/String;", "initViews", "Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleItemBean;", "Lkotlin/jvm/functions/Function0;", "LRd/L;", "binding", "LRd/L;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataPlanQuickBuyDialog extends b {
    private L binding;

    @NotNull
    private final HighlyRecommendDataBundleItemBean item;

    @NotNull
    private final Function0<Unit> onPay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataPlanQuickBuyDialog(@NotNull Context context, @NotNull HighlyRecommendDataBundleItemBean item, @NotNull Function0<Unit> onPay) {
        super(context, d.qt_airtime_data_plan_quick_buy_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onPay, "onPay");
        this.item = item;
        this.onPay = onPay;
    }

    private final void bindProductInfo() {
        HighlyRecommendDataBundleProductBean highlyRecommendDataBundleProductBean = this.item.item;
        if (highlyRecommendDataBundleProductBean == null) {
            return;
        }
        L l5 = this.binding;
        if (l5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        l5.f8102f.setText(buildProductTitle(highlyRecommendDataBundleProductBean));
        L l6 = this.binding;
        if (l6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String str = highlyRecommendDataBundleProductBean.description;
        if (str == null) {
            str = "";
        }
        l6.f8100d.setText(str);
        Long l8 = highlyRecommendDataBundleProductBean.price;
        String string = getContext().getString(k.core_pay_s, r0.F(l8 != null ? l8.longValue() : 0L));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpanUtils spanUtilsAppend = new SpanUtils().append(string);
        Long l10 = highlyRecommendDataBundleProductBean.businessPrice;
        if (l10 != null) {
            spanUtilsAppend.append(" ").append(r0.F(l10.longValue())).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorDisabled, getContext())).setStrikethrough();
        }
        L l11 = this.binding;
        if (l11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        l11.f8098b.setText(spanUtilsAppend.create());
        L l12 = this.binding;
        if (l12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String str2 = this.item.cornerMark;
        l12.f8101e.setText(str2 != null ? str2 : "");
        L l13 = this.binding;
        if (l13 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String str3 = this.item.cornerMark;
        l13.f8101e.setVisibility((str3 == null || StringsKt.F(str3)) ? 8 : 0);
    }

    private final String buildProductTitle(HighlyRecommendDataBundleProductBean product) {
        String string = product.volume;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            string = getContext().getString(k.core_digit_0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        String str = product.volumeUnit;
        if (str == null) {
            str = "";
        }
        String strJ = q0.j(string, str);
        Integer num = product.validityDay;
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue <= 0) {
            return strJ;
        }
        String quantityString = getContext().getResources().getQuantityString(i.core_validity_days, iIntValue, "", Integer.valueOf(iIntValue));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String string2 = getContext().getString(f.qt_airtime_data_plan_dialog_title_format, strJ, StringsKt.V(quantityString).toString());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(DataPlanQuickBuyDialog dataPlanQuickBuyDialog, View view) {
        if (r0.U0()) {
            return;
        }
        dataPlanQuickBuyDialog.dismiss();
        dataPlanQuickBuyDialog.onPay.invoke();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.btnPay;
        PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = c.dialogContent;
            if (((ConstraintLayout) a.m(i7, viewFindViewById)) != null) {
                i7 = c.ivClose;
                IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                if (iconicsImageView != null) {
                    i7 = c.ivTopBackground;
                    if (((ImageView) a.m(i7, viewFindViewById)) != null) {
                        i7 = c.tvDescription;
                        TextView textView = (TextView) a.m(i7, viewFindViewById);
                        if (textView != null) {
                            i7 = c.tvTag;
                            TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                            if (textView2 != null) {
                                i7 = c.tvTitle;
                                TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                                if (textView3 != null) {
                                    this.binding = new L((ConstraintLayout) viewFindViewById, ppButton, iconicsImageView, textView, textView2, textView3);
                                    showAtCenter(getWindow(), w.Animation_CommonDialog, ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(48));
                                    bindProductInfo();
                                    L l5 = this.binding;
                                    if (l5 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    final int i10 = 0;
                                    l5.f8099c.setOnClickListener(new View.OnClickListener(this) { // from class: l9.b

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ DataPlanQuickBuyDialog f39288b;

                                        {
                                            this.f39288b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i10) {
                                                case 0:
                                                    this.f39288b.dismiss();
                                                    break;
                                                default:
                                                    DataPlanQuickBuyDialog.initViews$lambda$1(this.f39288b, view);
                                                    break;
                                            }
                                        }
                                    });
                                    L l6 = this.binding;
                                    if (l6 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    final int i11 = 1;
                                    l6.f8098b.setOnClickListener(new View.OnClickListener(this) { // from class: l9.b

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ DataPlanQuickBuyDialog f39288b;

                                        {
                                            this.f39288b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i11) {
                                                case 0:
                                                    this.f39288b.dismiss();
                                                    break;
                                                default:
                                                    DataPlanQuickBuyDialog.initViews$lambda$1(this.f39288b, view);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }
}
