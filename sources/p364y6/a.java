package p364y6;

import android.view.View;
import com.palmpay.lib.liveness.ui.FaceCaptureActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FaceCaptureActivity f44062b;

    public /* synthetic */ a(FaceCaptureActivity faceCaptureActivity, int i7) {
        this.f44061a = i7;
        this.f44062b = faceCaptureActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FaceCaptureActivity faceCaptureActivity = this.f44062b;
        switch (this.f44061a) {
            case 0:
                FaceCaptureActivity.a aVar = FaceCaptureActivity.f23821i;
                faceCaptureActivity.f().e();
                break;
            case 1:
                FaceCaptureActivity.a aVar2 = FaceCaptureActivity.f23821i;
                faceCaptureActivity.finish();
                break;
            case 2:
                FaceCaptureActivity.a aVar3 = FaceCaptureActivity.f23821i;
                faceCaptureActivity.g();
                break;
            default:
                FaceCaptureActivity.a aVar4 = FaceCaptureActivity.f23821i;
                faceCaptureActivity.f().e();
                break;
        }
    }
}
