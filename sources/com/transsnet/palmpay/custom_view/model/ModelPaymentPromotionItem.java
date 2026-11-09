package com.transsnet.palmpay.custom_view.model;

import S3.c;
import Uc.I0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionItem;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ScreenUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001:\u000378\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR#\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u001a\u001a\n \u0010*\u0004\u0018\u00010\u00160\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\n \u0010*\u0004\u0018\u00010\u001b0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR#\u0010\"\u001a\n \u0010*\u0004\u0018\u00010\u00160\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0019R#\u0010%\u001a\n \u0010*\u0004\u0018\u00010\u00160\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0019R#\u0010(\u001a\n \u0010*\u0004\u0018\u00010\u00160\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0019R\"\u00100\u001a\u00020)8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R/\u00106\u001a\u0004\u0018\u00010)2\b\u00101\u001a\u0004\u0018\u00010)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/¨\u00069"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelPaymentPromotionItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/transsnet/palmpay/custom_view/model/ModelPaymentPromotionItem$OnPromotionItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setPromotionListener", "(Lcom/transsnet/palmpay/custom_view/model/ModelPaymentPromotionItem$OnPromotionItemListener;)V", "", "a", "I", "getMStyle", "()I", "setMStyle", "(I)V", "mStyle", "Lcom/mikepenz/iconics/view/IconicsImageView;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "getIv_promotion_icon", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_promotion_icon", "Landroid/widget/TextView;", "c", "getTv_promotion_calc_amount", "()Landroid/widget/TextView;", "tv_promotion_calc_amount", "Landroid/view/View;", "d", "getGroup_promotion_calc", "()Landroid/view/View;", "group_promotion_calc", "e", "getTv_promotion_calc_value", "tv_promotion_calc_value", "f", "getTv_promotion_value", "tv_promotion_value", "g", "getTv_promotion_key", "tv_promotion_key", "", "i", "Ljava/lang/CharSequence;", "getMDefaultPromotionValue", "()Ljava/lang/CharSequence;", "setMDefaultPromotionValue", "(Ljava/lang/CharSequence;)V", "mDefaultPromotionValue", "<set-?>", "j", "Lkotlin/properties/ReadWriteProperty;", "getMPromotionKey", "setMPromotionKey", "mPromotionKey", "OnPromotionItemListener", "PromotionItemStyle", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelPaymentPromotionItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelPaymentPromotionItem.kt\ncom/transsnet/palmpay/custom_view/model/ModelPaymentPromotionItem\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,239:1\n33#2,3:240\n*S KotlinDebug\n*F\n+ 1 ModelPaymentPromotionItem.kt\ncom/transsnet/palmpay/custom_view/model/ModelPaymentPromotionItem\n*L\n45#1:240,3\n*E\n"})
public abstract class ModelPaymentPromotionItem extends ConstraintLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f31544o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int mStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31551g;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public CharSequence mDefaultPromotionValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f31553j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelPaymentPromotionItem$OnPromotionItemListener;", "", "onPromotionItemClick", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnPromotionItemListener {
        void onPromotionItemClick();
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelPaymentPromotionItem$PromotionItemStyle;", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Documented
    public @interface PromotionItemStyle {
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        r rVar = new r("mPromotionKey", "getMPromotionKey()Ljava/lang/CharSequence;", ModelPaymentPromotionItem.class);
        G.f38952a.getClass();
        f31544o = new KProperty[]{rVar};
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentPromotionItem(@NotNull Context context) {
        this(context, null, 0, 14, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            TextView tv_promotion_calc_amount = getTv_promotion_calc_amount();
            if (tv_promotion_calc_amount != null) {
                tv_promotion_calc_amount.setVisibility(8);
            }
            TextView tv_promotion_value = getTv_promotion_value();
            if (tv_promotion_value != null) {
                tv_promotion_value.setVisibility(0);
            }
            TextView tv_promotion_value2 = getTv_promotion_value();
            if (tv_promotion_value2 != null) {
                tv_promotion_value2.setText(this.mDefaultPromotionValue);
                return;
            }
            return;
        }
        TextView tv_promotion_value3 = getTv_promotion_value();
        if (tv_promotion_value3 != null) {
            tv_promotion_value3.setVisibility(8);
        }
        TextView tv_promotion_calc_amount2 = getTv_promotion_calc_amount();
        if (tv_promotion_calc_amount2 != null) {
            tv_promotion_calc_amount2.setVisibility(0);
        }
        TextView tv_promotion_calc_amount3 = getTv_promotion_calc_amount();
        if (tv_promotion_calc_amount3 != null) {
            tv_promotion_calc_amount3.setText(str);
        }
    }

    public final void d(Boolean bool) {
        if (Intrinsics.c(bool, Boolean.TRUE)) {
            IconicsImageView iv_promotion_icon = getIv_promotion_icon();
            if (iv_promotion_icon != null) {
                iv_promotion_icon.setImageResource(com.transsnet.palmpay.custom_view.r.cv_switch_open_green);
                return;
            }
            return;
        }
        IconicsImageView iv_promotion_icon2 = getIv_promotion_icon();
        if (iv_promotion_icon2 != null) {
            iv_promotion_icon2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_switch_close_gray);
        }
    }

    public final void e(String str) {
        if (str == null) {
            str = "";
        }
        this.mDefaultPromotionValue = str;
        TextView tv_promotion_value = getTv_promotion_value();
        if (tv_promotion_value != null) {
            tv_promotion_value.setText(this.mDefaultPromotionValue);
        }
    }

    public final View getGroup_promotion_calc() {
        return (View) this.f31548d.getValue();
    }

    public final IconicsImageView getIv_promotion_icon() {
        return (IconicsImageView) this.f31546b.getValue();
    }

    @NotNull
    public final CharSequence getMDefaultPromotionValue() {
        return this.mDefaultPromotionValue;
    }

    @Nullable
    public final CharSequence getMPromotionKey() {
        return (CharSequence) this.f31553j.getValue(this, f31544o[0]);
    }

    public final int getMStyle() {
        return this.mStyle;
    }

    public final TextView getTv_promotion_calc_amount() {
        return (TextView) this.f31547c.getValue();
    }

    public final TextView getTv_promotion_calc_value() {
        return (TextView) this.f31549e.getValue();
    }

    public final TextView getTv_promotion_key() {
        return (TextView) this.f31551g.getValue();
    }

    public final TextView getTv_promotion_value() {
        return (TextView) this.f31550f.getValue();
    }

    public final void setMDefaultPromotionValue(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.mDefaultPromotionValue = charSequence;
    }

    public final void setMPromotionKey(@Nullable CharSequence charSequence) {
        this.f31553j.setValue(this, f31544o[0], charSequence);
    }

    public final void setMStyle(int i7) {
        this.mStyle = i7;
    }

    public final void setPromotionListener(@NotNull OnPromotionItemListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        I0 i0 = new I0(listener, 7);
        TextView tv_promotion_value = getTv_promotion_value();
        if (tv_promotion_value != null) {
            tv_promotion_value.setOnClickListener(i0);
        }
        TextView tv_promotion_calc_amount = getTv_promotion_calc_amount();
        if (tv_promotion_calc_amount != null) {
            tv_promotion_calc_amount.setOnClickListener(i0);
        }
        IconicsImageView iv_promotion_icon = getIv_promotion_icon();
        if (iv_promotion_icon != null) {
            iv_promotion_icon.setOnClickListener(i0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentPromotionItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentPromotionItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 8, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPaymentPromotionItem(Context context, AttributeSet attributeSet, int i7, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7, 102);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelPaymentPromotionItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mStyle = i10;
        final int i11 = 0;
        this.f31546b = C2131j.b(new Function0(this) { // from class: Vb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionItem f10292b;

            {
                this.f10292b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionItem modelPaymentPromotionItem = this.f10292b;
                switch (i11) {
                    case 0:
                        KProperty[] kPropertyArr = ModelPaymentPromotionItem.f31544o;
                        return (IconicsImageView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_promotion_icon);
                    case 1:
                        KProperty[] kPropertyArr2 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_amount);
                    case 2:
                        KProperty[] kPropertyArr3 = ModelPaymentPromotionItem.f31544o;
                        return modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.group_promotion_calc);
                    case 3:
                        KProperty[] kPropertyArr4 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_value);
                    case 4:
                        KProperty[] kPropertyArr5 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_value);
                    default:
                        KProperty[] kPropertyArr6 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_key);
                }
            }
        });
        final int i12 = 1;
        this.f31547c = C2131j.b(new Function0(this) { // from class: Vb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionItem f10292b;

            {
                this.f10292b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionItem modelPaymentPromotionItem = this.f10292b;
                switch (i12) {
                    case 0:
                        KProperty[] kPropertyArr = ModelPaymentPromotionItem.f31544o;
                        return (IconicsImageView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_promotion_icon);
                    case 1:
                        KProperty[] kPropertyArr2 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_amount);
                    case 2:
                        KProperty[] kPropertyArr3 = ModelPaymentPromotionItem.f31544o;
                        return modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.group_promotion_calc);
                    case 3:
                        KProperty[] kPropertyArr4 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_value);
                    case 4:
                        KProperty[] kPropertyArr5 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_value);
                    default:
                        KProperty[] kPropertyArr6 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_key);
                }
            }
        });
        final int i13 = 2;
        this.f31548d = C2131j.b(new Function0(this) { // from class: Vb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionItem f10292b;

            {
                this.f10292b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionItem modelPaymentPromotionItem = this.f10292b;
                switch (i13) {
                    case 0:
                        KProperty[] kPropertyArr = ModelPaymentPromotionItem.f31544o;
                        return (IconicsImageView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_promotion_icon);
                    case 1:
                        KProperty[] kPropertyArr2 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_amount);
                    case 2:
                        KProperty[] kPropertyArr3 = ModelPaymentPromotionItem.f31544o;
                        return modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.group_promotion_calc);
                    case 3:
                        KProperty[] kPropertyArr4 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_value);
                    case 4:
                        KProperty[] kPropertyArr5 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_value);
                    default:
                        KProperty[] kPropertyArr6 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_key);
                }
            }
        });
        final int i14 = 3;
        this.f31549e = C2131j.b(new Function0(this) { // from class: Vb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionItem f10292b;

            {
                this.f10292b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionItem modelPaymentPromotionItem = this.f10292b;
                switch (i14) {
                    case 0:
                        KProperty[] kPropertyArr = ModelPaymentPromotionItem.f31544o;
                        return (IconicsImageView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_promotion_icon);
                    case 1:
                        KProperty[] kPropertyArr2 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_amount);
                    case 2:
                        KProperty[] kPropertyArr3 = ModelPaymentPromotionItem.f31544o;
                        return modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.group_promotion_calc);
                    case 3:
                        KProperty[] kPropertyArr4 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_value);
                    case 4:
                        KProperty[] kPropertyArr5 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_value);
                    default:
                        KProperty[] kPropertyArr6 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_key);
                }
            }
        });
        final int i15 = 4;
        this.f31550f = C2131j.b(new Function0(this) { // from class: Vb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionItem f10292b;

            {
                this.f10292b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionItem modelPaymentPromotionItem = this.f10292b;
                switch (i15) {
                    case 0:
                        KProperty[] kPropertyArr = ModelPaymentPromotionItem.f31544o;
                        return (IconicsImageView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_promotion_icon);
                    case 1:
                        KProperty[] kPropertyArr2 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_amount);
                    case 2:
                        KProperty[] kPropertyArr3 = ModelPaymentPromotionItem.f31544o;
                        return modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.group_promotion_calc);
                    case 3:
                        KProperty[] kPropertyArr4 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_value);
                    case 4:
                        KProperty[] kPropertyArr5 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_value);
                    default:
                        KProperty[] kPropertyArr6 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_key);
                }
            }
        });
        final int i16 = 5;
        this.f31551g = C2131j.b(new Function0(this) { // from class: Vb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionItem f10292b;

            {
                this.f10292b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionItem modelPaymentPromotionItem = this.f10292b;
                switch (i16) {
                    case 0:
                        KProperty[] kPropertyArr = ModelPaymentPromotionItem.f31544o;
                        return (IconicsImageView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.iv_promotion_icon);
                    case 1:
                        KProperty[] kPropertyArr2 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_amount);
                    case 2:
                        KProperty[] kPropertyArr3 = ModelPaymentPromotionItem.f31544o;
                        return modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.group_promotion_calc);
                    case 3:
                        KProperty[] kPropertyArr4 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_calc_value);
                    case 4:
                        KProperty[] kPropertyArr5 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_value);
                    default:
                        KProperty[] kPropertyArr6 = ModelPaymentPromotionItem.f31544o;
                        return (TextView) modelPaymentPromotionItem.findViewById(com.transsnet.palmpay.custom_view.s.tv_promotion_key);
                }
            }
        });
        this.mDefaultPromotionValue = "";
        this.f31553j = new c(this, i16);
        View.inflate(getContext(), com.transsnet.palmpay.custom_view.t.cv_layout_payment_promotion_item, this);
        setPadding(CommonViewExtKt.getDp(12), 0, CommonViewExtKt.getDp(12), 0);
        setMinHeight(ScreenUtils.dip2px(32.0f));
    }
}
