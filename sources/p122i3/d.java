package p122i3;

import com.facebook.imagepipeline.listener.RequestListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements RequestListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37420a;

    public d(Set set) {
        this.f37420a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            RequestListener requestListener = (RequestListener) it.next();
            if (requestListener != null) {
                this.f37420a.add(requestListener);
            }
        }
    }

    public static void a(String str, Exception exc) {
        a.i("ForwardingRequestListener", str, exc);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public final void onProducerEvent(String str, String str2, String str3) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerEvent(str, str2, str3);
            } catch (Exception e10) {
                a("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public final void onProducerFinishWithCancellation(String str, String str2, Map map) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, Map map) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public final void onProducerFinishWithSuccess(String str, String str2, Map map) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public final void onProducerStart(String str, String str2) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onProducerStart(str, str2);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onRequestCancellation(String str) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onRequestCancellation(str);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onRequestFailure(com.facebook.imagepipeline.request.d dVar, String str, Throwable th, boolean z3) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onRequestFailure(dVar, str, th, z3);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onRequestStart(com.facebook.imagepipeline.request.d dVar, Object obj, String str, boolean z3) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onRequestStart(dVar, obj, str, z3);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public final void onRequestSuccess(com.facebook.imagepipeline.request.d dVar, String str, boolean z3) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onRequestSuccess(dVar, str, z3);
            } catch (Exception e10) {
                a("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public final void onUltimateProducerReached(String str, String str2, boolean z3) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((RequestListener) arrayList.get(i7)).onUltimateProducerReached(str, str2, z3);
            } catch (Exception e10) {
                a("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public final boolean requiresExtraMap(String str) {
        ArrayList arrayList = this.f37420a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((RequestListener) arrayList.get(i7)).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public d(RequestListener... requestListenerArr) {
        this.f37420a = new ArrayList(requestListenerArr.length);
        for (RequestListener requestListener : requestListenerArr) {
            if (requestListener != null) {
                this.f37420a.add(requestListener);
            }
        }
    }
}
