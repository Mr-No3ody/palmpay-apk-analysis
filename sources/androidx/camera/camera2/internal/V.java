package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.producers.AbstractC1338c;
import com.facebook.imagepipeline.producers.C1349n;
import com.facebook.imagepipeline.producers.C1353s;
import com.facebook.imagepipeline.producers.JobScheduler$JobRunnable;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.ProducerListener2;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.common.util.concurrent.ListenableFuture;
import com.transsnet.palmpay.airtime.bean.req.EditScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpTaskListFragment;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements AsyncFunction, JobScheduler$JobRunnable, SynchronizationGuard.CriticalSection, ResultCallback, Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13274c;

    public /* synthetic */ V(int i7, MinorAccountDetailActivity minorAccountDetailActivity, String str) {
        this.f13272a = i7;
        this.f13273b = minorAccountDetailActivity;
        this.f13274c = str;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        int i7;
        ImageProxy imageProxyDequeueImageFromBuffer;
        Z z3 = (Z) this.f13273b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) this.f13274c).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C0944o c0944o = z3.f13326d;
            if (!zHasNext) {
                c0944o.f13608f.onCameraControlCaptureRequests(arrayList2);
                return androidx.camera.core.impl.utils.futures.j.a(arrayList);
            }
            androidx.camera.core.impl.T t = (androidx.camera.core.impl.T) it.next();
            androidx.camera.core.impl.S s3 = new androidx.camera.core.impl.S(t);
            CameraCaptureResult cameraCaptureResult = null;
            int i10 = t.f13968c;
            if (i10 == 5) {
                l1 l1Var = c0944o.f13614l;
                if (!l1Var.f13588d && !l1Var.f13587c && (imageProxyDequeueImageFromBuffer = l1Var.dequeueImageFromBuffer()) != null && c0944o.f13614l.enqueueImageToImageWriter(imageProxyDequeueImageFromBuffer)) {
                    ImageInfo imageInfo = imageProxyDequeueImageFromBuffer.getImageInfo();
                    if (imageInfo instanceof androidx.camera.core.internal.c) {
                        cameraCaptureResult = ((androidx.camera.core.internal.c) imageInfo).f14315a;
                    }
                }
            }
            if (cameraCaptureResult != null) {
                s3.f13962h = cameraCaptureResult;
            } else {
                if (z3.f13323a != 3 || z3.f13328f) {
                    i7 = (i10 == -1 || i10 == 5) ? 2 : -1;
                } else {
                    i7 = 4;
                }
                if (i7 != -1) {
                    s3.f13957c = i7;
                }
            }
            N7.a aVar = z3.f13327e;
            if (aVar.f6100b && this.f13272a == 0 && aVar.f6099a) {
                C0992m0 c0992m0B = C0992m0.b();
                c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(CaptureRequest.CONTROL_AE_MODE), 3);
                s3.c(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
            }
            arrayList.add(AbstractC0198c.y(new C0936k(z3, s3)));
            arrayList2.add(s3.d());
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f13273b).lambda$upload$0((TransportContext) this.f13274c, this.f13272a);
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        int i7 = MinorAccountDetailActivity.f34759g;
        if (iIntValue != -1) {
            ToastUtils.showLong("face cancel", new Object[0]);
            return;
        }
        String stringExtra = intent != null ? intent.getStringExtra("extra_data") : null;
        String str = (String) this.f13274c;
        int i10 = this.f13272a;
        MinorAccountDetailActivity minorAccountDetailActivity = (MinorAccountDetailActivity) this.f13273b;
        if (i10 == 1) {
            MinorViewModel minorViewModel = (MinorViewModel) minorAccountDetailActivity.l();
            String id2 = minorAccountDetailActivity.o();
            minorViewModel.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            p140j8.f.s(minorViewModel, new Pe.O(id2, stringExtra, str, null), minorViewModel.f35381i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            return;
        }
        MinorViewModel minorViewModel2 = (MinorViewModel) minorAccountDetailActivity.l();
        String id3 = minorAccountDetailActivity.o();
        minorViewModel2.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        p140j8.f.s(minorViewModel2, new Pe.T(id3, stringExtra, str, null), minorViewModel2.f35380g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        String str = (String) obj;
        ScheduleTopUpTaskListFragment scheduleTopUpTaskListFragment = (ScheduleTopUpTaskListFragment) this.f13273b;
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) scheduleTopUpTaskListFragment.f27333i;
        if (scheduleTopUpViewModel != null) {
            EditScheduleTopUpTaskReq editScheduleTopUpTaskReq = new EditScheduleTopUpTaskReq();
            editScheduleTopUpTaskReq.setId(((ScheduleTopUpTaskBean) this.f13274c).getId());
            editScheduleTopUpTaskReq.setTagName(str);
            editScheduleTopUpTaskReq.setMemberId(BaseApplication.getInstance().getUser().getMemberId());
            scheduleTopUpViewModel.f(editScheduleTopUpTaskReq, new Xd.r(scheduleTopUpTaskListFragment, this.f13272a, str, 1));
        }
    }

    @Override // com.facebook.imagepipeline.producers.JobScheduler$JobRunnable
    public void run(p109h3.e eVar, int i7) {
        long j6;
        String str;
        QualityInfo qualityInfo;
        long j10;
        boolean z3;
        com.facebook.imagepipeline.producers.r rVar;
        long j11;
        CloseableImage closeableImage;
        com.facebook.imagepipeline.producers.r this$0 = (com.facebook.imagepipeline.producers.r) this.f13273b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C1353s this$1 = (C1353s) this.f13274c;
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        if (eVar == null) {
            return;
        }
        com.facebook.imagepipeline.request.d imageRequest = this$0.f21612c.getImageRequest();
        eVar.k();
        String str2 = eVar.f37275b.f10546a;
        ProducerContext producerContext = this$0.f21612c;
        producerContext.putExtra("image_format", str2);
        Uri sourceUri = imageRequest.getSourceUri();
        eVar.f37284p = sourceUri != null ? sourceUri.toString() : null;
        p061e3.i downsampleOverride = imageRequest.getDownsampleOverride();
        if (downsampleOverride == null) {
            downsampleOverride = this$1.f21625e;
        }
        boolean zH = AbstractC1338c.h(i7, 16);
        if ((downsampleOverride == p061e3.i.f36026a || (downsampleOverride == p061e3.i.f36027b && !zH)) && (this$1.f21626f || !p333w2.a.c(imageRequest.getSourceUri()))) {
            com.facebook.imagepipeline.common.i rotationOptions = imageRequest.getRotationOptions();
            Intrinsics.checkNotNullExpressionValue(rotationOptions, "getRotationOptions(...)");
            eVar.f37280g = AbstractC0198c.l(rotationOptions, imageRequest.getResizeOptions(), eVar, this.f13272a);
        }
        producerContext.getImagePipelineConfig().getExperiments().getClass();
        int i10 = this$0.f21618i;
        eVar.k();
        if ((eVar.f37275b != W2.c.f10530a && AbstractC1338c.b(i7)) || this$0.f21616g || !p109h3.e.j(eVar)) {
            return;
        }
        eVar.k();
        boolean zC = Intrinsics.c(eVar.f37275b, W2.c.f10532c);
        String str3 = "DecodeProducer";
        ProducerListener2 producerListener2 = this$0.f21614e;
        if (zC) {
            C1349n c1349n = C1353s.f21620k;
            com.facebook.imagepipeline.common.c cVar = this$0.f21615f;
            if (c1349n.isTooBig(eVar, cVar)) {
                eVar.k();
                int i11 = eVar.f37278e;
                eVar.k();
                int i12 = eVar.f37279f;
                Bitmap.Config config = cVar.f21425a;
                StringBuilder sbP = N8.q0.p(i11, "Image is too big to attempt decoding: w = ", i12, ", h = ", ", pixel config = ");
                sbP.append(config);
                sbP.append(", max bitmap size = 104857600");
                IllegalStateException illegalStateException = new IllegalStateException(sbP.toString());
                producerListener2.onProducerFinishWithFailure(producerContext, "DecodeProducer", illegalStateException, null);
                this$0.m(illegalStateException);
                return;
            }
        }
        eVar.k();
        W2.e eVar2 = eVar.f37275b;
        Intrinsics.checkNotNullExpressionValue(eVar2, "getImageFormat(...)");
        String str4 = eVar2.f10546a;
        String str5 = "unknown";
        eVar.k();
        int i13 = eVar.f37278e;
        eVar.k();
        String str6 = i13 + "x" + eVar.f37279f;
        String strValueOf = String.valueOf(eVar.f37280g);
        boolean zA = AbstractC1338c.a(i7);
        boolean z8 = zA && !AbstractC1338c.h(i7, 8);
        boolean zH2 = AbstractC1338c.h(i7, 4);
        com.facebook.imagepipeline.common.g resizeOptions = producerContext.getImageRequest().getResizeOptions();
        if (resizeOptions != null) {
            str5 = resizeOptions.f21432a + "x" + resizeOptions.f21433b;
        }
        try {
            com.facebook.imagepipeline.producers.G g7 = this$0.f21617h;
            synchronized (g7) {
                j6 = g7.f21485i - g7.f21484h;
            }
            String string = producerContext.getImageRequest().getSourceUri().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            int iF = (z8 || zH2) ? eVar.f() : this$0.j(eVar);
            QualityInfo qualityInfoK = (z8 || zH2) ? p109h3.g.f37290d : this$0.k();
            producerListener2.onProducerStart(producerContext, "DecodeProducer");
            try {
                try {
                    Intrinsics.e(qualityInfoK);
                    try {
                        String str7 = str5;
                        try {
                            try {
                                try {
                                    CloseableImage closeableImageDecode = this$0.f21619j.f21623c.decode(eVar, iF, qualityInfoK, this$0.f21615f);
                                    try {
                                        int i14 = eVar.f37280g != 1 ? i7 | 16 : i7;
                                        producerListener2.onProducerFinishWithSuccess(producerContext, "DecodeProducer", this$0.i(closeableImageDecode, j6, qualityInfoK, zA, str4, str6, str7, strValueOf));
                                        this$0.p(eVar, closeableImageDecode, i10);
                                        this$0.n(closeableImageDecode, i14);
                                        eVar.close();
                                    } catch (Exception e10) {
                                        e = e10;
                                        str3 = "DecodeProducer";
                                        str = str7;
                                        closeableImage = closeableImageDecode;
                                        qualityInfo = qualityInfoK;
                                        z3 = zA;
                                        producerListener2 = producerListener2;
                                        rVar = this$0;
                                        j11 = j6;
                                        Intrinsics.e(qualityInfo);
                                        com.facebook.imagepipeline.producers.r rVar2 = rVar;
                                        producerListener2.onProducerFinishWithFailure(producerContext, str3, e, rVar2.i(closeableImage, j11, qualityInfo, z3, str4, str6, str, strValueOf));
                                        rVar2.m(e);
                                        eVar.close();
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    str3 = "DecodeProducer";
                                    str = str7;
                                    qualityInfo = qualityInfoK;
                                    j10 = j6;
                                    z3 = zA;
                                    producerListener2 = producerListener2;
                                    rVar = this$0;
                                    j11 = j10;
                                    closeableImage = null;
                                    Intrinsics.e(qualityInfo);
                                    com.facebook.imagepipeline.producers.r rVar3 = rVar;
                                    producerListener2.onProducerFinishWithFailure(producerContext, str3, e, rVar3.i(closeableImage, j11, qualityInfo, z3, str4, str6, str, strValueOf));
                                    rVar3.m(e);
                                    eVar.close();
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str = str7;
                                qualityInfo = qualityInfoK;
                                j10 = j6;
                                z3 = zA;
                                rVar = this$0;
                                j11 = j10;
                                closeableImage = null;
                                Intrinsics.e(qualityInfo);
                                com.facebook.imagepipeline.producers.r rVar4 = rVar;
                                producerListener2.onProducerFinishWithFailure(producerContext, str3, e, rVar4.i(closeableImage, j11, qualityInfo, z3, str4, str6, str, strValueOf));
                                rVar4.m(e);
                                eVar.close();
                            }
                        } catch (g3.a e13) {
                            e = e13;
                            str = str7;
                            qualityInfo = qualityInfoK;
                            j10 = j6;
                            z3 = zA;
                            try {
                                p109h3.e eVar3 = e.f36841a;
                                g3.a aVar = e;
                                try {
                                    rVar = this$0;
                                    try {
                                        j11 = j10;
                                        try {
                                            p229p2.a.x(this$0.f21613d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", aVar.getMessage(), string, eVar3.d(), Integer.valueOf(eVar3.f()));
                                            throw aVar;
                                        } catch (Exception e14) {
                                            e = e14;
                                            closeableImage = null;
                                            Intrinsics.e(qualityInfo);
                                            com.facebook.imagepipeline.producers.r rVar5 = rVar;
                                            producerListener2.onProducerFinishWithFailure(producerContext, str3, e, rVar5.i(closeableImage, j11, qualityInfo, z3, str4, str6, str, strValueOf));
                                            rVar5.m(e);
                                            eVar.close();
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        j11 = j10;
                                        closeableImage = null;
                                        Intrinsics.e(qualityInfo);
                                        com.facebook.imagepipeline.producers.r rVar6 = rVar;
                                        producerListener2.onProducerFinishWithFailure(producerContext, str3, e, rVar6.i(closeableImage, j11, qualityInfo, z3, str4, str6, str, strValueOf));
                                        rVar6.m(e);
                                        eVar.close();
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    rVar = this$0;
                                    j11 = j10;
                                    closeableImage = null;
                                    Intrinsics.e(qualityInfo);
                                    com.facebook.imagepipeline.producers.r rVar7 = rVar;
                                    producerListener2.onProducerFinishWithFailure(producerContext, str3, e, rVar7.i(closeableImage, j11, qualityInfo, z3, str4, str6, str, strValueOf));
                                    rVar7.m(e);
                                    eVar.close();
                                }
                            } catch (Exception e17) {
                                e = e17;
                                rVar = this$0;
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        str = str5;
                    }
                } catch (g3.a e19) {
                    e = e19;
                    str = str5;
                }
            } catch (Exception e20) {
                e = e20;
                str = str5;
            }
        } catch (Throwable th) {
            eVar.close();
            throw th;
        }
    }

    public /* synthetic */ V(int i7, Object obj, Object obj2) {
        this.f13273b = obj;
        this.f13274c = obj2;
        this.f13272a = i7;
    }
}
