package com.transsnet.palmpay.credit.view;

import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.transsnet.palmpay.credit.view.CLHomeFinanceInstallmentStatus;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\fR\u001b\u0010\u001d\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u0011R\u001b\u0010 \u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\u0011¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/credit/view/CLHomeFinanceInstallmentStatus;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/constraintlayout/widget/Group;", "a", "Lkotlin/Lazy;", "getGroupInvalid", "()Landroidx/constraintlayout/widget/Group;", "groupInvalid", "Landroid/widget/TextView;", "b", "getTvStatusDesc", "()Landroid/widget/TextView;", "tvStatusDesc", "Lcom/transsnet/palmpay/custom_view/RoundedTextView;", "c", "getRtvStatus", "()Lcom/transsnet/palmpay/custom_view/RoundedTextView;", "rtvStatus", "d", "getGroupValid", "groupValid", "e", "getTvRepayTerms", "tvRepayTerms", "f", "getTvInstallmentAmount", "tvInstallmentAmount", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLHomeFinanceInstallmentStatus extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f30715g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f30717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f30718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f30719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f30720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f30721f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLHomeFinanceInstallmentStatus(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i7 = 0;
        this.f30716a = C2131j.b(new Function0(this) { // from class: Gb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLHomeFinanceInstallmentStatus f3268b;

            {
                this.f3268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLHomeFinanceInstallmentStatus cLHomeFinanceInstallmentStatus = this.f3268b;
                switch (i7) {
                    case 0:
                        int i10 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupInvalid);
                    case 1:
                        int i11 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvStatusDesc);
                    case 2:
                        int i12 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (RoundedTextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.rtvStatus);
                    case 3:
                        int i13 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupValid);
                    case 4:
                        int i14 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvRepayTerms);
                    default:
                        int i15 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvInstallmentAmount);
                }
            }
        });
        final int i10 = 1;
        this.f30717b = C2131j.b(new Function0(this) { // from class: Gb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLHomeFinanceInstallmentStatus f3268b;

            {
                this.f3268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLHomeFinanceInstallmentStatus cLHomeFinanceInstallmentStatus = this.f3268b;
                switch (i10) {
                    case 0:
                        int i11 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupInvalid);
                    case 1:
                        int i12 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvStatusDesc);
                    case 2:
                        int i13 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (RoundedTextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.rtvStatus);
                    case 3:
                        int i14 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupValid);
                    case 4:
                        int i15 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvRepayTerms);
                    default:
                        int i16 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvInstallmentAmount);
                }
            }
        });
        final int i11 = 2;
        this.f30718c = C2131j.b(new Function0(this) { // from class: Gb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLHomeFinanceInstallmentStatus f3268b;

            {
                this.f3268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLHomeFinanceInstallmentStatus cLHomeFinanceInstallmentStatus = this.f3268b;
                switch (i11) {
                    case 0:
                        int i12 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupInvalid);
                    case 1:
                        int i13 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvStatusDesc);
                    case 2:
                        int i14 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (RoundedTextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.rtvStatus);
                    case 3:
                        int i15 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupValid);
                    case 4:
                        int i16 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvRepayTerms);
                    default:
                        int i17 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvInstallmentAmount);
                }
            }
        });
        final int i12 = 3;
        this.f30719d = C2131j.b(new Function0(this) { // from class: Gb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLHomeFinanceInstallmentStatus f3268b;

            {
                this.f3268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLHomeFinanceInstallmentStatus cLHomeFinanceInstallmentStatus = this.f3268b;
                switch (i12) {
                    case 0:
                        int i13 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupInvalid);
                    case 1:
                        int i14 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvStatusDesc);
                    case 2:
                        int i15 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (RoundedTextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.rtvStatus);
                    case 3:
                        int i16 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupValid);
                    case 4:
                        int i17 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvRepayTerms);
                    default:
                        int i18 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvInstallmentAmount);
                }
            }
        });
        final int i13 = 4;
        this.f30720e = C2131j.b(new Function0(this) { // from class: Gb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLHomeFinanceInstallmentStatus f3268b;

            {
                this.f3268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLHomeFinanceInstallmentStatus cLHomeFinanceInstallmentStatus = this.f3268b;
                switch (i13) {
                    case 0:
                        int i14 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupInvalid);
                    case 1:
                        int i15 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvStatusDesc);
                    case 2:
                        int i16 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (RoundedTextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.rtvStatus);
                    case 3:
                        int i17 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupValid);
                    case 4:
                        int i18 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvRepayTerms);
                    default:
                        int i19 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvInstallmentAmount);
                }
            }
        });
        final int i14 = 5;
        this.f30721f = C2131j.b(new Function0(this) { // from class: Gb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLHomeFinanceInstallmentStatus f3268b;

            {
                this.f3268b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLHomeFinanceInstallmentStatus cLHomeFinanceInstallmentStatus = this.f3268b;
                switch (i14) {
                    case 0:
                        int i15 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupInvalid);
                    case 1:
                        int i16 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvStatusDesc);
                    case 2:
                        int i17 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (RoundedTextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.rtvStatus);
                    case 3:
                        int i18 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (Group) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.groupValid);
                    case 4:
                        int i19 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvRepayTerms);
                    default:
                        int i110 = CLHomeFinanceInstallmentStatus.f30715g;
                        return (TextView) cLHomeFinanceInstallmentStatus.findViewById(Ya.e.tvInstallmentAmount);
                }
            }
        });
        View.inflate(context, f.cs_cl_loan_status_layout, this);
    }

    private final Group getGroupInvalid() {
        Object value = this.f30716a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
    }

    private final Group getGroupValid() {
        Object value = this.f30719d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
    }

    private final RoundedTextView getRtvStatus() {
        Object value = this.f30718c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RoundedTextView) value;
    }

    private final TextView getTvInstallmentAmount() {
        Object value = this.f30721f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvRepayTerms() {
        Object value = this.f30720e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvStatusDesc() {
        Object value = this.f30717b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }
}
