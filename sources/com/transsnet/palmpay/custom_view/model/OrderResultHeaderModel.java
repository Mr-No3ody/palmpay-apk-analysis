package com.transsnet.palmpay.custom_view.model;

import Pa.r0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.load.resource.bitmap.i;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.MustBeDocumented;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002F\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\fJ\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u000fR#\u0010\u001c\u001a\n \u0018*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR#\u0010\u001f\u001a\n \u0018*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\fR#\u0010\"\u001a\n \u0018*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0012R#\u0010%\u001a\n \u0018*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\fR#\u0010(\u001a\n \u0018*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\fR#\u0010+\u001a\n \u0018*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\fR#\u0010.\u001a\n \u0018*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u000fR#\u00101\u001a\n \u0018*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\fR#\u00104\u001a\n \u0018*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u000fR#\u00107\u001a\n \u0018*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\u0012R#\u0010:\u001a\n \u0018*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001a\u001a\u0004\b9\u0010\fR#\u0010=\u001a\n \u0018*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001a\u001a\u0004\b<\u0010\fR#\u0010B\u001a\n \u0018*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001a\u001a\u0004\b@\u0010AR#\u0010E\u001a\n \u0018*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u001a\u001a\u0004\bD\u0010\u000f¨\u0006G"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultHeaderModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "getTvViewDetail", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "getBodyBgIv", "()Landroid/widget/ImageView;", "Landroid/widget/LinearLayout;", "getOrderStatusLayout", "()Landroid/widget/LinearLayout;", "getOrderHeaderIcon", "getOrderTitleTv", "getOrderResultStatusTipsTv", "getOrderStatusTv", "getOrderStatusArrow", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_order_pending_ac_question_btn", "tv_order_pending_ac_question_btn", "b", "getTv_order_pending_ac_question", "tv_order_pending_ac_question", "c", "getLayout_order_pending_ac", "layout_order_pending_ac", "d", "getTv_order_pending_ac_tips", "tv_order_pending_ac_tips", "e", "getTv_order_result_status_tips", "tv_order_result_status_tips", "f", "getMTvViewDetail", "mTvViewDetail", "g", "getIv_order_status_arrow", "iv_order_status_arrow", "i", "getTv_order_status", "tv_order_status", "j", "getIv_order_status_logo", "iv_order_status_logo", "o", "getLayout_order_status", "layout_order_status", "p", "getTv_order_result_amount", "tv_order_result_amount", "t", "getTv_order_result_title", "tv_order_result_title", "Landroidx/appcompat/widget/AppCompatImageView;", "v", "getIv_order_result_logo", "()Landroidx/appcompat/widget/AppCompatImageView;", "iv_order_result_logo", "w", "getIv_bg_root", "iv_bg_root", "HeaderStyle", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderResultHeaderModel extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f31610A = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31617g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f31619j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f31620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f31621p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f31622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f31623w;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultHeaderModel$HeaderStyle;", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Documented
    public @interface HeaderStyle {
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Drawable bookSuccessIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 16.0f;
            }
            return aVar.bookSuccessIcon(context, f10);
        }

        public static /* synthetic */ Drawable closeIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 16.0f;
            }
            return aVar.closeIcon(context, f10);
        }

        public static /* synthetic */ Drawable failIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 16.0f;
            }
            return aVar.failIcon(context, f10);
        }

        public static /* synthetic */ Drawable getOrderStatusIconByDes$default(a aVar, Context context, String str, float f10, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                f10 = 16.0f;
            }
            return aVar.getOrderStatusIconByDes(context, str, f10);
        }

        public static /* synthetic */ Drawable processingIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 16.0f;
            }
            return aVar.processingIcon(context, f10);
        }

        public static /* synthetic */ Drawable refundIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 16.0f;
            }
            return aVar.refundIcon(context, f10);
        }

        public static /* synthetic */ Drawable successIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 16.0f;
            }
            return aVar.successIcon(context, f10);
        }

        @JvmStatic
        @NotNull
        public final Drawable bookSuccessIcon(@NotNull Context context, float f10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            return d.b(context, S6.a.pay_Schedule, L6.b.ppColorSuccess, f10);
        }

        @JvmStatic
        @NotNull
        public final Drawable closeIcon(@NotNull Context context, float f10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return d.g(context, f10);
        }

        @JvmStatic
        @NotNull
        public final Drawable failIcon(@NotNull Context context, float f10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return d.o(context, f10);
        }

        @JvmStatic
        @NotNull
        public final Drawable getOrderStatusIconByDes(@NotNull Context context, @Nullable String str, float f10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return d.u(context, str, f10);
        }

        @JvmStatic
        @NotNull
        public final Drawable processingIcon(@NotNull Context context, float f10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return d.K(context, f10);
        }

        @JvmStatic
        @NotNull
        public final Drawable refundIcon(@NotNull Context context, float f10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return d.M(context, f10);
        }

        @JvmStatic
        @NotNull
        public final Drawable successIcon(@NotNull Context context, float f10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return d.S(context, f10);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultHeaderModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_bg_root() {
        return (ImageView) this.f31623w.getValue();
    }

    private final AppCompatImageView getIv_order_result_logo() {
        return (AppCompatImageView) this.f31622v.getValue();
    }

    private final ImageView getIv_order_status_arrow() {
        return (ImageView) this.f31617g.getValue();
    }

    private final ImageView getIv_order_status_logo() {
        return (ImageView) this.f31619j.getValue();
    }

    private final LinearLayout getLayout_order_pending_ac() {
        return (LinearLayout) this.f31613c.getValue();
    }

    private final LinearLayout getLayout_order_status() {
        return (LinearLayout) this.f31620o.getValue();
    }

    private final TextView getMTvViewDetail() {
        return (TextView) this.f31616f.getValue();
    }

    private final TextView getTv_order_pending_ac_question() {
        return (TextView) this.f31612b.getValue();
    }

    private final TextView getTv_order_pending_ac_question_btn() {
        return (TextView) this.f31611a.getValue();
    }

    private final TextView getTv_order_pending_ac_tips() {
        return (TextView) this.f31614d.getValue();
    }

    private final TextView getTv_order_result_amount() {
        return (TextView) this.f31621p.getValue();
    }

    private final TextView getTv_order_result_status_tips() {
        return (TextView) this.f31615e.getValue();
    }

    private final TextView getTv_order_result_title() {
        return (TextView) this.t.getValue();
    }

    private final TextView getTv_order_status() {
        return (TextView) this.f31618i.getValue();
    }

    public final void c(String str) {
        TextView tv_order_result_amount = getTv_order_result_amount();
        if (str == null) {
            str = "";
        }
        tv_order_result_amount.setText(str);
    }

    public final void d(int i7) {
        getIv_order_result_logo().setImageResource(i7);
    }

    public final void e(Uri uri) {
        if (uri != null) {
            com.bumptech.glide.b.e(getContext()).load(uri).S(getIv_order_result_logo());
        }
    }

    public final void f(String str) {
        if (str != null) {
            com.bumptech.glide.b.e(getContext()).load(str).S(getIv_order_result_logo());
        }
    }

    public final void g(String str, G1.d options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (str != null) {
            try {
                com.bumptech.glide.b.e(getContext()).load(str).a(options).S(getIv_order_result_logo());
            } catch (Exception unused) {
                Unit unit = Unit.f38893a;
            }
        }
    }

    @NotNull
    public final ImageView getBodyBgIv() {
        ImageView iv_bg_root = getIv_bg_root();
        Intrinsics.checkNotNullExpressionValue(iv_bg_root, "<get-iv_bg_root>(...)");
        return iv_bg_root;
    }

    @NotNull
    public final ImageView getOrderHeaderIcon() {
        AppCompatImageView iv_order_result_logo = getIv_order_result_logo();
        Intrinsics.checkNotNullExpressionValue(iv_order_result_logo, "<get-iv_order_result_logo>(...)");
        return iv_order_result_logo;
    }

    @NotNull
    public final TextView getOrderResultStatusTipsTv() {
        TextView tv_order_result_status_tips = getTv_order_result_status_tips();
        Intrinsics.checkNotNullExpressionValue(tv_order_result_status_tips, "<get-tv_order_result_status_tips>(...)");
        return tv_order_result_status_tips;
    }

    @NotNull
    public final ImageView getOrderStatusArrow() {
        ImageView iv_order_status_arrow = getIv_order_status_arrow();
        Intrinsics.checkNotNullExpressionValue(iv_order_status_arrow, "<get-iv_order_status_arrow>(...)");
        return iv_order_status_arrow;
    }

    @NotNull
    public final LinearLayout getOrderStatusLayout() {
        LinearLayout layout_order_status = getLayout_order_status();
        Intrinsics.checkNotNullExpressionValue(layout_order_status, "<get-layout_order_status>(...)");
        return layout_order_status;
    }

    @NotNull
    public final TextView getOrderStatusTv() {
        TextView tv_order_status = getTv_order_status();
        Intrinsics.checkNotNullExpressionValue(tv_order_status, "<get-tv_order_status>(...)");
        return tv_order_status;
    }

    @NotNull
    public final TextView getOrderTitleTv() {
        TextView tv_order_result_title = getTv_order_result_title();
        Intrinsics.checkNotNullExpressionValue(tv_order_result_title, "<get-tv_order_result_title>(...)");
        return tv_order_result_title;
    }

    @Nullable
    public final TextView getTvViewDetail() {
        return getMTvViewDetail();
    }

    public final void h(String str) {
        if (str != null) {
            com.bumptech.glide.b.e(getContext()).load(str).a(new G1.d().I(new i(), true)).S(getIv_order_result_logo());
        }
    }

    public final void i() {
        getLayout_order_pending_ac().setVisibility(0);
    }

    public final void j(String str) {
        TextView tv_order_pending_ac_question = getTv_order_pending_ac_question();
        if (str == null) {
            str = "";
        }
        tv_order_pending_ac_question.setText(str);
    }

    public final void k(String str) {
        TextView tv_order_status = getTv_order_status();
        if (str == null) {
            str = "";
        }
        tv_order_status.setText(str);
    }

    public final void l(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        getIv_order_status_logo().setImageDrawable(drawable);
    }

    public final void m(CharSequence charSequence) {
        TextView tv_order_result_status_tips = getTv_order_result_status_tips();
        if (charSequence == null) {
            charSequence = "";
        }
        tv_order_result_status_tips.setText(charSequence);
        getTv_order_result_status_tips().setVisibility(0);
    }

    public final void n(int i7) {
        getTv_order_result_title().setText(getContext().getResources().getText(i7));
    }

    public final void o(String str) {
        TextView tv_order_result_title = getTv_order_result_title();
        if (str == null) {
            str = "";
        }
        tv_order_result_title.setText(str);
    }

    public final void p(View.OnClickListener onClickListener) {
        getTv_order_pending_ac_question_btn().setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultHeaderModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OrderResultHeaderModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultHeaderModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31611a = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i10) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i11 = 9;
        this.f31612b = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i11) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i12 = 10;
        this.f31613c = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i12) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i13 = 11;
        this.f31614d = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i13) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i14 = 12;
        this.f31615e = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i14) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i15 = 13;
        this.f31616f = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i15) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i16 = 1;
        this.f31617g = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i16) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i17 = 2;
        this.f31618i = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i17) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i18 = 3;
        this.f31619j = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i18) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i19 = 4;
        this.f31620o = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i19) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i20 = 5;
        this.f31621p = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i20) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i21 = 6;
        this.t = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i21) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i22 = 7;
        this.f31622v = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i22) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        final int i23 = 8;
        this.f31623w = C2131j.b(new Function0(this) { // from class: Vb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultHeaderModel f10308b;

            {
                this.f10308b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultHeaderModel orderResultHeaderModel = this.f10308b;
                switch (i23) {
                    case 0:
                        OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question_btn);
                    case 1:
                        OrderResultHeaderModel.a aVar2 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_arrow);
                    case 2:
                        OrderResultHeaderModel.a aVar3 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_status);
                    case 3:
                        OrderResultHeaderModel.a aVar4 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_status_logo);
                    case 4:
                        OrderResultHeaderModel.a aVar5 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_status);
                    case 5:
                        OrderResultHeaderModel.a aVar6 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_amount);
                    case 6:
                        OrderResultHeaderModel.a aVar7 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_title);
                    case 7:
                        OrderResultHeaderModel.a aVar8 = OrderResultHeaderModel.f31610A;
                        return (AppCompatImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_order_result_logo);
                    case 8:
                        OrderResultHeaderModel.a aVar9 = OrderResultHeaderModel.f31610A;
                        return (ImageView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                    case 9:
                        OrderResultHeaderModel.a aVar10 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_question);
                    case 10:
                        OrderResultHeaderModel.a aVar11 = OrderResultHeaderModel.f31610A;
                        return (LinearLayout) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.layout_order_pending_ac);
                    case 11:
                        OrderResultHeaderModel.a aVar12 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_pending_ac_tips);
                    case 12:
                        OrderResultHeaderModel.a aVar13 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_order_result_status_tips);
                    default:
                        OrderResultHeaderModel.a aVar14 = OrderResultHeaderModel.f31610A;
                        return (TextView) orderResultHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tvViewDetail);
                }
            }
        });
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_order_result_header, this);
        r0.R1(getTv_order_result_amount(), "fonts/PalmPayNum-Bold.ttf");
    }
}
