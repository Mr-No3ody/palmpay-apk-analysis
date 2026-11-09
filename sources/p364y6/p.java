package p364y6;

import E6.c;
import Ef.a;
import Ff.h;
import Pa.C0525w;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.widget.ImageView;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.palmpay.lib.liveness.ui.widget.LTitleBar;
import com.transsnet.palmpay.managemoney.ui.activity.J;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;
import p232p6.s;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0525w f44094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivenessActivity f44096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(LivenessActivity livenessActivity, Continuation continuation) {
        super(2, continuation);
        this.f44096c = livenessActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f44096c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0525w c0525w;
        a aVar = a.f2423a;
        int i7 = this.f44095b;
        LivenessActivity livenessActivity = this.f44096c;
        if (i7 == 0) {
            g.M(obj);
            Context applicationContext = livenessActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            C0525w c0525w2 = new C0525w(applicationContext);
            f fVar = I.f10809a;
            e eVar = e.f19009c;
            o oVar = new o(c0525w2, null);
            this.f44094a = c0525w2;
            this.f44095b = 1;
            Object objS = AbstractC0780y.s(eVar, oVar, this);
            if (objS == aVar) {
                return aVar;
            }
            c0525w = c0525w2;
            obj = objS;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0525w = this.f44094a;
            g.M(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LTitleBar lTitleBar = livenessActivity.f23854j;
        if (lTitleBar == null) {
            Intrinsics.n("titleBar");
            throw null;
        }
        ImageView rightImageView1 = lTitleBar.getRightImageView1();
        rightImageView1.setVisibility(0);
        rightImageView1.setImageResource(zBooleanValue ? s.lib_liveness_voice_outline : s.lib_liveness_voice_nor);
        rightImageView1.setOnClickListener(new J(livenessActivity, 9, rightImageView1, c0525w));
        livenessActivity.f23843M = new top.zibin.luban.io.a(new c(livenessActivity));
        return Unit.f38893a;
    }
}
