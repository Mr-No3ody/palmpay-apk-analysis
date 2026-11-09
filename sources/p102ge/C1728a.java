package p102ge;

import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.ui.activity.AllFuncationActivityV2;
import com.transsnet.palmpay.ui.viewhandler.MenuModelViewHandler$OnMenuItemClickListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ge.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1728a implements MenuModelViewHandler$OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AllFuncationActivityV2 f37205b;

    public /* synthetic */ C1728a(AllFuncationActivityV2 allFuncationActivityV2, int i7) {
        this.f37204a = i7;
        this.f37205b = allFuncationActivityV2;
    }

    @Override // com.transsnet.palmpay.ui.viewhandler.MenuModelViewHandler$OnMenuItemClickListener
    public final void onMenuItemClick(HomePageMenuData homePageMenuData) {
        AllFuncationActivityV2 allFuncationActivityV2 = this.f37205b;
        switch (this.f37204a) {
            case 0:
                int i7 = AllFuncationActivityV2.f34434e;
                Intrinsics.e(homePageMenuData);
                allFuncationActivityV2.o(homePageMenuData);
                break;
            default:
                int i10 = AllFuncationActivityV2.f34434e;
                Intrinsics.e(homePageMenuData);
                allFuncationActivityV2.o(homePageMenuData);
                break;
        }
    }
}
