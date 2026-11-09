package kotlinx.coroutines.flow;

import Zf.C0805a;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f39064b;

    public /* synthetic */ G(kotlin.jvm.internal.F f10, int i7) {
        this.f39063a = i7;
        this.f39064b = f10;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.f39063a) {
            case 0:
                this.f39064b.f38951a = obj;
                throw new C0805a(this);
            default:
                this.f39064b.f38951a = obj;
                throw new C0805a(this);
        }
    }
}
