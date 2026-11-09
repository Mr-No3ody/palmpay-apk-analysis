package Ge;

import Ce.ViewOnClickListenerC0159a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.BasePopupWindow;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p052da.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends BasePopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f3396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f3397b;

    public f(Context context, e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.mContext = context;
        this.f3397b = builder;
        View viewInflate = LayoutInflater.from(context).inflate(Ac.f.main_choose_item_pop_window, (ViewGroup) null, false);
        this.mContentView = viewInflate;
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-2);
        setFocusable(true);
        initViews();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void initViews() {
        RecyclerView recyclerView = (RecyclerView) this.mContentView.findViewById(Ac.e.rvChooseList);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, this.mContext), SizeUtils.dp2px(0.5f), 0, 0);
        c1548f.f31336e = false;
        c1548f.f31338g = false;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(c1548f);
        }
        e eVar = this.f3397b;
        if (eVar != null) {
            c0 c0Var = new c0(p025ba.g.core_item_history_status_choose, null);
            if (recyclerView != null) {
                recyclerView.setAdapter(c0Var);
            }
            ArrayList<TransactionFilterResp.FilterBean> arrayList = eVar.f3394b;
            for (TransactionFilterResp.FilterBean filterBean : arrayList) {
                if (Intrinsics.c(filterBean.getCode(), eVar.f3395c)) {
                    filterBean.setSelected(true);
                }
            }
            c0Var.setList(arrayList);
            c0Var.setOnItemClickListener(new defpackage.a(c0Var, 2, eVar, this));
        }
        this.mContentView.setOnClickListener(new ViewOnClickListenerC0159a(this, 27));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void init() {
    }
}
