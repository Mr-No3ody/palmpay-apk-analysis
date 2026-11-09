package He;

import Bc.D;
import N8.q0;
import Wf.AbstractC0780y;
import Wf.t0;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsRewardNoticeBean;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsRewardNoticeItemBean;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f3900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumBenefits f3901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CommonResult commonResult, Continuation continuation, ModelPremiumBenefits modelPremiumBenefits) {
        super(2, continuation);
        this.f3900a = commonResult;
        this.f3901b = modelPremiumBenefits;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f3900a, continuation, this.f3901b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        T t;
        D d2;
        D d10;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f3900a;
        ModelPremiumBenefits modelPremiumBenefits = this.f3901b;
        if (commonBeanResult == null || !commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
            D d11 = modelPremiumBenefits.f35306d;
            if (d11 != null) {
                p220oa.h.s((ModelPremiumScrollNotice) d11.f614A, false);
            }
            D d12 = modelPremiumBenefits.f35306d;
            if (d12 != null) {
                p220oa.h.s(d12.f620f, true);
            }
            D d13 = modelPremiumBenefits.f35306d;
            if (d13 != null) {
                d13.f620f.setText(modelPremiumBenefits.getContext().getString(p025ba.k.core_more));
            }
        } else {
            List<PremiumBenefitsRewardNoticeItemBean> newList = ((PremiumBenefitsRewardNoticeBean) t).benefitClaimVOList;
            if (newList != null) {
                Unit unit = null;
                unit = null;
                if (newList.isEmpty()) {
                    newList = null;
                }
                if (newList == null) {
                    d2 = modelPremiumBenefits.f35306d;
                    if (d2 != null) {
                        p220oa.h.s((ModelPremiumScrollNotice) d2.f614A, false);
                    }
                    d10 = modelPremiumBenefits.f35306d;
                    if (d10 != null) {
                        p220oa.h.s(d10.f620f, true);
                    }
                    if (d10 != null) {
                        d10.f620f.setText(modelPremiumBenefits.getContext().getString(p025ba.k.core_more));
                    }
                } else {
                    if (newList.size() > 1) {
                        D d14 = modelPremiumBenefits.f35306d;
                        if (d14 != null) {
                            p220oa.h.s((ModelPremiumScrollNotice) d14.f614A, true);
                        }
                        D d15 = modelPremiumBenefits.f35306d;
                        if (d15 != null) {
                            p220oa.h.s(d15.f620f, false);
                        }
                        D d16 = modelPremiumBenefits.f35306d;
                        if (d16 != null) {
                            ModelPremiumScrollNotice modelPremiumScrollNotice = (ModelPremiumScrollNotice) d16.f614A;
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            ArrayList arrayList = modelPremiumScrollNotice.f35314d;
                            arrayList.clear();
                            arrayList.addAll(newList);
                            arrayList.add(CollectionsKt.F(newList));
                            RecyclerView.Adapter adapter = modelPremiumScrollNotice.getAdapter();
                            if (adapter != null) {
                                adapter.notifyDataSetChanged();
                            }
                            modelPremiumScrollNotice.f35315e = 0;
                            if (arrayList.size() > 1) {
                                t0 t0Var = modelPremiumScrollNotice.f35313c;
                                if (t0Var != null) {
                                    t0Var.cancel((CancellationException) null);
                                }
                                modelPremiumScrollNotice.f35313c = null;
                                ModelPremiumBenefits modelPremiumBenefits2 = modelPremiumScrollNotice.f35312b;
                                modelPremiumScrollNotice.f35313c = modelPremiumBenefits2 != null ? AbstractC0780y.m(V.f(modelPremiumBenefits2), null, null, new u(modelPremiumScrollNotice, null), 3) : null;
                            }
                            unit = Unit.f38893a;
                        }
                    } else {
                        D d17 = modelPremiumBenefits.f35306d;
                        if (d17 != null) {
                            p220oa.h.s((ModelPremiumScrollNotice) d17.f614A, false);
                        }
                        D d18 = modelPremiumBenefits.f35306d;
                        if (d18 != null) {
                            p220oa.h.s(d18.f620f, true);
                        }
                        String str = newList.get(0).preClaimContent;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = newList.get(0).lastClaimContent;
                        String strY = q0.y(str, " ", str2 != null ? str2 : "");
                        D d19 = modelPremiumBenefits.f35306d;
                        if (d19 != null) {
                            d19.f620f.setText(strY);
                            unit = Unit.f38893a;
                        }
                    }
                    if (unit == null) {
                        d2 = modelPremiumBenefits.f35306d;
                        if (d2 != null) {
                            p220oa.h.s((ModelPremiumScrollNotice) d2.f614A, false);
                        }
                        d10 = modelPremiumBenefits.f35306d;
                        if (d10 != null) {
                            p220oa.h.s(d10.f620f, true);
                        }
                        if (d10 != null) {
                            d10.f620f.setText(modelPremiumBenefits.getContext().getString(p025ba.k.core_more));
                        }
                    }
                }
            } else {
                d2 = modelPremiumBenefits.f35306d;
                if (d2 != null) {
                    p220oa.h.s((ModelPremiumScrollNotice) d2.f614A, false);
                }
                d10 = modelPremiumBenefits.f35306d;
                if (d10 != null) {
                    p220oa.h.s(d10.f620f, true);
                }
                if (d10 != null) {
                    d10.f620f.setText(modelPremiumBenefits.getContext().getString(p025ba.k.core_more));
                }
            }
        }
        return Unit.f38893a;
    }
}
