package com.transsnet.palmpay.custom_view.model;

import Ff.h;
import L6.b;
import Vb.u;
import Vb.x;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.apm.launchcounter.util.d;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.f;
import p355xf.C2131j;
import p355xf.o;
import p355xf.q;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fR#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR#\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u000fR#\u0010\u001b\u001a\n \u0011*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u000fR#\u0010\u001e\u001a\n \u0011*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/TransactionResultHeaderModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "getOrderHeaderIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "getOrderResultStatusTipsTv", "()Landroid/widget/TextView;", "getOrderStatusTv", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_order_result_status_tips", "tv_order_result_status_tips", "b", "getTv_order_result_amount", "tv_order_result_amount", "c", "getTv_order_status", "tv_order_status", "d", "getIv_transfer_result", "iv_transfer_result", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionResultHeaderModel extends ConstraintLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f31650j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f31656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function1 f31657g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f31658i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Drawable bookSuccessIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 40.0f;
            }
            return aVar.bookSuccessIcon(context, f10);
        }

        public static /* synthetic */ Drawable closeIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 40.0f;
            }
            return aVar.closeIcon(context, f10);
        }

        public static /* synthetic */ Drawable failIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 40.0f;
            }
            return aVar.failIcon(context, f10);
        }

        public static /* synthetic */ Drawable getOrderStatusIconByDes$default(a aVar, Context context, String str, float f10, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                f10 = 40.0f;
            }
            return aVar.getOrderStatusIconByDes(context, str, f10);
        }

        public static /* synthetic */ Drawable processingIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 40.0f;
            }
            return aVar.processingIcon(context, f10);
        }

        public static /* synthetic */ Drawable refundIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 40.0f;
            }
            return aVar.refundIcon(context, f10);
        }

        public static /* synthetic */ Drawable successIcon$default(a aVar, Context context, float f10, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                f10 = 40.0f;
            }
            return aVar.successIcon(context, f10);
        }

        @JvmStatic
        @NotNull
        public final Drawable bookSuccessIcon(@NotNull Context context, float f10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            return d.b(context, S6.a.pay_Schedule, b.ppColorSuccess, f10);
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
    public TransactionResultHeaderModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_transfer_result() {
        return (ImageView) this.f31654d.getValue();
    }

    private final TextView getTv_order_result_amount() {
        return (TextView) this.f31652b.getValue();
    }

    private final TextView getTv_order_result_status_tips() {
        return (TextView) this.f31651a.getValue();
    }

    private final TextView getTv_order_status() {
        return (TextView) this.f31653c.getValue();
    }

    public final void c(String str) {
        TextView tv_order_result_amount = getTv_order_result_amount();
        if (str == null) {
            str = "";
        }
        tv_order_result_amount.setText(str);
    }

    public final void d(int i7) {
        getTv_order_status().setText(getContext().getResources().getText(i7));
    }

    public final void e(String str) {
        TextView tv_order_status = getTv_order_status();
        if (str == null) {
            str = "";
        }
        tv_order_status.setText(str);
    }

    public final void f(int i7) {
        getIv_transfer_result().setImageResource(i7);
    }

    public final void g(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        getIv_transfer_result().setImageDrawable(drawable);
    }

    @NotNull
    public final ImageView getOrderHeaderIcon() {
        ImageView iv_transfer_result = getIv_transfer_result();
        Intrinsics.checkNotNullExpressionValue(iv_transfer_result, "<get-iv_transfer_result>(...)");
        return iv_transfer_result;
    }

    @NotNull
    public final TextView getOrderResultStatusTipsTv() {
        TextView tv_order_result_status_tips = getTv_order_result_status_tips();
        Intrinsics.checkNotNullExpressionValue(tv_order_result_status_tips, "<get-tv_order_result_status_tips>(...)");
        return tv_order_result_status_tips;
    }

    @NotNull
    public final TextView getOrderStatusTv() {
        TextView tv_order_status = getTv_order_status();
        Intrinsics.checkNotNullExpressionValue(tv_order_status, "<get-tv_order_status>(...)");
        return tv_order_status;
    }

    public final void h(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            getTv_order_result_status_tips().setVisibility(8);
            return;
        }
        TextView tv_order_result_status_tips = getTv_order_result_status_tips();
        if (charSequence == null) {
            charSequence = "";
        }
        tv_order_result_status_tips.setText(charSequence);
        getTv_order_result_status_tips().setVisibility(0);
    }

    public final void i(long j6, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f31655e = false;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        g(a.processingIcon$default(f31650j, context, 0.0f, 2, null));
        if (j6 <= 0 || this.f31658i != null) {
            return;
        }
        try {
            o oVar = q.f43977a;
            f fVar = I.f10809a;
            this.f31658i = AbstractC0780y.m(scope, p015ag.o.f11960a, null, new x(j6, this, null), 2);
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            g.f(th);
        }
    }

    public final void j() {
        this.f31655e = true;
        t0 t0Var = this.f31658i;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionResultHeaderModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransactionResultHeaderModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionResultHeaderModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31651a = C2131j.b(new u(this, 0));
        this.f31652b = C2131j.b(new u(this, 1));
        this.f31653c = C2131j.b(new u(this, 2));
        this.f31654d = C2131j.b(new u(this, 3));
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_transfer_result_header, this);
    }
}
