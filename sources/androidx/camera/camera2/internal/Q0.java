package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0968a0;
import androidx.camera.core.impl.C0981h;
import androidx.camera.core.impl.C0983i;
import androidx.camera.core.impl.C0987k;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.core.os.CancellationSignal$OnCancelListener;
import androidx.fragment.app.C1171f;
import androidx.fragment.app.C1176k;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.common.util.concurrent.ListenableFuture;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener;
import com.transsnet.palmpay.custom_view.input.OperatorSelectNewPopWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q0 implements AsyncFunction, CallbackToFutureAdapter$Resolver, CancellationSignal$OnCancelListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13257e;

    public /* synthetic */ Q0(c1 c1Var, CameraDevice cameraDevice, androidx.camera.camera2.internal.compat.params.r rVar, List list) {
        this.f13253a = 2;
        this.f13254b = c1Var;
        this.f13256d = cameraDevice;
        this.f13255c = rVar;
        this.f13257e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        C0981h c0981h;
        ListenableFuture listenableFutureOpen;
        List list = (List) obj;
        switch (this.f13253a) {
            case 0:
                V0 v3 = (V0) this.f13254b;
                p140j8.f.G("ProcessingCaptureSession");
                if (v3.f13286j == 5) {
                    return new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("SessionProcessorCaptureSession is closed."), 1);
                }
                AbstractC0970b0 abstractC0970b0 = null;
                boolean zContains = list.contains(null);
                androidx.camera.core.impl.H0 h7 = (androidx.camera.core.impl.H0) this.f13255c;
                if (zContains) {
                    listenableFutureOpen = new androidx.camera.core.impl.utils.futures.l(new C0968a0("Surface closed", (AbstractC0970b0) h7.b().get(list.indexOf(null))), 1);
                } else {
                    boolean z3 = false;
                    C0981h c0981h2 = null;
                    C0981h c0981h3 = null;
                    C0981h c0981h4 = null;
                    for (int i7 = 0; i7 < h7.b().size(); i7++) {
                        AbstractC0970b0 abstractC0970b1 = (AbstractC0970b0) h7.b().get(i7);
                        boolean zEquals = Objects.equals(abstractC0970b1.f14030j, E.b0.class);
                        int i10 = abstractC0970b1.f14029i;
                        Size size = abstractC0970b1.f14028h;
                        if (zEquals || Objects.equals(abstractC0970b1.f14030j, androidx.camera.core.streamsharing.d.class)) {
                            c0981h2 = new C0981h((Surface) abstractC0970b1.c().get(), size, i10);
                        } else if (Objects.equals(abstractC0970b1.f14030j, E.P.class)) {
                            c0981h3 = new C0981h((Surface) abstractC0970b1.c().get(), size, i10);
                        } else if (Objects.equals(abstractC0970b1.f14030j, E.C.class)) {
                            c0981h4 = new C0981h((Surface) abstractC0970b1.c().get(), size, i10);
                        }
                    }
                    C0987k c0987k = h7.f13881b;
                    if (c0987k != null) {
                        abstractC0970b0 = c0987k.f14094a;
                        c0981h = new C0981h((Surface) abstractC0970b0.c().get(), abstractC0970b0.f14028h, abstractC0970b0.f14029i);
                    } else {
                        c0981h = null;
                    }
                    v3.f13286j = 2;
                    try {
                        ArrayList arrayList = new ArrayList(v3.f13282f);
                        if (abstractC0970b0 != null) {
                            arrayList.add(abstractC0970b0);
                        }
                        androidx.camera.core.impl.utils.n.r(arrayList);
                        p140j8.f.G("ProcessingCaptureSession");
                        try {
                            androidx.camera.core.impl.H0 h0InitSession = v3.f13277a.initSession(v3.f13278b, new C0983i(c0981h2, c0981h3, c0981h4, c0981h));
                            v3.f13285i = h0InitSession;
                            androidx.camera.core.impl.utils.futures.j.e(((AbstractC0970b0) h0InitSession.b().get(0)).f14025e).addListener(new RunnableC0934j(7, v3, abstractC0970b0), org.chromium.support_lib_boundary.util.b.u());
                            Iterator it = v3.f13285i.b().iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                androidx.camera.core.impl.utils.executor.i iVar = v3.f13279c;
                                if (zHasNext) {
                                    AbstractC0970b0 abstractC0970b2 = (AbstractC0970b0) it.next();
                                    V0.f13275o.add(abstractC0970b2);
                                    androidx.camera.core.impl.utils.futures.j.e(abstractC0970b2.f14025e).addListener(new RunnableC0961x(abstractC0970b2, 7), iVar);
                                } else {
                                    androidx.camera.core.impl.G0 g7 = new androidx.camera.core.impl.G0();
                                    g7.a(h7);
                                    g7.f13838a.clear();
                                    g7.f13839b.f13955a.clear();
                                    g7.a(v3.f13285i);
                                    if (g7.f13873k && g7.f13872j) {
                                        z3 = true;
                                    }
                                    p118hf.a.g(z3, "Cannot transform the SessionConfig");
                                    androidx.camera.core.impl.H0 h0B = g7.b();
                                    CameraDevice cameraDevice = (CameraDevice) this.f13256d;
                                    cameraDevice.getClass();
                                    listenableFutureOpen = v3.f13281e.open(h0B, cameraDevice, (SynchronizedCaptureSession.Opener) this.f13257e);
                                    listenableFutureOpen.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureOpen, new S0(v3)), iVar);
                                }
                            }
                        } catch (Throwable th) {
                            p140j8.f.h("ProcessingCaptureSession", "initSession failed", th);
                            androidx.camera.core.impl.utils.n.f(v3.f13282f);
                            if (abstractC0970b0 != null) {
                                abstractC0970b0.b();
                            }
                            throw th;
                        }
                    } catch (C0968a0 e10) {
                        return new androidx.camera.core.impl.utils.futures.l(e10, 1);
                    }
                }
                return listenableFutureOpen;
            default:
                return c1.l((c1) this.f13254b, (CameraDevice) this.f13256d, (androidx.camera.camera2.internal.compat.params.r) this.f13255c, (List) this.f13257e);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        String str;
        b1 b1Var = (b1) this.f13254b;
        List list = (List) this.f13255c;
        androidx.camera.camera2.internal.compat.n nVar = (androidx.camera.camera2.internal.compat.n) this.f13256d;
        androidx.camera.camera2.internal.compat.params.r rVar = (androidx.camera.camera2.internal.compat.params.r) this.f13257e;
        synchronized (b1Var.f13349a) {
            synchronized (b1Var.f13349a) {
                b1Var.k();
                androidx.camera.core.impl.utils.n.r(list);
                b1Var.f13359k = list;
            }
            p118hf.a.k(b1Var.f13357i == null, "The openCaptureSessionCompleter can only set once!");
            b1Var.f13357i = kVar;
            nVar.a(rVar);
            str = "openCaptureSession[session=" + b1Var + "]";
        }
        return str;
    }

    @Override // androidx.core.os.CancellationSignal$OnCancelListener
    public void onCancel() {
        C1176k this$0 = (C1176k) this.f13255c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C1171f animationInfo = (C1171f) this.f13256d;
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        androidx.fragment.app.x0 operation = (androidx.fragment.app.x0) this.f13257e;
        Intrinsics.checkNotNullParameter(operation, "$operation");
        View view = (View) this.f13254b;
        view.clearAnimation();
        this$0.f16974a.endViewTransition(view);
        animationInfo.a();
        if (androidx.fragment.app.Z.L(2)) {
            Objects.toString(operation);
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        OperatorSelectNewPopWindow operatorSelectNewPopWindow = (OperatorSelectNewPopWindow) this.f13257e;
        ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$9((List) this.f13254b, (ModelMobileWithIconInputLayout) this.f13255c, (OnOperatorItemClickListener) this.f13256d, operatorSelectNewPopWindow, jVar, view, i7);
    }

    public /* synthetic */ Q0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f13253a = i7;
        this.f13254b = obj;
        this.f13255c = obj2;
        this.f13256d = obj3;
        this.f13257e = obj4;
    }
}
