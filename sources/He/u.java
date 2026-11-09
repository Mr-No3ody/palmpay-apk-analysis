package He;

import Wf.D;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumScrollNotice f3916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ModelPremiumScrollNotice modelPremiumScrollNotice, Continuation continuation) {
        super(2, continuation);
        this.f3916b = modelPremiumScrollNotice;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f3916b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        long j6;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f3915a;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        do {
            ModelPremiumScrollNotice modelPremiumScrollNotice = this.f3916b;
            if (modelPremiumScrollNotice.isAttachedToWindow()) {
                ArrayList arrayList = modelPremiumScrollNotice.f35314d;
                if (arrayList.size() > 1) {
                    modelPremiumScrollNotice.getScroller().setTargetPosition(modelPremiumScrollNotice.f35315e);
                    RecyclerView.LayoutManager layoutManager = modelPremiumScrollNotice.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.startSmoothScroll(modelPremiumScrollNotice.getScroller());
                    }
                    int i10 = modelPremiumScrollNotice.f35315e;
                    int size = arrayList.size() - 1;
                    j6 = modelPremiumScrollNotice.f35311a;
                    if (i10 == size) {
                        modelPremiumScrollNotice.postDelayed(new Ae.n(modelPremiumScrollNotice, 21), j6 / ((long) 3));
                    }
                    modelPremiumScrollNotice.f35315e++;
                    this.f3915a = 1;
                }
            }
            return Unit.f38893a;
        } while (D.b(j6, this) != aVar);
        return aVar;
    }
}
