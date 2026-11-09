package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.CreateOrderReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f32620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f32621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f32623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OrderPreViewModel f32624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f32625g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f32626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32627j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Long l5, long j6, String str, String str2, OrderPreViewModel orderPreViewModel, long j10, int i7, int i10, Continuation continuation) {
        super(1, continuation);
        this.f32620b = l5;
        this.f32621c = j6;
        this.f32622d = str;
        this.f32623e = str2;
        this.f32624f = orderPreViewModel;
        this.f32625g = j10;
        this.f32626i = i7;
        this.f32627j = i10;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.f32620b, this.f32621c, this.f32622d, this.f32623e, this.f32624f, this.f32625g, this.f32626i, this.f32627j, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        int i7;
        int i10;
        Ef.a aVar = Ef.a.f2423a;
        int i11 = this.f32619a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        Long l5 = new Long(this.f32621c);
        this.f32624f.getClass();
        String str = com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a;
        int iHashCode = str.hashCode();
        if (iHashCode != -853258278) {
            if (iHashCode != 3480) {
                if (iHashCode == 3208415) {
                    str.equals("home");
                }
            } else if (str.equals("me")) {
                i7 = 3;
                i10 = i7;
            }
            i10 = 1;
        } else if (str.equals("finance")) {
            i7 = 2;
            i10 = i7;
        } else {
            i10 = 1;
        }
        CreateOrderReq createOrderReq = new CreateOrderReq(this.f32620b, l5, this.f32622d, this.f32623e, i10, this.f32625g, 2, this.f32626i, this.f32627j);
        this.f32619a = 1;
        Object objCreateOrder = manageApiService.createOrder(createOrderReq, this);
        return objCreateOrder == aVar ? aVar : objCreateOrder;
    }
}
