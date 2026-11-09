package p364y6;

import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import android.widget.ImageView;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.cache.ICacheService;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;
import p232p6.s;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f44090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LivenessActivity f44091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ICacheService f44092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ImageView imageView, LivenessActivity livenessActivity, ICacheService iCacheService, Continuation continuation) {
        super(2, continuation);
        this.f44090c = imageView;
        this.f44091d = livenessActivity;
        this.f44092e = iCacheService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f44090c, this.f44091d, this.f44092e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7;
        LivenessActivity livenessActivity;
        a aVar;
        int i10;
        String str;
        a aVar2;
        Ef.a aVar3 = Ef.a.f2423a;
        int i11 = this.f44089b;
        ICacheService iCacheService = this.f44092e;
        if (i11 == 0) {
            g.M(obj);
            f fVar = I.f10809a;
            e eVar = e.f19009c;
            m mVar = new m(iCacheService, null);
            this.f44089b = 1;
            obj = AbstractC0780y.s(eVar, mVar, this);
            if (obj != aVar3) {
            }
            return aVar3;
        }
        if (i11 == 1) {
            g.M(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f44088a;
            g.M(obj);
        }
        livenessActivity = this.f44091d;
        if (i7 != 0) {
            str = livenessActivity.f23844Q;
            if (str != null && (aVar2 = livenessActivity.f23843M) != null) {
                aVar2.o(str);
                Unit unit = Unit.f38893a;
            }
            i10 = s.lib_liveness_voice_outline;
        } else {
            aVar = livenessActivity.f23843M;
            if (aVar != null) {
                aVar.r();
            }
            i10 = s.lib_liveness_voice_nor;
        }
        this.f44090c.setImageResource(i10);
        return Unit.f38893a;
        boolean z3 = !((Boolean) obj).booleanValue();
        f fVar2 = I.f10809a;
        e eVar2 = e.f19009c;
        l lVar = new l(iCacheService, z3, null);
        this.f44088a = z3 ? 1 : 0;
        this.f44089b = 2;
        if (AbstractC0780y.s(eVar2, lVar, this) != aVar3) {
            i7 = z3 ? 1 : 0;
            livenessActivity = this.f44091d;
            if (i7 != 0) {
                str = livenessActivity.f23844Q;
                if (str != null) {
                    aVar2.o(str);
                    Unit unit2 = Unit.f38893a;
                }
                i10 = s.lib_liveness_voice_outline;
            } else {
                aVar = livenessActivity.f23843M;
                if (aVar != null) {
                    aVar.r();
                }
                i10 = s.lib_liveness_voice_nor;
            }
            this.f44090c.setImageResource(i10);
            return Unit.f38893a;
        }
        return aVar3;
    }
}
