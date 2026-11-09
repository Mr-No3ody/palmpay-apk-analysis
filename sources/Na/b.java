package Na;

import Ad.c0;
import Je.l;
import M3.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.KeyValue;
import com.transsnet.palmpay.core.ui.pop.ChooseItemPopWindow$OnPopItemClickListener;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.BasePopupWindow;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;
import p052da.C1652y;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends BasePopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f6290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f6291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6292c;

    public b(Context context, a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f6290a = C2131j.b(new f(this, 6));
        this.mContext = context;
        this.f6292c = builder;
        View viewInflate = LayoutInflater.from(context).inflate(g.core_choose_item_pop_window, (ViewGroup) null, false);
        this.mContentView = viewInflate;
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-2);
        setFocusable(true);
        initViews();
    }

    public static void a(b bVar) {
        super.dismiss();
    }

    public static void b(a aVar, b bVar, KeyValue keyValue) {
        aVar.f6286a = keyValue.getValue();
        aVar.a().f35831e = keyValue.getValue();
        aVar.a().notifyDataSetChanged();
        ChooseItemPopWindow$OnPopItemClickListener chooseItemPopWindow$OnPopItemClickListener = (ChooseItemPopWindow$OnPopItemClickListener) aVar.f6288c;
        if (chooseItemPopWindow$OnPopItemClickListener != null) {
            chooseItemPopWindow$OnPopItemClickListener.onItemSelect(keyValue);
        }
        super.dismiss();
    }

    public static RecyclerView c(b bVar) {
        View view = bVar.mContentView;
        if (view != null) {
            return (RecyclerView) view.findViewById(e.rcv_choose_list);
        }
        return null;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void initViews() {
        t tVar = this.f6290a;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
        C1548f c1548f = new C1548f(this.mContext.getResources().getColor(L6.b.ppColorDividerLine), SizeUtils.dp2px(0.5f), 0, 0);
        c1548f.f31336e = false;
        c1548f.f31338g = false;
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(c1548f);
        }
        a aVar = this.f6292c;
        if (aVar != null) {
            C1652y c1652y = new C1652y(this.mContext);
            c1652y.f35831e = -1;
            Intrinsics.checkNotNullParameter(c1652y, "<set-?>");
            aVar.f6289d = c1652y;
            RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(aVar.a());
            }
            aVar.a().f4985b = (ArrayList) aVar.f6287b;
            aVar.a().f35831e = aVar.f6286a;
            aVar.a().f4986c = new c0(25, aVar, this);
        }
        this.mContentView.setOnClickListener(new l(this, 26));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void init() {
    }
}
