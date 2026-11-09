package com.transsnet.palmpay.send_money.ui.view;

import G9.j;
import Gd.w;
import Gd.x;
import Pa.F;
import Pa.r0;
import Wf.t0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.send_money.bean.TransferDetailCompensation;
import com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00024/B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferToFastTransferSafeguardProgressModel;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/send_money/ui/view/TransferToFastTransferSafeguardProgressModel$OnFastTransferSafeguardListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnFastTransferSafeguardListener", "(Lcom/transsnet/palmpay/send_money/ui/view/TransferToFastTransferSafeguardProgressModel$OnFastTransferSafeguardListener;)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getBtnApplyRefund", "()Landroid/widget/TextView;", "btnApplyRefund", "Landroidx/recyclerview/widget/RecyclerView;", "b", "getRv_progress", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_progress", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "getCl_progress", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "cl_progress", "d", "getTvTips", "tvTips", "Lcom/mikepenz/iconics/view/IconicsImageView;", "e", "getIivArrowRight", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iivArrowRight", "f", "getTvStatus", "tvStatus", "Landroid/widget/ImageView;", "g", "getIvTop", "()Landroid/widget/ImageView;", "ivTop", "LGd/w;", "p", "getAdapter", "()LGd/w;", "adapter", "OnFastTransferSafeguardListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToFastTransferSafeguardProgressModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToFastTransferSafeguardProgressModel.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferToFastTransferSafeguardProgressModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
public final class TransferToFastTransferSafeguardProgressModel extends LinearLayout {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33925g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f33926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33927j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnFastTransferSafeguardListener f33928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33929p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferToFastTransferSafeguardProgressModel$OnFastTransferSafeguardListener;", "", "onCountdownFinish", "", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnFastTransferSafeguardListener {
        void onCountdownFinish();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToFastTransferSafeguardProgressModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final w getAdapter() {
        return (w) this.f33929p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getBtnApplyRefund() {
        Object value = this.f33919a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final ConstraintLayout getCl_progress() {
        Object value = this.f33921c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    private final IconicsImageView getIivArrowRight() {
        Object value = this.f33923e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final ImageView getIvTop() {
        Object value = this.f33925g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final RecyclerView getRv_progress() {
        Object value = this.f33920b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final TextView getTvStatus() {
        Object value = this.f33924f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvTips() {
        Object value = this.f33922d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void b(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            str = null;
        }
        ActivityUtils.startActivity(F.a(getContext(), str));
    }

    public final void c(AbstractActivityC0837o activity, final TransferDetailCompensation transferDetailCompensation) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (transferDetailCompensation != null) {
            if (Intrinsics.c(transferDetailCompensation.getShowProcessBar(), Boolean.TRUE)) {
                getAdapter().setList(transferDetailCompensation.getTips());
                h.C(getCl_progress());
            } else {
                h.c(getCl_progress());
            }
            r0.k1(getIvTop(), transferDetailCompensation.getTopLeftPic(), transferDetailCompensation.getTopLeftDarkPic());
            getTvStatus().setText(transferDetailCompensation.getTopRightDesc());
            TextView tvTips = getTvTips();
            String middleDesc = transferDetailCompensation.getMiddleDesc();
            Long middleTime = transferDetailCompensation.getMiddleTime();
            if ((middleTime != null ? middleTime.longValue() : 0L) > 0) {
                Long middleTime2 = transferDetailCompensation.getMiddleTime();
                strValueOf = String.valueOf(TimeUtils.millis2String(middleTime2 != null ? middleTime2.longValue() : 0L, new SimpleDateFormat("h:mm aa", Locale.ENGLISH)));
            } else {
                strValueOf = "";
            }
            tvTips.setText(middleDesc + strValueOf);
            final int i7 = 1;
            getBtnApplyRefund().setOnClickListener(new View.OnClickListener(this) { // from class: Gd.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3376b;

                {
                    this.f3376b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3376b;
                    TransferDetailCompensation transferDetailCompensation2 = transferDetailCompensation;
                    switch (i7) {
                        case 0:
                            int i10 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getIntroduceJumpUrl());
                            break;
                        case 1:
                            int i11 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getDetailJumpUrl());
                            break;
                        default:
                            int i12 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getIntroduceJumpUrl());
                            break;
                    }
                }
            });
            final int i10 = 2;
            getTvStatus().setOnClickListener(new View.OnClickListener(this) { // from class: Gd.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3376b;

                {
                    this.f3376b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3376b;
                    TransferDetailCompensation transferDetailCompensation2 = transferDetailCompensation;
                    switch (i10) {
                        case 0:
                            int i11 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getIntroduceJumpUrl());
                            break;
                        case 1:
                            int i12 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getDetailJumpUrl());
                            break;
                        default:
                            int i13 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getIntroduceJumpUrl());
                            break;
                    }
                }
            });
            final int i11 = 0;
            getIivArrowRight().setOnClickListener(new View.OnClickListener(this) { // from class: Gd.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3376b;

                {
                    this.f3376b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3376b;
                    TransferDetailCompensation transferDetailCompensation2 = transferDetailCompensation;
                    switch (i11) {
                        case 0:
                            int i12 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getIntroduceJumpUrl());
                            break;
                        case 1:
                            int i13 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getDetailJumpUrl());
                            break;
                        default:
                            int i14 = TransferToFastTransferSafeguardProgressModel.t;
                            transferToFastTransferSafeguardProgressModel.b(transferDetailCompensation2.getIntroduceJumpUrl());
                            break;
                    }
                }
            });
            h.C(getBtnApplyRefund());
            Integer compensationStatus = transferDetailCompensation.getCompensationStatus();
            if (compensationStatus != null && compensationStatus.intValue() == 1) {
                getBtnApplyRefund().setEnabled(false);
                Long bottomButtonCountdown = transferDetailCompensation.getBottomButtonCountdown();
                if (bottomButtonCountdown != null) {
                    if (bottomButtonCountdown.longValue() <= 0) {
                        bottomButtonCountdown = null;
                    }
                    if (bottomButtonCountdown != null) {
                        long jLongValue = bottomButtonCountdown.longValue();
                        d();
                        this.f33927j = false;
                        this.f33926i = org.chromium.support_lib_boundary.util.b.r(V.f(activity), jLongValue, null, new c(this, null), new x(this, transferDetailCompensation, null), 14);
                        return;
                    }
                    return;
                }
                return;
            }
            if (compensationStatus != null && compensationStatus.intValue() == 2) {
                d();
                getBtnApplyRefund().setEnabled(true);
                getBtnApplyRefund().setText(transferDetailCompensation.getBottomButtonDesc());
            } else if (compensationStatus == null || compensationStatus.intValue() != 3) {
                d();
                h.c(getBtnApplyRefund());
            } else {
                d();
                getBtnApplyRefund().setEnabled(true);
                getBtnApplyRefund().setText(transferDetailCompensation.getBottomButtonDesc());
            }
        }
    }

    public final void d() {
        this.f33927j = true;
        t0 t0Var = this.f33926i;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    public final void setOnFastTransferSafeguardListener(@NotNull OnFastTransferSafeguardListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33928o = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToFastTransferSafeguardProgressModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferToFastTransferSafeguardProgressModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToFastTransferSafeguardProgressModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f33919a = C2131j.b(new Function0(this) { // from class: Gd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3374b;

            {
                this.f3374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3374b;
                switch (i10) {
                    case 0:
                        int i11 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.btnApplyRefund);
                    case 1:
                        int i12 = TransferToFastTransferSafeguardProgressModel.t;
                        return (RecyclerView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i13 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ConstraintLayout) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.cl_progress);
                    case 3:
                        int i14 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvTips);
                    case 4:
                        int i15 = TransferToFastTransferSafeguardProgressModel.t;
                        return (IconicsImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.iivArrowRight);
                    case 5:
                        int i16 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvStatus);
                    default:
                        int i17 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.ivTop);
                }
            }
        });
        final int i11 = 1;
        this.f33920b = C2131j.b(new Function0(this) { // from class: Gd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3374b;

            {
                this.f3374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3374b;
                switch (i11) {
                    case 0:
                        int i12 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.btnApplyRefund);
                    case 1:
                        int i13 = TransferToFastTransferSafeguardProgressModel.t;
                        return (RecyclerView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i14 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ConstraintLayout) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.cl_progress);
                    case 3:
                        int i15 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvTips);
                    case 4:
                        int i16 = TransferToFastTransferSafeguardProgressModel.t;
                        return (IconicsImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.iivArrowRight);
                    case 5:
                        int i17 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvStatus);
                    default:
                        int i18 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.ivTop);
                }
            }
        });
        final int i12 = 2;
        this.f33921c = C2131j.b(new Function0(this) { // from class: Gd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3374b;

            {
                this.f3374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3374b;
                switch (i12) {
                    case 0:
                        int i13 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.btnApplyRefund);
                    case 1:
                        int i14 = TransferToFastTransferSafeguardProgressModel.t;
                        return (RecyclerView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i15 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ConstraintLayout) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.cl_progress);
                    case 3:
                        int i16 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvTips);
                    case 4:
                        int i17 = TransferToFastTransferSafeguardProgressModel.t;
                        return (IconicsImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.iivArrowRight);
                    case 5:
                        int i18 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvStatus);
                    default:
                        int i19 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.ivTop);
                }
            }
        });
        final int i13 = 3;
        this.f33922d = C2131j.b(new Function0(this) { // from class: Gd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3374b;

            {
                this.f3374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3374b;
                switch (i13) {
                    case 0:
                        int i14 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.btnApplyRefund);
                    case 1:
                        int i15 = TransferToFastTransferSafeguardProgressModel.t;
                        return (RecyclerView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i16 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ConstraintLayout) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.cl_progress);
                    case 3:
                        int i17 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvTips);
                    case 4:
                        int i18 = TransferToFastTransferSafeguardProgressModel.t;
                        return (IconicsImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.iivArrowRight);
                    case 5:
                        int i19 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvStatus);
                    default:
                        int i110 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.ivTop);
                }
            }
        });
        final int i14 = 4;
        this.f33923e = C2131j.b(new Function0(this) { // from class: Gd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3374b;

            {
                this.f3374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3374b;
                switch (i14) {
                    case 0:
                        int i15 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.btnApplyRefund);
                    case 1:
                        int i16 = TransferToFastTransferSafeguardProgressModel.t;
                        return (RecyclerView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i17 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ConstraintLayout) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.cl_progress);
                    case 3:
                        int i18 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvTips);
                    case 4:
                        int i19 = TransferToFastTransferSafeguardProgressModel.t;
                        return (IconicsImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.iivArrowRight);
                    case 5:
                        int i110 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvStatus);
                    default:
                        int i111 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.ivTop);
                }
            }
        });
        final int i15 = 5;
        this.f33924f = C2131j.b(new Function0(this) { // from class: Gd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3374b;

            {
                this.f3374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3374b;
                switch (i15) {
                    case 0:
                        int i16 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.btnApplyRefund);
                    case 1:
                        int i17 = TransferToFastTransferSafeguardProgressModel.t;
                        return (RecyclerView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i18 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ConstraintLayout) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.cl_progress);
                    case 3:
                        int i19 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvTips);
                    case 4:
                        int i110 = TransferToFastTransferSafeguardProgressModel.t;
                        return (IconicsImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.iivArrowRight);
                    case 5:
                        int i111 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvStatus);
                    default:
                        int i112 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.ivTop);
                }
            }
        });
        final int i16 = 6;
        this.f33925g = C2131j.b(new Function0(this) { // from class: Gd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f3374b;

            {
                this.f3374b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f3374b;
                switch (i16) {
                    case 0:
                        int i17 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.btnApplyRefund);
                    case 1:
                        int i18 = TransferToFastTransferSafeguardProgressModel.t;
                        return (RecyclerView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i19 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ConstraintLayout) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.cl_progress);
                    case 3:
                        int i110 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvTips);
                    case 4:
                        int i111 = TransferToFastTransferSafeguardProgressModel.t;
                        return (IconicsImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.iivArrowRight);
                    case 5:
                        int i112 = TransferToFastTransferSafeguardProgressModel.t;
                        return (TextView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.tvStatus);
                    default:
                        int i113 = TransferToFastTransferSafeguardProgressModel.t;
                        return (ImageView) transferToFastTransferSafeguardProgressModel.findViewById(p159kd.e.ivTop);
                }
            }
        });
        this.f33929p = C2131j.b(new j(5));
        View.inflate(context, f.sm_layout_fast_transfer_safeguard_progress, this);
        setOrientation(1);
        setGravity(1);
        getRv_progress().setAdapter(getAdapter());
        getRv_progress().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
    }
}
