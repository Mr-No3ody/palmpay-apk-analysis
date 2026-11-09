package B6;

import Pa.C0525w;
import Wf.AbstractC0780y;
import android.content.Context;
import android.widget.ImageView;
import com.palmpay.lib.liveness.ui.widget.LTitleBar;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: B6.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0092n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0525w f501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092n(LivenessActivityV2 livenessActivityV2, Continuation continuation) {
        super(2, continuation);
        this.f503c = livenessActivityV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0092n(this.f503c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0092n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0525w c0525w;
        int i7 = 0;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = this.f502b;
        LivenessActivityV2 livenessActivityV2 = this.f503c;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            Context applicationContext = livenessActivityV2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            C0525w c0525w2 = new C0525w(applicationContext);
            p042cg.f fVar = Wf.I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            C0091m c0091m = new C0091m(c0525w2, null);
            this.f501a = c0525w2;
            this.f502b = 1;
            Object objS = AbstractC0780y.s(eVar, c0091m, this);
            if (objS == aVar) {
                return aVar;
            }
            c0525w = c0525w2;
            obj = objS;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0525w = this.f501a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LTitleBar lTitleBar = livenessActivityV2.f23942g;
        if (lTitleBar == null) {
            Intrinsics.n("titleBar");
            throw null;
        }
        ImageView rightImageView1 = lTitleBar.getRightImageView1();
        rightImageView1.setVisibility(0);
        rightImageView1.setImageResource(zBooleanValue ? p232p6.s.lib_liveness_voice_outline : p232p6.s.lib_liveness_voice_nor);
        rightImageView1.setOnClickListener(new ViewOnClickListenerC0087i(livenessActivityV2, i7, rightImageView1, c0525w));
        livenessActivityV2.f23933Q = new top.zibin.luban.io.a(new E6.c(livenessActivityV2));
        return Unit.f38893a;
    }
}
