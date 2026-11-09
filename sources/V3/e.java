package V3;

import Pa.c0;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.app.AbstractC1032a;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckWithFaceRecognitionFragment;
import com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge;
import j4.q;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9993e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f9989a = i7;
        this.f9990b = obj;
        this.f9991c = obj2;
        this.f9992d = obj3;
        this.f9993e = obj4;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        switch (this.f9989a) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    f fVar = (f) this.f9991c;
                    FlexiBankCheckWithFaceRecognitionFragment flexiBankCheckWithFaceRecognitionFragment = fVar.f9994f;
                    Intrinsics.checkNotNullParameter(flexiBankCheckWithFaceRecognitionFragment, "<this>");
                    Intrinsics.checkNotNullParameter("android.permission.CAMERA", "permission");
                    boolean zH = flexiBankCheckWithFaceRecognitionFragment != null ? AbstractC1032a.h(flexiBankCheckWithFaceRecognitionFragment.requireActivity(), "android.permission.CAMERA") : false;
                    q qVar = (q) this.f9993e;
                    if (!zH) {
                        qVar.invoke(fVar.f9995g);
                    } else {
                        ((q) this.f9992d).invoke();
                    }
                } else {
                    ((q) this.f9990b).invoke();
                }
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    p038ca.d dVar = (p038ca.d) this.f9991c;
                    boolean zG = D3.a.G(dVar.f18887f, "android.permission.CAMERA");
                    c0 c0Var = (c0) this.f9993e;
                    if (!zG) {
                        c0Var.invoke(dVar.f18888g);
                    } else {
                        ((c0) this.f9992d).invoke();
                    }
                } else {
                    ((c0) this.f9990b).invoke();
                }
                break;
            default:
                PhotoUploadBridge.m112actualCapture$lambda5((File) this.f9990b, (PhotoUploadBridge) this.f9991c, (AbstractActivityC0837o) this.f9992d, (PhotoUploadBridge.PhotoUploadParam) this.f9993e, (ActivityResult) obj);
                break;
        }
    }
}
