package p157kb;

import Ff.c;
import com.transsnet.palmpay.credit.init.LoanBusinessConfigTask;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoanBusinessConfigTask f38722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LoanBusinessConfigTask loanBusinessConfigTask, Continuation continuation) {
        super(continuation);
        this.f38722b = loanBusinessConfigTask;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38721a = obj;
        this.f38723c |= Integer.MIN_VALUE;
        return this.f38722b.getBusinessConfigFromNet(this);
    }
}
