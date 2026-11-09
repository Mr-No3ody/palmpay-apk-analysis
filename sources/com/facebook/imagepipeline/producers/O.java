package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.ParcelFileDescriptor;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class O extends j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21499f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ProducerListener2 f21500g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ProducerContext f21501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f21502j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Producer f21503o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Consumer consumer, ProducerListener2 producerListener2, ProducerContext producerContext, l0 l0Var) {
        super(consumer, producerListener2, producerContext, "BackgroundThreadHandoffProducer");
        this.f21502j = consumer;
        this.f21500g = producerListener2;
        this.f21501i = producerContext;
        this.f21503o = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final void b(Object obj) {
        switch (this.f21499f) {
            case 0:
                p109h3.e.b((p109h3.e) obj);
                break;
            case 1:
                CloseableReference.d((CloseableReference) obj);
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public Map c(Object obj) {
        switch (this.f21499f) {
            case 1:
                return p213o2.d.a("createdThumbnail", String.valueOf(((CloseableReference) obj) != null));
            default:
                return super.c(obj);
        }
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final Object d() throws Throwable {
        String strA;
        Bitmap bitmapCreateVideoThumbnail;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap frameAtTime;
        switch (this.f21499f) {
            case 0:
                P p3 = (P) this.f21503o;
                p109h3.e eVarB = p3.b((com.facebook.imagepipeline.request.d) this.f21502j);
                ProducerContext producerContext = this.f21501i;
                ProducerListener2 producerListener2 = this.f21500g;
                if (eVarB == null) {
                    producerListener2.onUltimateProducerReached(producerContext, p3.c(), false);
                    producerContext.putOriginExtra(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
                    return null;
                }
                eVarB.g();
                producerListener2.onUltimateProducerReached(producerContext, p3.c(), true);
                producerContext.putOriginExtra(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
                eVarB.k();
                producerContext.putExtra("image_color_space", eVarB.f37283o);
                return eVarB;
            case 1:
                ContentResolver contentResolver = (ContentResolver) ((W) this.f21503o).f21515c;
                com.facebook.imagepipeline.request.d dVar = (com.facebook.imagepipeline.request.d) this.f21502j;
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    strA = p333w2.a.a(contentResolver, dVar.getSourceUri());
                    break;
                } catch (IllegalArgumentException unused) {
                    strA = null;
                }
                if (strA != null) {
                    bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strA, (dVar.getPreferredWidth() > 96 || dVar.getPreferredHeight() > 96) ? 1 : 3);
                } else {
                    bitmapCreateVideoThumbnail = null;
                }
                if (bitmapCreateVideoThumbnail == null) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(dVar.getSourceUri(), "r");
                        parcelFileDescriptorOpenFileDescriptor.getClass();
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                            frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                            try {
                                mediaMetadataRetriever.release();
                                break;
                            } catch (IOException unused2) {
                            }
                        } catch (FileNotFoundException unused3) {
                            if (mediaMetadataRetriever != null) {
                                try {
                                    mediaMetadataRetriever.release();
                                    break;
                                } catch (IOException unused4) {
                                }
                            }
                            frameAtTime = null;
                        } catch (Throwable th) {
                            th = th;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            if (mediaMetadataRetriever2 != null) {
                                try {
                                    mediaMetadataRetriever2.release();
                                    break;
                                } catch (IOException unused5) {
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused6) {
                        mediaMetadataRetriever = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    bitmapCreateVideoThumbnail = frameAtTime;
                }
                if (bitmapCreateVideoThumbnail == null) {
                    return null;
                }
                CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(bitmapCreateVideoThumbnail, p121i2.e.a(), p109h3.g.f37290d, 0);
                HasExtraData hasExtraData = this.f21501i;
                hasExtraData.putExtra("image_format", "thumbnail");
                closeableStaticBitmapOf.putExtras(hasExtraData.getExtras());
                return CloseableReference.i(closeableStaticBitmapOf);
            default:
                return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public void f(Exception exc) {
        switch (this.f21499f) {
            case 1:
                super.f(exc);
                ProducerContext producerContext = this.f21501i;
                this.f21500g.onUltimateProducerReached(producerContext, "VideoThumbnailProducer", false);
                producerContext.putOriginExtra(ImagesContract.LOCAL, "video");
                break;
            default:
                super.f(exc);
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public void g(Object obj) {
        switch (this.f21499f) {
            case 1:
                CloseableReference closeableReference = (CloseableReference) obj;
                super.g(closeableReference);
                boolean z3 = closeableReference != null;
                ProducerListener2 producerListener2 = this.f21500g;
                ProducerContext producerContext = this.f21501i;
                producerListener2.onUltimateProducerReached(producerContext, "VideoThumbnailProducer", z3);
                producerContext.putOriginExtra(ImagesContract.LOCAL, "video");
                break;
            case 2:
                ProducerListener2 producerListener3 = this.f21500g;
                ProducerContext producerContext2 = this.f21501i;
                producerListener3.onProducerFinishWithSuccess(producerContext2, "BackgroundThreadHandoffProducer", null);
                ((l0) this.f21503o).f21597a.produceResults((Consumer) this.f21502j, producerContext2);
                break;
            default:
                super.g(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p3, Consumer consumer, ProducerListener2 producerListener2, ProducerContext producerContext, String str, com.facebook.imagepipeline.request.d dVar, ProducerListener2 producerListener3, ProducerContext producerContext2) {
        super(consumer, producerListener2, producerContext, str);
        this.f21503o = p3;
        this.f21502j = dVar;
        this.f21500g = producerListener3;
        this.f21501i = producerContext2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(W w3, Consumer consumer, ProducerListener2 producerListener2, ProducerContext producerContext, ProducerListener2 producerListener3, ProducerContext producerContext2, com.facebook.imagepipeline.request.d dVar) {
        super(consumer, producerListener2, producerContext, "VideoThumbnailProducer");
        this.f21503o = w3;
        this.f21500g = producerListener3;
        this.f21501i = producerContext2;
        this.f21502j = dVar;
    }

    private final void h(Object obj) {
    }
}
