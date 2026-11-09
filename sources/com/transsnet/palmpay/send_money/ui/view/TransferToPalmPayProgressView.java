package com.transsnet.palmpay.send_money.ui.view;

import Ce.ViewOnClickListenerC0159a;
import G9.j;
import Gd.B;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.send_money.bean.OrderCompensateBean;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayProgressView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.d;
import p159kd.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferToPalmPayProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/send_money/bean/OrderCompensateBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setData", "(Lcom/transsnet/palmpay/send_money/bean/OrderCompensateBean;)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTv_progress_tip", "()Landroid/widget/TextView;", "tv_progress_tip", "Landroidx/recyclerview/widget/RecyclerView;", "b", "getRv_progress", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_progress", "Lcom/mikepenz/iconics/view/IconicsImageView;", "c", "getIv_question", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_question", "d", "getTv_top", "tv_top", "LGd/B;", "e", "getAdapter", "()LGd/B;", "adapter", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayProgressView.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferToPalmPayProgressView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
public final class TransferToPalmPayProgressView extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33939f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33944e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToPalmPayProgressView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final B getAdapter() {
        return (B) this.f33944e.getValue();
    }

    private final IconicsImageView getIv_question() {
        Object value = this.f33942c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final RecyclerView getRv_progress() {
        Object value = this.f33941b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final TextView getTv_progress_tip() {
        Object value = this.f33940a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_top() {
        Object value = this.f33943d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public final void setData(@Nullable OrderCompensateBean data) {
        if (data != null) {
            getTv_top().setText(data.getCompensateTitle());
            String compensateContent = data.getCompensateContent();
            if (compensateContent == null) {
                h.c(getTv_progress_tip());
                Unit unit = Unit.f38893a;
            } else {
                if (TextUtils.isEmpty(compensateContent)) {
                    compensateContent = null;
                }
                if (compensateContent != null) {
                    h.C(getTv_progress_tip());
                    getTv_progress_tip().setText(data.getCompensateContent());
                } else {
                    h.c(getTv_progress_tip());
                    Unit unit2 = Unit.f38893a;
                }
            }
            if (!TextUtils.isEmpty(data.getCompensateQuestionJumpUrl()) && !TextUtils.isEmpty(data.getCompensateQuestionPic())) {
                h.C(getIv_question());
                r0.l1(data.getCompensateQuestionPic(), getIv_question());
                getIv_question().setOnClickListener(new ViewOnClickListenerC0159a(data, 26));
            }
            getAdapter().setList(data.getCompensateStatusList());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToPalmPayProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferToPalmPayProgressView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToPalmPayProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f33940a = C2131j.b(new Function0(this) { // from class: Gd.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayProgressView f3326b;

            {
                this.f3326b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayProgressView transferToPalmPayProgressView = this.f3326b;
                switch (i10) {
                    case 0:
                        int i11 = TransferToPalmPayProgressView.f33939f;
                        return (TextView) transferToPalmPayProgressView.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i12 = TransferToPalmPayProgressView.f33939f;
                        return (RecyclerView) transferToPalmPayProgressView.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i13 = TransferToPalmPayProgressView.f33939f;
                        return (IconicsImageView) transferToPalmPayProgressView.findViewById(p159kd.e.iv_question);
                    default:
                        int i14 = TransferToPalmPayProgressView.f33939f;
                        return (TextView) transferToPalmPayProgressView.findViewById(p159kd.e.tv_top);
                }
            }
        });
        final int i11 = 1;
        this.f33941b = C2131j.b(new Function0(this) { // from class: Gd.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayProgressView f3326b;

            {
                this.f3326b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayProgressView transferToPalmPayProgressView = this.f3326b;
                switch (i11) {
                    case 0:
                        int i12 = TransferToPalmPayProgressView.f33939f;
                        return (TextView) transferToPalmPayProgressView.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i13 = TransferToPalmPayProgressView.f33939f;
                        return (RecyclerView) transferToPalmPayProgressView.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i14 = TransferToPalmPayProgressView.f33939f;
                        return (IconicsImageView) transferToPalmPayProgressView.findViewById(p159kd.e.iv_question);
                    default:
                        int i15 = TransferToPalmPayProgressView.f33939f;
                        return (TextView) transferToPalmPayProgressView.findViewById(p159kd.e.tv_top);
                }
            }
        });
        final int i12 = 2;
        this.f33942c = C2131j.b(new Function0(this) { // from class: Gd.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayProgressView f3326b;

            {
                this.f3326b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayProgressView transferToPalmPayProgressView = this.f3326b;
                switch (i12) {
                    case 0:
                        int i13 = TransferToPalmPayProgressView.f33939f;
                        return (TextView) transferToPalmPayProgressView.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i14 = TransferToPalmPayProgressView.f33939f;
                        return (RecyclerView) transferToPalmPayProgressView.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i15 = TransferToPalmPayProgressView.f33939f;
                        return (IconicsImageView) transferToPalmPayProgressView.findViewById(p159kd.e.iv_question);
                    default:
                        int i16 = TransferToPalmPayProgressView.f33939f;
                        return (TextView) transferToPalmPayProgressView.findViewById(p159kd.e.tv_top);
                }
            }
        });
        final int i13 = 3;
        this.f33943d = C2131j.b(new Function0(this) { // from class: Gd.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayProgressView f3326b;

            {
                this.f3326b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToPalmPayProgressView transferToPalmPayProgressView = this.f3326b;
                switch (i13) {
                    case 0:
                        int i14 = TransferToPalmPayProgressView.f33939f;
                        return (TextView) transferToPalmPayProgressView.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i15 = TransferToPalmPayProgressView.f33939f;
                        return (RecyclerView) transferToPalmPayProgressView.findViewById(p159kd.e.rv_progress);
                    case 2:
                        int i16 = TransferToPalmPayProgressView.f33939f;
                        return (IconicsImageView) transferToPalmPayProgressView.findViewById(p159kd.e.iv_question);
                    default:
                        int i17 = TransferToPalmPayProgressView.f33939f;
                        return (TextView) transferToPalmPayProgressView.findViewById(p159kd.e.tv_top);
                }
            }
        });
        this.f33944e = C2131j.b(new j(6));
        View.inflate(context, f.sm_layout_transfer_to_palmpay_progress, this);
        setBackgroundResource(d.core_shape_rect_corner_8_bg_e8f8f5);
        getRv_progress().setAdapter(getAdapter());
        getRv_progress().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
    }
}
