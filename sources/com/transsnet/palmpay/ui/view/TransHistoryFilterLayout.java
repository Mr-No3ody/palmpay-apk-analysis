package com.transsnet.palmpay.ui.view;

import Ac.f;
import Ge.d;
import Ge.e;
import He.x;
import L6.b;
import Pa.r0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.view.TransHistoryFilterLayout;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00025\u001eB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012JU\u0010\u0016\u001a\u00020\f2F\u0010\u0015\u001aB\u0012\u0004\u0012\u00020\t\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0018\u00010\u0013j \u0012\u0004\u0012\u00020\t\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010\"\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010%\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R#\u0010)\u001a\n \u001d*\u0004\u0018\u00010\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010(R#\u0010,\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R#\u0010/\u001a\n \u001d*\u0004\u0018\u00010\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010(R#\u00104\u001a\n \u001d*\u0004\u0018\u000100008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/transsnet/palmpay/ui/view/TransHistoryFilterLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "selectedFilterName", "", "setFilterName", "(Ljava/util/ArrayList;)V", "Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setData", "(Lcom/transsnet/palmpay/core/bean/rsp/TransactionFilterResp;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "selectedFilters", "setSelectedFilters", "(Ljava/util/HashMap;)V", "Lcom/transsnet/palmpay/ui/view/TransHistoryFilterLayout$OnSelectListener;", "onSelectListener", "setOnSelectListener", "(Lcom/transsnet/palmpay/ui/view/TransHistoryFilterLayout$OnSelectListener;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTvFilterIO", "()Landroid/widget/TextView;", "tvFilterIO", "b", "getTvFilterAll", "tvFilterAll", "c", "getFlFilterAll", "()Landroid/widget/FrameLayout;", "flFilterAll", "d", "getTvFilterActive", "tvFilterActive", "e", "getFlFilter", "flFilter", "Landroid/widget/LinearLayout;", "f", "getViewContainer", "()Landroid/widget/LinearLayout;", "viewContainer", "OnSelectListener", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransHistoryFilterLayout extends FrameLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f35338p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f35339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f35340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f35341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f35342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f35343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f35344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TransactionFilterResp f35345g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnSelectListener f35347j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f35348o;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&JP\u0010\u0006\u001a\u00020\u00032F\u0010\u0007\u001aB\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\n\u0018\u00010\bj \u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\n\u0018\u0001`\u000bH&¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/ui/view/TransHistoryFilterLayout$OnSelectListener;", "", "onSelectStatus", "", "status", "", "onSelectBillType", "selectedFilters", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnSelectListener {
        void onSelectBillType(@Nullable HashMap<String, ArrayList<String>> selectedFilters);

        void onSelectStatus(@Nullable String status);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransHistoryFilterLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.f35339a = C2131j.b(new Function0(this) { // from class: He.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransHistoryFilterLayout f3918b;

            {
                this.f3918b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransHistoryFilterLayout transHistoryFilterLayout = this.f3918b;
                switch (i7) {
                    case 0:
                        int i10 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterIO);
                    case 1:
                        int i11 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterAll);
                    case 2:
                        int i12 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilterAll);
                    case 3:
                        int i13 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterActive);
                    case 4:
                        int i14 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilter);
                    default:
                        int i15 = TransHistoryFilterLayout.f35338p;
                        return (LinearLayout) transHistoryFilterLayout.findViewById(Ac.e.viewContainer);
                }
            }
        });
        final int i10 = 1;
        this.f35340b = C2131j.b(new Function0(this) { // from class: He.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransHistoryFilterLayout f3918b;

            {
                this.f3918b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransHistoryFilterLayout transHistoryFilterLayout = this.f3918b;
                switch (i10) {
                    case 0:
                        int i11 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterIO);
                    case 1:
                        int i12 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterAll);
                    case 2:
                        int i13 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilterAll);
                    case 3:
                        int i14 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterActive);
                    case 4:
                        int i15 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilter);
                    default:
                        int i16 = TransHistoryFilterLayout.f35338p;
                        return (LinearLayout) transHistoryFilterLayout.findViewById(Ac.e.viewContainer);
                }
            }
        });
        final int i11 = 2;
        this.f35341c = C2131j.b(new Function0(this) { // from class: He.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransHistoryFilterLayout f3918b;

            {
                this.f3918b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransHistoryFilterLayout transHistoryFilterLayout = this.f3918b;
                switch (i11) {
                    case 0:
                        int i12 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterIO);
                    case 1:
                        int i13 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterAll);
                    case 2:
                        int i14 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilterAll);
                    case 3:
                        int i15 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterActive);
                    case 4:
                        int i16 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilter);
                    default:
                        int i17 = TransHistoryFilterLayout.f35338p;
                        return (LinearLayout) transHistoryFilterLayout.findViewById(Ac.e.viewContainer);
                }
            }
        });
        final int i12 = 3;
        this.f35342d = C2131j.b(new Function0(this) { // from class: He.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransHistoryFilterLayout f3918b;

            {
                this.f3918b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransHistoryFilterLayout transHistoryFilterLayout = this.f3918b;
                switch (i12) {
                    case 0:
                        int i13 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterIO);
                    case 1:
                        int i14 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterAll);
                    case 2:
                        int i15 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilterAll);
                    case 3:
                        int i16 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterActive);
                    case 4:
                        int i17 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilter);
                    default:
                        int i18 = TransHistoryFilterLayout.f35338p;
                        return (LinearLayout) transHistoryFilterLayout.findViewById(Ac.e.viewContainer);
                }
            }
        });
        final int i13 = 4;
        this.f35343e = C2131j.b(new Function0(this) { // from class: He.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransHistoryFilterLayout f3918b;

            {
                this.f3918b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransHistoryFilterLayout transHistoryFilterLayout = this.f3918b;
                switch (i13) {
                    case 0:
                        int i14 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterIO);
                    case 1:
                        int i15 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterAll);
                    case 2:
                        int i16 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilterAll);
                    case 3:
                        int i17 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterActive);
                    case 4:
                        int i18 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilter);
                    default:
                        int i19 = TransHistoryFilterLayout.f35338p;
                        return (LinearLayout) transHistoryFilterLayout.findViewById(Ac.e.viewContainer);
                }
            }
        });
        final int i14 = 5;
        this.f35344f = C2131j.b(new Function0(this) { // from class: He.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransHistoryFilterLayout f3918b;

            {
                this.f3918b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransHistoryFilterLayout transHistoryFilterLayout = this.f3918b;
                switch (i14) {
                    case 0:
                        int i15 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterIO);
                    case 1:
                        int i16 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterAll);
                    case 2:
                        int i17 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilterAll);
                    case 3:
                        int i18 = TransHistoryFilterLayout.f35338p;
                        return (TextView) transHistoryFilterLayout.findViewById(Ac.e.tvFilterActive);
                    case 4:
                        int i19 = TransHistoryFilterLayout.f35338p;
                        return (FrameLayout) transHistoryFilterLayout.findViewById(Ac.e.flFilter);
                    default:
                        int i110 = TransHistoryFilterLayout.f35338p;
                        return (LinearLayout) transHistoryFilterLayout.findViewById(Ac.e.viewContainer);
                }
            }
        });
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        addView(((LayoutInflater) systemService).inflate(f.main_trans_histroy_filter, (ViewGroup) this, false));
        int iColorInt = CommonViewExtKt.colorInt(b.ppColorTextNormal, context);
        TextView tvFilterIO = getTvFilterIO();
        S6.a aVar = S6.a.pay_Arrowdown;
        tvFilterIO.setCompoundDrawables(null, null, G8.a.x(context, aVar, Integer.valueOf(iColorInt), null, 16.0f, 116), null);
        getTvFilterAll().setCompoundDrawables(null, null, G8.a.x(context, aVar, Integer.valueOf(iColorInt), null, 16.0f, 116), null);
        getTvFilterActive().setCompoundDrawables(null, null, G8.a.x(context, S6.a.pay_Filter, Integer.valueOf(iColorInt), null, 16.0f, 116), null);
        FrameLayout flFilterAll = getFlFilterAll();
        if (flFilterAll != null) {
            final int i15 = 0;
            flFilterAll.setOnClickListener(new View.OnClickListener(this) { // from class: He.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransHistoryFilterLayout f3920b;

                {
                    this.f3920b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            TransHistoryFilterLayout.a(this.f3920b);
                            break;
                        default:
                            TransHistoryFilterLayout.b(this.f3920b);
                            break;
                    }
                }
            });
        }
        FrameLayout flFilter = getFlFilter();
        if (flFilter != null) {
            final int i16 = 1;
            flFilter.setOnClickListener(new View.OnClickListener(this) { // from class: He.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransHistoryFilterLayout f3920b;

                {
                    this.f3920b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            TransHistoryFilterLayout.a(this.f3920b);
                            break;
                        default:
                            TransHistoryFilterLayout.b(this.f3920b);
                            break;
                    }
                }
            });
        }
    }

    public static void a(TransHistoryFilterLayout transHistoryFilterLayout) {
        if (r0.U0()) {
            return;
        }
        TransactionFilterResp transactionFilterResp = transHistoryFilterLayout.f35345g;
        ArrayList<TransactionFilterResp.FilterBean> status = transactionFilterResp != null ? transactionFilterResp.getStatus() : null;
        if (status == null || status.isEmpty()) {
            return;
        }
        TransactionFilterResp transactionFilterResp2 = transHistoryFilterLayout.f35345g;
        ArrayList<TransactionFilterResp.FilterBean> status2 = transactionFilterResp2 != null ? transactionFilterResp2.getStatus() : null;
        Intrinsics.e(status2);
        ArrayList<TransactionFilterResp.FilterBean> datas = status2.get(0).getChildTypeParam();
        if (datas != null) {
            Context context = transHistoryFilterLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            e eVar = new e();
            eVar.f3394b = new ArrayList();
            Intrinsics.checkNotNullParameter(datas, "datas");
            ArrayList arrayList = eVar.f3394b;
            arrayList.clear();
            arrayList.addAll(datas);
            eVar.f3395c = transHistoryFilterLayout.f35346i;
            x l5 = new x(transHistoryFilterLayout);
            Intrinsics.checkNotNullParameter(l5, "l");
            eVar.f3393a = l5;
            Ge.f fVar = new Ge.f(context, eVar);
            fVar.f3396a = transHistoryFilterLayout.getFlFilterAll();
            fVar.showAsDropDown(transHistoryFilterLayout.getViewContainer());
        }
    }

    public static void b(TransHistoryFilterLayout transHistoryFilterLayout) {
        if (r0.U0()) {
            return;
        }
        Context context = transHistoryFilterLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        top.zibin.luban.io.a aVar = new top.zibin.luban.io.a(8, false);
        aVar.f42647d = new HashMap();
        aVar.f42646c = transHistoryFilterLayout.f35345g;
        HashMap map = transHistoryFilterLayout.f35348o;
        if (map != null) {
            aVar.f42647d = map;
        }
        x l5 = new x(transHistoryFilterLayout);
        Intrinsics.checkNotNullParameter(l5, "l");
        aVar.f42645b = l5;
        d dVar = new d(context, aVar);
        dVar.f3386a = transHistoryFilterLayout.getFlFilter();
        dVar.showAsDropDown(transHistoryFilterLayout.getViewContainer());
    }

    public static void c(TransHistoryFilterLayout transHistoryFilterLayout, TransactionFilterResp.FilterBean selectedStatus) {
        Intrinsics.checkNotNullParameter(selectedStatus, "selectedStatus");
        transHistoryFilterLayout.getTvFilterAll().setText(selectedStatus.getName());
        String code = selectedStatus.getCode();
        transHistoryFilterLayout.f35346i = code;
        OnSelectListener onSelectListener = transHistoryFilterLayout.f35347j;
        if (onSelectListener != null) {
            onSelectListener.onSelectStatus(code);
        }
    }

    private final FrameLayout getFlFilter() {
        return (FrameLayout) this.f35343e.getValue();
    }

    private final FrameLayout getFlFilterAll() {
        return (FrameLayout) this.f35341c.getValue();
    }

    private final TextView getTvFilterActive() {
        return (TextView) this.f35342d.getValue();
    }

    private final TextView getTvFilterAll() {
        return (TextView) this.f35340b.getValue();
    }

    private final TextView getTvFilterIO() {
        return (TextView) this.f35339a.getValue();
    }

    private final LinearLayout getViewContainer() {
        return (LinearLayout) this.f35344f.getValue();
    }

    public final void setData(@Nullable TransactionFilterResp data) {
        this.f35345g = data;
    }

    public final void setFilterName(@NotNull ArrayList<String> selectedFilterName) {
        Intrinsics.checkNotNullParameter(selectedFilterName, "selectedFilterName");
        getTvFilterActive().setText(CollectionsKt.J(selectedFilterName, ",", null, null, null, 62));
    }

    public final void setOnSelectListener(@NotNull OnSelectListener onSelectListener) {
        Intrinsics.checkNotNullParameter(onSelectListener, "onSelectListener");
        this.f35347j = onSelectListener;
    }

    public final void setSelectedFilters(@Nullable HashMap<String, ArrayList<String>> selectedFilters) {
        this.f35348o = selectedFilters;
    }
}
