package df;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.internal.operators.flowable.t;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements Publisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35920a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static k a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i iVar = p298tf.f.f42628a;
        p147jf.a.a(timeUnit, "unit is null");
        p147jf.a.a(iVar, "scheduler is null");
        return new k(Math.max(0L, 0L), Math.max(0L, 1L), iVar);
    }

    public final t b(p071ef.d dVar) {
        int i7 = f35920a;
        p147jf.a.b(i7, "bufferSize");
        return new t(this, dVar, i7);
    }

    public final void c(FlowableSubscriber flowableSubscriber) {
        p147jf.a.a(flowableSubscriber, "s is null");
        try {
            d(flowableSubscriber);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            D3.a.H(th);
            org.chromium.support_lib_boundary.util.b.V(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d(FlowableSubscriber flowableSubscriber);

    @Override // org.reactivestreams.Publisher
    public final void subscribe(Subscriber subscriber) {
        if (subscriber instanceof FlowableSubscriber) {
            c((FlowableSubscriber) subscriber);
        } else {
            p147jf.a.a(subscriber, "s is null");
            c(new p208nf.e(subscriber));
        }
    }
}
