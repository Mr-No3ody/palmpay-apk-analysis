package p076f3;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.producers.ProducerContext;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    @Override // p360y2.b
    public final void a(Object obj) {
        CloseableReference.d((CloseableReference) obj);
    }

    @Override // p076f3.a
    public final void g(Object obj, int i7, ProducerContext producerContext) {
        super.g(CloseableReference.c((CloseableReference) obj), i7, producerContext);
    }

    @Override // p360y2.b, com.facebook.datasource.DataSource
    public final Object getResult() {
        return CloseableReference.c((CloseableReference) super.getResult());
    }
}
