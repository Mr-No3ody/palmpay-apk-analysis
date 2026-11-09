package com.flexibank.sdk.cashier.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierPayMethodItem;
import com.flexibank.sdk.m;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0018R\u001d\u0010\"\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0018R\u001d\u0010'\u001a\u0004\u0018\u00010#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010&R\u001d\u0010*\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010\u0013R\u001d\u0010-\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0018¨\u0006."}, d2 = {"Lcom/flexibank/sdk/cashier/viewmodel/FlexiBankCashierPayMethodItem;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext", "Landroid/widget/ImageView;", "b", "Lkotlin/Lazy;", "getMPayMethodImg", "()Landroid/widget/ImageView;", "mPayMethodImg", "Landroid/widget/TextView;", "c", "getMPayMethodNameTv", "()Landroid/widget/TextView;", "mPayMethodNameTv", "d", "getMPayMethodNumTv", "mPayMethodNumTv", "e", "getMHintText", "mHintText", "f", "getMActHintText", "mActHintText", "Landroid/view/View;", "g", "getMRoot", "()Landroid/view/View;", "mRoot", "i", "getMRightIv", "mRightIv", "j", "getMActiveTv", "mActiveTv", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FlexiBankCashierPayMethodItem extends LinearLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f22071o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context mContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f22073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f22074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f22075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f22076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f22077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f22078g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f22079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f22080j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankCashierPayMethodItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public final void a(FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean, boolean z3) {
        TextView mActiveTv = getMActiveTv();
        if (mActiveTv != null) {
            mActiveTv.setVisibility(8);
        }
        ImageView mRightIv = getMRightIv();
        if (mRightIv != null) {
            mRightIv.setVisibility(0);
        }
        TextView mActHintText = getMActHintText();
        if (mActHintText != null) {
            mActHintText.setVisibility(8);
        }
        TextView mHintText = getMHintText();
        if (mHintText != null) {
            mHintText.setVisibility(8);
        }
        setEnabled(z3);
        View mRoot = getMRoot();
        if (mRoot != null) {
            mRoot.setEnabled(z3);
        }
        if (!z3) {
            if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean != null ? flexiBankCashierPaymentMethodBean.getTips() : null)) {
                c(flexiBankCashierPaymentMethodBean != null ? flexiBankCashierPaymentMethodBean.getTips() : null, false);
            }
            ImageView mPayMethodImg = getMPayMethodImg();
            if (mPayMethodImg != null) {
                mPayMethodImg.setAlpha(0.6f);
            }
            TextView mPayMethodNameTv = getMPayMethodNameTv();
            if (mPayMethodNameTv != null) {
                mPayMethodNameTv.setAlpha(0.5f);
            }
            TextView mPayMethodNumTv = getMPayMethodNumTv();
            if (mPayMethodNumTv != null) {
                mPayMethodNumTv.setAlpha(0.5f);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(flexiBankCashierPaymentMethodBean != null ? flexiBankCashierPaymentMethodBean.getAcTips() : null)) {
            if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean != null ? flexiBankCashierPaymentMethodBean.getTips() : null)) {
                c(flexiBankCashierPaymentMethodBean != null ? flexiBankCashierPaymentMethodBean.getTips() : null, true);
            }
        } else {
            b(getMActHintText(), flexiBankCashierPaymentMethodBean != null ? flexiBankCashierPaymentMethodBean.getAcTips() : null);
        }
        ImageView mPayMethodImg2 = getMPayMethodImg();
        if (mPayMethodImg2 != null) {
            mPayMethodImg2.setAlpha(1.0f);
        }
        TextView mPayMethodNameTv2 = getMPayMethodNameTv();
        if (mPayMethodNameTv2 != null) {
            mPayMethodNameTv2.setAlpha(1.0f);
        }
        TextView mPayMethodNumTv2 = getMPayMethodNumTv();
        if (mPayMethodNumTv2 != null) {
            mPayMethodNumTv2.setAlpha(1.0f);
        }
    }

    public final void c(String str, boolean z3) {
        if (getMHintText() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            TextView mHintText = getMHintText();
            if (mHintText != null) {
                mHintText.setVisibility(8);
                return;
            }
            return;
        }
        TextView mHintText2 = getMHintText();
        if (mHintText2 != null) {
            mHintText2.setVisibility(0);
        }
        TextView mHintText3 = getMHintText();
        if (mHintText3 != null) {
            Context context = this.mContext;
            mHintText3.setTextColor(z3 ? context.getColor(m.fb_text_color_black1) : context.getColor(m.fb_text_color_gray2));
        }
        TextView mHintText4 = getMHintText();
        if (mHintText4 != null) {
            mHintText4.setBackground(null);
        }
        TextView mHintText5 = getMHintText();
        if (mHintText5 != null) {
            mHintText5.setText(str);
        }
    }

    @Nullable
    public final TextView getMActHintText() {
        return (TextView) this.f22077f.getValue();
    }

    @Nullable
    public final TextView getMActiveTv() {
        return (TextView) this.f22080j.getValue();
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    public final TextView getMHintText() {
        return (TextView) this.f22076e.getValue();
    }

    @Nullable
    public final ImageView getMPayMethodImg() {
        return (ImageView) this.f22073b.getValue();
    }

    @Nullable
    public final TextView getMPayMethodNameTv() {
        return (TextView) this.f22074c.getValue();
    }

    @Nullable
    public final TextView getMPayMethodNumTv() {
        return (TextView) this.f22075d.getValue();
    }

    @Nullable
    public final ImageView getMRightIv() {
        return (ImageView) this.f22079i.getValue();
    }

    @Nullable
    public final View getMRoot() {
        return (View) this.f22078g.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankCashierPayMethodItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiBankCashierPayMethodItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankCashierPayMethodItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        final int i10 = 0;
        this.f22073b = C2131j.b(new Function0(this) { // from class: U3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPayMethodItem f9186b;

            {
                this.f9186b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = this.f9186b;
                switch (i10) {
                    case 0:
                        int i11 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_payment_method_icon);
                    case 1:
                        int i12 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_method_name);
                    case 2:
                        int i13 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_balance);
                    case 3:
                        int i14 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_normal_tips);
                    case 4:
                        int i15 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_activity_tips);
                    case 5:
                        int i16 = FlexiBankCashierPayMethodItem.f22071o;
                        return flexiBankCashierPayMethodItem.findViewById(p.fb_mbci_root);
                    case 6:
                        int i17 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_selected);
                    default:
                        int i18 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_top_up);
                }
            }
        });
        final int i11 = 1;
        this.f22074c = C2131j.b(new Function0(this) { // from class: U3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPayMethodItem f9186b;

            {
                this.f9186b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = this.f9186b;
                switch (i11) {
                    case 0:
                        int i12 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_payment_method_icon);
                    case 1:
                        int i13 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_method_name);
                    case 2:
                        int i14 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_balance);
                    case 3:
                        int i15 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_normal_tips);
                    case 4:
                        int i16 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_activity_tips);
                    case 5:
                        int i17 = FlexiBankCashierPayMethodItem.f22071o;
                        return flexiBankCashierPayMethodItem.findViewById(p.fb_mbci_root);
                    case 6:
                        int i18 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_selected);
                    default:
                        int i19 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_top_up);
                }
            }
        });
        final int i12 = 2;
        this.f22075d = C2131j.b(new Function0(this) { // from class: U3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPayMethodItem f9186b;

            {
                this.f9186b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = this.f9186b;
                switch (i12) {
                    case 0:
                        int i13 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_payment_method_icon);
                    case 1:
                        int i14 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_method_name);
                    case 2:
                        int i15 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_balance);
                    case 3:
                        int i16 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_normal_tips);
                    case 4:
                        int i17 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_activity_tips);
                    case 5:
                        int i18 = FlexiBankCashierPayMethodItem.f22071o;
                        return flexiBankCashierPayMethodItem.findViewById(p.fb_mbci_root);
                    case 6:
                        int i19 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_selected);
                    default:
                        int i110 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_top_up);
                }
            }
        });
        final int i13 = 3;
        this.f22076e = C2131j.b(new Function0(this) { // from class: U3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPayMethodItem f9186b;

            {
                this.f9186b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = this.f9186b;
                switch (i13) {
                    case 0:
                        int i14 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_payment_method_icon);
                    case 1:
                        int i15 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_method_name);
                    case 2:
                        int i16 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_balance);
                    case 3:
                        int i17 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_normal_tips);
                    case 4:
                        int i18 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_activity_tips);
                    case 5:
                        int i19 = FlexiBankCashierPayMethodItem.f22071o;
                        return flexiBankCashierPayMethodItem.findViewById(p.fb_mbci_root);
                    case 6:
                        int i110 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_selected);
                    default:
                        int i111 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_top_up);
                }
            }
        });
        final int i14 = 4;
        this.f22077f = C2131j.b(new Function0(this) { // from class: U3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPayMethodItem f9186b;

            {
                this.f9186b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = this.f9186b;
                switch (i14) {
                    case 0:
                        int i15 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_payment_method_icon);
                    case 1:
                        int i16 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_method_name);
                    case 2:
                        int i17 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_balance);
                    case 3:
                        int i18 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_normal_tips);
                    case 4:
                        int i19 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_activity_tips);
                    case 5:
                        int i110 = FlexiBankCashierPayMethodItem.f22071o;
                        return flexiBankCashierPayMethodItem.findViewById(p.fb_mbci_root);
                    case 6:
                        int i111 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_selected);
                    default:
                        int i112 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_top_up);
                }
            }
        });
        final int i15 = 5;
        this.f22078g = C2131j.b(new Function0(this) { // from class: U3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPayMethodItem f9186b;

            {
                this.f9186b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = this.f9186b;
                switch (i15) {
                    case 0:
                        int i16 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_payment_method_icon);
                    case 1:
                        int i17 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_method_name);
                    case 2:
                        int i18 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_balance);
                    case 3:
                        int i19 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_normal_tips);
                    case 4:
                        int i110 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_activity_tips);
                    case 5:
                        int i111 = FlexiBankCashierPayMethodItem.f22071o;
                        return flexiBankCashierPayMethodItem.findViewById(p.fb_mbci_root);
                    case 6:
                        int i112 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_selected);
                    default:
                        int i113 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_top_up);
                }
            }
        });
        final int i16 = 6;
        this.f22079i = C2131j.b(new Function0(this) { // from class: U3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPayMethodItem f9186b;

            {
                this.f9186b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = this.f9186b;
                switch (i16) {
                    case 0:
                        int i17 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_payment_method_icon);
                    case 1:
                        int i18 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_method_name);
                    case 2:
                        int i19 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_balance);
                    case 3:
                        int i110 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_normal_tips);
                    case 4:
                        int i111 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_activity_tips);
                    case 5:
                        int i112 = FlexiBankCashierPayMethodItem.f22071o;
                        return flexiBankCashierPayMethodItem.findViewById(p.fb_mbci_root);
                    case 6:
                        int i113 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_selected);
                    default:
                        int i114 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_top_up);
                }
            }
        });
        final int i17 = 7;
        this.f22080j = C2131j.b(new Function0(this) { // from class: U3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPayMethodItem f9186b;

            {
                this.f9186b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = this.f9186b;
                switch (i17) {
                    case 0:
                        int i18 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_payment_method_icon);
                    case 1:
                        int i19 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_method_name);
                    case 2:
                        int i110 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_payment_balance);
                    case 3:
                        int i111 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_normal_tips);
                    case 4:
                        int i112 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_item_payment_method_activity_tips);
                    case 5:
                        int i113 = FlexiBankCashierPayMethodItem.f22071o;
                        return flexiBankCashierPayMethodItem.findViewById(p.fb_mbci_root);
                    case 6:
                        int i114 = FlexiBankCashierPayMethodItem.f22071o;
                        return (ImageView) flexiBankCashierPayMethodItem.findViewById(p.fb_iv_cashier_item_selected);
                    default:
                        int i115 = FlexiBankCashierPayMethodItem.f22071o;
                        return (TextView) flexiBankCashierPayMethodItem.findViewById(p.fb_tv_cashier_item_top_up);
                }
            }
        });
        View.inflate(context, q.fb_model_cashier_payment_item, this);
    }
}
