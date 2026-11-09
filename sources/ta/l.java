package ta;

import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements OnSuccessListener, OnFailureListener, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f42381a;

    public /* synthetic */ l(m mVar) {
        this.f42381a = mVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        k kVar = this.f42381a.f42383b;
        if (kVar != null) {
            kVar.onLastKnowLocationTaskReceived(task);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        k kVar = this.f42381a.f42383b;
        if (kVar != null) {
            kVar.onFailure(exception);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        LocationSettingsResponse locationSettingsResponse = (LocationSettingsResponse) obj;
        k kVar = this.f42381a.f42383b;
        if (kVar != null) {
            kVar.onSuccess(locationSettingsResponse);
        }
    }
}
