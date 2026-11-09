package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p196n3.c f21565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProducerContext f21566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G f21568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f21569h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, Consumer consumer, ProducerContext producerContext, boolean z3, p196n3.c cVar) {
        super(consumer);
        this.f21569h = h0Var;
        this.f21567f = false;
        this.f21566e = producerContext;
        Boolean resizingAllowedOverride = producerContext.getImageRequest().getResizingAllowedOverride();
        this.f21564c = resizingAllowedOverride != null ? resizingAllowedOverride.booleanValue() : z3;
        this.f21565d = cVar;
        this.f21568g = new G(h0Var.f21570a, new p1.c(this, 18));
        producerContext.addCallbacks(new X(1, this, consumer));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        char c6;
        boolean z3;
        boolean zContains;
        p109h3.e eVarA = (p109h3.e) obj;
        if (this.f21567f) {
            return;
        }
        boolean zA = AbstractC1338c.a(i7);
        Consumer consumer = this.f21631b;
        if (eVarA == null) {
            if (zA) {
                consumer.onNewResult(null, 1);
                return;
            }
            return;
        }
        eVarA.k();
        W2.e eVar = eVarA.f37275b;
        ProducerContext producerContext = this.f21566e;
        com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
        ImageTranscoder imageTranscoderCreateImageTranscoder = this.f21565d.createImageTranscoder(eVar, this.f21564c);
        eVarA.k();
        if (eVarA.f37275b == W2.e.f10545c) {
            c6 = 3;
        } else {
            eVarA.k();
            c6 = 2;
            if (imageTranscoderCreateImageTranscoder.canTranscode(eVarA.f37275b)) {
                com.facebook.imagepipeline.common.i rotationOptions = imageRequest.getRotationOptions();
                if (rotationOptions.f21439b) {
                    z3 = false;
                } else {
                    if (p196n3.b.b(rotationOptions, eVarA) == 0) {
                        if (rotationOptions.f21438a == -2 || rotationOptions.f21439b) {
                            eVarA.f37277d = 0;
                            zContains = false;
                        } else {
                            p213o2.c cVar = p196n3.b.f39823a;
                            eVarA.k();
                            zContains = cVar.contains(Integer.valueOf(eVarA.f37277d));
                        }
                        if (!zContains) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                }
                if (z3 || imageTranscoderCreateImageTranscoder.canResize(eVarA, imageRequest.getRotationOptions(), imageRequest.getResizeOptions())) {
                    c6 = 1;
                }
            }
        }
        if (zA || c6 != 3) {
            if (c6 == 1) {
                G g7 = this.f21568g;
                if (g7.e(eVarA, i7)) {
                    if (zA || producerContext.isIntermediateResultExpected()) {
                        g7.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (eVar != W2.c.f10530a && eVar != W2.c.f10540k) {
                com.facebook.imagepipeline.common.i rotationOptions2 = producerContext.getImageRequest().getRotationOptions();
                if (!rotationOptions2.a()) {
                    int i10 = rotationOptions2.f21438a;
                    if (i10 != -2) {
                        if (rotationOptions2.a()) {
                            throw new IllegalStateException("Rotation is set to use EXIF");
                        }
                        eVarA = p109h3.e.a(eVarA);
                        if (eVarA != null) {
                            eVarA.f37276c = i10;
                        }
                    }
                }
            } else if (!producerContext.getImageRequest().getRotationOptions().f21439b) {
                eVarA.k();
                if (eVarA.f37276c != 0) {
                    eVarA.k();
                    if (eVarA.f37276c != -1 && (eVarA = p109h3.e.a(eVarA)) != null) {
                        eVarA.f37276c = 0;
                    }
                }
            }
            consumer.onNewResult(eVarA, i7);
        }
    }

    public final p213o2.d i(p109h3.e eVar, com.facebook.imagepipeline.common.g gVar, p196n3.a aVar, String str) {
        String str2;
        long j6;
        ProducerContext producerContext = this.f21566e;
        if (!producerContext.getProducerListener().requiresExtraMap(producerContext, "ResizeAndRotateProducer")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        eVar.k();
        sb2.append(eVar.f37278e);
        sb2.append("x");
        eVar.k();
        sb2.append(eVar.f37279f);
        String string = sb2.toString();
        if (gVar != null) {
            str2 = gVar.f21432a + "x" + gVar.f21433b;
        } else {
            str2 = "Unspecified";
        }
        HashMap map = new HashMap();
        eVar.k();
        map.put("Image format", String.valueOf(eVar.f37275b));
        map.put("Original size", string);
        map.put("Requested size", str2);
        G g7 = this.f21568g;
        synchronized (g7) {
            j6 = g7.f21485i - g7.f21484h;
        }
        map.put("queueTime", String.valueOf(j6));
        map.put("Transcoder id", str);
        map.put("Transcoding result", String.valueOf(aVar));
        return new p213o2.d(map);
    }
}
