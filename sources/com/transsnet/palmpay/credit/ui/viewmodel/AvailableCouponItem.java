package com.transsnet.palmpay.credit.ui.viewmodel;

import C0.G;
import Ce.ViewOnClickListenerC0159a;
import Db.C0185b;
import Fe.e0;
import Pa.H;
import Pa.r0;
import Ya.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.rsp.QueryUserCouponsRsp;
import com.transsnet.palmpay.credit.bean.req.GetAvailableCouponListReq;
import com.transsnet.palmpay.credit.bean.req.GetPriorityCouponReq;
import com.transsnet.palmpay.credit.ui.viewmodel.AvailableCouponItem;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import df.d;
import io.reactivex.internal.operators.observable.C1752d;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p071ef.b;
import p221ob.c;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/viewmodel/AvailableCouponItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getPriorityCoupon", "()V", "getAvailableCouponList", "Lgf/a;", "c", "Lkotlin/Lazy;", "getMDisposable", "()Lgf/a;", "mDisposable", "Landroid/widget/TextView;", "d", "getTvCouponName", "()Landroid/widget/TextView;", "tvCouponName", "e", "getTvCouponAmount", "tvCouponAmount", "Landroid/widget/ImageView;", "f", "getIvArrowRight", "()Landroid/widget/ImageView;", "ivArrowRight", "Lcom/transsnet/palmpay/credit/ui/viewmodel/AvailableCouponItem$OnVisibleCallBack;", "j", "Lcom/transsnet/palmpay/credit/ui/viewmodel/AvailableCouponItem$OnVisibleCallBack;", "getOnVisibleCallBack", "()Lcom/transsnet/palmpay/credit/ui/viewmodel/AvailableCouponItem$OnVisibleCallBack;", "setOnVisibleCallBack", "(Lcom/transsnet/palmpay/credit/ui/viewmodel/AvailableCouponItem$OnVisibleCallBack;)V", "onVisibleCallBack", "OnVisibleCallBack", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailableCouponItem extends BaseModel {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f30663p = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f30664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f30665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f30666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f30667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f30668g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public OnVisibleCallBack onVisibleCallBack;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f30671o;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/viewmodel/AvailableCouponItem$OnVisibleCallBack;", "", ViewProps.VISIBLE, "", "show", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnVisibleCallBack {
        void visible(boolean show);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AvailableCouponItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void f(AvailableCouponItem availableCouponItem, CouponItem couponItem) {
        G.x("-", r0.B(couponItem.consumeAmt, true), availableCouponItem.getTvCouponAmount());
    }

    private final void getAvailableCouponList() {
        GetAvailableCouponListReq getAvailableCouponListReq = new GetAvailableCouponListReq(1, new GetAvailableCouponListReq.OrderDto(this.f30668g), 0, 4, null);
        String strB = H.b(getAvailableCouponListReq);
        c.f40268a.getInstance().getClass();
        C1752d c1752dD = d.d(r0.H1(QueryUserCouponsRsp.class, strB), c.a().queryUserCouponList(getAvailableCouponListReq).c(new e0(strB)));
        Intrinsics.checkNotNullExpressionValue(c1752dD, "concat(...)");
        c1752dD.k(f.f42629b).i(b.a()).subscribe(new C0185b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getIvArrowRight() {
        Object value = this.f30667f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p103gf.a getMDisposable() {
        return (p103gf.a) this.f30664c.getValue();
    }

    private final void getPriorityCoupon() {
        G.h(c.f40268a).getPriorityCoupon(new GetPriorityCouponReq(this.f30668g, null, 2, null)).k(f.f42629b).i(b.a()).subscribe(new a(this));
    }

    private final TextView getTvCouponAmount() {
        Object value = this.f30666e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvCouponName() {
        Object value = this.f30665d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.AvailableCouponView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(h.AvailableCouponView_transTypes);
        this.f30669i = typedArrayObtainStyledAttributes.getInt(h.AvailableCouponView_viewStyle, 0);
        if (!TextUtils.isEmpty(string)) {
            this.f30668g = TextUtils.split(string, Pattern.compile(","));
        }
        typedArrayObtainStyledAttributes.recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        F6.d.h(G.m(this.f30669i, "mViewStyle = "), 3, new Object[0]);
        View viewInflate = LayoutInflater.from(context).inflate(this.f30669i == 0 ? Ya.f.cs_layout_available_coupon : Ya.f.cs_layout_available_coupon_white_style, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Nullable
    public final OnVisibleCallBack getOnVisibleCallBack() {
        return this.onVisibleCallBack;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMDisposable().dispose();
    }

    public final void setOnVisibleCallBack(@Nullable OnVisibleCallBack onVisibleCallBack) {
        this.onVisibleCallBack = onVisibleCallBack;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AvailableCouponItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AvailableCouponItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AvailableCouponItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30664c = C2131j.b(new Aa.a(21));
        final int i10 = 0;
        this.f30665d = C2131j.b(new Function0(this) { // from class: Db.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvailableCouponItem f1798b;

            {
                this.f1798b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AvailableCouponItem availableCouponItem = this.f1798b;
                switch (i10) {
                    case 0:
                        int i11 = AvailableCouponItem.f30663p;
                        return (TextView) availableCouponItem.findViewById(Ya.e.tvCouponName);
                    case 1:
                        int i12 = AvailableCouponItem.f30663p;
                        return (TextView) availableCouponItem.findViewById(Ya.e.tvCouponAmount);
                    default:
                        int i13 = AvailableCouponItem.f30663p;
                        return (ImageView) availableCouponItem.findViewById(Ya.e.ivArrowRight);
                }
            }
        });
        final int i11 = 1;
        this.f30666e = C2131j.b(new Function0(this) { // from class: Db.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvailableCouponItem f1798b;

            {
                this.f1798b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AvailableCouponItem availableCouponItem = this.f1798b;
                switch (i11) {
                    case 0:
                        int i12 = AvailableCouponItem.f30663p;
                        return (TextView) availableCouponItem.findViewById(Ya.e.tvCouponName);
                    case 1:
                        int i13 = AvailableCouponItem.f30663p;
                        return (TextView) availableCouponItem.findViewById(Ya.e.tvCouponAmount);
                    default:
                        int i14 = AvailableCouponItem.f30663p;
                        return (ImageView) availableCouponItem.findViewById(Ya.e.ivArrowRight);
                }
            }
        });
        final int i12 = 2;
        this.f30667f = C2131j.b(new Function0(this) { // from class: Db.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvailableCouponItem f1798b;

            {
                this.f1798b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AvailableCouponItem availableCouponItem = this.f1798b;
                switch (i12) {
                    case 0:
                        int i13 = AvailableCouponItem.f30663p;
                        return (TextView) availableCouponItem.findViewById(Ya.e.tvCouponName);
                    case 1:
                        int i14 = AvailableCouponItem.f30663p;
                        return (TextView) availableCouponItem.findViewById(Ya.e.tvCouponAmount);
                    default:
                        int i15 = AvailableCouponItem.f30663p;
                        return (ImageView) availableCouponItem.findViewById(Ya.e.ivArrowRight);
                }
            }
        });
        p220oa.h.l(new ViewOnClickListenerC0159a(this, 7), this);
        getPriorityCoupon();
        getAvailableCouponList();
    }
}
