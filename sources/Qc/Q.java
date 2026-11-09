package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.PreviewOrderReq;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CreatePlanViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CreatePlanViewModel f7699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7700g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(long j6, long j10, String str, String str2, CreatePlanViewModel createPlanViewModel, long j11, int i7, Continuation continuation) {
        super(1, continuation);
        this.f7695b = j6;
        this.f7696c = j10;
        this.f7697d = str;
        this.f7698e = str2;
        this.f7699f = createPlanViewModel;
        this.f7700g = j11;
        this.f7701i = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new Q(this.f7695b, this.f7696c, this.f7697d, this.f7698e, this.f7699f, this.f7700g, this.f7701i, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Q) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        int i7;
        int i10;
        Ef.a aVar = Ef.a.f2423a;
        int i11 = this.f7694a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        Long l5 = new Long(this.f7695b);
        Long l6 = new Long(this.f7696c);
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
        PreviewOrderReq previewOrderReq = new PreviewOrderReq(l5, l6, this.f7697d, this.f7698e, i10, this.f7700g, this.f7701i);
        this.f7694a = 1;
        Object orderPreview = manageApiService.getOrderPreview(previewOrderReq, this);
        return orderPreview == aVar ? aVar : orderPreview;
    }
}
