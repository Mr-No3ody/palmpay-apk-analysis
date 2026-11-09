package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerListener2 f21538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProducerContext f21539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Postprocessor f21540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CloseableReference f21542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1357w f21546k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(C1357w c1357w, Consumer consumer, ProducerListener2 producerListener2, Postprocessor postprocessor, ProducerContext producerContext) {
        super(consumer);
        this.f21546k = c1357w;
        this.f21542g = null;
        this.f21543h = 0;
        this.f21544i = false;
        this.f21545j = false;
        this.f21538c = producerListener2;
        this.f21540e = postprocessor;
        this.f21539d = producerContext;
        producerContext.addCallbacks(new C1356v(this, 5));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void i(c0 c0Var, CloseableReference closeableReference, int i7) throws Throwable {
        Postprocessor postprocessor = c0Var.f21540e;
        if (!CloseableReference.h(closeableReference)) {
            throw new IllegalArgumentException();
        }
        if (!(((CloseableImage) closeableReference.f()) instanceof CloseableStaticBitmap)) {
            c0Var.k(closeableReference, i7);
            return;
        }
        ProducerListener2 producerListener2 = c0Var.f21538c;
        ProducerContext producerContext = c0Var.f21539d;
        producerListener2.onProducerStart(producerContext, "PostprocessorProducer");
        com.facebook.common.references.b bVar = null;
        Map<String, String> mapA = null;
        try {
            try {
                com.facebook.common.references.b bVarL = c0Var.l((CloseableImage) closeableReference.f());
                try {
                    if (producerListener2.requiresExtraMap(producerContext, "PostprocessorProducer")) {
                        mapA = p213o2.d.a("Postprocessor", postprocessor.getName());
                    }
                    producerListener2.onProducerFinishWithSuccess(producerContext, "PostprocessorProducer", mapA);
                    c0Var.k(bVarL, i7);
                    CloseableReference.d(bVarL);
                } catch (Throwable th) {
                    th = th;
                    bVar = bVarL;
                    CloseableReference.d(bVar);
                    throw th;
                }
            } catch (Exception e10) {
                producerListener2.onProducerFinishWithFailure(producerContext, "PostprocessorProducer", e10, !producerListener2.requiresExtraMap(producerContext, "PostprocessorProducer") ? null : p213o2.d.a("Postprocessor", postprocessor.getName()));
                if (c0Var.j()) {
                    c0Var.f21631b.onFailure(e10);
                    return;
                }
                return;
                CloseableReference.d(bVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void c() {
        if (j()) {
            this.f21631b.onCancellation();
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void d(Throwable th) {
        if (j()) {
            this.f21631b.onFailure(th);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        if (!CloseableReference.h(closeableReference)) {
            if (AbstractC1338c.a(i7)) {
                k(null, i7);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (this.f21541f) {
                    return;
                }
                CloseableReference closeableReference2 = this.f21542g;
                this.f21542g = CloseableReference.c(closeableReference);
                this.f21543h = i7;
                this.f21544i = true;
                boolean zM = m();
                CloseableReference.d(closeableReference2);
                if (zM) {
                    C1357w c1357w = this.f21546k;
                    ((Executor) c1357w.f21641d).execute(new androidx.customview.widget.e(this, 12));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (this.f21541f) {
                    return false;
                }
                CloseableReference closeableReference = this.f21542g;
                this.f21542g = null;
                this.f21541f = true;
                CloseableReference.d(closeableReference);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    public final void k(CloseableReference closeableReference, int i7) {
        boolean z3;
        boolean zA = AbstractC1338c.a(i7);
        if (zA) {
            if (zA) {
                return;
            } else {
                return;
            }
        }
        synchronized (this) {
            z3 = this.f21541f;
        }
        if (z3) {
            if (zA || !j()) {
                return;
            }
        }
        this.f21631b.onNewResult(closeableReference, i7);
    }

    public final com.facebook.common.references.b l(CloseableImage closeableImage) {
        CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
        CloseableReference closeableReferenceProcess = this.f21540e.process(closeableStaticBitmap.getUnderlyingBitmap(), (p032c3.b) this.f21546k.f21640c);
        try {
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(closeableReferenceProcess, closeableImage.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            closeableStaticBitmapOf.putExtras(closeableStaticBitmap.getExtras());
            return CloseableReference.i(closeableStaticBitmapOf);
        } finally {
            CloseableReference.d(closeableReferenceProcess);
        }
    }

    public final synchronized boolean m() {
        if (this.f21541f || !this.f21544i || this.f21545j || !CloseableReference.h(this.f21542g)) {
            return false;
        }
        this.f21545j = true;
        return true;
    }
}
