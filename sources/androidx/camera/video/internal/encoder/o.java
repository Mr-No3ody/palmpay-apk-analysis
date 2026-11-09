package androidx.camera.video.internal.encoder;

import E.C0211p;
import E.m0;
import Fe.Z;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.View;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.L;
import androidx.camera.core.impl.Observable;
import androidx.camera.view.C1027h;
import androidx.camera.view.H;
import androidx.constraintlayout.motion.widget.C;
import androidx.webkit.WebViewStartUpResult;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import androidx.work.impl.C1271d;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.constraints.ConstraintListener;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.facebook.react.animated.NativeAnimatedNodesManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.internal.ChoreographerProvider;
import com.facebook.react.modules.blob.BlobCollector;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.BlobProvider;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.uimanager.events.Event;
import com.google.api.Service;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14699c;

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.f14697a = i7;
        this.f14698b = obj;
        this.f14699c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncoderCallback encoderCallback;
        Executor executor;
        switch (this.f14697a) {
            case 0:
                ((Observable.Observer) ((Map.Entry) this.f14698b).getKey()).onNewData((androidx.camera.video.internal.b) this.f14699c);
                return;
            case 1:
                LinkedHashMap linkedHashMap = ((r) this.f14698b).f14706a;
                Observable.Observer observer = (Observable.Observer) this.f14699c;
                observer.getClass();
                linkedHashMap.remove(observer);
                return;
            case 2:
                ((Observable.Observer) this.f14698b).onNewData((androidx.camera.video.internal.b) this.f14699c);
                return;
            case 3:
                v vVar = ((t) this.f14698b).f14722k;
                switch (F.i(vVar.f14733D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f14699c;
                        vVar.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(androidx.camera.video.u.A(vVar.f14733D)));
                }
            case 4:
                t tVar = (t) this.f14698b;
                MediaFormat mediaFormat = (MediaFormat) this.f14699c;
                if (tVar.f14721j) {
                    p140j8.f.G(tVar.f14722k.f14734a);
                    return;
                }
                switch (F.i(tVar.f14722k.f14733D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (tVar.f14722k.f14735b) {
                            v vVar2 = tVar.f14722k;
                            encoderCallback = vVar2.f14751r;
                            executor = vVar2.f14752s;
                            break;
                        }
                        try {
                            executor.execute(new o(5, encoderCallback, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e10) {
                            p140j8.f.h(tVar.f14722k.f14734a, "Unable to post to the supplied executor.", e10);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(androidx.camera.video.u.A(tVar.f14722k.f14733D)));
                }
            case 5:
                ((EncoderCallback) this.f14698b).onOutputConfigUpdate(new L((MediaFormat) this.f14699c, 4));
                return;
            case 6:
                ((EncoderCallback) this.f14698b).onEncodedData((h) this.f14699c);
                return;
            case 7:
                ((Encoder.SurfaceInput.OnSurfaceUpdateListener) this.f14698b).onSurfaceUpdate((Surface) this.f14699c);
                return;
            case 8:
                ((C1027h) this.f14698b).f14924a = (C0211p) this.f14699c;
                return;
            case 9:
                ((androidx.camera.view.m) this.f14698b).f14991a.f14899A.onSurfaceRequested((m0) this.f14699c);
                return;
            case 10:
                H h7 = (H) this.f14698b;
                m0 m0Var = h7.f14893h;
                if (m0Var != null && m0Var == ((m0) this.f14699c)) {
                    h7.f14893h = null;
                    h7.f14892g = null;
                }
                androidx.camera.view.l lVar = h7.f14897l;
                if (lVar != null) {
                    lVar.onSurfaceNotInUse();
                    h7.f14897l = null;
                    return;
                }
                return;
            case 11:
                C c6 = (C) this.f14698b;
                int i7 = c6.f15245p;
                View[] viewArr = (View[]) this.f14699c;
                if (i7 != -1) {
                    for (View view : viewArr) {
                        view.setTag(c6.f15245p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (c6.f15246q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(c6.f15246q, null);
                    }
                    return;
                }
                return;
            case 12:
                V7.g this$0 = (V7.g) this.f14698b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Runnable runnable = (Runnable) this.f14699c;
                Intrinsics.checkNotNullParameter(runnable, "$runnable");
                if (!((ArrayDeque) this$0.f10099d).offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                this$0.b();
                return;
            case 13:
                Runnable command = (Runnable) this.f14698b;
                Intrinsics.checkNotNullParameter(command, "$command");
                androidx.appcompat.app.r this$1 = (androidx.appcompat.app.r) this.f14699c;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$1.a();
                }
            case 14:
                ((Z) this.f14698b).onSuccess((WebViewStartUpResult) this.f14699c);
                return;
            case 15:
                ExtensionEmbeddingBackend.SplitListenerWrapper.m79accept$lambda1((ExtensionEmbeddingBackend.SplitListenerWrapper) this.f14698b, (ArrayList) this.f14699c);
                return;
            case 16:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m80accept$lambda0((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) this.f14698b, (WindowLayoutInfo) this.f14699c);
                return;
            case 17:
                C1271d c1271d = (C1271d) this.f14698b;
                androidx.work.impl.model.e eVar = (androidx.work.impl.model.e) this.f14699c;
                synchronized (c1271d.f18540k) {
                    try {
                        Iterator it = c1271d.f18539j.iterator();
                        while (it.hasNext()) {
                            ((ExecutionListener) it.next()).onExecuted(eVar, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 18:
                Iterator it2 = ((List) this.f14698b).iterator();
                while (it2.hasNext()) {
                    ((ConstraintListener) it2.next()).onConstraintChanged(((androidx.work.impl.constraints.trackers.e) this.f14699c).f18516e);
                }
                return;
            case 19:
                String string = ((UUID) this.f14699c).toString();
                Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                androidx.work.impl.utils.h.a((androidx.work.impl.s) this.f14698b, string);
                return;
            case 20:
                Iterator<String> it3 = ((WorkDatabase) this.f14698b).h().getUnfinishedWorkWithTag("PeriodWakeUpWorker").iterator();
                while (it3.hasNext()) {
                    androidx.work.impl.utils.h.a((androidx.work.impl.s) this.f14699c, it3.next());
                }
                return;
            case 21:
                BaseMVPFragment baseMVPFragment = ((p024b9.d) this.f14698b).f18796a;
                if (!baseMVPFragment.isAdded() || baseMVPFragment.getContext() == null) {
                    return;
                }
                ((Function0) this.f14699c).invoke();
                return;
            case 22:
                ((ActivityHandler) this.f14698b).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.f14699c);
                return;
            case 23:
                ((ActivityHandler) this.f14698b).lambda$new$2((AdjustConfig) this.f14699c);
                return;
            case 24:
                com.didi.drouter.router.f fVar = (com.didi.drouter.router.f) this.f14698b;
                fVar.getClass();
                ((com.didi.drouter.router.d) this.f14699c).f21140e.a(fVar.f21150e);
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((NativeAnimatedNodesManager) this.f14698b).handleEvent((Event) this.f14699c);
                return;
            case 26:
                BlobCollector.install$lambda$0((ReactContext) this.f14698b, (BlobModule) this.f14699c);
                return;
            case 27:
                BlobProvider.openFile$lambda$2((ParcelFileDescriptor) this.f14698b, (byte[]) this.f14699c);
                return;
            case 28:
                ReactChoreographer._init_$lambda$2((ReactChoreographer) this.f14698b, (ChoreographerProvider) this.f14699c);
                return;
            default:
                Task.Companion.call$lambda$2((Callable) this.f14698b, (TaskCompletionSource) this.f14699c);
                return;
        }
    }
}
