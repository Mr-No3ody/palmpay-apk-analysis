package C6;

import androidx.camera.core.ImageProxy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f1206b;

    public /* synthetic */ r(ImageProxy imageProxy, int i7) {
        this.f1205a = i7;
        this.f1206b = imageProxy;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task it) {
        switch (this.f1205a) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                this.f1206b.close();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                this.f1206b.close();
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                this.f1206b.close();
                break;
        }
    }
}
