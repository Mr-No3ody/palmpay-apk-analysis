package com.transsnet.palmpay.core.ui.activity;

import Wf.AbstractC0780y;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.CommonRewardRsp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1485t extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommonClaimRewardActivity f27809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1485t(CommonClaimRewardActivity commonClaimRewardActivity, String str, Continuation continuation) {
        super(2, continuation);
        this.f27809b = commonClaimRewardActivity;
        this.f27810c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1485t(this.f27809b, this.f27810c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1485t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f27808a;
        CommonClaimRewardActivity commonClaimRewardActivity = this.f27809b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                CommonClaimRewardActivity.m(commonClaimRewardActivity);
                p042cg.e eVar = p042cg.e.f19009c;
                C1484s c1484s = new C1484s(this.f27810c, null);
                this.f27808a = 1;
                obj = AbstractC0780y.s(eVar, c1484s, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
            if (commonBeanResult.isSuccess()) {
                T data = commonBeanResult.data;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                CommonClaimRewardActivity.n(commonClaimRewardActivity, (CommonRewardRsp) data);
            } else {
                String respMsg = commonBeanResult.getRespMsg();
                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                CommonClaimRewardActivity.l(commonClaimRewardActivity, respMsg);
            }
        } catch (Exception e10) {
            CommonClaimRewardActivity.l(commonClaimRewardActivity, org.chromium.support_lib_boundary.util.b.W(e10));
        } finally {
            CommonClaimRewardActivity.m(commonClaimRewardActivity);
        }
        return Unit.f38893a;
    }
}
