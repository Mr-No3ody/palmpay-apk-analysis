package Ce;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HomeSlideMenuBean;
import com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeMeFragment f1433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SlideMenuListRsp f1434b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(HomeMeFragment homeMeFragment, SlideMenuListRsp slideMenuListRsp, Continuation continuation) {
        super(2, continuation);
        this.f1433a = homeMeFragment;
        this.f1434b = slideMenuListRsp;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new L(this.f1433a, this.f1434b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        List<List<HomeSlideMenuBean>> list;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        HomeMeFragment homeMeFragment = this.f1433a;
        Ke.d dVar = homeMeFragment.f35123C;
        if (dVar != null && (list = this.f1434b.menuList) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                LinearLayout linearLayout = dVar.f5434a;
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                }
                int size = list.size();
                int i7 = 0;
                while (i7 < size) {
                    List<HomeSlideMenuBean> list2 = list.get(i7);
                    Intrinsics.checkNotNullExpressionValue(list2, "get(...)");
                    List<HomeSlideMenuBean> list3 = list2;
                    if (linearLayout != null) {
                        WeakReference weakReference = dVar.f5435b;
                        if (((Activity) weakReference.get()) != null) {
                            Activity activity = (Activity) weakReference.get();
                            Intrinsics.e(activity);
                            View viewInflate = LayoutInflater.from(activity).inflate(Ac.f.main_layout_home_me_menu, (ViewGroup) linearLayout, false);
                            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(Ac.e.fhm_rcv);
                            recyclerView.setLayoutManager(new LinearLayoutManager(activity, 1, false));
                            p354xe.c cVar = new p354xe.c(activity);
                            recyclerView.setAdapter(cVar);
                            cVar.f4985b = list3;
                            cVar.f4986c = new Dg.a(dVar, 25);
                            cVar.notifyDataSetChanged();
                            linearLayout.addView(viewInflate);
                            p220oa.h.k(viewInflate, Integer.valueOf(i7 > 0 ? CommonViewExtKt.getDp(12.0f) : 0), null, null, null, 14);
                        }
                    }
                    i7++;
                }
            }
        }
        if (homeMeFragment.f35130o == null && BaseApplication.isNG()) {
            ViewStub viewStub = (ViewStub) homeMeFragment.f27318b.findViewById(Ac.e.securityStub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            TextView textView = (TextView) homeMeFragment.f27318b.findViewById(Ac.e.tvVersion);
            homeMeFragment.f35130o = textView;
            if (textView != null) {
                textView.setText(homeMeFragment.getString(Ac.h.main_version_s, BaseApplication.get().getVersionName()));
            }
        }
        return Unit.f38893a;
    }
}
