package com.transsnet.palmpay.core.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.KeyValue;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.ui.widget.TransFilterLayout;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001`B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u001b\u0010&\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001fR\u001b\u0010)\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001bR\u001b\u0010,\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001fR\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u00100R\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\fR\"\u0010;\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u0010\fR\"\u0010?\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00103\u001a\u0004\b=\u00105\"\u0004\b>\u0010\fR\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010O\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010S\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR$\u0010[\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010_\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010J\u001a\u0004\b]\u0010L\"\u0004\b^\u0010N¨\u0006a"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/TransFilterLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "type", "", "setFilterTextWithType", "(I)V", "Lcom/transsnet/palmpay/core/ui/widget/TransFilterLayout$OnSelectListener;", "onSelectListener", "setOnSelectListener", "(Lcom/transsnet/palmpay/core/ui/widget/TransFilterLayout$OnSelectListener;)V", "businessType", "setBusinessType", "", "Lcom/transsnet/palmpay/core/bean/KeyValue;", "getAllStatusByBusiness", "()Ljava/util/List;", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTvFilterActive", "()Landroid/widget/TextView;", "tvFilterActive", "b", "getFlFilter", "()Landroid/widget/FrameLayout;", "flFilter", "c", "getTvFilterAll", "tvFilterAll", "d", "getFlFilterAll", "flFilterAll", "e", "getTvFilterIO", "tvFilterIO", "f", "getFlFilterIO", "flFilterIO", "Landroid/widget/LinearLayout;", "g", "getViewContainer", "()Landroid/widget/LinearLayout;", "viewContainer", "i", "I", "getIOType", "()I", "setIOType", "IOType", "j", "getStatusType", "setStatusType", "statusType", "o", "getCashBoxBillType", "setCashBoxBillType", "cashBoxBillType", "", "p", "Ljava/lang/String;", "getBillType", "()Ljava/lang/String;", "setBillType", "(Ljava/lang/String;)V", "billType", "LNa/b;", "t", "LNa/b;", "getIoPop", "()LNa/b;", "setIoPop", "(LNa/b;)V", "ioPop", "v", "getStatusPop", "setStatusPop", "statusPop", "LNa/d;", "w", "LNa/d;", "getMultiItemPopWindow", "()LNa/d;", "setMultiItemPopWindow", "(LNa/d;)V", "multiItemPopWindow", "A", "getCashBoxPop", "setCashBoxPop", "cashBoxPop", "OnSelectListener", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransFilterLayout extends FrameLayout {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f28161H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    public Na.b cashBoxPop;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public OnSelectListener f28163B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f28164C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28171g;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int IOType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int statusType;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int cashBoxBillType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public String billType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public Na.b ioPop;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Na.b statusPop;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Na.d multiItemPopWindow;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/TransFilterLayout$OnSelectListener;", "", "onSelectStatus", "", "status", "", "onSelectIOType", "type", "onSelectBillType", "districtName", "", "onSelectCashBoxBillType", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnSelectListener {
        void onSelectBillType(@Nullable String districtName);

        void onSelectCashBoxBillType(int type);

        void onSelectIOType(int type);

        void onSelectStatus(int status);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransFilterLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.f28165a = C2131j.b(new Function0(this) { // from class: Oa.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransFilterLayout f6707b;

            {
                this.f6707b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransFilterLayout transFilterLayout = this.f6707b;
                switch (i7) {
                    case 0:
                        int i10 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterActive);
                    case 1:
                        int i11 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilter);
                    case 2:
                        int i12 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterAll);
                    case 3:
                        int i13 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterAll);
                    case 4:
                        int i14 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterIO);
                    case 5:
                        int i15 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterIO);
                    default:
                        int i16 = TransFilterLayout.f28161H;
                        return (LinearLayout) transFilterLayout.findViewById(p025ba.e.viewContainer);
                }
            }
        });
        final int i10 = 1;
        this.f28166b = C2131j.b(new Function0(this) { // from class: Oa.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransFilterLayout f6707b;

            {
                this.f6707b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransFilterLayout transFilterLayout = this.f6707b;
                switch (i10) {
                    case 0:
                        int i11 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterActive);
                    case 1:
                        int i12 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilter);
                    case 2:
                        int i13 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterAll);
                    case 3:
                        int i14 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterAll);
                    case 4:
                        int i15 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterIO);
                    case 5:
                        int i16 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterIO);
                    default:
                        int i17 = TransFilterLayout.f28161H;
                        return (LinearLayout) transFilterLayout.findViewById(p025ba.e.viewContainer);
                }
            }
        });
        final int i11 = 2;
        this.f28167c = C2131j.b(new Function0(this) { // from class: Oa.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransFilterLayout f6707b;

            {
                this.f6707b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransFilterLayout transFilterLayout = this.f6707b;
                switch (i11) {
                    case 0:
                        int i12 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterActive);
                    case 1:
                        int i13 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilter);
                    case 2:
                        int i14 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterAll);
                    case 3:
                        int i15 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterAll);
                    case 4:
                        int i16 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterIO);
                    case 5:
                        int i17 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterIO);
                    default:
                        int i18 = TransFilterLayout.f28161H;
                        return (LinearLayout) transFilterLayout.findViewById(p025ba.e.viewContainer);
                }
            }
        });
        final int i12 = 3;
        this.f28168d = C2131j.b(new Function0(this) { // from class: Oa.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransFilterLayout f6707b;

            {
                this.f6707b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransFilterLayout transFilterLayout = this.f6707b;
                switch (i12) {
                    case 0:
                        int i13 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterActive);
                    case 1:
                        int i14 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilter);
                    case 2:
                        int i15 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterAll);
                    case 3:
                        int i16 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterAll);
                    case 4:
                        int i17 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterIO);
                    case 5:
                        int i18 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterIO);
                    default:
                        int i19 = TransFilterLayout.f28161H;
                        return (LinearLayout) transFilterLayout.findViewById(p025ba.e.viewContainer);
                }
            }
        });
        final int i13 = 4;
        this.f28169e = C2131j.b(new Function0(this) { // from class: Oa.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransFilterLayout f6707b;

            {
                this.f6707b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransFilterLayout transFilterLayout = this.f6707b;
                switch (i13) {
                    case 0:
                        int i14 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterActive);
                    case 1:
                        int i15 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilter);
                    case 2:
                        int i16 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterAll);
                    case 3:
                        int i17 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterAll);
                    case 4:
                        int i18 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterIO);
                    case 5:
                        int i19 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterIO);
                    default:
                        int i110 = TransFilterLayout.f28161H;
                        return (LinearLayout) transFilterLayout.findViewById(p025ba.e.viewContainer);
                }
            }
        });
        final int i14 = 5;
        this.f28170f = C2131j.b(new Function0(this) { // from class: Oa.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransFilterLayout f6707b;

            {
                this.f6707b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransFilterLayout transFilterLayout = this.f6707b;
                switch (i14) {
                    case 0:
                        int i15 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterActive);
                    case 1:
                        int i16 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilter);
                    case 2:
                        int i17 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterAll);
                    case 3:
                        int i18 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterAll);
                    case 4:
                        int i19 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterIO);
                    case 5:
                        int i110 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterIO);
                    default:
                        int i111 = TransFilterLayout.f28161H;
                        return (LinearLayout) transFilterLayout.findViewById(p025ba.e.viewContainer);
                }
            }
        });
        final int i15 = 6;
        this.f28171g = C2131j.b(new Function0(this) { // from class: Oa.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransFilterLayout f6707b;

            {
                this.f6707b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransFilterLayout transFilterLayout = this.f6707b;
                switch (i15) {
                    case 0:
                        int i16 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterActive);
                    case 1:
                        int i17 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilter);
                    case 2:
                        int i18 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterAll);
                    case 3:
                        int i19 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterAll);
                    case 4:
                        int i110 = TransFilterLayout.f28161H;
                        return (TextView) transFilterLayout.findViewById(p025ba.e.tvFilterIO);
                    case 5:
                        int i111 = TransFilterLayout.f28161H;
                        return (FrameLayout) transFilterLayout.findViewById(p025ba.e.flFilterIO);
                    default:
                        int i112 = TransFilterLayout.f28161H;
                        return (LinearLayout) transFilterLayout.findViewById(p025ba.e.viewContainer);
                }
            }
        });
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        addView(((LayoutInflater) systemService).inflate(p025ba.g.core_trans_history_filter, (ViewGroup) this, false));
        TextView tvFilterIO = getTvFilterIO();
        S6.a aVar = S6.a.pay_Arrowdown;
        h(tvFilterIO, aVar, true);
        h(getTvFilterAll(), aVar, true);
        h(getTvFilterActive(), S6.a.pay_Filter, true);
        FrameLayout flFilterAll = getFlFilterAll();
        if (flFilterAll != null) {
            final int i16 = 0;
            flFilterAll.setOnClickListener(new View.OnClickListener(this) { // from class: Oa.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransFilterLayout f6709b;

                {
                    this.f6709b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            TransFilterLayout.b(this.f6709b);
                            break;
                        case 1:
                            TransFilterLayout.c(this.f6709b);
                            break;
                        default:
                            TransFilterLayout.a(this.f6709b);
                            break;
                    }
                }
            });
        }
        final int i17 = 1;
        getFlFilterIO().setOnClickListener(new View.OnClickListener(this) { // from class: Oa.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransFilterLayout f6709b;

            {
                this.f6709b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        TransFilterLayout.b(this.f6709b);
                        break;
                    case 1:
                        TransFilterLayout.c(this.f6709b);
                        break;
                    default:
                        TransFilterLayout.a(this.f6709b);
                        break;
                }
            }
        });
        FrameLayout flFilter = getFlFilter();
        if (flFilter != null) {
            final int i18 = 2;
            flFilter.setOnClickListener(new View.OnClickListener(this) { // from class: Oa.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransFilterLayout f6709b;

                {
                    this.f6709b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            TransFilterLayout.b(this.f6709b);
                            break;
                        case 1:
                            TransFilterLayout.c(this.f6709b);
                            break;
                        default:
                            TransFilterLayout.a(this.f6709b);
                            break;
                    }
                }
            });
        }
        this.billType = "All";
    }

    public static void a(TransFilterLayout transFilterLayout) {
        if (transFilterLayout.multiItemPopWindow == null) {
            Context context = transFilterLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            p279s5.d dVar = new p279s5.d(6, false);
            dVar.f42026c = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
            String select = transFilterLayout.billType;
            Intrinsics.checkNotNullParameter(select, "select");
            dVar.f42026c = select;
            e l5 = new e(transFilterLayout);
            Intrinsics.checkNotNullParameter(l5, "l");
            dVar.f42025b = l5;
            transFilterLayout.multiItemPopWindow = new Na.d(context, dVar);
        }
        Na.d dVar2 = transFilterLayout.multiItemPopWindow;
        if (dVar2 != null) {
            dVar2.f6293a = transFilterLayout.getFlFilter();
        }
        Na.d dVar3 = transFilterLayout.multiItemPopWindow;
        if (dVar3 != null) {
            dVar3.showAsDropDown(transFilterLayout.getViewContainer());
        }
    }

    public static void b(TransFilterLayout transFilterLayout) {
        if (transFilterLayout.statusPop == null) {
            Context context = transFilterLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Na.a aVar = new Na.a(context);
            aVar.b(transFilterLayout.getAllStatusByBusiness());
            aVar.f6286a = transFilterLayout.statusType;
            f l5 = new f(transFilterLayout);
            Intrinsics.checkNotNullParameter(l5, "l");
            aVar.f6288c = l5;
            transFilterLayout.statusPop = new Na.b(context, aVar);
        }
        Na.b bVar = transFilterLayout.statusPop;
        if (bVar != null) {
            bVar.f6291b = transFilterLayout.getFlFilterAll();
        }
        Na.b bVar2 = transFilterLayout.statusPop;
        if (bVar2 != null) {
            bVar2.showAsDropDown(transFilterLayout.getViewContainer());
        }
    }

    public static void c(TransFilterLayout transFilterLayout) {
        if (transFilterLayout.ioPop == null) {
            Context context = transFilterLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Na.a aVar = new Na.a(context);
            String string = transFilterLayout.getResources().getString(k.core_all);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            KeyValue keyValue = new KeyValue(string, 0, false, 4, null);
            String string2 = transFilterLayout.getResources().getString(k.core_money_in);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            KeyValue keyValue2 = new KeyValue(string2, 1, false, 4, null);
            String string3 = transFilterLayout.getResources().getString(k.core_money_out);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            aVar.b(C1850q.e(keyValue, keyValue2, new KeyValue(string3, 2, false, 4, null)));
            aVar.f6286a = transFilterLayout.IOType;
            d l5 = new d(transFilterLayout);
            Intrinsics.checkNotNullParameter(l5, "l");
            aVar.f6288c = l5;
            transFilterLayout.ioPop = new Na.b(context, aVar);
        }
        Na.b bVar = transFilterLayout.ioPop;
        if (bVar != null) {
            bVar.f6291b = transFilterLayout.getFlFilterIO();
        }
        Na.b bVar2 = transFilterLayout.ioPop;
        if (bVar2 != null) {
            bVar2.showAsDropDown(transFilterLayout.getViewContainer());
        }
    }

    private final List<KeyValue> getAllStatusByBusiness() {
        if (this.f28164C == 1) {
            String string = getResources().getString(k.core_all);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            KeyValue keyValue = new KeyValue(string, 0, false, 4, null);
            String string2 = getResources().getString(k.core_successful);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            KeyValue keyValue2 = new KeyValue(string2, 2, false, 4, null);
            String string3 = getResources().getString(k.core_processing);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            KeyValue keyValue3 = new KeyValue(string3, 1, false, 4, null);
            String string4 = getResources().getString(k.core_fail);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return C1850q.e(keyValue, keyValue2, keyValue3, new KeyValue(string4, 3, false, 4, null));
        }
        String string5 = getResources().getString(k.core_all);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        KeyValue keyValue4 = new KeyValue(string5, 0, false, 4, null);
        String string6 = getResources().getString(k.core_successful);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        KeyValue keyValue5 = new KeyValue(string6, 2, false, 4, null);
        String string7 = getResources().getString(k.core_processing);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        KeyValue keyValue6 = new KeyValue(string7, 1, false, 4, null);
        String string8 = getResources().getString(k.core_fail);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        KeyValue keyValue7 = new KeyValue(string8, 3, false, 4, null);
        String string9 = getResources().getString(k.core_cancelled);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        KeyValue keyValue8 = new KeyValue(string9, 6, false, 4, null);
        String string10 = getResources().getString(k.core_refunded);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        return C1850q.e(keyValue4, keyValue5, keyValue6, keyValue7, keyValue8, new KeyValue(string10, 12, false, 4, null));
    }

    private final FrameLayout getFlFilter() {
        Object value = this.f28166b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    private final FrameLayout getFlFilterAll() {
        Object value = this.f28168d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    private final FrameLayout getFlFilterIO() {
        Object value = this.f28170f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvFilterActive() {
        Object value = this.f28165a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvFilterAll() {
        Object value = this.f28167c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvFilterIO() {
        Object value = this.f28169e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final LinearLayout getViewContainer() {
        Object value = this.f28171g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final ArrayList g() {
        String string = getResources().getString(k.core_all);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        KeyValue keyValue = new KeyValue(string, 0, false, 4, null);
        String string2 = getResources().getString(k.core_deposit);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        KeyValue keyValue2 = new KeyValue(string2, 1, false, 4, null);
        String string3 = getResources().getString(k.core_withdraw);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        KeyValue keyValue3 = new KeyValue(string3, 2, false, 4, null);
        String string4 = getResources().getString(k.core_interest);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        KeyValue keyValue4 = new KeyValue(string4, 3, false, 4, null);
        String string5 = getResources().getString(k.core_purchase);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        KeyValue keyValue5 = new KeyValue(string5, 4, false, 4, null);
        String string6 = getResources().getString(k.core_refund);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        return C1850q.e(keyValue, keyValue2, keyValue3, keyValue4, keyValue5, new KeyValue(string6, 5, false, 4, null));
    }

    @NotNull
    public final String getBillType() {
        return this.billType;
    }

    public final int getCashBoxBillType() {
        return this.cashBoxBillType;
    }

    @Nullable
    public final Na.b getCashBoxPop() {
        return this.cashBoxPop;
    }

    public final int getIOType() {
        return this.IOType;
    }

    @Nullable
    public final Na.b getIoPop() {
        return this.ioPop;
    }

    @Nullable
    public final Na.d getMultiItemPopWindow() {
        return this.multiItemPopWindow;
    }

    @Nullable
    public final Na.b getStatusPop() {
        return this.statusPop;
    }

    public final int getStatusType() {
        return this.statusType;
    }

    public final void h(TextView textView, S6.a aVar, boolean z3) {
        textView.setTextColor(z3 ? CommonViewExtKt.colorInt(p.cv_color_858a8f, textView.getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorPrimary, textView.getContext()));
        int iColorInt = z3 ? CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setCompoundDrawables(null, null, G8.a.x(context, aVar, Integer.valueOf(iColorInt), null, 16.0f, 116), null);
    }

    public final void i() {
        if (this.cashBoxPop == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Na.a aVar = new Na.a(context);
            aVar.b(g());
            aVar.f6286a = this.cashBoxBillType;
            b l5 = new b(this);
            Intrinsics.checkNotNullParameter(l5, "l");
            aVar.f6288c = l5;
            this.cashBoxPop = new Na.b(context, aVar);
        }
        Na.b bVar = this.cashBoxPop;
        if (bVar != null) {
            bVar.f6291b = getFlFilterIO();
        }
        Na.b bVar2 = this.cashBoxPop;
        if (bVar2 != null) {
            bVar2.showAsDropDown(getViewContainer());
        }
    }

    public final void j() {
        if (this.ioPop == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Na.a aVar = new Na.a(context);
            String string = getResources().getString(k.core_all);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            aVar.b(C1850q.e(new KeyValue(string, 0, false, 4, null), new KeyValue("Mutual Fund Purchase", 1, false, 4, null), new KeyValue("Mutual Fund Redeem", 2, false, 4, null), new KeyValue("Mutual Fund Auto-Invest", 3, false, 4, null), new KeyValue("Fund Redeem (Withdraw On-hold)", 4, false, 4, null)));
            aVar.f6286a = this.IOType;
            c l5 = new c(this);
            Intrinsics.checkNotNullParameter(l5, "l");
            aVar.f6288c = l5;
            this.ioPop = new Na.b(context, aVar);
        }
        Na.b bVar = this.ioPop;
        if (bVar != null) {
            bVar.f6291b = getFlFilterIO();
        }
        Na.b bVar2 = this.ioPop;
        if (bVar2 != null) {
            bVar2.showAsDropDown(getViewContainer());
        }
    }

    public final void k() {
        if (this.cashBoxPop == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Na.a aVar = new Na.a(context);
            String string = getResources().getString(k.core_all);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            KeyValue keyValue = new KeyValue(string, 0, false, 4, null);
            String string2 = getResources().getString(k.core_deposit);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            KeyValue keyValue2 = new KeyValue(string2, 1, false, 4, null);
            String string3 = getResources().getString(k.core_pay_out);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            aVar.b(C1850q.e(keyValue, keyValue2, new KeyValue(string3, 2, false, 4, null)));
            aVar.f6286a = this.cashBoxBillType;
            g l5 = new g(this);
            Intrinsics.checkNotNullParameter(l5, "l");
            aVar.f6288c = l5;
            this.cashBoxPop = new Na.b(context, aVar);
        }
        Na.b bVar = this.cashBoxPop;
        if (bVar != null) {
            bVar.f6291b = getFlFilterIO();
        }
        Na.b bVar2 = this.cashBoxPop;
        if (bVar2 != null) {
            bVar2.showAsDropDown(getViewContainer());
        }
    }

    public final void setBillType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.billType = str;
    }

    public final void setBusinessType(int businessType) {
        this.f28164C = businessType;
    }

    public final void setCashBoxBillType(int i7) {
        this.cashBoxBillType = i7;
    }

    public final void setCashBoxPop(@Nullable Na.b bVar) {
        this.cashBoxPop = bVar;
    }

    public final void setFilterTextWithType(int type) {
        try {
            getTvFilterActive().setText(((KeyValue) g().get(type)).getKey());
            h(getTvFilterActive(), S6.a.pay_Filter, false);
            this.cashBoxBillType = type;
        } catch (Exception unused) {
        }
    }

    public final void setIOType(int i7) {
        this.IOType = i7;
    }

    public final void setIoPop(@Nullable Na.b bVar) {
        this.ioPop = bVar;
    }

    public final void setMultiItemPopWindow(@Nullable Na.d dVar) {
        this.multiItemPopWindow = dVar;
    }

    public final void setOnSelectListener(@NotNull OnSelectListener onSelectListener) {
        Intrinsics.checkNotNullParameter(onSelectListener, "onSelectListener");
        this.f28163B = onSelectListener;
    }

    public final void setStatusPop(@Nullable Na.b bVar) {
        this.statusPop = bVar;
    }

    public final void setStatusType(int i7) {
        this.statusType = i7;
    }
}
