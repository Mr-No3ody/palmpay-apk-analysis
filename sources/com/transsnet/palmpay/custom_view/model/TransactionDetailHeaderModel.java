package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.custom_view.model.TransactionDetailHeaderModel;
import com.transsnet.palmpay.custom_view.r;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0002\"\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010R#\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0010R#\u0010\u001b\u001a\n \u0011*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0010R#\u0010\u001e\u001a\n \u0011*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\fR#\u0010!\u001a\n \u0011*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\f¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/TransactionDetailHeaderModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "getBodyBgIv", "()Landroid/widget/ImageView;", "getTransactionHeaderIcon", "Landroid/widget/TextView;", "getTransactionTitleTv", "()Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_transaction_amount", "tv_transaction_amount", "b", "getTv_transaction_result_tips", "tv_transaction_result_tips", "c", "getTv_transaction_result_title", "tv_transaction_result_title", "d", "getIv_transaction_result_logo", "iv_transaction_result_logo", "e", "getIv_bg_root", "iv_bg_root", "HeaderStyle", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionDetailHeaderModel extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31640f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31641g = r.cv_order_result_success_48;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f31642i = r.cv_order_result_processing;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f31643j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f31644o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31649e;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/TransactionDetailHeaderModel$HeaderStyle;", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Documented
    public @interface HeaderStyle {
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCloseIcon() {
            return TransactionDetailHeaderModel.f31644o;
        }

        public final int getFailIcon() {
            return TransactionDetailHeaderModel.f31643j;
        }

        public final int getProcessingIcon() {
            return TransactionDetailHeaderModel.f31642i;
        }

        public final int getSuccessIcon() {
            return TransactionDetailHeaderModel.f31641g;
        }

        public final int getTransactionStatusIconByDes(@Nullable String str) {
            if (str == null) {
                return getSuccessIcon();
            }
            if (StringsKt.A(str, "success", true) || StringsKt.A(str, "complete", true)) {
                return TransactionDetailHeaderModel.f31640f.getSuccessIcon();
            }
            if (StringsKt.A(str, "processing", true) || StringsKt.A(str, "pending", true) || StringsKt.A(str, "waiting", true)) {
                return TransactionDetailHeaderModel.f31640f.getProcessingIcon();
            }
            if (StringsKt.A(str, TransferByLoanResult.STATUS_FAILED, true) || StringsKt.A(str, "expired", true) || StringsKt.A(str, "error", true) || StringsKt.A(str, TransferByLoanResult.STATUS_CANCELLED, true) || StringsKt.A(str, "declined", true)) {
                return TransactionDetailHeaderModel.f31640f.getFailIcon();
            }
            return StringsKt.A(str, "close", true) ? TransactionDetailHeaderModel.f31640f.getCloseIcon() : TransactionDetailHeaderModel.f31640f.getSuccessIcon();
        }

        private a() {
        }
    }

    static {
        int i7 = r.cv_order_result_fail_48;
        f31643j = i7;
        f31644o = i7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionDetailHeaderModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_bg_root() {
        return (ImageView) this.f31649e.getValue();
    }

    private final ImageView getIv_transaction_result_logo() {
        return (ImageView) this.f31648d.getValue();
    }

    private final TextView getTv_transaction_amount() {
        return (TextView) this.f31645a.getValue();
    }

    private final TextView getTv_transaction_result_tips() {
        return (TextView) this.f31646b.getValue();
    }

    private final TextView getTv_transaction_result_title() {
        return (TextView) this.f31647c.getValue();
    }

    public final void c(String str) {
        TextView tv_transaction_amount = getTv_transaction_amount();
        if (str == null) {
            str = "";
        }
        tv_transaction_amount.setText(str);
    }

    public final void d(int i7) {
        getIv_transaction_result_logo().setImageResource(i7);
    }

    public final void e(String str) {
        TextView tv_transaction_result_tips = getTv_transaction_result_tips();
        if (str == null) {
            str = "";
        }
        tv_transaction_result_tips.setText(str);
    }

    public final void f(String str) {
        TextView tv_transaction_result_title = getTv_transaction_result_title();
        if (str == null) {
            str = "";
        }
        tv_transaction_result_title.setText(str);
    }

    @NotNull
    public final ImageView getBodyBgIv() {
        ImageView iv_bg_root = getIv_bg_root();
        Intrinsics.checkNotNullExpressionValue(iv_bg_root, "<get-iv_bg_root>(...)");
        return iv_bg_root;
    }

    @NotNull
    public final ImageView getTransactionHeaderIcon() {
        ImageView iv_transaction_result_logo = getIv_transaction_result_logo();
        Intrinsics.checkNotNullExpressionValue(iv_transaction_result_logo, "<get-iv_transaction_result_logo>(...)");
        return iv_transaction_result_logo;
    }

    @NotNull
    public final TextView getTransactionTitleTv() {
        TextView tv_transaction_result_title = getTv_transaction_result_title();
        Intrinsics.checkNotNullExpressionValue(tv_transaction_result_title, "<get-tv_transaction_result_title>(...)");
        return tv_transaction_result_title;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionDetailHeaderModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransactionDetailHeaderModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionDetailHeaderModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31645a = C2131j.b(new Function0(this) { // from class: Vb.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailHeaderModel f10319b;

            {
                this.f10319b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailHeaderModel transactionDetailHeaderModel = this.f10319b;
                switch (i10) {
                    case 0:
                        TransactionDetailHeaderModel.a aVar = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_amount);
                    case 1:
                        TransactionDetailHeaderModel.a aVar2 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_tips);
                    case 2:
                        TransactionDetailHeaderModel.a aVar3 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_title);
                    case 3:
                        TransactionDetailHeaderModel.a aVar4 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_transaction_result_logo);
                    default:
                        TransactionDetailHeaderModel.a aVar5 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                }
            }
        });
        final int i11 = 1;
        this.f31646b = C2131j.b(new Function0(this) { // from class: Vb.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailHeaderModel f10319b;

            {
                this.f10319b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailHeaderModel transactionDetailHeaderModel = this.f10319b;
                switch (i11) {
                    case 0:
                        TransactionDetailHeaderModel.a aVar = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_amount);
                    case 1:
                        TransactionDetailHeaderModel.a aVar2 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_tips);
                    case 2:
                        TransactionDetailHeaderModel.a aVar3 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_title);
                    case 3:
                        TransactionDetailHeaderModel.a aVar4 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_transaction_result_logo);
                    default:
                        TransactionDetailHeaderModel.a aVar5 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                }
            }
        });
        final int i12 = 2;
        this.f31647c = C2131j.b(new Function0(this) { // from class: Vb.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailHeaderModel f10319b;

            {
                this.f10319b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailHeaderModel transactionDetailHeaderModel = this.f10319b;
                switch (i12) {
                    case 0:
                        TransactionDetailHeaderModel.a aVar = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_amount);
                    case 1:
                        TransactionDetailHeaderModel.a aVar2 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_tips);
                    case 2:
                        TransactionDetailHeaderModel.a aVar3 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_title);
                    case 3:
                        TransactionDetailHeaderModel.a aVar4 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_transaction_result_logo);
                    default:
                        TransactionDetailHeaderModel.a aVar5 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                }
            }
        });
        final int i13 = 3;
        this.f31648d = C2131j.b(new Function0(this) { // from class: Vb.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailHeaderModel f10319b;

            {
                this.f10319b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailHeaderModel transactionDetailHeaderModel = this.f10319b;
                switch (i13) {
                    case 0:
                        TransactionDetailHeaderModel.a aVar = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_amount);
                    case 1:
                        TransactionDetailHeaderModel.a aVar2 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_tips);
                    case 2:
                        TransactionDetailHeaderModel.a aVar3 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_title);
                    case 3:
                        TransactionDetailHeaderModel.a aVar4 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_transaction_result_logo);
                    default:
                        TransactionDetailHeaderModel.a aVar5 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                }
            }
        });
        final int i14 = 4;
        this.f31649e = C2131j.b(new Function0(this) { // from class: Vb.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailHeaderModel f10319b;

            {
                this.f10319b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionDetailHeaderModel transactionDetailHeaderModel = this.f10319b;
                switch (i14) {
                    case 0:
                        TransactionDetailHeaderModel.a aVar = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_amount);
                    case 1:
                        TransactionDetailHeaderModel.a aVar2 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_tips);
                    case 2:
                        TransactionDetailHeaderModel.a aVar3 = TransactionDetailHeaderModel.f31640f;
                        return (TextView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_transaction_result_title);
                    case 3:
                        TransactionDetailHeaderModel.a aVar4 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_transaction_result_logo);
                    default:
                        TransactionDetailHeaderModel.a aVar5 = TransactionDetailHeaderModel.f31640f;
                        return (ImageView) transactionDetailHeaderModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_bg_root);
                }
            }
        });
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_transaction_result_header, this);
    }
}
