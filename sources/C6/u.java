package C6;

import com.palmpay.lib.liveness.model.UploadRequestV2;
import com.palmpay.lib.liveness.net.UploadApi;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f1218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f1218c = vVar;
        this.f1219d = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f1218c, this.f1219d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        File file;
        long j6;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1217b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                Boolean bool = Boolean.TRUE;
                v vVar = this.f1218c;
                if (bool.equals(vVar.f1228Y)) {
                    return Unit.f38893a;
                }
                int i10 = p292t6.a.f42345a;
                o oVar = vVar.f1227X;
                p292t6.a.a("start upload video!! " + (oVar != null ? oVar.f1197j : null));
                o oVar2 = vVar.f1227X;
                if (oVar2 != null && (file = oVar2.f1197j) != null) {
                    String str = this.f1219d;
                    if (file.exists()) {
                        UploadRequestV2 uploadRequestV2 = new UploadRequestV2(file);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        p232p6.p pVar = p232p6.p.f41234a;
                        UploadApi uploadApiH = p232p6.p.h();
                        this.f1216a = jCurrentTimeMillis;
                        this.f1217b = 1;
                        if (uploadApiH.uploadV2(str, uploadRequestV2, this) == aVar) {
                            return aVar;
                        }
                        j6 = jCurrentTimeMillis;
                    }
                }
                return Unit.f38893a;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j6 = this.f1216a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            int i11 = p292t6.a.f42345a;
            p292t6.a.a("upload video cost : " + (System.currentTimeMillis() - j6) + "ms");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f38893a;
    }
}
