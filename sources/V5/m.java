package V5;

import androidx.camera.camera2.internal.F;
import com.horcrux.svg.d0;
import com.nimbusds.jose.shaded.gson.y;
import com.nimbusds.jose.shaded.gson.z;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.nimbusds.jose.shaded.gson.m f10025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f10026b;

    static {
        new k(y.f23722a, 1);
    }

    public m(com.nimbusds.jose.shaded.gson.m mVar, y yVar) {
        this.f10025a = mVar;
        this.f10026b = yVar;
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iW = bVar.w();
        int i7 = F.i(iW);
        if (i7 == 0) {
            bVar.a();
            arrayList = new ArrayList();
        } else if (i7 != 2) {
            arrayList = null;
        } else {
            bVar.b();
            arrayList = new com.nimbusds.jose.shaded.gson.internal.l(true);
        }
        if (arrayList == null) {
            return c(bVar, iW);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (bVar.j()) {
                String strQ = arrayList instanceof Map ? bVar.q() : null;
                int iW2 = bVar.w();
                int i10 = F.i(iW2);
                if (i10 == 0) {
                    bVar.a();
                    arrayList2 = new ArrayList();
                } else if (i10 != 2) {
                    arrayList2 = null;
                } else {
                    bVar.b();
                    arrayList2 = new com.nimbusds.jose.shaded.gson.internal.l(true);
                }
                boolean z3 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(bVar, iW2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strQ, arrayList2);
                }
                if (z3) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    bVar.e();
                } else {
                    bVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        com.nimbusds.jose.shaded.gson.m mVar = this.f10025a;
        mVar.getClass();
        z zVarD = mVar.d(new com.nimbusds.jose.shaded.gson.reflect.a(cls));
        if (!(zVarD instanceof m)) {
            zVarD.b(cVar, obj);
        } else {
            cVar.c();
            cVar.f();
        }
    }

    public final Serializable c(com.nimbusds.jose.shaded.gson.stream.b bVar, int i7) throws IOException {
        int i10 = F.i(i7);
        if (i10 == 5) {
            return bVar.u();
        }
        if (i10 == 6) {
            return this.f10026b.readNumber(bVar);
        }
        if (i10 == 7) {
            return Boolean.valueOf(bVar.m());
        }
        if (i10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(d0.u(i7)));
        }
        bVar.s();
        return null;
    }
}
