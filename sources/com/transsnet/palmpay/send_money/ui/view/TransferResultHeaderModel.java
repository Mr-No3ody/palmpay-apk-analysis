package com.transsnet.palmpay.send_money.ui.view;

import Gd.i;
import Pa.r0;
import Wf.t0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.apm.launchcounter.util.d;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015R\u001b\u0010\u001d\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0011R\u001b\u0010 \u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0015R\u001b\u0010#\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u0015R\u001b\u0010&\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferResultHeaderModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "url", "", "setTransferResultImage", "(Ljava/lang/String;)V", "Landroid/widget/ImageView;", "getTransferResultImage", "()Landroid/widget/ImageView;", "getOrderHeaderIcon", "Landroid/widget/TextView;", "getOrderResultStatusTipsTv", "()Landroid/widget/TextView;", "getOrderStatusTv", "a", "Lkotlin/Lazy;", "getTv_order_result_status_tips", "tv_order_result_status_tips", "b", "getIv_transfer_result_extend", "iv_transfer_result_extend", "c", "getTv_order_result_amount", "tv_order_result_amount", "d", "getTv_order_status", "tv_order_status", "e", "getIv_transfer_result", "iv_transfer_result", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferResultHeaderModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferResultHeaderModel.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferResultHeaderModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
public final class TransferResultHeaderModel extends ConstraintLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f33879g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f33885f;

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
    public TransferResultHeaderModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_transfer_result() {
        Object value = this.f33884e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getIv_transfer_result_extend() {
        Object value = this.f33881b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getTv_order_result_amount() {
        Object value = this.f33882c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_order_result_status_tips() {
        Object value = this.f33880a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_order_status() {
        Object value = this.f33883d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void c(String str) {
        TextView tv_order_result_amount = getTv_order_result_amount();
        if (str == null) {
            str = "";
        }
        tv_order_result_amount.setText(str);
    }

    public final void d(String str) {
        TextView tv_order_status = getTv_order_status();
        if (str == null) {
            str = "";
        }
        tv_order_status.setText(str);
    }

    public final void e(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        getIv_transfer_result().setImageDrawable(drawable);
    }

    public final void f(CharSequence charSequence) {
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

    @NotNull
    public final ImageView getOrderHeaderIcon() {
        return getIv_transfer_result();
    }

    @NotNull
    public final TextView getOrderResultStatusTipsTv() {
        return getTv_order_result_status_tips();
    }

    @NotNull
    public final TextView getOrderStatusTv() {
        return getTv_order_status();
    }

    @NotNull
    public final ImageView getTransferResultImage() {
        return getIv_transfer_result_extend();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t0 t0Var = this.f33885f;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
    }

    public final void setTransferResultImage(@Nullable String url) {
        if (url != null) {
            if (url.length() <= 0) {
                url = null;
            }
            if (url != null) {
                r0.l1(url, getIv_transfer_result_extend());
                h.C(getIv_transfer_result_extend());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferResultHeaderModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferResultHeaderModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferResultHeaderModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33880a = C2131j.b(new i(this, 0));
        this.f33881b = C2131j.b(new i(this, 1));
        this.f33882c = C2131j.b(new i(this, 2));
        this.f33883d = C2131j.b(new i(this, 3));
        this.f33884e = C2131j.b(new i(this, 4));
        View.inflate(context, f.sm_layout_transfer_result_header, this);
    }
}
