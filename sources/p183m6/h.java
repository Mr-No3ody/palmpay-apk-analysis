package p183m6;

import Ef.a;
import Wf.AbstractC0780y;
import Wf.t0;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.config.api.bean.ConfigRsp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f39505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f39507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.f39505b = iVar;
        this.f39506c = str;
        this.f39507d = list;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f39505b, this.f39506c, this.f39507d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        HashMap<String, String> data;
        a aVar = a.f2423a;
        int i7 = this.f39504a;
        if (i7 == 0) {
            g.M(obj);
            e eVar = this.f39505b.f39511d;
            if (eVar != null) {
                eVar.b();
                i iVar = this.f39505b;
                String str = this.f39506c;
                List list = this.f39507d;
                this.f39504a = 1;
                obj = iVar.b(str, list);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        ConfigRsp configRsp = (ConfigRsp) obj;
        if (configRsp != null) {
            i iVar2 = this.f39505b;
            List list2 = this.f39507d;
            synchronized (iVar2) {
                try {
                    List list3 = list2;
                    if (list3 == null || list3.isEmpty()) {
                        iVar2.f39515h = configRsp;
                    } else {
                        Map data2 = configRsp.getData();
                        if (data2 == null) {
                            data2 = G.c();
                        }
                        for (String str2 : data2.keySet()) {
                            ConfigRsp configRsp2 = iVar2.f39515h;
                            if (configRsp2 != null && (data = configRsp2.getData()) != 0) {
                            }
                        }
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            i iVar3 = this.f39505b;
            i.a(iVar3, iVar3.f39510c, iVar3.f39515h);
            e eVar2 = this.f39505b.f39511d;
            if (eVar2 != null) {
                synchronized (eVar2) {
                    f fVar = eVar2.f39499g;
                    if (fVar != null) {
                        t0 t0Var = eVar2.f39497e;
                        if (t0Var == null || !t0Var.isActive()) {
                            t0 t0Var2 = eVar2.f39498f;
                            if (t0Var2 == null || !t0Var2.isActive()) {
                                eVar2.f39498f = AbstractC0780y.m(eVar2.f39493a, eVar2.f39494b, null, new b(eVar2, fVar, null), 2);
                            }
                        }
                    }
                }
            }
            return this.f39505b.f39515h;
        }
        return null;
    }
}
