package Wd;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBySceneRsp;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.BillerListRsp;
import com.transsnet.palmpay.teller.ui.activity.BillerSearchActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0740n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillerSearchActivity f10772b;

    public /* synthetic */ C0740n(BillerSearchActivity billerSearchActivity, int i7) {
        this.f10771a = i7;
        this.f10772b = billerSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList<HomePageMenuData> arrayList;
        List<BillerListItemBean> list;
        BillerSearchActivity billerSearchActivity = this.f10772b;
        switch (this.f10771a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        ArrayList arrayList2 = (ArrayList) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        Xd.l lVar = billerSearchActivity.f34178i;
                        if (lVar != null) {
                            lVar.f4985b = arrayList2;
                        }
                        if (lVar != null) {
                            lVar.notifyDataSetChanged();
                        }
                        BillerSearchActivity.n(billerSearchActivity);
                        billerSearchActivity.q(TextUtils.isEmpty(billerSearchActivity.p()));
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        ArrayList arrayList3 = (ArrayList) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        Xd.z zVar = billerSearchActivity.f34174d;
                        if (zVar != null) {
                            zVar.f4985b = arrayList3;
                        }
                        if (zVar != null) {
                            zVar.notifyDataSetChanged();
                        }
                        BillerSearchActivity.n(billerSearchActivity);
                        billerSearchActivity.q(TextUtils.isEmpty(billerSearchActivity.p()));
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 2:
                if (obj != null) {
                    GetMenuBySceneRsp getMenuBySceneRsp = (GetMenuBySceneRsp) obj;
                    if (getMenuBySceneRsp.isSuccess()) {
                        int i7 = BillerSearchActivity.f34173p;
                        billerSearchActivity.getClass();
                        if (getMenuBySceneRsp.isSuccess() && (arrayList = getMenuBySceneRsp.data) != null && arrayList.size() > 0) {
                            ArrayList arrayList4 = billerSearchActivity.f34175e;
                            Intrinsics.e(arrayList4);
                            arrayList4.clear();
                            arrayList4.addAll(arrayList);
                        }
                        if (!getMenuBySceneRsp.isSuccess()) {
                            p220oa.h.w(billerSearchActivity, getMenuBySceneRsp);
                        }
                    } else {
                        p220oa.h.w(billerSearchActivity, getMenuBySceneRsp);
                    }
                }
                return Unit.f38893a;
            default:
                if (obj != null) {
                    BillerListRsp billerListRsp = (BillerListRsp) obj;
                    if (!billerListRsp.isSuccess() || (list = billerListRsp.data) == null) {
                        p220oa.h.w(billerSearchActivity, billerListRsp);
                    } else {
                        billerSearchActivity.f34177g.clear();
                        billerSearchActivity.f34177g.addAll(list);
                    }
                }
                return Unit.f38893a;
        }
    }
}
