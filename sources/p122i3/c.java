package p122i3;

import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.ProducerContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements RequestListener2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37419a;

    static {
        new b(null);
    }

    public c(Set set) {
        if (set == null) {
            this.f37419a = new ArrayList();
            return;
        }
        ArrayList destination = new ArrayList(set.size());
        this.f37419a = destination;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : set) {
            if (obj != null) {
                destination.add(obj);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerEvent(ProducerContext producerContext, String producerName, String producerEventName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(producerEventName, "producerEventName");
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerEvent(producerContext, producerName, producerEventName);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerFinishWithCancellation(ProducerContext producerContext, String str, Map map) {
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerFinishWithCancellation(producerContext, str, map);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerFinishWithFailure(ProducerContext producerContext, String str, Throwable th, Map map) {
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerFinishWithFailure(producerContext, str, th, map);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerFinishWithSuccess(ProducerContext producerContext, String str, Map map) {
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerFinishWithSuccess(producerContext, str, map);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onProducerStart(ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onProducerStart(producerContext, producerName);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public final void onRequestCancellation(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onRequestCancellation(producerContext);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public final void onRequestFailure(ProducerContext producerContext, Throwable throwable) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onRequestFailure(producerContext, throwable);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public final void onRequestStart(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onRequestStart(producerContext);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public final void onRequestSuccess(ProducerContext producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onRequestSuccess(producerContext);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final void onUltimateProducerReached(ProducerContext producerContext, String producerName, boolean z3) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f37419a.iterator();
        while (it.hasNext()) {
            try {
                ((RequestListener2) it.next()).onUltimateProducerReached(producerContext, producerName, z3);
            } catch (Exception e10) {
                a.i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public final boolean requiresExtraMap(ProducerContext producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        ArrayList arrayList = this.f37419a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((RequestListener2) it.next()).requiresExtraMap(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }
}
