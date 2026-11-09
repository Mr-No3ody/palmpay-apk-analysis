package com.transsnet.palmpay.teller.ui.dialog;

import N8.q0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.S;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleDescInfoDialog;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import p025ba.i;
import p025ba.k;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/DataBundleDescInfoDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;", "item", "Lkotlin/Function0;", "", "onPay", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;Lkotlin/jvm/functions/Function0;)V", "bindProductInfo", "()V", "", "buildProductTitle", "()Ljava/lang/String;", "initViews", "Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;", "Lkotlin/jvm/functions/Function0;", "LRd/S;", "binding", "LRd/S;", "", "hasHandledPayClick", "Z", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataBundleDescInfoDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataBundleDescInfoDialog.kt\ncom/transsnet/palmpay/teller/ui/dialog/DataBundleDescInfoDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class DataBundleDescInfoDialog extends b {
    private S binding;
    private boolean hasHandledPayClick;

    @NotNull
    private final DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean item;

    @NotNull
    private final Function0<Unit> onPay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBundleDescInfoDialog(@NotNull Context context, @NotNull DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean item, @NotNull Function0<Unit> onPay) {
        super(context, d.qt_data_bundle_desc_info_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onPay, "onPay");
        this.item = item;
        this.onPay = onPay;
    }

    private final void bindProductInfo() {
        long price;
        Long lValueOf;
        S s3 = this.binding;
        if (s3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        s3.f8148f.setText(buildProductTitle());
        S s8 = this.binding;
        if (s8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String description = this.item.getDescription();
        if (description == null) {
            description = "";
        }
        s8.f8146d.setText(description);
        Long deductionAmount = this.item.getDeductionAmount();
        if (deductionAmount == null || deductionAmount.longValue() <= 0) {
            deductionAmount = null;
        }
        if (deductionAmount != null) {
            long price2 = this.item.getPrice() - deductionAmount.longValue();
            price = price2 >= 0 ? price2 : 0L;
            lValueOf = Long.valueOf(this.item.getPrice());
        } else {
            price = this.item.getPrice();
            lValueOf = null;
        }
        String strB = r0.B(price, true);
        Intrinsics.checkNotNullExpressionValue(strB, "getAmountStringWithCurrency(...)");
        String string = getContext().getString(k.core_pay_s, y.k(strB, ".00", ""));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpanUtils spanUtilsAppend = new SpanUtils().append(string);
        if (lValueOf != null) {
            SpanUtils spanUtilsAppend2 = spanUtilsAppend.append(" ");
            String strB2 = r0.B(lValueOf.longValue(), true);
            Intrinsics.checkNotNullExpressionValue(strB2, "getAmountStringWithCurrency(...)");
            spanUtilsAppend2.append(y.k(strB2, ".00", "")).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorDisabled, getContext())).setStrikethrough();
        }
        S s10 = this.binding;
        if (s10 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        s10.f8144b.setText(spanUtilsAppend.create());
        S s11 = this.binding;
        if (s11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String remark = this.item.getRemark();
        s11.f8147e.setText(remark != null ? remark : "");
        S s12 = this.binding;
        if (s12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String remark2 = this.item.getRemark();
        s12.f8147e.setVisibility((remark2 == null || StringsKt.F(remark2)) ? 8 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    private final String buildProductTitle() {
        Integer validityDay;
        Integer num;
        String volume = this.item.getVolume();
        if (volume == null) {
            volume = "";
        }
        if (volume.length() == 0) {
            volume = getContext().getString(k.core_digit_0);
            Intrinsics.checkNotNullExpressionValue(volume, "getString(...)");
        }
        String volumeUnit = this.item.getVolumeUnit();
        if (volumeUnit == null) {
            volumeUnit = "";
        }
        String strJ = q0.j(volume, volumeUnit);
        String validity = this.item.getValidity();
        if (validity == null) {
            validityDay = this.item.getValidityDay();
            if (validityDay != null) {
                return strJ;
            }
            num = validityDay.intValue() > 0 ? validityDay : null;
            if (num != null) {
                return strJ;
            }
            int iIntValue = num.intValue();
            String quantityString = getContext().getResources().getQuantityString(i.core_validity_days, iIntValue, "", Integer.valueOf(iIntValue));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            validity = StringsKt.V(quantityString).toString();
        } else {
            if (StringsKt.F(validity)) {
                validity = null;
            }
            if (validity == null) {
                validityDay = this.item.getValidityDay();
                if (validityDay != null) {
                    return strJ;
                }
                if (validityDay.intValue() > 0) {
                }
                if (num != null) {
                    return strJ;
                }
                int iIntValue2 = num.intValue();
                String quantityString2 = getContext().getResources().getQuantityString(i.core_validity_days, iIntValue2, "", Integer.valueOf(iIntValue2));
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                validity = StringsKt.V(quantityString2).toString();
            }
        }
        String string = getContext().getString(f.qt_airtime_data_plan_dialog_title_format, strJ, validity);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(DataBundleDescInfoDialog dataBundleDescInfoDialog, View view) {
        if (dataBundleDescInfoDialog.hasHandledPayClick) {
            return;
        }
        dataBundleDescInfoDialog.hasHandledPayClick = true;
        dataBundleDescInfoDialog.dismiss();
        dataBundleDescInfoDialog.onPay.invoke();
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
                                    this.binding = new S((ConstraintLayout) viewFindViewById, ppButton, iconicsImageView, textView, textView2, textView3);
                                    showAtCenter(getWindow(), w.Animation_CommonDialog, ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(48));
                                    bindProductInfo();
                                    S s3 = this.binding;
                                    if (s3 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    final int i10 = 0;
                                    s3.f8145c.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.h

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ DataBundleDescInfoDialog f11337b;

                                        {
                                            this.f11337b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i10) {
                                                case 0:
                                                    this.f11337b.dismiss();
                                                    break;
                                                default:
                                                    DataBundleDescInfoDialog.initViews$lambda$1(this.f11337b, view);
                                                    break;
                                            }
                                        }
                                    });
                                    S s8 = this.binding;
                                    if (s8 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    final int i11 = 1;
                                    s8.f8144b.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.h

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ DataBundleDescInfoDialog f11337b;

                                        {
                                            this.f11337b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i11) {
                                                case 0:
                                                    this.f11337b.dismiss();
                                                    break;
                                                default:
                                                    DataBundleDescInfoDialog.initViews$lambda$1(this.f11337b, view);
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
