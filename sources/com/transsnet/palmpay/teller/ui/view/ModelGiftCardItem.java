package com.transsnet.palmpay.teller.ui.view;

import B6.ViewOnClickListenerC0087i;
import Pa.r0;
import Pd.f;
import Rd.t0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.utils.n;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.load.resource.bitmap.z;
import com.google.android.flexbox.FlexboxLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p041ce.D;
import p220oa.h;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelGiftCardItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelGiftCardItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelGiftCardItem.kt\ncom/transsnet/palmpay/teller/ui/view/ModelGiftCardItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,297:1\n1#2:298\n327#3,4:299\n327#3,4:303\n327#3,4:307\n327#3,4:311\n327#3,4:315\n327#3,4:319\n*S KotlinDebug\n*F\n+ 1 ModelGiftCardItem.kt\ncom/transsnet/palmpay/teller/ui/view/ModelGiftCardItem\n*L\n102#1:299,4\n111#1:303,4\n124#1:307,4\n167#1:311,4\n173#1:315,4\n208#1:319,4\n*E\n"})
public final class ModelGiftCardItem extends BaseConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34345d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f34346c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelGiftCardItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(String str) {
        if (str.length() == 0 || r0.U0()) {
            return;
        }
        ClipboardUtils.copyText(str);
        n.v(k.core_copy_success);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:108:0x0300  */
    /* JADX WARN: Code duplicated, block: B:111:0x030a  */
    /* JADX WARN: Code duplicated, block: B:112:0x030d  */
    /* JADX WARN: Code duplicated, block: B:115:0x031c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0325  */
    /* JADX WARN: Code duplicated, block: B:118:0x0328  */
    /* JADX WARN: Code duplicated, block: B:121:0x032f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0332  */
    /* JADX WARN: Code duplicated, block: B:124:0x0335  */
    /* JADX WARN: Code duplicated, block: B:127:0x033b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0340  */
    /* JADX WARN: Code duplicated, block: B:130:0x037a  */
    /* JADX WARN: Code duplicated, block: B:133:0x038e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0396  */
    /* JADX WARN: Code duplicated, block: B:138:0x0399  */
    /* JADX WARN: Code duplicated, block: B:139:0x039c  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:143:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:146:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:148:0x0401 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0408  */
    /* JADX WARN: Code duplicated, block: B:153:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0419  */
    /* JADX WARN: Code duplicated, block: B:160:0x042d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0435  */
    /* JADX WARN: Code duplicated, block: B:24:0x017c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0186  */
    /* JADX WARN: Code duplicated, block: B:30:0x0195  */
    /* JADX WARN: Code duplicated, block: B:33:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x01db  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x020b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0211  */
    /* JADX WARN: Code duplicated, block: B:58:0x021a  */
    /* JADX WARN: Code duplicated, block: B:61:0x022f  */
    /* JADX WARN: Code duplicated, block: B:64:0x023b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0246  */
    /* JADX WARN: Code duplicated, block: B:67:0x0253  */
    /* JADX WARN: Code duplicated, block: B:69:0x025e  */
    /* JADX WARN: Code duplicated, block: B:71:0x026b  */
    /* JADX WARN: Code duplicated, block: B:72:0x028f  */
    /* JADX WARN: Code duplicated, block: B:76:0x029d  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02dc  */
    /* JADX WARN: Failed to extract var names
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 ??
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.checkAndRename(ProcessKotlinInternals.java:142)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processInvoke(ProcessKotlinInternals.java:125)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:98)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:85)
     */
    public final void d(BillPaymentOrderDetailRsp billPaymentOrderDetailRsp) {
        int i7;
        Drawable drawable;
        String billerName;
        String countryName;
        String currencySymbol;
        String paymentItemName;
        String redeemCode;
        final String redeemPin;
        String redeemCodeDisplay;
        boolean z3;
        String redeemCodeDisplay2;
        ViewGroup.LayoutParams layoutParams;
        String str;
        View view;
        ViewGroup.LayoutParams layoutParams2;
        Long expireTime;
        String strS;
        boolean z8;
        String redeemDesc;
        final String str2;
        String redemptionUrl;
        String string;
        boolean z10;
        int i10;
        String string2;
        boolean z11;
        TextView tvGiftCardRedemptionUrl;
        String str3;
        boolean z12;
        ViewGroup.LayoutParams layoutParams3;
        int dp;
        boolean z13;
        t0 t0Var = this.f34346c;
        if (t0Var == null) {
            return;
        }
        ImageView imageView = t0Var.f8512e;
        imageView.setImageDrawable(null);
        TextView textView = t0Var.f8500C;
        textView.setText((CharSequence) null);
        TextView textView2 = t0Var.f8520v;
        textView2.setText((CharSequence) null);
        TextView textView3 = t0Var.f8501H;
        textView3.setText((CharSequence) null);
        TextView tvGiftCardCodeTitle = t0Var.t;
        Intrinsics.checkNotNullExpressionValue(tvGiftCardCodeTitle, "tvGiftCardCodeTitle");
        h.s(tvGiftCardCodeTitle, true);
        tvGiftCardCodeTitle.setText(f.qt_gift_card_code_title);
        TextView tvGiftCardCode = t0Var.f8519p;
        Intrinsics.checkNotNullExpressionValue(tvGiftCardCode, "tvGiftCardCode");
        h.s(tvGiftCardCode, true);
        tvGiftCardCode.setText((CharSequence) null);
        FlexboxLayout flexboxGiftCardPinExpire = t0Var.f8509b;
        Intrinsics.checkNotNullExpressionValue(flexboxGiftCardPinExpire, "flexboxGiftCardPinExpire");
        ViewGroup.LayoutParams layoutParams4 = flexboxGiftCardPinExpire.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
        layoutParams5.f15651j = Pd.c.barrier_code;
        flexboxGiftCardPinExpire.setLayoutParams(layoutParams5);
        IconicsImageView ivGiftCardCopy = t0Var.f8510c;
        Intrinsics.checkNotNullExpressionValue(ivGiftCardCopy, "ivGiftCardCopy");
        h.s(ivGiftCardCopy, false);
        ivGiftCardCopy.setOnClickListener(null);
        ConstraintLayout layoutGiftCardPin = t0Var.f8516j;
        Intrinsics.checkNotNullExpressionValue(layoutGiftCardPin, "layoutGiftCardPin");
        h.s(layoutGiftCardPin, false);
        TextView textView4 = t0Var.f8502L;
        textView4.setText((CharSequence) null);
        IconicsImageView iconicsImageView = t0Var.f8513f;
        iconicsImageView.setOnClickListener(null);
        View layoutGiftCardExpire = t0Var.f8514g;
        Intrinsics.checkNotNullExpressionValue(layoutGiftCardExpire, "layoutGiftCardExpire");
        h.s(layoutGiftCardExpire, false);
        Intrinsics.checkNotNullExpressionValue(layoutGiftCardExpire, "layoutGiftCardExpire");
        ViewGroup.LayoutParams layoutParams6 = layoutGiftCardExpire.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
        }
        FlexboxLayout.LayoutParams layoutParams7 = (FlexboxLayout.LayoutParams) layoutParams6;
        layoutParams7.setWrapBefore(false);
        layoutGiftCardExpire.setLayoutParams(layoutParams7);
        TextView textView5 = t0Var.f8521w;
        textView5.setText((CharSequence) null);
        View vGiftCardDivider = t0Var.f8517k0;
        Intrinsics.checkNotNullExpressionValue(vGiftCardDivider, "vGiftCardDivider");
        h.s(vGiftCardDivider, false);
        LinearLayout layoutGiftCardSecondaryInfo = t0Var.f8518o;
        Intrinsics.checkNotNullExpressionValue(layoutGiftCardSecondaryInfo, "layoutGiftCardSecondaryInfo");
        h.s(layoutGiftCardSecondaryInfo, false);
        ConstraintLayout layoutGiftCardInstructions = t0Var.f8515i;
        Intrinsics.checkNotNullExpressionValue(layoutGiftCardInstructions, "layoutGiftCardInstructions");
        h.s(layoutGiftCardInstructions, false);
        TextView tvGiftCardInstructions = t0Var.f8499B;
        tvGiftCardInstructions.setText((CharSequence) null);
        Intrinsics.checkNotNullExpressionValue(tvGiftCardInstructions, "tvGiftCardInstructions");
        h.s(tvGiftCardInstructions, false);
        IconicsImageView iconicsImageView2 = t0Var.f8511d;
        iconicsImageView2.setOnClickListener(null);
        TextView tvGiftCardRedemptionUrl2 = t0Var.f8504Q;
        tvGiftCardRedemptionUrl2.setText((CharSequence) null);
        tvGiftCardRedemptionUrl2.setMovementMethod(null);
        Intrinsics.checkNotNullExpressionValue(tvGiftCardRedemptionUrl2, "tvGiftCardRedemptionUrl");
        h.s(tvGiftCardRedemptionUrl2, false);
        Intrinsics.checkNotNullExpressionValue(tvGiftCardRedemptionUrl2, "tvGiftCardRedemptionUrl");
        ViewGroup.LayoutParams layoutParams8 = tvGiftCardRedemptionUrl2.getLayoutParams();
        if (layoutParams8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams8;
        marginLayoutParams.topMargin = 0;
        tvGiftCardRedemptionUrl2.setLayoutParams(marginLayoutParams);
        TextView tvGiftCardUsedNote = t0Var.f8505X;
        tvGiftCardUsedNote.setText((CharSequence) null);
        Intrinsics.checkNotNullExpressionValue(tvGiftCardUsedNote, "tvGiftCardUsedNote");
        h.s(tvGiftCardUsedNote, false);
        if (billPaymentOrderDetailRsp == null) {
            return;
        }
        String billerLogo = billPaymentOrderDetailRsp.getBillerLogo();
        if (billerLogo != null) {
            if (billerLogo.length() == 0) {
                drawable = null;
                i7 = 2;
            } else {
                i7 = 2;
                tvGiftCardRedemptionUrl2 = tvGiftCardRedemptionUrl2;
                r0.j1(imageView, billPaymentOrderDetailRsp.getBillerLogo(), (G1.d) new G1.d().I(new z(CommonViewExtKt.getDp(2)), true));
            }
            billerName = billPaymentOrderDetailRsp.getBillerName();
            if (billerName == null) {
                billerName = "";
            }
            textView.setText(billerName);
            countryName = billPaymentOrderDetailRsp.getCountryName();
            if (countryName == null) {
                countryName = "";
            }
            textView2.setText(countryName);
            SpanUtils spanUtils = new SpanUtils();
            currencySymbol = billPaymentOrderDetailRsp.getCurrencySymbol();
            if (currencySymbol == null) {
                currencySymbol = "";
            }
            SpanUtils fontSize = spanUtils.append(currencySymbol).setFontSize(CommonViewExtKt.getDp(14));
            paymentItemName = billPaymentOrderDetailRsp.getPaymentItemName();
            if (paymentItemName == null) {
                paymentItemName = "";
            }
            textView3.setText(fontSize.append(paymentItemName).setFontSize(CommonViewExtKt.getDp(22)).create());
            redeemCode = billPaymentOrderDetailRsp.getRedeemCode();
            if (redeemCode != null || StringsKt.F(redeemCode)) {
                redeemCode = null;
            }
            redeemPin = billPaymentOrderDetailRsp.getRedeemPin();
            if (redeemPin != null || StringsKt.F(redeemPin)) {
                redeemPin = null;
            }
            if (redeemCode != null && redeemPin == null) {
                tvGiftCardCodeTitle.setText(f.qt_code_or_pin);
                tvGiftCardCode.setText(f.qt_code_pin_error);
            } else {
                if (redeemCode != null) {
                    redeemCodeDisplay = billPaymentOrderDetailRsp.getRedeemCodeDisplay();
                    if (redeemCodeDisplay != null || StringsKt.F(redeemCodeDisplay)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z14 = !z3;
                    Intrinsics.checkNotNullExpressionValue(tvGiftCardCodeTitle, "tvGiftCardCodeTitle");
                    h.s(tvGiftCardCodeTitle, z14);
                    Intrinsics.checkNotNullExpressionValue(tvGiftCardCode, "tvGiftCardCode");
                    h.s(tvGiftCardCode, z14);
                    redeemCodeDisplay2 = billPaymentOrderDetailRsp.getRedeemCodeDisplay();
                    if (redeemCodeDisplay2 == null) {
                        redeemCodeDisplay2 = "";
                    }
                    tvGiftCardCode.setText(redeemCodeDisplay2);
                    Intrinsics.checkNotNullExpressionValue(ivGiftCardCopy, "ivGiftCardCopy");
                    h.s(ivGiftCardCopy, z14);
                    if (z3) {
                        Intrinsics.checkNotNullExpressionValue(flexboxGiftCardPinExpire, "flexboxGiftCardPinExpire");
                        layoutParams = flexboxGiftCardPinExpire.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ConstraintLayout.LayoutParams layoutParams9 = (ConstraintLayout.LayoutParams) layoutParams;
                        layoutParams9.f15651j = Pd.c.v_gift_card_body_top;
                        flexboxGiftCardPinExpire.setLayoutParams(layoutParams9);
                    } else {
                        ivGiftCardCopy.setOnClickListener(new ViewOnClickListenerC0087i(this, 26, billPaymentOrderDetailRsp, redeemCode));
                    }
                    if (redeemPin != null) {
                        str = "layoutGiftCardExpire";
                        view = layoutGiftCardExpire;
                        Intrinsics.checkNotNullExpressionValue(view, str);
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                        }
                        FlexboxLayout.LayoutParams layoutParams10 = (FlexboxLayout.LayoutParams) layoutParams2;
                        layoutParams10.setWrapBefore(z3);
                        view.setLayoutParams(layoutParams10);
                        textView4.setText(redeemPin);
                        Intrinsics.checkNotNullExpressionValue(layoutGiftCardPin, "layoutGiftCardPin");
                        h.s(layoutGiftCardPin, true);
                        final int i11 = 2;
                        iconicsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ ModelGiftCardItem f18913b;

                            {
                                this.f18913b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ModelGiftCardItem modelGiftCardItem = this.f18913b;
                                String str4 = redeemPin;
                                switch (i11) {
                                    case 0:
                                        int i12 = ModelGiftCardItem.f34345d;
                                        modelGiftCardItem.getClass();
                                        ModelGiftCardItem.c(str4);
                                        break;
                                    case 1:
                                        int i13 = ModelGiftCardItem.f34345d;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        modelGiftCardItem.getClass();
                                        ModelGiftCardItem.c(str4);
                                        break;
                                    default:
                                        int i14 = ModelGiftCardItem.f34345d;
                                        modelGiftCardItem.getClass();
                                        ModelGiftCardItem.c(str4);
                                        break;
                                }
                            }
                        });
                    }
                    expireTime = billPaymentOrderDetailRsp.getExpireTime();
                    if (expireTime == null) {
                        strS = null;
                    } else {
                        if (expireTime.longValue() <= 0) {
                            expireTime = null;
                        }
                        if (expireTime != null) {
                            strS = r0.S(expireTime.longValue());
                        } else {
                            strS = null;
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(view, str);
                    if (strS != null || strS.length() == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    h.s(view, !z8);
                    textView5.setText(strS != null ? strS : "");
                    redeemDesc = billPaymentOrderDetailRsp.getRedeemDesc();
                    if (redeemDesc != null || StringsKt.F(redeemDesc)) {
                        str2 = null;
                    } else {
                        str2 = redeemDesc;
                    }
                    redemptionUrl = billPaymentOrderDetailRsp.getRedemptionUrl();
                    if (redemptionUrl != null || (string = StringsKt.V(redemptionUrl).toString()) == null || string.length() <= 0) {
                        string = null;
                    }
                    Intrinsics.checkNotNullExpressionValue(r33, "layoutGiftCardInstructions");
                    if (str2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h.s(layoutGiftCardInstructions, z10);
                    Intrinsics.checkNotNullExpressionValue(tvGiftCardInstructions, "tvGiftCardInstructions");
                    i10 = f.qt_gift_card_instructions_label;
                    if (str2 != null) {
                        string2 = StringsKt.V(str2).toString();
                    } else {
                        string2 = null;
                    }
                    if (string2 != null || string2.length() <= 0) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h.s(tvGiftCardInstructions, z11);
                    if (string2 == null) {
                        tvGiftCardInstructions.setText((CharSequence) null);
                    } else {
                        tvGiftCardInstructions.setText(new SpanUtils().append(getContext().getString(i10)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext())).append(string2).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext())).create());
                    }
                    if (str2 != null) {
                        final int i12 = 0;
                        iconicsImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ ModelGiftCardItem f18913b;

                            {
                                this.f18913b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ModelGiftCardItem modelGiftCardItem = this.f18913b;
                                String str4 = str2;
                                switch (i12) {
                                    case 0:
                                        int i13 = ModelGiftCardItem.f34345d;
                                        modelGiftCardItem.getClass();
                                        ModelGiftCardItem.c(str4);
                                        break;
                                    case 1:
                                        int i14 = ModelGiftCardItem.f34345d;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        modelGiftCardItem.getClass();
                                        ModelGiftCardItem.c(str4);
                                        break;
                                    default:
                                        int i15 = ModelGiftCardItem.f34345d;
                                        modelGiftCardItem.getClass();
                                        ModelGiftCardItem.c(str4);
                                        break;
                                }
                            }
                        });
                    }
                    tvGiftCardRedemptionUrl = tvGiftCardRedemptionUrl2;
                    Intrinsics.checkNotNullExpressionValue(tvGiftCardRedemptionUrl, "tvGiftCardRedemptionUrl");
                    if (string != null || string.length() <= 0) {
                        str3 = null;
                    } else {
                        str3 = string;
                    }
                    if (str3 != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h.s(tvGiftCardRedemptionUrl, z12);
                    if (str3 == null) {
                        tvGiftCardRedemptionUrl.setText((CharSequence) null);
                        tvGiftCardRedemptionUrl.setMovementMethod(null);
                    } else {
                        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext());
                        tvGiftCardRedemptionUrl.setText(new SpanUtils().append(getContext().getString(f.qt_gift_card_how_to_redeem_label)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext())).append(str3).setForegroundColor(iColorInt).setClickSpan(new D(str3, iColorInt)).create());
                        tvGiftCardRedemptionUrl.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    Intrinsics.checkNotNullExpressionValue(tvGiftCardRedemptionUrl, "tvGiftCardRedemptionUrl");
                    layoutParams3 = tvGiftCardRedemptionUrl.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (str2 != null || string == null) {
                        dp = 0;
                    } else {
                        dp = CommonViewExtKt.getDp(i7);
                    }
                    marginLayoutParams2.topMargin = dp;
                    tvGiftCardRedemptionUrl.setLayoutParams(marginLayoutParams2);
                    if (str2 == null || string != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Intrinsics.checkNotNullExpressionValue(vGiftCardDivider, "vGiftCardDivider");
                    h.s(vGiftCardDivider, z13);
                    Intrinsics.checkNotNullExpressionValue(layoutGiftCardSecondaryInfo, "layoutGiftCardSecondaryInfo");
                    h.s(layoutGiftCardSecondaryInfo, z13);
                }
                tvGiftCardCodeTitle.setText(f.qt_pin);
                tvGiftCardCode.setText(redeemPin);
                Intrinsics.checkNotNullExpressionValue(ivGiftCardCopy, "ivGiftCardCopy");
                h.s(ivGiftCardCopy, true);
                final int i13 = 1;
                ivGiftCardCopy.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModelGiftCardItem f18913b;

                    {
                        this.f18913b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ModelGiftCardItem modelGiftCardItem = this.f18913b;
                        String str4 = redeemPin;
                        switch (i13) {
                            case 0:
                                int i14 = ModelGiftCardItem.f34345d;
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                            case 1:
                                int i15 = ModelGiftCardItem.f34345d;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                            default:
                                int i16 = ModelGiftCardItem.f34345d;
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                        }
                    }
                });
            }
            str = "layoutGiftCardExpire";
            view = layoutGiftCardExpire;
            expireTime = billPaymentOrderDetailRsp.getExpireTime();
            if (expireTime == null) {
                strS = null;
            } else {
                if (expireTime.longValue() <= 0) {
                    expireTime = null;
                }
                if (expireTime != null) {
                    strS = r0.S(expireTime.longValue());
                } else {
                    strS = null;
                }
            }
            Intrinsics.checkNotNullExpressionValue(view, str);
            if (strS != null) {
                z8 = true;
            } else {
                z8 = true;
            }
            h.s(view, !z8);
            textView5.setText(strS != null ? strS : "");
            redeemDesc = billPaymentOrderDetailRsp.getRedeemDesc();
            if (redeemDesc != null) {
                str2 = null;
            } else {
                str2 = null;
            }
            redemptionUrl = billPaymentOrderDetailRsp.getRedemptionUrl();
            if (redemptionUrl != null) {
                string = null;
            } else {
                string = null;
            }
            Intrinsics.checkNotNullExpressionValue(r33, "layoutGiftCardInstructions");
            if (str2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            h.s(layoutGiftCardInstructions, z10);
            Intrinsics.checkNotNullExpressionValue(tvGiftCardInstructions, "tvGiftCardInstructions");
            i10 = f.qt_gift_card_instructions_label;
            if (str2 != null) {
                string2 = StringsKt.V(str2).toString();
            } else {
                string2 = null;
            }
            if (string2 != null) {
                string2 = null;
            } else {
                string2 = null;
            }
            if (string2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            h.s(tvGiftCardInstructions, z11);
            if (string2 == null) {
                tvGiftCardInstructions.setText((CharSequence) null);
            } else {
                tvGiftCardInstructions.setText(new SpanUtils().append(getContext().getString(i10)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext())).append(string2).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext())).create());
            }
            if (str2 != null) {
                final int i14 = 0;
                iconicsImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModelGiftCardItem f18913b;

                    {
                        this.f18913b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ModelGiftCardItem modelGiftCardItem = this.f18913b;
                        String str4 = str2;
                        switch (i14) {
                            case 0:
                                int i15 = ModelGiftCardItem.f34345d;
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                            case 1:
                                int i16 = ModelGiftCardItem.f34345d;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                            default:
                                int i17 = ModelGiftCardItem.f34345d;
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                        }
                    }
                });
            }
            tvGiftCardRedemptionUrl = tvGiftCardRedemptionUrl2;
            Intrinsics.checkNotNullExpressionValue(tvGiftCardRedemptionUrl, "tvGiftCardRedemptionUrl");
            if (string != null) {
                str3 = null;
            } else {
                str3 = null;
            }
            if (str3 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            h.s(tvGiftCardRedemptionUrl, z12);
            if (str3 == null) {
                tvGiftCardRedemptionUrl.setText((CharSequence) null);
                tvGiftCardRedemptionUrl.setMovementMethod(null);
            } else {
                int iColorInt2 = CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext());
                tvGiftCardRedemptionUrl.setText(new SpanUtils().append(getContext().getString(f.qt_gift_card_how_to_redeem_label)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext())).append(str3).setForegroundColor(iColorInt2).setClickSpan(new D(str3, iColorInt2)).create());
                tvGiftCardRedemptionUrl.setMovementMethod(LinkMovementMethod.getInstance());
            }
            Intrinsics.checkNotNullExpressionValue(tvGiftCardRedemptionUrl, "tvGiftCardRedemptionUrl");
            layoutParams3 = tvGiftCardRedemptionUrl.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            if (str2 != null) {
                dp = 0;
            } else {
                dp = 0;
            }
            marginLayoutParams3.topMargin = dp;
            tvGiftCardRedemptionUrl.setLayoutParams(marginLayoutParams3);
            if (str2 == null) {
                z13 = true;
            } else {
                z13 = true;
            }
            Intrinsics.checkNotNullExpressionValue(vGiftCardDivider, "vGiftCardDivider");
            h.s(vGiftCardDivider, z13);
            Intrinsics.checkNotNullExpressionValue(layoutGiftCardSecondaryInfo, "layoutGiftCardSecondaryInfo");
            h.s(layoutGiftCardSecondaryInfo, z13);
        }
        i7 = 2;
        drawable = null;
        imageView.setImageDrawable(drawable);
        billerName = billPaymentOrderDetailRsp.getBillerName();
        if (billerName == null) {
            billerName = "";
        }
        textView.setText(billerName);
        countryName = billPaymentOrderDetailRsp.getCountryName();
        if (countryName == null) {
            countryName = "";
        }
        textView2.setText(countryName);
        SpanUtils spanUtils2 = new SpanUtils();
        currencySymbol = billPaymentOrderDetailRsp.getCurrencySymbol();
        if (currencySymbol == null) {
            currencySymbol = "";
        }
        SpanUtils fontSize2 = spanUtils2.append(currencySymbol).setFontSize(CommonViewExtKt.getDp(14));
        paymentItemName = billPaymentOrderDetailRsp.getPaymentItemName();
        if (paymentItemName == null) {
            paymentItemName = "";
        }
        textView3.setText(fontSize2.append(paymentItemName).setFontSize(CommonViewExtKt.getDp(22)).create());
        redeemCode = billPaymentOrderDetailRsp.getRedeemCode();
        if (redeemCode != null) {
            redeemCode = null;
        } else {
            redeemCode = null;
        }
        redeemPin = billPaymentOrderDetailRsp.getRedeemPin();
        if (redeemPin != null) {
            redeemPin = null;
        } else {
            redeemPin = null;
        }
        if (redeemCode != null) {
            if (redeemCode != null) {
                tvGiftCardCodeTitle.setText(f.qt_pin);
                tvGiftCardCode.setText(redeemPin);
                Intrinsics.checkNotNullExpressionValue(ivGiftCardCopy, "ivGiftCardCopy");
                h.s(ivGiftCardCopy, true);
                final int i15 = 1;
                ivGiftCardCopy.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModelGiftCardItem f18913b;

                    {
                        this.f18913b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ModelGiftCardItem modelGiftCardItem = this.f18913b;
                        String str4 = redeemPin;
                        switch (i15) {
                            case 0:
                                int i16 = ModelGiftCardItem.f34345d;
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                            case 1:
                                int i17 = ModelGiftCardItem.f34345d;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                            default:
                                int i18 = ModelGiftCardItem.f34345d;
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                        }
                    }
                });
            } else {
                redeemCodeDisplay = billPaymentOrderDetailRsp.getRedeemCodeDisplay();
                if (redeemCodeDisplay != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                boolean z15 = !z3;
                Intrinsics.checkNotNullExpressionValue(tvGiftCardCodeTitle, "tvGiftCardCodeTitle");
                h.s(tvGiftCardCodeTitle, z15);
                Intrinsics.checkNotNullExpressionValue(tvGiftCardCode, "tvGiftCardCode");
                h.s(tvGiftCardCode, z15);
                redeemCodeDisplay2 = billPaymentOrderDetailRsp.getRedeemCodeDisplay();
                if (redeemCodeDisplay2 == null) {
                    redeemCodeDisplay2 = "";
                }
                tvGiftCardCode.setText(redeemCodeDisplay2);
                Intrinsics.checkNotNullExpressionValue(ivGiftCardCopy, "ivGiftCardCopy");
                h.s(ivGiftCardCopy, z15);
                if (z3) {
                    ivGiftCardCopy.setOnClickListener(new ViewOnClickListenerC0087i(this, 26, billPaymentOrderDetailRsp, redeemCode));
                } else {
                    Intrinsics.checkNotNullExpressionValue(flexboxGiftCardPinExpire, "flexboxGiftCardPinExpire");
                    layoutParams = flexboxGiftCardPinExpire.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams11 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams11.f15651j = Pd.c.v_gift_card_body_top;
                    flexboxGiftCardPinExpire.setLayoutParams(layoutParams11);
                }
                if (redeemPin != null) {
                    str = "layoutGiftCardExpire";
                    view = layoutGiftCardExpire;
                    Intrinsics.checkNotNullExpressionValue(view, str);
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                    }
                    FlexboxLayout.LayoutParams layoutParams12 = (FlexboxLayout.LayoutParams) layoutParams2;
                    layoutParams12.setWrapBefore(z3);
                    view.setLayoutParams(layoutParams12);
                    textView4.setText(redeemPin);
                    Intrinsics.checkNotNullExpressionValue(layoutGiftCardPin, "layoutGiftCardPin");
                    h.s(layoutGiftCardPin, true);
                    final int i16 = 2;
                    iconicsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ModelGiftCardItem f18913b;

                        {
                            this.f18913b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ModelGiftCardItem modelGiftCardItem = this.f18913b;
                            String str4 = redeemPin;
                            switch (i16) {
                                case 0:
                                    int i17 = ModelGiftCardItem.f34345d;
                                    modelGiftCardItem.getClass();
                                    ModelGiftCardItem.c(str4);
                                    break;
                                case 1:
                                    int i18 = ModelGiftCardItem.f34345d;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    modelGiftCardItem.getClass();
                                    ModelGiftCardItem.c(str4);
                                    break;
                                default:
                                    int i19 = ModelGiftCardItem.f34345d;
                                    modelGiftCardItem.getClass();
                                    ModelGiftCardItem.c(str4);
                                    break;
                            }
                        }
                    });
                }
            }
            str = "layoutGiftCardExpire";
            view = layoutGiftCardExpire;
        } else {
            if (redeemCode != null) {
                tvGiftCardCodeTitle.setText(f.qt_pin);
                tvGiftCardCode.setText(redeemPin);
                Intrinsics.checkNotNullExpressionValue(ivGiftCardCopy, "ivGiftCardCopy");
                h.s(ivGiftCardCopy, true);
                final int i17 = 1;
                ivGiftCardCopy.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModelGiftCardItem f18913b;

                    {
                        this.f18913b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ModelGiftCardItem modelGiftCardItem = this.f18913b;
                        String str4 = redeemPin;
                        switch (i17) {
                            case 0:
                                int i18 = ModelGiftCardItem.f34345d;
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                            case 1:
                                int i19 = ModelGiftCardItem.f34345d;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                            default:
                                int i110 = ModelGiftCardItem.f34345d;
                                modelGiftCardItem.getClass();
                                ModelGiftCardItem.c(str4);
                                break;
                        }
                    }
                });
            } else {
                redeemCodeDisplay = billPaymentOrderDetailRsp.getRedeemCodeDisplay();
                if (redeemCodeDisplay != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                boolean z16 = !z3;
                Intrinsics.checkNotNullExpressionValue(tvGiftCardCodeTitle, "tvGiftCardCodeTitle");
                h.s(tvGiftCardCodeTitle, z16);
                Intrinsics.checkNotNullExpressionValue(tvGiftCardCode, "tvGiftCardCode");
                h.s(tvGiftCardCode, z16);
                redeemCodeDisplay2 = billPaymentOrderDetailRsp.getRedeemCodeDisplay();
                if (redeemCodeDisplay2 == null) {
                    redeemCodeDisplay2 = "";
                }
                tvGiftCardCode.setText(redeemCodeDisplay2);
                Intrinsics.checkNotNullExpressionValue(ivGiftCardCopy, "ivGiftCardCopy");
                h.s(ivGiftCardCopy, z16);
                if (z3) {
                    ivGiftCardCopy.setOnClickListener(new ViewOnClickListenerC0087i(this, 26, billPaymentOrderDetailRsp, redeemCode));
                } else {
                    Intrinsics.checkNotNullExpressionValue(flexboxGiftCardPinExpire, "flexboxGiftCardPinExpire");
                    layoutParams = flexboxGiftCardPinExpire.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams13 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams13.f15651j = Pd.c.v_gift_card_body_top;
                    flexboxGiftCardPinExpire.setLayoutParams(layoutParams13);
                }
                if (redeemPin != null) {
                    str = "layoutGiftCardExpire";
                    view = layoutGiftCardExpire;
                    Intrinsics.checkNotNullExpressionValue(view, str);
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                    }
                    FlexboxLayout.LayoutParams layoutParams14 = (FlexboxLayout.LayoutParams) layoutParams2;
                    layoutParams14.setWrapBefore(z3);
                    view.setLayoutParams(layoutParams14);
                    textView4.setText(redeemPin);
                    Intrinsics.checkNotNullExpressionValue(layoutGiftCardPin, "layoutGiftCardPin");
                    h.s(layoutGiftCardPin, true);
                    final int i18 = 2;
                    iconicsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ModelGiftCardItem f18913b;

                        {
                            this.f18913b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ModelGiftCardItem modelGiftCardItem = this.f18913b;
                            String str4 = redeemPin;
                            switch (i18) {
                                case 0:
                                    int i19 = ModelGiftCardItem.f34345d;
                                    modelGiftCardItem.getClass();
                                    ModelGiftCardItem.c(str4);
                                    break;
                                case 1:
                                    int i110 = ModelGiftCardItem.f34345d;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    modelGiftCardItem.getClass();
                                    ModelGiftCardItem.c(str4);
                                    break;
                                default:
                                    int i111 = ModelGiftCardItem.f34345d;
                                    modelGiftCardItem.getClass();
                                    ModelGiftCardItem.c(str4);
                                    break;
                            }
                        }
                    });
                }
            }
            str = "layoutGiftCardExpire";
            view = layoutGiftCardExpire;
        }
        expireTime = billPaymentOrderDetailRsp.getExpireTime();
        if (expireTime == null) {
            strS = null;
        } else {
            if (expireTime.longValue() <= 0) {
                expireTime = null;
            }
            if (expireTime != null) {
                strS = r0.S(expireTime.longValue());
            } else {
                strS = null;
            }
        }
        Intrinsics.checkNotNullExpressionValue(view, str);
        if (strS != null) {
            z8 = true;
        } else {
            z8 = true;
        }
        h.s(view, !z8);
        textView5.setText(strS != null ? strS : "");
        redeemDesc = billPaymentOrderDetailRsp.getRedeemDesc();
        if (redeemDesc != null) {
            str2 = null;
        } else {
            str2 = null;
        }
        redemptionUrl = billPaymentOrderDetailRsp.getRedemptionUrl();
        if (redemptionUrl != null) {
            string = null;
        } else {
            string = null;
        }
        Intrinsics.checkNotNullExpressionValue(r33, "layoutGiftCardInstructions");
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h.s(layoutGiftCardInstructions, z10);
        Intrinsics.checkNotNullExpressionValue(tvGiftCardInstructions, "tvGiftCardInstructions");
        i10 = f.qt_gift_card_instructions_label;
        if (str2 != null) {
            string2 = StringsKt.V(str2).toString();
        } else {
            string2 = null;
        }
        if (string2 != null) {
            string2 = null;
        } else {
            string2 = null;
        }
        if (string2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        h.s(tvGiftCardInstructions, z11);
        if (string2 == null) {
            tvGiftCardInstructions.setText((CharSequence) null);
        } else {
            tvGiftCardInstructions.setText(new SpanUtils().append(getContext().getString(i10)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext())).append(string2).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext())).create());
        }
        if (str2 != null) {
            final int i19 = 0;
            iconicsImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ce.C

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ModelGiftCardItem f18913b;

                {
                    this.f18913b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ModelGiftCardItem modelGiftCardItem = this.f18913b;
                    String str4 = str2;
                    switch (i19) {
                        case 0:
                            int i110 = ModelGiftCardItem.f34345d;
                            modelGiftCardItem.getClass();
                            ModelGiftCardItem.c(str4);
                            break;
                        case 1:
                            int i111 = ModelGiftCardItem.f34345d;
                            if (str4 == null) {
                                str4 = "";
                            }
                            modelGiftCardItem.getClass();
                            ModelGiftCardItem.c(str4);
                            break;
                        default:
                            int i112 = ModelGiftCardItem.f34345d;
                            modelGiftCardItem.getClass();
                            ModelGiftCardItem.c(str4);
                            break;
                    }
                }
            });
        }
        tvGiftCardRedemptionUrl = tvGiftCardRedemptionUrl2;
        Intrinsics.checkNotNullExpressionValue(tvGiftCardRedemptionUrl, "tvGiftCardRedemptionUrl");
        if (string != null) {
            str3 = null;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        h.s(tvGiftCardRedemptionUrl, z12);
        if (str3 == null) {
            tvGiftCardRedemptionUrl.setText((CharSequence) null);
            tvGiftCardRedemptionUrl.setMovementMethod(null);
        } else {
            int iColorInt3 = CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext());
            tvGiftCardRedemptionUrl.setText(new SpanUtils().append(getContext().getString(f.qt_gift_card_how_to_redeem_label)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext())).append(str3).setForegroundColor(iColorInt3).setClickSpan(new D(str3, iColorInt3)).create());
            tvGiftCardRedemptionUrl.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Intrinsics.checkNotNullExpressionValue(tvGiftCardRedemptionUrl, "tvGiftCardRedemptionUrl");
        layoutParams3 = tvGiftCardRedemptionUrl.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3;
        if (str2 != null) {
            dp = 0;
        } else {
            dp = 0;
        }
        marginLayoutParams4.topMargin = dp;
        tvGiftCardRedemptionUrl.setLayoutParams(marginLayoutParams4);
        if (str2 == null) {
            z13 = true;
        } else {
            z13 = true;
        }
        Intrinsics.checkNotNullExpressionValue(vGiftCardDivider, "vGiftCardDivider");
        h.s(vGiftCardDivider, z13);
        Intrinsics.checkNotNullExpressionValue(layoutGiftCardSecondaryInfo, "layoutGiftCardSecondaryInfo");
        h.s(layoutGiftCardSecondaryInfo, z13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelGiftCardItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelGiftCardItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelGiftCardItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        View viewM;
        View viewM2;
        View viewM3;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, Pd.d.qt_view_layout_gift_card_item, this);
        int i10 = Pd.c.barrier_code;
        if (((Barrier) p059e1.a.m(i10, viewInflate)) != null) {
            i10 = Pd.c.barrier_content;
            if (((Barrier) p059e1.a.m(i10, viewInflate)) != null) {
                i10 = Pd.c.barrier_primary_info;
                if (((Barrier) p059e1.a.m(i10, viewInflate)) != null) {
                    i10 = Pd.c.flexbox_gift_card_pin_expire;
                    FlexboxLayout flexboxLayout = (FlexboxLayout) p059e1.a.m(i10, viewInflate);
                    if (flexboxLayout != null) {
                        i10 = Pd.c.iv_gift_card_copy;
                        IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i10, viewInflate);
                        if (iconicsImageView != null) {
                            i10 = Pd.c.iv_gift_card_instructions_copy;
                            IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i10, viewInflate);
                            if (iconicsImageView2 != null) {
                                i10 = Pd.c.iv_gift_card_operator_icon;
                                ImageView imageView = (ImageView) p059e1.a.m(i10, viewInflate);
                                if (imageView != null) {
                                    i10 = Pd.c.iv_gift_card_pin_copy;
                                    IconicsImageView iconicsImageView3 = (IconicsImageView) p059e1.a.m(i10, viewInflate);
                                    if (iconicsImageView3 != null) {
                                        i10 = Pd.c.layout_gift_card_expire;
                                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                        if (linearLayout != null) {
                                            i10 = Pd.c.layout_gift_card_instructions;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i10, viewInflate);
                                            if (constraintLayout != null) {
                                                i10 = Pd.c.layout_gift_card_pin;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i10, viewInflate);
                                                if (constraintLayout2 != null) {
                                                    i10 = Pd.c.layout_gift_card_secondary_info;
                                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                                    if (linearLayout2 != null) {
                                                        i10 = Pd.c.tv_gift_card_code;
                                                        TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
                                                        if (textView != null) {
                                                            i10 = Pd.c.tv_gift_card_code_title;
                                                            TextView textView2 = (TextView) p059e1.a.m(i10, viewInflate);
                                                            if (textView2 != null) {
                                                                i10 = Pd.c.tv_gift_card_country_name;
                                                                TextView textView3 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                if (textView3 != null) {
                                                                    i10 = Pd.c.tv_gift_card_expire;
                                                                    TextView textView4 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                    if (textView4 != null) {
                                                                        i10 = Pd.c.tv_gift_card_expire_title;
                                                                        TextView textView5 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                        if (textView5 != null) {
                                                                            i10 = Pd.c.tv_gift_card_instructions;
                                                                            TextView textView6 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i10 = Pd.c.tv_gift_card_operator_name;
                                                                                TextView textView7 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                if (textView7 != null) {
                                                                                    i10 = Pd.c.tv_gift_card_operator_price;
                                                                                    TextView textView8 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                    if (textView8 != null) {
                                                                                        i10 = Pd.c.tv_gift_card_pin;
                                                                                        TextView textView9 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                        if (textView9 != null) {
                                                                                            i10 = Pd.c.tv_gift_card_pin_title;
                                                                                            TextView textView10 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                            if (textView10 != null) {
                                                                                                i10 = Pd.c.tv_gift_card_redemption_url;
                                                                                                TextView textView11 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                                if (textView11 != null) {
                                                                                                    i10 = Pd.c.tv_gift_card_used_note;
                                                                                                    TextView textView12 = (TextView) p059e1.a.m(i10, viewInflate);
                                                                                                    if (textView12 != null && (viewM = p059e1.a.m((i10 = Pd.c.v_gift_card_body_content), viewInflate)) != null && (viewM2 = p059e1.a.m((i10 = Pd.c.v_gift_card_body_top), viewInflate)) != null && (viewM3 = p059e1.a.m((i10 = Pd.c.v_gift_card_divider), viewInflate)) != null) {
                                                                                                        t0 t0Var = new t0(viewInflate, flexboxLayout, iconicsImageView, iconicsImageView2, imageView, iconicsImageView3, linearLayout, constraintLayout, constraintLayout2, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, viewM, viewM2, viewM3);
                                                                                                        l.G(textView6, CommonViewExtKt.getDp(14));
                                                                                                        l.G(textView11, CommonViewExtKt.getDp(14));
                                                                                                        this.f34346c = t0Var;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
