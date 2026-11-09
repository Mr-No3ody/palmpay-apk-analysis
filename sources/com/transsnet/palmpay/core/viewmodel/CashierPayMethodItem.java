package com.transsnet.palmpay.core.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.viewmodel.CashierPayMethodItem;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u0013R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u0013R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010!R\u001d\u0010%\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000eR\u001d\u0010(\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u0013R\u001d\u0010+\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010!¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/CashierPayMethodItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "c", "Lkotlin/Lazy;", "getMPayMethodImg", "()Landroid/widget/ImageView;", "mPayMethodImg", "Landroid/widget/TextView;", "d", "getMPayMethodNameTv", "()Landroid/widget/TextView;", "mPayMethodNameTv", "e", "getMPayMethodNumTv", "mPayMethodNumTv", "f", "getMHintText", "mHintText", "g", "getMActHintText", "mActHintText", "Landroid/view/View;", "i", "getMRoot", "()Landroid/view/View;", "mRoot", "j", "getMRightIv", "mRightIv", "o", "getMActiveTv", "mActiveTv", "p", "getModelPaymentDivider", "modelPaymentDivider", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CashierPayMethodItem extends BaseModel {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28215g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28217j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28219p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CashierPayMethodItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, g.core_model_cashier_payment_item, this);
        return this;
    }

    public final void d(CashierPaymentMethodBean cashierPaymentMethodBean, boolean z3) {
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
            if (!TextUtils.isEmpty(cashierPaymentMethodBean != null ? cashierPaymentMethodBean.tips : null)) {
                g(cashierPaymentMethodBean != null ? cashierPaymentMethodBean.tips : null, false);
            }
            ImageView mPayMethodImg = getMPayMethodImg();
            if (mPayMethodImg != null) {
                mPayMethodImg.setAlpha(0.3f);
            }
            TextView mPayMethodNameTv = getMPayMethodNameTv();
            if (mPayMethodNameTv != null) {
                mPayMethodNameTv.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, getContext()));
            }
            TextView mPayMethodNumTv = getMPayMethodNumTv();
            if (mPayMethodNumTv != null) {
                mPayMethodNumTv.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, getContext()));
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(cashierPaymentMethodBean != null ? cashierPaymentMethodBean.acTips : null)) {
            if (!TextUtils.isEmpty(cashierPaymentMethodBean != null ? cashierPaymentMethodBean.tips : null)) {
                g(cashierPaymentMethodBean != null ? cashierPaymentMethodBean.tips : null, true);
            }
        } else {
            e(getMActHintText(), cashierPaymentMethodBean != null ? cashierPaymentMethodBean.acTips : null);
        }
        ImageView mPayMethodImg2 = getMPayMethodImg();
        if (mPayMethodImg2 != null) {
            mPayMethodImg2.setAlpha(1.0f);
        }
        TextView mPayMethodNameTv2 = getMPayMethodNameTv();
        if (mPayMethodNameTv2 != null) {
            mPayMethodNameTv2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext()));
        }
        TextView mPayMethodNumTv2 = getMPayMethodNumTv();
        if (mPayMethodNumTv2 != null) {
            mPayMethodNumTv2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, getContext()));
        }
    }

    public final void e(TextView textView, String str) {
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

    public final void f() {
        View modelPaymentDivider = getModelPaymentDivider();
        if (modelPaymentDivider != null) {
            h.s(modelPaymentDivider, true);
        }
    }

    public final void g(String str, boolean z3) {
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
            mHintText3.setTextColor(z3 ? this.f31417a.getColor(L6.b.ppColorTextPrimary) : this.f31417a.getColor(L6.b.ppColorTextNormal));
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
        return (TextView) this.f28215g.getValue();
    }

    @Nullable
    public final TextView getMActiveTv() {
        return (TextView) this.f28218o.getValue();
    }

    @Nullable
    public final TextView getMHintText() {
        return (TextView) this.f28214f.getValue();
    }

    @Nullable
    public final ImageView getMPayMethodImg() {
        return (ImageView) this.f28211c.getValue();
    }

    @Nullable
    public final TextView getMPayMethodNameTv() {
        return (TextView) this.f28212d.getValue();
    }

    @Nullable
    public final TextView getMPayMethodNumTv() {
        return (TextView) this.f28213e.getValue();
    }

    @Nullable
    public final ImageView getMRightIv() {
        return (ImageView) this.f28217j.getValue();
    }

    @Nullable
    public final View getMRoot() {
        return (View) this.f28216i.getValue();
    }

    @Nullable
    public final View getModelPaymentDivider() {
        return (View) this.f28219p.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CashierPayMethodItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CashierPayMethodItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CashierPayMethodItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28211c = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i10) {
                    case 0:
                        int i11 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i12 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i13 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i14 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i15 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i16 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i17 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i18 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i19 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
        final int i11 = 1;
        this.f28212d = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i11) {
                    case 0:
                        int i12 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i13 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i14 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i15 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i16 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i17 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i18 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i19 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i110 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
        final int i12 = 2;
        this.f28213e = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i12) {
                    case 0:
                        int i13 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i14 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i15 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i16 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i17 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i18 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i19 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i110 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i111 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
        final int i13 = 3;
        this.f28214f = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i13) {
                    case 0:
                        int i14 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i15 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i16 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i17 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i18 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i19 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i110 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i111 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i112 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
        final int i14 = 4;
        this.f28215g = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i14) {
                    case 0:
                        int i15 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i16 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i17 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i18 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i19 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i110 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i111 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i112 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i113 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
        final int i15 = 5;
        this.f28216i = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i15) {
                    case 0:
                        int i16 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i17 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i18 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i19 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i110 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i111 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i112 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i113 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i114 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
        final int i16 = 6;
        this.f28217j = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i16) {
                    case 0:
                        int i17 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i18 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i19 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i110 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i111 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i112 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i113 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i114 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i115 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
        final int i17 = 7;
        this.f28218o = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i17) {
                    case 0:
                        int i18 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i19 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i110 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i111 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i112 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i113 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i114 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i115 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i116 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
        final int i18 = 8;
        this.f28219p = C2131j.b(new Function0(this) { // from class: Ua.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPayMethodItem f9407b;

            {
                this.f9407b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashierPayMethodItem cashierPayMethodItem = this.f9407b;
                switch (i18) {
                    case 0:
                        int i19 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_payment_method_icon);
                    case 1:
                        int i110 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_method_name);
                    case 2:
                        int i111 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_payment_balance);
                    case 3:
                        int i112 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_normal_tips);
                    case 4:
                        int i113 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_item_payment_method_activity_tips);
                    case 5:
                        int i114 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.mbci_root);
                    case 6:
                        int i115 = CashierPayMethodItem.t;
                        return (ImageView) cashierPayMethodItem.findViewById(p025ba.e.iv_cashier_item_selected);
                    case 7:
                        int i116 = CashierPayMethodItem.t;
                        return (TextView) cashierPayMethodItem.findViewById(p025ba.e.tv_cashier_item_top_up);
                    default:
                        int i117 = CashierPayMethodItem.t;
                        return cashierPayMethodItem.findViewById(p025ba.e.modelPaymentDivider);
                }
            }
        });
    }
}
