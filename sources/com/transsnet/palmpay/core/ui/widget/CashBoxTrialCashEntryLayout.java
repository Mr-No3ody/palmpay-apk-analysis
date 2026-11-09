package com.transsnet.palmpay.core.ui.widget;

import C0.G;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.transsnet.palmpay.core.bean.rsp.CashBoxTrialCashEntryResp;
import com.transsnet.palmpay.core.ui.widget.CashBoxTrialCashEntryLayout;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/CashBoxTrialCashEntryLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/constraintlayout/widget/Group;", "a", "Lkotlin/Lazy;", "getG_has_trial_cash", "()Landroidx/constraintlayout/widget/Group;", "g_has_trial_cash", "Landroid/widget/TextView;", "b", "getTv_has_trial_cash", "()Landroid/widget/TextView;", "tv_has_trial_cash", "Landroid/widget/ImageView;", "c", "getIv_bg_has_trial_cash", "()Landroid/widget/ImageView;", "iv_bg_has_trial_cash", "d", "getIv_none_trial_cash", "iv_none_trial_cash", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxTrialCashEntryLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxTrialCashEntryLayout.kt\ncom/transsnet/palmpay/core/ui/widget/CashBoxTrialCashEntryLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class CashBoxTrialCashEntryLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28112e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28116d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CashBoxTrialCashEntryLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Group getG_has_trial_cash() {
        Object value = this.f28113a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
    }

    private final ImageView getIv_bg_has_trial_cash() {
        Object value = this.f28115c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getIv_none_trial_cash() {
        Object value = this.f28116d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getTv_has_trial_cash() {
        Object value = this.f28114b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void c(final CashBoxTrialCashEntryResp cashBoxTrialCashEntryResp, final String elementName, boolean z3) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        if (cashBoxTrialCashEntryResp != null) {
            Integer num = cashBoxTrialCashEntryResp.showType;
            if (num != null && num.intValue() == 2) {
                r0.l1((TextUtils.isEmpty(cashBoxTrialCashEntryResp.darkPic) || !z3) ? cashBoxTrialCashEntryResp.pic : cashBoxTrialCashEntryResp.darkPic, getIv_none_trial_cash());
                h.C(getIv_none_trial_cash());
                h.c(getG_has_trial_cash());
                n0.g().w("PalmPay_TrialCash_Go_View", F.b(new Pair("", elementName)));
                String str = cashBoxTrialCashEntryResp.jumpUrl;
                if (str != null) {
                    if ((TextUtils.isEmpty(str) ? null : str) != null) {
                        final int i7 = 0;
                        getIv_none_trial_cash().setOnClickListener(new View.OnClickListener(this) { // from class: Oa.i

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ CashBoxTrialCashEntryLayout f6699b;

                            {
                                this.f6699b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CashBoxTrialCashEntryResp cashBoxTrialCashEntryResp2 = cashBoxTrialCashEntryResp;
                                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout = this.f6699b;
                                String str2 = elementName;
                                switch (i7) {
                                    case 0:
                                        int i10 = CashBoxTrialCashEntryLayout.f28112e;
                                        cashBoxTrialCashEntryLayout.getClass();
                                        n0.g().k((ClickEvent) G.f("PalmPay_TrialCash_Go_Click", "element_name", str2));
                                        ActivityUtils.startActivity(Pa.F.a(cashBoxTrialCashEntryLayout.getContext(), cashBoxTrialCashEntryResp2.jumpUrl));
                                        break;
                                    default:
                                        int i11 = CashBoxTrialCashEntryLayout.f28112e;
                                        cashBoxTrialCashEntryLayout.getClass();
                                        n0.g().k((ClickEvent) G.f("PalmPay_TrialCash_Claim_Click", "element_name", str2));
                                        ActivityUtils.startActivity(Pa.F.a(cashBoxTrialCashEntryLayout.getContext(), cashBoxTrialCashEntryResp2.jumpUrl));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            Integer num2 = cashBoxTrialCashEntryResp.showType;
            if (num2 != null && num2.intValue() == 1) {
                h.c(getIv_none_trial_cash());
                h.C(getG_has_trial_cash());
                getTv_has_trial_cash().requestFocus();
                getTv_has_trial_cash().setText(cashBoxTrialCashEntryResp.tips);
                n0.g().w("PalmPay_TrialCash_Claim_View", F.b(new Pair("", elementName)));
                String str2 = cashBoxTrialCashEntryResp.jumpUrl;
                if (str2 != null) {
                    if ((TextUtils.isEmpty(str2) ? null : str2) != null) {
                        final int i10 = 1;
                        getIv_bg_has_trial_cash().setOnClickListener(new View.OnClickListener(this) { // from class: Oa.i

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ CashBoxTrialCashEntryLayout f6699b;

                            {
                                this.f6699b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CashBoxTrialCashEntryResp cashBoxTrialCashEntryResp2 = cashBoxTrialCashEntryResp;
                                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout = this.f6699b;
                                String str3 = elementName;
                                switch (i10) {
                                    case 0:
                                        int i11 = CashBoxTrialCashEntryLayout.f28112e;
                                        cashBoxTrialCashEntryLayout.getClass();
                                        n0.g().k((ClickEvent) G.f("PalmPay_TrialCash_Go_Click", "element_name", str3));
                                        ActivityUtils.startActivity(Pa.F.a(cashBoxTrialCashEntryLayout.getContext(), cashBoxTrialCashEntryResp2.jumpUrl));
                                        break;
                                    default:
                                        int i12 = CashBoxTrialCashEntryLayout.f28112e;
                                        cashBoxTrialCashEntryLayout.getClass();
                                        n0.g().k((ClickEvent) G.f("PalmPay_TrialCash_Claim_Click", "element_name", str3));
                                        ActivityUtils.startActivity(Pa.F.a(cashBoxTrialCashEntryLayout.getContext(), cashBoxTrialCashEntryResp2.jumpUrl));
                                        break;
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getTv_has_trial_cash().requestFocus();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CashBoxTrialCashEntryLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CashBoxTrialCashEntryLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CashBoxTrialCashEntryLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28113a = C2131j.b(new Function0(this) { // from class: Oa.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTrialCashEntryLayout f6697b;

            {
                this.f6697b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout = this.f6697b;
                switch (i10) {
                    case 0:
                        int i11 = CashBoxTrialCashEntryLayout.f28112e;
                        return (Group) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.g_has_trial_cash);
                    case 1:
                        int i12 = CashBoxTrialCashEntryLayout.f28112e;
                        return (TextView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.tv_has_trial_cash);
                    case 2:
                        int i13 = CashBoxTrialCashEntryLayout.f28112e;
                        return (ImageView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.iv_bg_has_trial_cash);
                    default:
                        int i14 = CashBoxTrialCashEntryLayout.f28112e;
                        return (ImageView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.iv_none_trial_cash);
                }
            }
        });
        final int i11 = 1;
        this.f28114b = C2131j.b(new Function0(this) { // from class: Oa.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTrialCashEntryLayout f6697b;

            {
                this.f6697b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout = this.f6697b;
                switch (i11) {
                    case 0:
                        int i12 = CashBoxTrialCashEntryLayout.f28112e;
                        return (Group) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.g_has_trial_cash);
                    case 1:
                        int i13 = CashBoxTrialCashEntryLayout.f28112e;
                        return (TextView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.tv_has_trial_cash);
                    case 2:
                        int i14 = CashBoxTrialCashEntryLayout.f28112e;
                        return (ImageView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.iv_bg_has_trial_cash);
                    default:
                        int i15 = CashBoxTrialCashEntryLayout.f28112e;
                        return (ImageView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.iv_none_trial_cash);
                }
            }
        });
        final int i12 = 2;
        this.f28115c = C2131j.b(new Function0(this) { // from class: Oa.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTrialCashEntryLayout f6697b;

            {
                this.f6697b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout = this.f6697b;
                switch (i12) {
                    case 0:
                        int i13 = CashBoxTrialCashEntryLayout.f28112e;
                        return (Group) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.g_has_trial_cash);
                    case 1:
                        int i14 = CashBoxTrialCashEntryLayout.f28112e;
                        return (TextView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.tv_has_trial_cash);
                    case 2:
                        int i15 = CashBoxTrialCashEntryLayout.f28112e;
                        return (ImageView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.iv_bg_has_trial_cash);
                    default:
                        int i16 = CashBoxTrialCashEntryLayout.f28112e;
                        return (ImageView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.iv_none_trial_cash);
                }
            }
        });
        final int i13 = 3;
        this.f28116d = C2131j.b(new Function0(this) { // from class: Oa.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTrialCashEntryLayout f6697b;

            {
                this.f6697b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout = this.f6697b;
                switch (i13) {
                    case 0:
                        int i14 = CashBoxTrialCashEntryLayout.f28112e;
                        return (Group) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.g_has_trial_cash);
                    case 1:
                        int i15 = CashBoxTrialCashEntryLayout.f28112e;
                        return (TextView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.tv_has_trial_cash);
                    case 2:
                        int i16 = CashBoxTrialCashEntryLayout.f28112e;
                        return (ImageView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.iv_bg_has_trial_cash);
                    default:
                        int i17 = CashBoxTrialCashEntryLayout.f28112e;
                        return (ImageView) cashBoxTrialCashEntryLayout.findViewById(p025ba.e.iv_none_trial_cash);
                }
            }
        });
        View.inflate(context, p025ba.g.core_layout_cashbox_trial_cash_entry, this);
    }
}
