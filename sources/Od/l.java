package Od;

import com.transsnet.palmpay.task.WelcomeNewUserConfigTask;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WelcomeNewUserConfigTask f6825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(WelcomeNewUserConfigTask welcomeNewUserConfigTask, Continuation continuation) {
        super(continuation);
        this.f6825b = welcomeNewUserConfigTask;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f6824a = obj;
        this.f6826c |= Integer.MIN_VALUE;
        return this.f6825b.queryConfig(this);
    }
}
