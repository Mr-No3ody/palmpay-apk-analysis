package Od;

import com.transsnet.palmpay.task.HomeMenuConfigTask;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeMenuConfigTask f6811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HomeMenuConfigTask homeMenuConfigTask, Continuation continuation) {
        super(continuation);
        this.f6811b = homeMenuConfigTask;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f6810a = obj;
        this.f6812c |= Integer.MIN_VALUE;
        return this.f6811b.preloadHomeMenu(this);
    }
}
