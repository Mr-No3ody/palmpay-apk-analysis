package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function f37711c;

    public p(df.b bVar, Function function) {
        super(bVar);
        this.f37711c = function;
    }

    @Override // df.b
    public final void d(FlowableSubscriber flowableSubscriber) {
        boolean z3 = flowableSubscriber instanceof ConditionalSubscriber;
        Function function = this.f37711c;
        df.b bVar = this.f37677b;
        if (z3) {
            bVar.c(new n((ConditionalSubscriber) flowableSubscriber, function));
        } else {
            bVar.c(new o(flowableSubscriber, function));
        }
    }
}
