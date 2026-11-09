package androidx.core.app;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: renamed from: androidx.core.app.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC1041j implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Na.a f15977a;

    public WindowOnFrameMetricsAvailableListenerC1041j(Na.a aVar) {
        this.f15977a = aVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
        Na.a aVar = this.f15977a;
        if ((aVar.f6286a & 1) != 0) {
            SparseIntArray sparseIntArray = ((SparseIntArray[]) aVar.f6288c)[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }
}
