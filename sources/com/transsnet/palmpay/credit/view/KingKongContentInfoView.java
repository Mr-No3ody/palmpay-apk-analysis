package com.transsnet.palmpay.credit.view;

import Ae.j;
import Gb.C0291n;
import Gb.C0292o;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/view/KingKongContentInfoView;", "Lcom/transsnet/palmpay/credit/view/BaseLoanView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Lkotlin/Lazy;", "getRvInfoList", "()Landroidx/recyclerview/widget/RecyclerView;", "rvInfoList", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KingKongContentInfoView extends BaseLoanView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30791b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30792a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingKongContentInfoView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30792a = C2131j.b(new j(this, 14));
        View.inflate(context, f.cs_cl_king_kong_view, this);
        RecyclerView rvInfoList = getRvInfoList();
        if (rvInfoList != null) {
            rvInfoList.setLayoutManager(new GridLayoutManager(context, 2));
        }
        RecyclerView rvInfoList2 = getRvInfoList();
        if (rvInfoList2 != null) {
            rvInfoList2.addItemDecoration(new C0292o(this));
        }
        RecyclerView rvInfoList3 = getRvInfoList();
        if (rvInfoList3 != null) {
            rvInfoList3.setAdapter(new C0291n(this));
        }
    }

    private final RecyclerView getRvInfoList() {
        return (RecyclerView) this.f30792a.getValue();
    }

    public final void e(List list) {
        if (list == null) {
            setVisibility(8);
            return;
        }
        setVisibility(!list.isEmpty() ? 0 : 8);
        RecyclerView rvInfoList = getRvInfoList();
        RecyclerView.Adapter adapter = rvInfoList != null ? rvInfoList.getAdapter() : null;
        Intrinsics.f(adapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.KingKongContentInfoAdapter");
        ((C0291n) adapter).setList(list);
    }
}
