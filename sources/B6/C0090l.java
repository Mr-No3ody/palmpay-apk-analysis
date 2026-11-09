package B6;

import Wf.AbstractC0780y;
import android.widget.ImageView;
import com.palmpay.lib.liveness.cache.ICacheService;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: B6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0090l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ICacheService f499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090l(ImageView imageView, LivenessActivityV2 livenessActivityV2, ICacheService iCacheService, Continuation continuation) {
        super(2, continuation);
        this.f497c = imageView;
        this.f498d = livenessActivityV2;
        this.f499e = iCacheService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0090l(this.f497c, this.f498d, this.f499e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0090l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7;
        LivenessActivityV2 livenessActivityV2;
        top.zibin.luban.io.a aVar;
        int i10;
        String str;
        top.zibin.luban.io.a aVar2;
        Ef.a aVar3 = Ef.a.f2423a;
        int i11 = this.f496b;
        ICacheService iCacheService = this.f499e;
        if (i11 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            p042cg.f fVar = Wf.I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            C0089k c0089k = new C0089k(iCacheService, null);
            this.f496b = 1;
            obj = AbstractC0780y.s(eVar, c0089k, this);
            if (obj != aVar3) {
            }
            return aVar3;
        }
        if (i11 == 1) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f495a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        livenessActivityV2 = this.f498d;
        if (i7 != 0) {
            str = livenessActivityV2.f23934X;
            if (str != null && (aVar2 = livenessActivityV2.f23933Q) != null) {
                aVar2.o(str);
                Unit unit = Unit.f38893a;
            }
            i10 = p232p6.s.lib_liveness_voice_outline;
        } else {
            aVar = livenessActivityV2.f23933Q;
            if (aVar != null) {
                aVar.r();
            }
            i10 = p232p6.s.lib_liveness_voice_nor;
        }
        this.f497c.setImageResource(i10);
        return Unit.f38893a;
        boolean z3 = !((Boolean) obj).booleanValue();
        p042cg.f fVar2 = Wf.I.f10809a;
        p042cg.e eVar2 = p042cg.e.f19009c;
        C0088j c0088j = new C0088j(iCacheService, z3, null);
        this.f495a = z3 ? 1 : 0;
        this.f496b = 2;
        if (AbstractC0780y.s(eVar2, c0088j, this) != aVar3) {
            i7 = z3 ? 1 : 0;
            livenessActivityV2 = this.f498d;
            if (i7 != 0) {
                str = livenessActivityV2.f23934X;
                if (str != null) {
                    aVar2.o(str);
                    Unit unit2 = Unit.f38893a;
                }
                i10 = p232p6.s.lib_liveness_voice_outline;
            } else {
                aVar = livenessActivityV2.f23933Q;
                if (aVar != null) {
                    aVar.r();
                }
                i10 = p232p6.s.lib_liveness_voice_nor;
            }
            this.f497c.setImageResource(i10);
            return Unit.f38893a;
        }
        return aVar3;
    }
}
