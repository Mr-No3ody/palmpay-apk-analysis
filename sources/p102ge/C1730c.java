package p102ge;

import Ef.a;
import Ff.h;
import android.widget.LinearLayout;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.ui.activity.AllFuncationActivityV2;
import com.transsnet.palmpay.util.RecentMenuCache;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: ge.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1730c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AllFuncationActivityV2 f37208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730c(AllFuncationActivityV2 allFuncationActivityV2, Continuation continuation) {
        super(2, continuation);
        this.f37208a = allFuncationActivityV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1730c(this.f37208a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1730c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        int i7 = AllFuncationActivityV2.f34434e;
        AllFuncationActivityV2 allFuncationActivityV2 = this.f37208a;
        if (!allFuncationActivityV2.n().isEmpty()) {
            LinearLayout linearLayout = allFuncationActivityV2.f34436b;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            allFuncationActivityV2.f34437c = null;
            allFuncationActivityV2.f34438d = null;
            RecentMenuCache recentMenuCache = RecentMenuCache.INSTANCE;
            List<HomePageMenuData> listResolveRecentMenus = recentMenuCache.resolveRecentMenus(recentMenuCache.pruneInvalidMenus(allFuncationActivityV2.n()), allFuncationActivityV2.n());
            if (!listResolveRecentMenus.isEmpty()) {
                allFuncationActivityV2.m(new ArrayList(listResolveRecentMenus));
            }
            ArrayList arrayList = new ArrayList();
            int size = allFuncationActivityV2.n().size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = allFuncationActivityV2.n().get(i10);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                HomePageMenuData homePageMenuData = (HomePageMenuData) obj2;
                arrayList.add(homePageMenuData);
                if (i10 == allFuncationActivityV2.n().size() - 1) {
                    allFuncationActivityV2.l(homePageMenuData.menuGroupName, arrayList);
                } else {
                    Object obj3 = allFuncationActivityV2.n().get(i10 + 1);
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    if (((HomePageMenuData) obj3).type != homePageMenuData.type) {
                        allFuncationActivityV2.l(homePageMenuData.menuGroupName, arrayList);
                        arrayList = new ArrayList();
                    }
                }
            }
        }
        return Unit.f38893a;
    }
}
