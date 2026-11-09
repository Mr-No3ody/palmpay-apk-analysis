package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Camera2CapturePipeline$PipelineTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f13292a;

    public X(Z z3) {
        this.f13292a = z3;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final boolean isCaptureResultNeeded() {
        Iterator it = this.f13292a.f13330h.iterator();
        while (it.hasNext()) {
            if (((Camera2CapturePipeline$PipelineTask) it.next()).isCaptureResultNeeded()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final void postCapture() {
        Iterator it = this.f13292a.f13330h.iterator();
        while (it.hasNext()) {
            ((Camera2CapturePipeline$PipelineTask) it.next()).postCapture();
        }
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final ListenableFuture preCapture(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f13292a.f13330h.iterator();
        while (it.hasNext()) {
            arrayList.add(((Camera2CapturePipeline$PipelineTask) it.next()).preCapture(totalCaptureResult));
        }
        androidx.camera.core.impl.utils.futures.m mVarA = androidx.camera.core.impl.utils.futures.j.a(arrayList);
        Q q10 = new Q(2);
        return androidx.camera.core.impl.utils.futures.j.i(mVarA, new C2085k0(q10, 13), org.chromium.support_lib_boundary.util.b.u());
    }
}
