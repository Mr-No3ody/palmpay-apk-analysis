package Pe;

import Pa.C0525w;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.main.export.bean.rsp.QueryModuleRankResp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.B f7253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PalmZoneViewModel f7255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(PalmZoneViewModel palmZoneViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7255c = palmZoneViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h0(this.f7255c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.B b7;
        Object obj2;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7254b;
        PalmZoneViewModel palmZoneViewModel = this.f7255c;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                String strI = p059e1.a.I("rewards_sp_home_reward_tab_config_v2", "[{\"moduleName\":\"pointsCoupon\",\"moduleEnable\":true},{\"moduleName\":\"rewardsHub\",\"moduleEnable\":true},{\"moduleName\":\"task\",\"moduleEnable\":true},{\"moduleName\":\"referEarn\",\"moduleEnable\":true},{\"moduleName\":\"palmPrize\",\"moduleEnable\":true},{\"moduleName\":\"adBanner\",\"moduleEnable\":true},{\"moduleName\":\"bannerBottom\",\"moduleEnable\":true}]");
                kotlin.jvm.internal.B b10 = new kotlin.jvm.internal.B();
                if (!TextUtils.isEmpty(strI)) {
                    List list = (List) ((Gson) C0525w.f().f7166b).fromJson(strI, new TypeToken<ArrayList<QueryModuleRankResp>>() { // from class: com.transsnet.palmpay.viewmodule.PalmZoneViewModel$queryModuleConfig$1$1
                    }.getType());
                    if (list != null) {
                        palmZoneViewModel.f35391g.i(list);
                        b10.f38947a = true;
                    }
                }
                IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
                this.f7253a = b10;
                this.f7254b = 1;
                obj = iApiMainService.queryModuleRank(this);
                if (obj == aVar) {
                    return aVar;
                }
                b7 = b10;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b7 = this.f7253a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonListResultV2 commonListResultV2 = (CommonListResultV2) obj;
            if (commonListResultV2.isSuccess() && (obj2 = commonListResultV2.data) != null) {
                if (!b7.f38947a) {
                    palmZoneViewModel.f35391g.i(obj2);
                }
                String json = ((Gson) C0525w.f().f7166b).toJson(obj2);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                p059e1.a.W("rewards_sp_home_reward_tab_config_v2", json);
            }
        } catch (Exception e10) {
            F6.d.c("PalmZoneViewModel", "queryModuleConfig: ", e10);
        }
        return Unit.f38893a;
    }
}
