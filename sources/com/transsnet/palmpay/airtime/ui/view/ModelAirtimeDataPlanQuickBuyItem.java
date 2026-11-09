package com.transsnet.palmpay.airtime.ui.view;

import Pa.r0;
import Pd.c;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleItemBean;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleProductBean;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.activity.J;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p042cg.e;
import p042cg.f;
import p173ld.o;
import p202n9.d;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0013\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001dR\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u001dR\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u0010\u001d¨\u00067"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/view/ModelAirtimeDataPlanQuickBuyItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lcom/transsnet/palmpay/core/bean/HighlyRecommendDataBundleItemBean;", "Lkotlin/ParameterName;", "name", "item", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "setOnInfoClickListener", "Landroid/view/View;", "c", "Lkotlin/Lazy;", "getQuickBuyItem", "()Landroid/view/View;", "quickBuyItem", "Landroid/widget/TextView;", "d", "getTvName", "()Landroid/widget/TextView;", "tvName", "e", "getTvContent", "tvContent", "Lcom/mikepenz/iconics/view/IconicsImageView;", "f", "getIvInfo", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "ivInfo", "g", "getTvTag", "tvTag", "Landroid/widget/ImageView;", "i", "getIvIcon", "()Landroid/widget/ImageView;", "ivIcon", "Lcom/palmpay/lib/ui/button/PpButton;", "j", "getBuyButton", "()Lcom/palmpay/lib/ui/button/PpButton;", "buyButton", "o", "getBusinessPriceText", "businessPriceText", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelAirtimeDataPlanQuickBuyItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelAirtimeDataPlanQuickBuyItem.kt\ncom/transsnet/palmpay/airtime/ui/view/ModelAirtimeDataPlanQuickBuyItem\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n116#2:207\n1#3:208\n*S KotlinDebug\n*F\n+ 1 ModelAirtimeDataPlanQuickBuyItem.kt\ncom/transsnet/palmpay/airtime/ui/view/ModelAirtimeDataPlanQuickBuyItem\n*L\n101#1:207\n*E\n"})
public final class ModelAirtimeDataPlanQuickBuyItem extends BaseConstraintLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f26589B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public HighlyRecommendDataBundleItemBean f26590A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26595g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f26596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f26597j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f26598o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function1 f26599p;
    public Function1 t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f26600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f26601w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAirtimeDataPlanQuickBuyItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getBusinessPriceText() {
        Object value = this.f26598o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final PpButton getBuyButton() {
        Object value = this.f26597j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpButton) value;
    }

    private final ImageView getIvIcon() {
        Object value = this.f26596i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final IconicsImageView getIvInfo() {
        Object value = this.f26594f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final View getQuickBuyItem() {
        Object value = this.f26591c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    private final TextView getTvContent() {
        Object value = this.f26593e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvName() {
        Object value = this.f26592d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvTag() {
        Object value = this.f26595g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void c(String str, String str2, boolean z3) {
        h.s(this, z3);
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            d(null);
            return;
        }
        this.f26600v = str;
        this.f26601w = str2;
        if (!BaseApplication.hasLogin() || (TextUtils.isEmpty(this.f26600v) && TextUtils.isEmpty(this.f26601w))) {
            d(null);
            return;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new d(null, this), 2));
    }

    public final void d(HighlyRecommendDataBundleItemBean highlyRecommendDataBundleItemBean) {
        this.f26590A = highlyRecommendDataBundleItemBean;
        if ((highlyRecommendDataBundleItemBean != null ? highlyRecommendDataBundleItemBean.item : null) == null) {
            setVisibility(8);
            return;
        }
        HighlyRecommendDataBundleProductBean highlyRecommendDataBundleProductBean = highlyRecommendDataBundleItemBean.item;
        if (highlyRecommendDataBundleProductBean != null) {
            String strConcat = highlyRecommendDataBundleProductBean.volume;
            if (strConcat == null) {
                strConcat = "";
            }
            String str = highlyRecommendDataBundleProductBean.volumeUnit;
            if (str == null) {
                str = "";
            }
            if (strConcat.length() == 0) {
                strConcat = getResources().getString(k.core_digit_0);
            } else if (str.length() != 0) {
                strConcat = strConcat.concat(str);
            }
            Intrinsics.e(strConcat);
            getTvName().setText(strConcat);
            Long l5 = highlyRecommendDataBundleProductBean.price;
            long jLongValue = l5 != null ? l5.longValue() : 0L;
            getBuyButton().setText(getResources().getString(k.core_pay_s, r0.F(jLongValue)));
            Long l6 = highlyRecommendDataBundleProductBean.businessPrice;
            TextView businessPriceText = getBusinessPriceText();
            String strF = l6 != null ? r0.F(l6.longValue()) : null;
            if (strF == null) {
                strF = "";
            }
            businessPriceText.setText(strF);
            getBusinessPriceText().setVisibility((l6 == null || l6.longValue() == jLongValue) ? 8 : 0);
            String str2 = highlyRecommendDataBundleProductBean.validity;
            String string = str2 != null ? StringsKt.V(str2).toString() : null;
            if (string == null) {
                string = "";
            }
            Integer num = highlyRecommendDataBundleProductBean.validityDay;
            String strConcat2 = (num != null ? num.intValue() : 0) > 0 ? "Valid for ".concat(string) : null;
            getTvContent().setText(strConcat2 != null ? strConcat2 : "");
            boolean z3 = true;
            getTvContent().setVisibility(strConcat2 == null || strConcat2.length() == 0 ? 8 : 0);
            if (TextUtils.isEmpty(highlyRecommendDataBundleItemBean.cornerMark)) {
                h.s(getTvTag(), false);
            } else {
                getTvTag().setText(highlyRecommendDataBundleItemBean.cornerMark);
                h.s(getTvTag(), true);
            }
            ImageView ivIcon = getIvIcon();
            String str3 = highlyRecommendDataBundleItemBean.badgeUrl;
            if (str3 == null || StringsKt.F(str3)) {
                ivIcon.setImageDrawable(null);
                ivIcon.setVisibility(8);
            } else {
                ivIcon.setVisibility(0);
                r0.l1(str3, ivIcon);
            }
            IconicsImageView ivInfo = getIvInfo();
            String str4 = highlyRecommendDataBundleProductBean.description;
            if (str4 != null && str4.length() != 0) {
                z3 = false;
            }
            ivInfo.setVisibility(z3 ? 8 : 0);
            getIvInfo().setOnClickListener(new J(highlyRecommendDataBundleProductBean, 2, this, highlyRecommendDataBundleItemBean));
        }
        setVisibility(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, CommonViewExtKt.getDp(KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
    }

    public final void setOnInfoClickListener(@NotNull Function1<? super HighlyRecommendDataBundleItemBean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.t = listener;
    }

    public final void setOnItemClickListener(@NotNull Function1<? super HighlyRecommendDataBundleItemBean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f26599p = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAirtimeDataPlanQuickBuyItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelAirtimeDataPlanQuickBuyItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAirtimeDataPlanQuickBuyItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f26591c = C2131j.b(new Function0(this) { // from class: n9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39859b;

            {
                this.f39859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39859b;
                switch (i10) {
                    case 0:
                        int i11 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return modelAirtimeDataPlanQuickBuyItem.findViewById(c.quick_buy_item);
                    case 1:
                        int i12 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_name);
                    case 2:
                        int i13 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_content);
                    case 3:
                        int i14 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (IconicsImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.iv_info);
                    case 4:
                        int i15 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvTag);
                    case 5:
                        int i16 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (ImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.ivIcon);
                    case 6:
                        int i17 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (PpButton) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBuy);
                    default:
                        int i18 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBusinessPrice);
                }
            }
        });
        final int i11 = 1;
        this.f26592d = C2131j.b(new Function0(this) { // from class: n9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39859b;

            {
                this.f39859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39859b;
                switch (i11) {
                    case 0:
                        int i12 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return modelAirtimeDataPlanQuickBuyItem.findViewById(c.quick_buy_item);
                    case 1:
                        int i13 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_name);
                    case 2:
                        int i14 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_content);
                    case 3:
                        int i15 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (IconicsImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.iv_info);
                    case 4:
                        int i16 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvTag);
                    case 5:
                        int i17 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (ImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.ivIcon);
                    case 6:
                        int i18 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (PpButton) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBuy);
                    default:
                        int i19 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBusinessPrice);
                }
            }
        });
        final int i12 = 2;
        this.f26593e = C2131j.b(new Function0(this) { // from class: n9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39859b;

            {
                this.f39859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39859b;
                switch (i12) {
                    case 0:
                        int i13 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return modelAirtimeDataPlanQuickBuyItem.findViewById(c.quick_buy_item);
                    case 1:
                        int i14 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_name);
                    case 2:
                        int i15 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_content);
                    case 3:
                        int i16 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (IconicsImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.iv_info);
                    case 4:
                        int i17 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvTag);
                    case 5:
                        int i18 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (ImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.ivIcon);
                    case 6:
                        int i19 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (PpButton) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBuy);
                    default:
                        int i110 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBusinessPrice);
                }
            }
        });
        final int i13 = 3;
        this.f26594f = C2131j.b(new Function0(this) { // from class: n9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39859b;

            {
                this.f39859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39859b;
                switch (i13) {
                    case 0:
                        int i14 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return modelAirtimeDataPlanQuickBuyItem.findViewById(c.quick_buy_item);
                    case 1:
                        int i15 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_name);
                    case 2:
                        int i16 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_content);
                    case 3:
                        int i17 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (IconicsImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.iv_info);
                    case 4:
                        int i18 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvTag);
                    case 5:
                        int i19 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (ImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.ivIcon);
                    case 6:
                        int i110 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (PpButton) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBuy);
                    default:
                        int i111 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBusinessPrice);
                }
            }
        });
        final int i14 = 4;
        this.f26595g = C2131j.b(new Function0(this) { // from class: n9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39859b;

            {
                this.f39859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39859b;
                switch (i14) {
                    case 0:
                        int i15 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return modelAirtimeDataPlanQuickBuyItem.findViewById(c.quick_buy_item);
                    case 1:
                        int i16 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_name);
                    case 2:
                        int i17 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_content);
                    case 3:
                        int i18 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (IconicsImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.iv_info);
                    case 4:
                        int i19 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvTag);
                    case 5:
                        int i110 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (ImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.ivIcon);
                    case 6:
                        int i111 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (PpButton) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBuy);
                    default:
                        int i112 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBusinessPrice);
                }
            }
        });
        final int i15 = 5;
        this.f26596i = C2131j.b(new Function0(this) { // from class: n9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39859b;

            {
                this.f39859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39859b;
                switch (i15) {
                    case 0:
                        int i16 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return modelAirtimeDataPlanQuickBuyItem.findViewById(c.quick_buy_item);
                    case 1:
                        int i17 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_name);
                    case 2:
                        int i18 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_content);
                    case 3:
                        int i19 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (IconicsImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.iv_info);
                    case 4:
                        int i110 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvTag);
                    case 5:
                        int i111 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (ImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.ivIcon);
                    case 6:
                        int i112 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (PpButton) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBuy);
                    default:
                        int i113 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBusinessPrice);
                }
            }
        });
        final int i16 = 6;
        this.f26597j = C2131j.b(new Function0(this) { // from class: n9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39859b;

            {
                this.f39859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39859b;
                switch (i16) {
                    case 0:
                        int i17 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return modelAirtimeDataPlanQuickBuyItem.findViewById(c.quick_buy_item);
                    case 1:
                        int i18 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_name);
                    case 2:
                        int i19 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_content);
                    case 3:
                        int i110 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (IconicsImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.iv_info);
                    case 4:
                        int i111 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvTag);
                    case 5:
                        int i112 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (ImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.ivIcon);
                    case 6:
                        int i113 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (PpButton) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBuy);
                    default:
                        int i114 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBusinessPrice);
                }
            }
        });
        final int i17 = 7;
        this.f26598o = C2131j.b(new Function0(this) { // from class: n9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39859b;

            {
                this.f39859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39859b;
                switch (i17) {
                    case 0:
                        int i18 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return modelAirtimeDataPlanQuickBuyItem.findViewById(c.quick_buy_item);
                    case 1:
                        int i19 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_name);
                    case 2:
                        int i110 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tv_content);
                    case 3:
                        int i111 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (IconicsImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.iv_info);
                    case 4:
                        int i112 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvTag);
                    case 5:
                        int i113 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (ImageView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.ivIcon);
                    case 6:
                        int i114 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (PpButton) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBuy);
                    default:
                        int i115 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                        return (TextView) modelAirtimeDataPlanQuickBuyItem.findViewById(c.tvBusinessPrice);
                }
            }
        });
        View.inflate(context, Pd.d.qt_airtime_data_plan_quick_buy_content, this);
        o oVar = new o(this, 10);
        getQuickBuyItem().setOnClickListener(oVar);
        getBuyButton().setOnClickListener(oVar);
        getBusinessPriceText().setPaintFlags(getBusinessPriceText().getPaintFlags() | 16);
        setVisibility(8);
    }
}
