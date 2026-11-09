package com.flexibank.sdk.cashier.ui.view;

import R8.d;
import S3.c;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.util.ScreenUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p371yf.b;
import x4.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001:\u0003%&\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR/\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u0006'"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentPromotionItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentPromotionItem$OnPromotionItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setPromotionListener", "(Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentPromotionItem$OnPromotionItemListener;)V", "", "a", "I", "getMStyle", "()I", "setMStyle", "(I)V", "mStyle", "Lx4/k;", "b", "Lx4/k;", "getBinding", "()Lx4/k;", "setBinding", "(Lx4/k;)V", "binding", "", "c", "Ljava/lang/CharSequence;", "getMDefaultPromotionValue", "()Ljava/lang/CharSequence;", "setMDefaultPromotionValue", "(Ljava/lang/CharSequence;)V", "mDefaultPromotionValue", "<set-?>", "d", "Lkotlin/properties/ReadWriteProperty;", "getMPromotionKey", "setMPromotionKey", "mPromotionKey", "OnPromotionItemListener", "PromotionItemStyle", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankModelPaymentPromotionItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankModelPaymentPromotionItem.kt\ncom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentPromotionItem\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,232:1\n33#2,3:233\n*S KotlinDebug\n*F\n+ 1 FlexiBankModelPaymentPromotionItem.kt\ncom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentPromotionItem\n*L\n37#1:233,3\n*E\n"})
public abstract class FlexiBankModelPaymentPromotionItem extends ConstraintLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f22053e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int mStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public k binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public CharSequence mDefaultPromotionValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f22057d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentPromotionItem$OnPromotionItemListener;", "", "onPromotionItemClick", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnPromotionItemListener {
        void onPromotionItemClick();
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentPromotionItem$PromotionItemStyle;", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        r rVar = new r("mPromotionKey", "getMPromotionKey()Ljava/lang/CharSequence;", FlexiBankModelPaymentPromotionItem.class);
        G.f38952a.getClass();
        f22053e = new KProperty[]{rVar};
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankModelPaymentPromotionItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mStyle = i10;
        this.mDefaultPromotionValue = "";
        this.f22057d = new c(this, 0);
        View viewInflate = View.inflate(getContext(), q.fb_layout_payment_promotion_item, this);
        int i11 = p.fb_barrier_right;
        if (((Barrier) p059e1.a.m(i11, viewInflate)) != null) {
            i11 = p.fb_group_promotion_calc;
            if (((Group) p059e1.a.m(i11, viewInflate)) != null) {
                i11 = p.fb_iv_promotion_calc_arrow;
                if (((ImageView) p059e1.a.m(i11, viewInflate)) != null) {
                    i11 = p.fb_iv_promotion_icon;
                    ImageView imageView = (ImageView) p059e1.a.m(i11, viewInflate);
                    if (imageView != null) {
                        i11 = p.fb_tv_promotion_calc_amount;
                        TextView textView = (TextView) p059e1.a.m(i11, viewInflate);
                        if (textView != null) {
                            i11 = p.fb_tv_promotion_calc_value;
                            TextView textView2 = (TextView) p059e1.a.m(i11, viewInflate);
                            if (textView2 != null) {
                                i11 = p.fb_tv_promotion_key;
                                TextView textView3 = (TextView) p059e1.a.m(i11, viewInflate);
                                if (textView3 != null) {
                                    i11 = p.fb_tv_promotion_value;
                                    TextView textView4 = (TextView) p059e1.a.m(i11, viewInflate);
                                    if (textView4 != null) {
                                        this.binding = new k(viewInflate, imageView, textView, textView2, textView3, textView4);
                                        setPadding(ScreenUtils.dip2px(12.0f), ScreenUtils.dip2px(0.0f), ScreenUtils.dip2px(12.0f), ScreenUtils.dip2px(0.0f));
                                        setMinHeight(ScreenUtils.dip2px(32.0f));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            k kVar = this.binding;
            if (kVar != null) {
                kVar.f43627c.setVisibility(8);
            }
            k kVar2 = this.binding;
            if (kVar2 != null) {
                kVar2.f43630f.setVisibility(0);
            }
            k kVar3 = this.binding;
            if (kVar3 != null) {
                kVar3.f43630f.setText(this.mDefaultPromotionValue);
                return;
            }
            return;
        }
        k kVar4 = this.binding;
        if (kVar4 != null) {
            kVar4.f43630f.setVisibility(8);
        }
        k kVar5 = this.binding;
        if (kVar5 != null) {
            kVar5.f43627c.setVisibility(0);
        }
        k kVar6 = this.binding;
        if (kVar6 != null) {
            kVar6.f43627c.setText(str);
        }
    }

    public final void d(Boolean bool) {
        ImageView imageView;
        ImageView imageView2;
        if (Intrinsics.c(bool, Boolean.TRUE)) {
            k kVar = this.binding;
            if (kVar == null || (imageView2 = kVar.f43626b) == null) {
                return;
            }
            imageView2.setImageResource(o.fb_switch_open_green);
            return;
        }
        k kVar2 = this.binding;
        if (kVar2 == null || (imageView = kVar2.f43626b) == null) {
            return;
        }
        imageView.setImageResource(o.fb_switch_close_gray);
    }

    public final void e(String str) {
        if (str == null) {
            str = "";
        }
        this.mDefaultPromotionValue = str;
        k kVar = this.binding;
        if (kVar != null) {
            kVar.f43630f.setText(str);
        }
    }

    @Nullable
    public final k getBinding() {
        return this.binding;
    }

    @NotNull
    public final CharSequence getMDefaultPromotionValue() {
        return this.mDefaultPromotionValue;
    }

    @Nullable
    public final CharSequence getMPromotionKey() {
        return (CharSequence) this.f22057d.getValue(this, f22053e[0]);
    }

    public final int getMStyle() {
        return this.mStyle;
    }

    public final void setBinding(@Nullable k kVar) {
        this.binding = kVar;
    }

    public final void setMDefaultPromotionValue(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.mDefaultPromotionValue = charSequence;
    }

    public final void setMPromotionKey(@Nullable CharSequence charSequence) {
        this.f22057d.setValue(this, f22053e[0], charSequence);
    }

    public final void setMStyle(int i7) {
        this.mStyle = i7;
    }

    public final void setPromotionListener(@NotNull OnPromotionItemListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d dVar = new d(listener, 4);
        k kVar = this.binding;
        if (kVar != null) {
            kVar.f43630f.setOnClickListener(dVar);
        }
        k kVar2 = this.binding;
        if (kVar2 != null) {
            kVar2.f43627c.setOnClickListener(dVar);
        }
        k kVar3 = this.binding;
        if (kVar3 != null) {
            kVar3.f43626b.setOnClickListener(dVar);
        }
    }
}
