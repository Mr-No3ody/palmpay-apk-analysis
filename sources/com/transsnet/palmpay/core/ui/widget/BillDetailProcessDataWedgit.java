package com.transsnet.palmpay.core.ui.widget;

import Nc.x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BillProcessData2;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import com.transsnet.palmpay.core.ui.widget.BillDetailProcessDataWedgit;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p052da.C1638j;
import p052da.C1640l;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u000bR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u001c\u001a\n \r*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\n \r*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010 R#\u0010$\u001a\n \r*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010 R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R2\u0010F\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER2\u0010K\u001a\u0012\u0012\u0004\u0012\u00020G0=j\b\u0012\u0004\u0012\u00020G`?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010A\u001a\u0004\bI\u0010C\"\u0004\bJ\u0010ER*\u0010S\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/BillDetailProcessDataWedgit;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getCwb_arrow_iv", "()Landroid/widget/ImageView;", "cwb_arrow_iv", "Landroid/widget/TextView;", "b", "getCwb_more_tv", "()Landroid/widget/TextView;", "cwb_more_tv", "Landroid/widget/LinearLayout;", "c", "getCwb_more_ll", "()Landroid/widget/LinearLayout;", "cwb_more_ll", "Landroidx/recyclerview/widget/RecyclerView;", "d", "getCwb_process_rcv", "()Landroidx/recyclerview/widget/RecyclerView;", "cwb_process_rcv", "e", "getCwb_title_process_rcv", "cwb_title_process_rcv", "", "f", "Z", "getShowingMore", "()Z", "setShowingMore", "(Z)V", "showingMore", "Lda/j;", "g", "Lda/j;", "getProcessAdapter", "()Lda/j;", "setProcessAdapter", "(Lda/j;)V", "processAdapter", "Lda/l;", "i", "Lda/l;", "getTitleProcessAdapter", "()Lda/l;", "setTitleProcessAdapter", "(Lda/l;)V", "titleProcessAdapter", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/core/bean/BillProcessData2;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "getProcessList", "()Ljava/util/ArrayList;", "setProcessList", "(Ljava/util/ArrayList;)V", "processList", "Lcom/transsnet/palmpay/core/bean/BillProcessTitleData1;", "o", "getTitleList", "setTitleList", "titleList", "value", "p", "I", "getMaxList1Size", "()I", "setMaxList1Size", "(I)V", "maxList1Size", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillDetailProcessDataWedgit extends ConstraintLayout {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean showingMore;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public C1638j processAdapter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public C1640l titleProcessAdapter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public ArrayList processList;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public ArrayList titleList;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int maxList1Size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillDetailProcessDataWedgit(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.f28095a = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i7) {
                    case 0:
                        int i10 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i11 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i12 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i13 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i10 = 1;
        this.f28096b = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i10) {
                    case 0:
                        int i11 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i12 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i13 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i11 = 2;
        this.f28097c = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i11) {
                    case 0:
                        int i12 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i13 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i12 = 3;
        this.f28098d = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i12) {
                    case 0:
                        int i13 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i13 = 4;
        this.f28099e = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i13) {
                    case 0:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        this.maxList1Size = 4;
        d();
    }

    private final ImageView getCwb_arrow_iv() {
        return (ImageView) this.f28095a.getValue();
    }

    private final LinearLayout getCwb_more_ll() {
        return (LinearLayout) this.f28097c.getValue();
    }

    private final TextView getCwb_more_tv() {
        return (TextView) this.f28096b.getValue();
    }

    private final RecyclerView getCwb_process_rcv() {
        return (RecyclerView) this.f28098d.getValue();
    }

    private final RecyclerView getCwb_title_process_rcv() {
        return (RecyclerView) this.f28099e.getValue();
    }

    public final void c(BillProcessDetail billProcessDetail) {
        if (billProcessDetail == null) {
            return;
        }
        if (!BaseApplication.isNG()) {
            setVisibility(8);
            return;
        }
        if (billProcessDetail.fullTips != null) {
            getProcessList().clear();
            getProcessList().addAll(billProcessDetail.fullTips);
            getProcessAdapter().notifyDataSetChanged();
        }
        if (billProcessDetail.tips != null) {
            getTitleList().clear();
            getTitleList().addAll(billProcessDetail.tips);
            int size = this.maxList1Size - getTitleList().size();
            for (int i7 = 0; i7 < size; i7++) {
                getTitleList().add(new BillProcessTitleData1(false, ""));
            }
            getTitleProcessAdapter().notifyDataSetChanged();
        }
        setVisibility(0);
    }

    public final void d() {
        LayoutInflater.from(getContext()).inflate(p025ba.g.core_wedgit_bill_process, (ViewGroup) this, true);
        setProcessList(new ArrayList<>());
        setProcessAdapter(new C1638j(getContext()));
        getProcessAdapter().f4985b = getProcessList();
        getCwb_process_rcv().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        getCwb_process_rcv().setAdapter(getProcessAdapter());
        setTitleList(new ArrayList<>());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        setTitleProcessAdapter(new C1640l(context));
        getTitleProcessAdapter().f4985b = getTitleList();
        getCwb_title_process_rcv().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getCwb_title_process_rcv().setAdapter(getTitleProcessAdapter());
        getCwb_more_tv().setOnClickListener(new x(this, 2));
        setVisibility(8);
    }

    public final void e(boolean z3) {
        this.showingMore = z3;
        if (z3) {
            getCwb_more_tv().setText(getContext().getString(k.core_hide));
            getCwb_process_rcv().getLayoutParams().height = -2;
            getCwb_arrow_iv().setImageDrawable(p059e1.a.h(getContext(), S6.a.pay_ArrowUp, null, CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext()), 16.0f));
        } else {
            getCwb_process_rcv().getLayoutParams().height = SizeUtils.dp2px(100.0f);
            getCwb_more_tv().setText(getContext().getString(k.core_more));
            getCwb_arrow_iv().setImageDrawable(p059e1.a.h(getContext(), S6.a.pay_Arrowdown, null, CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext()), 16.0f));
        }
    }

    public final void f() {
        LinearLayout cwb_more_ll = getCwb_more_ll();
        Intrinsics.checkNotNullExpressionValue(cwb_more_ll, "<get-cwb_more_ll>(...)");
        h.s(cwb_more_ll, false);
    }

    public final int getMaxList1Size() {
        return this.maxList1Size;
    }

    @NotNull
    public final C1638j getProcessAdapter() {
        C1638j c1638j = this.processAdapter;
        if (c1638j != null) {
            return c1638j;
        }
        Intrinsics.n("processAdapter");
        throw null;
    }

    @NotNull
    public final ArrayList<BillProcessData2> getProcessList() {
        ArrayList<BillProcessData2> arrayList = this.processList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.n("processList");
        throw null;
    }

    public final boolean getShowingMore() {
        return this.showingMore;
    }

    @NotNull
    public final ArrayList<BillProcessTitleData1> getTitleList() {
        ArrayList<BillProcessTitleData1> arrayList = this.titleList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.n("titleList");
        throw null;
    }

    @NotNull
    public final C1640l getTitleProcessAdapter() {
        C1640l c1640l = this.titleProcessAdapter;
        if (c1640l != null) {
            return c1640l;
        }
        Intrinsics.n("titleProcessAdapter");
        throw null;
    }

    public final void setMaxList1Size(int i7) {
        this.maxList1Size = i7;
    }

    public final void setProcessAdapter(@NotNull C1638j c1638j) {
        Intrinsics.checkNotNullParameter(c1638j, "<set-?>");
        this.processAdapter = c1638j;
    }

    public final void setProcessList(@NotNull ArrayList<BillProcessData2> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.processList = arrayList;
    }

    public final void setShowingMore(boolean z3) {
        this.showingMore = z3;
    }

    public final void setTitleList(@NotNull ArrayList<BillProcessTitleData1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.titleList = arrayList;
    }

    public final void setTitleProcessAdapter(@NotNull C1640l c1640l) {
        Intrinsics.checkNotNullParameter(c1640l, "<set-?>");
        this.titleProcessAdapter = c1640l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillDetailProcessDataWedgit(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28095a = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i10) {
                    case 0:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i11 = 1;
        this.f28096b = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i11) {
                    case 0:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i12 = 2;
        this.f28097c = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i12) {
                    case 0:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i13 = 3;
        this.f28098d = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i13) {
                    case 0:
                        int i14 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i14 = 4;
        this.f28099e = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i14) {
                    case 0:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i19 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        this.maxList1Size = 4;
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillDetailProcessDataWedgit(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.f28095a = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i7) {
                    case 0:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i19 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i10 = 1;
        this.f28096b = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i10) {
                    case 0:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i19 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i11 = 2;
        this.f28097c = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i11) {
                    case 0:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i19 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i12 = 3;
        this.f28098d = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i12) {
                    case 0:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i19 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        final int i13 = 4;
        this.f28099e = C2131j.b(new Function0(this) { // from class: Oa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillDetailProcessDataWedgit f6684b;

            {
                this.f6684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillDetailProcessDataWedgit billDetailProcessDataWedgit = this.f6684b;
                switch (i13) {
                    case 0:
                        int i15 = BillDetailProcessDataWedgit.t;
                        return (ImageView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_arrow_iv);
                    case 1:
                        int i16 = BillDetailProcessDataWedgit.t;
                        return (TextView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_tv);
                    case 2:
                        int i17 = BillDetailProcessDataWedgit.t;
                        return (LinearLayout) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_more_ll);
                    case 3:
                        int i18 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_process_rcv);
                    default:
                        int i19 = BillDetailProcessDataWedgit.t;
                        return (RecyclerView) billDetailProcessDataWedgit.findViewById(p025ba.e.cwb_title_process_rcv);
                }
            }
        });
        this.maxList1Size = 4;
        d();
    }
}
