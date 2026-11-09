package X0;

import V0.C;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10965a;

    static {
        String strD = C.d("ConstraintTrkngWrkr");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f10965a = strD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(F1.b bVar, androidx.work.impl.model.k kVar, Ff.c cVar) {
        k kVar2;
        if (cVar instanceof k) {
            kVar2 = (k) cVar;
            int i7 = kVar2.f10963b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                kVar2.f10963b = i7 - Integer.MIN_VALUE;
            } else {
                kVar2 = new k(cVar);
            }
        } else {
            kVar2 = new k(cVar);
        }
        Object objK = kVar2.f10962a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = kVar2.f10963b;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(objK);
            j jVar = new j(new C1888u(bVar.k(kVar), new l(kVar, null), 3), 0);
            kVar2.f10963b = 1;
            objK = X.k(jVar, kVar2);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(objK);
        }
        return new Integer(((androidx.work.impl.constraints.b) objK).f18471a);
    }
}
