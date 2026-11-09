package com.transsnet.palmpay.credit.view;

import Pa.r0;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.LoanHomeBottomInfo;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p186mb.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/view/LoanHomeBottomInfoView;", "Lcom/transsnet/palmpay/credit/view/BaseLoanView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTvContent", "()Landroid/widget/TextView;", "tvContent", "Landroid/widget/ImageView;", "b", "getIvIcon", "()Landroid/widget/ImageView;", "ivIcon", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanHomeBottomInfoView extends BaseLoanView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30793c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f30795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanHomeBottomInfoView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i7 = 0;
        this.f30794a = C2131j.b(new Function0(this) { // from class: Gb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanHomeBottomInfoView f3292b;

            {
                this.f3292b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LoanHomeBottomInfoView loanHomeBottomInfoView = this.f3292b;
                switch (i7) {
                    case 0:
                        int i10 = LoanHomeBottomInfoView.f30793c;
                        return (TextView) loanHomeBottomInfoView.findViewById(Ya.e.tvContent);
                    default:
                        int i11 = LoanHomeBottomInfoView.f30793c;
                        return (ImageView) loanHomeBottomInfoView.findViewById(Ya.e.ivIcon);
                }
            }
        });
        final int i10 = 1;
        this.f30795b = C2131j.b(new Function0(this) { // from class: Gb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanHomeBottomInfoView f3292b;

            {
                this.f3292b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LoanHomeBottomInfoView loanHomeBottomInfoView = this.f3292b;
                switch (i10) {
                    case 0:
                        int i11 = LoanHomeBottomInfoView.f30793c;
                        return (TextView) loanHomeBottomInfoView.findViewById(Ya.e.tvContent);
                    default:
                        int i12 = LoanHomeBottomInfoView.f30793c;
                        return (ImageView) loanHomeBottomInfoView.findViewById(Ya.e.ivIcon);
                }
            }
        });
        LayoutInflater.from(context).inflate(f.cs_cl_bottom_info_view, this);
        e(d.f39634e.getInstance().f39636a, null, null);
    }

    private final ImageView getIvIcon() {
        Object value = this.f30795b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getTvContent() {
        Object value = this.f30794a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void e(LoanHomeBottomInfo loanHomeBottomInfo, String str, String str2) {
        if (loanHomeBottomInfo == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (d() && str2 != null && str2.length() != 0) {
            str = str2;
        } else if (d() || str == null || str.length() == 0) {
            str = d() ? loanHomeBottomInfo.logoDark : loanHomeBottomInfo.logo;
        }
        r0.l1(str, getIvIcon());
        getTvContent().setText(loanHomeBottomInfo.content);
    }
}
