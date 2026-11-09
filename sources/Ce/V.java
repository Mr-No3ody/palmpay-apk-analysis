package Ce;

import Pe.C0551x;
import Pe.C0552y;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.main.export.bean.rsp.ProductData;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.viewmodule.HomeSavingsViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements BaseRecyclerViewAdapter$ItemViewOnClickListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeSavingsUserV2Fragment f1454a;

    public /* synthetic */ V(HomeSavingsUserV2Fragment homeSavingsUserV2Fragment) {
        this.f1454a = homeSavingsUserV2Fragment;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        ProductData data = (ProductData) obj;
        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
        Intrinsics.checkNotNullParameter(data, "data");
        Pa.n0.g().k(new ClickEvent("FinanceTab_Icon_Click").add("element_name", data.name));
        HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1454a;
        try {
            if (!TextUtils.isEmpty(data.androidIndexUrl)) {
                if (data.androidVersion > BaseApplication.get().getVersionCode()) {
                    O6.c cVar = new O6.c(homeSavingsUserV2Fragment.f27319c);
                    cVar.f6596b = O6.d.f("Upgrade Required");
                    cVar.d(p025ba.k.core_upgrade_now, new X(homeSavingsUserV2Fragment, 0));
                    cVar.f6598d = homeSavingsUserV2Fragment.getResources().getString(p025ba.k.core_invest_version_support);
                    cVar.a().show();
                    Unit unit = Unit.f38893a;
                    return;
                }
                Intent intentA = Pa.F.a(homeSavingsUserV2Fragment.f27319c, data.androidIndexUrl);
                if (intentA == null) {
                    return;
                } else {
                    ActivityUtils.startActivity(intentA);
                }
            }
            Unit unit2 = Unit.f38893a;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message != null) {
                F6.d.c("onItemJump", message);
                Unit unit3 = Unit.f38893a;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
        HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1454a;
        ((HomeSavingsViewModel) homeSavingsUserV2Fragment.f27327p).d();
        HomeSavingsViewModel homeSavingsViewModel = (HomeSavingsViewModel) homeSavingsUserV2Fragment.f27327p;
        homeSavingsViewModel.getClass();
        p140j8.f.s(homeSavingsViewModel, new C0552y(1, null), homeSavingsViewModel.f35368i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        HomeSavingsViewModel homeSavingsViewModel2 = (HomeSavingsViewModel) homeSavingsUserV2Fragment.f27327p;
        homeSavingsViewModel2.getClass();
        p140j8.f.s(homeSavingsViewModel2, new C0551x(1, null), homeSavingsViewModel2.f35370o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
