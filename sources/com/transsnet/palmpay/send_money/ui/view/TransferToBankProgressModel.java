package com.transsnet.palmpay.send_money.ui.view;

import G9.j;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import com.transsnet.palmpay.send_money.bean.TransferData;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankProgressModel;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001b\u0010\u001f\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferToBankProgressModel;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/send_money/bean/TransferData$EarlyRefundFeeInfoBean;", "earlyRefundFeeInfo", "", "setEarlyRefund", "(Lcom/transsnet/palmpay/send_money/bean/TransferData$EarlyRefundFeeInfoBean;)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTv_progress_tip", "()Landroid/widget/TextView;", "tv_progress_tip", "Landroidx/constraintlayout/widget/Group;", "b", "getG_early_refund", "()Landroidx/constraintlayout/widget/Group;", "g_early_refund", "c", "getTv_early_refund_checked", "tv_early_refund_checked", "d", "getTv_early_refund_title", "tv_early_refund_title", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e", "getCl_progress_tips", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "cl_progress_tips", "Landroidx/recyclerview/widget/RecyclerView;", "f", "getRv_progress", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_progress", "LGd/t;", "g", "getAdapter", "()LGd/t;", "adapter", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankProgressModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankProgressModel.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferToBankProgressModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1869#2,2:136\n*S KotlinDebug\n*F\n+ 1 TransferToBankProgressModel.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferToBankProgressModel\n*L\n63#1:136,2\n*E\n"})
public final class TransferToBankProgressModel extends LinearLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f33911i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33918g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToBankProgressModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Gd.t getAdapter() {
        return (Gd.t) this.f33918g.getValue();
    }

    private final ConstraintLayout getCl_progress_tips() {
        Object value = this.f33916e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    private final Group getG_early_refund() {
        Object value = this.f33913b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
    }

    private final RecyclerView getRv_progress() {
        Object value = this.f33917f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final TextView getTv_early_refund_checked() {
        Object value = this.f33914c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_early_refund_title() {
        Object value = this.f33915d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_progress_tip() {
        Object value = this.f33912a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void a(List list, boolean z3) {
        if (list != null) {
            getAdapter().setList(list);
            Gd.t adapter = getAdapter();
            adapter.f3372a = z3;
            adapter.notifyDataSetChanged();
            if (z3) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    BillProcessTitleData1 billProcessTitleData1 = (BillProcessTitleData1) it.next();
                    if (billProcessTitleData1.selected && !TextUtils.isEmpty(billProcessTitleData1.tips)) {
                        ConstraintLayout cl_progress_tips = getCl_progress_tips();
                        if (cl_progress_tips != null) {
                            h.C(cl_progress_tips);
                        }
                        TextView tv_progress_tip = getTv_progress_tip();
                        if (tv_progress_tip != null) {
                            h.C(tv_progress_tip);
                        }
                        TextView tv_progress_tip2 = getTv_progress_tip();
                        if (tv_progress_tip2 != null) {
                            tv_progress_tip2.setText(billProcessTitleData1.tips);
                        }
                    }
                }
            }
        }
    }

    public final void setEarlyRefund(@Nullable TransferData.EarlyRefundFeeInfoBean earlyRefundFeeInfo) {
        if (earlyRefundFeeInfo != null) {
            ConstraintLayout cl_progress_tips = getCl_progress_tips();
            if (cl_progress_tips != null) {
                h.C(cl_progress_tips);
            }
            Group g_early_refund = getG_early_refund();
            if (g_early_refund != null) {
                h.C(g_early_refund);
            }
            TextView tv_early_refund_title = getTv_early_refund_title();
            if (tv_early_refund_title != null) {
                tv_early_refund_title.setText(earlyRefundFeeInfo.name);
            }
            TextView tv_early_refund_checked = getTv_early_refund_checked();
            if (tv_early_refund_checked != null) {
                tv_early_refund_checked.setText(earlyRefundFeeInfo.desc);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToBankProgressModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferToBankProgressModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferToBankProgressModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f33912a = C2131j.b(new Function0(this) { // from class: Gd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankProgressModel f3371b;

            {
                this.f3371b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBankProgressModel transferToBankProgressModel = this.f3371b;
                switch (i10) {
                    case 0:
                        int i11 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i12 = TransferToBankProgressModel.f33911i;
                        return (Group) transferToBankProgressModel.findViewById(p159kd.e.g_early_refund);
                    case 2:
                        int i13 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_checked);
                    case 3:
                        int i14 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_title);
                    case 4:
                        int i15 = TransferToBankProgressModel.f33911i;
                        return (ConstraintLayout) transferToBankProgressModel.findViewById(p159kd.e.cl_progress_tips);
                    default:
                        int i16 = TransferToBankProgressModel.f33911i;
                        return (RecyclerView) transferToBankProgressModel.findViewById(p159kd.e.rv_progress);
                }
            }
        });
        final int i11 = 1;
        this.f33913b = C2131j.b(new Function0(this) { // from class: Gd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankProgressModel f3371b;

            {
                this.f3371b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBankProgressModel transferToBankProgressModel = this.f3371b;
                switch (i11) {
                    case 0:
                        int i12 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i13 = TransferToBankProgressModel.f33911i;
                        return (Group) transferToBankProgressModel.findViewById(p159kd.e.g_early_refund);
                    case 2:
                        int i14 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_checked);
                    case 3:
                        int i15 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_title);
                    case 4:
                        int i16 = TransferToBankProgressModel.f33911i;
                        return (ConstraintLayout) transferToBankProgressModel.findViewById(p159kd.e.cl_progress_tips);
                    default:
                        int i17 = TransferToBankProgressModel.f33911i;
                        return (RecyclerView) transferToBankProgressModel.findViewById(p159kd.e.rv_progress);
                }
            }
        });
        final int i12 = 2;
        this.f33914c = C2131j.b(new Function0(this) { // from class: Gd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankProgressModel f3371b;

            {
                this.f3371b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBankProgressModel transferToBankProgressModel = this.f3371b;
                switch (i12) {
                    case 0:
                        int i13 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i14 = TransferToBankProgressModel.f33911i;
                        return (Group) transferToBankProgressModel.findViewById(p159kd.e.g_early_refund);
                    case 2:
                        int i15 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_checked);
                    case 3:
                        int i16 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_title);
                    case 4:
                        int i17 = TransferToBankProgressModel.f33911i;
                        return (ConstraintLayout) transferToBankProgressModel.findViewById(p159kd.e.cl_progress_tips);
                    default:
                        int i18 = TransferToBankProgressModel.f33911i;
                        return (RecyclerView) transferToBankProgressModel.findViewById(p159kd.e.rv_progress);
                }
            }
        });
        final int i13 = 3;
        this.f33915d = C2131j.b(new Function0(this) { // from class: Gd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankProgressModel f3371b;

            {
                this.f3371b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBankProgressModel transferToBankProgressModel = this.f3371b;
                switch (i13) {
                    case 0:
                        int i14 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i15 = TransferToBankProgressModel.f33911i;
                        return (Group) transferToBankProgressModel.findViewById(p159kd.e.g_early_refund);
                    case 2:
                        int i16 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_checked);
                    case 3:
                        int i17 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_title);
                    case 4:
                        int i18 = TransferToBankProgressModel.f33911i;
                        return (ConstraintLayout) transferToBankProgressModel.findViewById(p159kd.e.cl_progress_tips);
                    default:
                        int i19 = TransferToBankProgressModel.f33911i;
                        return (RecyclerView) transferToBankProgressModel.findViewById(p159kd.e.rv_progress);
                }
            }
        });
        final int i14 = 4;
        this.f33916e = C2131j.b(new Function0(this) { // from class: Gd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankProgressModel f3371b;

            {
                this.f3371b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBankProgressModel transferToBankProgressModel = this.f3371b;
                switch (i14) {
                    case 0:
                        int i15 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i16 = TransferToBankProgressModel.f33911i;
                        return (Group) transferToBankProgressModel.findViewById(p159kd.e.g_early_refund);
                    case 2:
                        int i17 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_checked);
                    case 3:
                        int i18 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_title);
                    case 4:
                        int i19 = TransferToBankProgressModel.f33911i;
                        return (ConstraintLayout) transferToBankProgressModel.findViewById(p159kd.e.cl_progress_tips);
                    default:
                        int i110 = TransferToBankProgressModel.f33911i;
                        return (RecyclerView) transferToBankProgressModel.findViewById(p159kd.e.rv_progress);
                }
            }
        });
        final int i15 = 5;
        this.f33917f = C2131j.b(new Function0(this) { // from class: Gd.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankProgressModel f3371b;

            {
                this.f3371b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBankProgressModel transferToBankProgressModel = this.f3371b;
                switch (i15) {
                    case 0:
                        int i16 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_progress_tip);
                    case 1:
                        int i17 = TransferToBankProgressModel.f33911i;
                        return (Group) transferToBankProgressModel.findViewById(p159kd.e.g_early_refund);
                    case 2:
                        int i18 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_checked);
                    case 3:
                        int i19 = TransferToBankProgressModel.f33911i;
                        return (TextView) transferToBankProgressModel.findViewById(p159kd.e.tv_early_refund_title);
                    case 4:
                        int i110 = TransferToBankProgressModel.f33911i;
                        return (ConstraintLayout) transferToBankProgressModel.findViewById(p159kd.e.cl_progress_tips);
                    default:
                        int i111 = TransferToBankProgressModel.f33911i;
                        return (RecyclerView) transferToBankProgressModel.findViewById(p159kd.e.rv_progress);
                }
            }
        });
        this.f33918g = C2131j.b(new j(4));
        View.inflate(context, f.sm_layout_transfer_progress, this);
        setOrientation(1);
        setBackgroundResource(L6.b.ppColorBackgroundLight);
        setGravity(1);
        getRv_progress().setAdapter(getAdapter());
        getRv_progress().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
    }
}
