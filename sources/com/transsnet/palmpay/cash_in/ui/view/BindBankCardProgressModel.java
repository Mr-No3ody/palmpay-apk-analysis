package com.transsnet.palmpay.cash_in.ui.view;

import G9.j;
import I9.b;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.cash_in.ui.view.BindBankCardProgressModel;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/view/BindBankCardProgressModel;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTv_progress_tip", "()Landroid/widget/TextView;", "tv_progress_tip", "Landroidx/recyclerview/widget/RecyclerView;", "b", "getRv_progress", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_progress", "LI9/b;", "c", "getAdapter", "()LI9/b;", "adapter", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindBankCardProgressModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindBankCardProgressModel.kt\ncom/transsnet/palmpay/cash_in/ui/view/BindBankCardProgressModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1869#2,2:108\n*S KotlinDebug\n*F\n+ 1 BindBankCardProgressModel.kt\ncom/transsnet/palmpay/cash_in/ui/view/BindBankCardProgressModel\n*L\n55#1:108,2\n*E\n"})
public final class BindBankCardProgressModel extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27070d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f27071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f27072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f27073c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BindBankCardProgressModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final b getAdapter() {
        return (b) this.f27073c.getValue();
    }

    private final RecyclerView getRv_progress() {
        return (RecyclerView) this.f27072b.getValue();
    }

    private final TextView getTv_progress_tip() {
        return (TextView) this.f27071a.getValue();
    }

    public final void a(int i7, List list) {
        getAdapter().setList(list);
        if (i7 != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BillProcessTitleData1 billProcessTitleData1 = (BillProcessTitleData1) it.next();
                if (billProcessTitleData1.selected && !TextUtils.isEmpty(billProcessTitleData1.tips)) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BindBankCardProgressModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BindBankCardProgressModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BindBankCardProgressModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f27071a = C2131j.b(new Function0(this) { // from class: I9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardProgressModel f4274b;

            {
                this.f4274b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardProgressModel bindBankCardProgressModel = this.f4274b;
                switch (i10) {
                    case 0:
                        int i11 = BindBankCardProgressModel.f27070d;
                        return (TextView) bindBankCardProgressModel.findViewById(p366y9.b.tv_progress_tip);
                    default:
                        int i12 = BindBankCardProgressModel.f27070d;
                        return (RecyclerView) bindBankCardProgressModel.findViewById(p366y9.b.rv_progress);
                }
            }
        });
        final int i11 = 1;
        this.f27072b = C2131j.b(new Function0(this) { // from class: I9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardProgressModel f4274b;

            {
                this.f4274b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardProgressModel bindBankCardProgressModel = this.f4274b;
                switch (i11) {
                    case 0:
                        int i12 = BindBankCardProgressModel.f27070d;
                        return (TextView) bindBankCardProgressModel.findViewById(p366y9.b.tv_progress_tip);
                    default:
                        int i13 = BindBankCardProgressModel.f27070d;
                        return (RecyclerView) bindBankCardProgressModel.findViewById(p366y9.b.rv_progress);
                }
            }
        });
        this.f27073c = C2131j.b(new j(14));
        View.inflate(context, c.ci_layout_transfer_progress, this);
        setOrientation(1);
        setBackgroundResource(L6.b.ppColorBackgroundLight);
        setGravity(1);
        RecyclerView rv_progress = getRv_progress();
        if (rv_progress != null) {
            rv_progress.setAdapter(getAdapter());
        }
        RecyclerView rv_progress2 = getRv_progress();
        if (rv_progress2 != null) {
            rv_progress2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }
}
