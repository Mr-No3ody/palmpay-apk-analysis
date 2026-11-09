package Pa;

import android.os.Build;
import android.text.TextUtils;
import com.luck.picture.lib.config.SelectMimeType;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ImageUtils;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeakReference[] f7057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7059f;

    public /* synthetic */ X(String str, int i7, WeakReference[] weakReferenceArr, WeakReference weakReference, WeakReference weakReference2, int i10) {
        this.f7054a = i10;
        this.f7055b = str;
        this.f7056c = i7;
        this.f7057d = weakReferenceArr;
        this.f7058e = weakReference;
        this.f7059f = weakReference2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7054a) {
            case 0:
                String strValueOf = this.f7055b;
                if (TextUtils.isEmpty(strValueOf)) {
                    strValueOf = String.valueOf(System.currentTimeMillis());
                }
                File fileSaveViewsAsImage = ImageUtils.saveViewsAsImage(r0.s(strValueOf), this.f7056c, 0, this.f7057d);
                WeakReference weakReference = this.f7059f;
                if (fileSaveViewsAsImage != null) {
                    if (Build.VERSION.SDK_INT <= 28) {
                        p038ca.e eVar = (p038ca.e) this.f7058e.get();
                        if (eVar != null) {
                            eVar.f(r0.i(fileSaveViewsAsImage.getName(), SelectMimeType.SYSTEM_IMAGE), new p1.d(10, fileSaveViewsAsImage, weakReference));
                        }
                    } else {
                        r0.N1(BaseApplication.getContext(), fileSaveViewsAsImage.getPath());
                    }
                }
                r0.x1(weakReference, fileSaveViewsAsImage);
                break;
            default:
                String strValueOf2 = this.f7055b;
                if (TextUtils.isEmpty(strValueOf2)) {
                    strValueOf2 = String.valueOf(System.currentTimeMillis());
                }
                File fileSaveViewsAsImage2 = ImageUtils.saveViewsAsImage(r0.s(strValueOf2), this.f7056c, 0, this.f7057d);
                WeakReference weakReference2 = this.f7059f;
                if (fileSaveViewsAsImage2 != null) {
                    if (Build.VERSION.SDK_INT <= 28) {
                        p038ca.e eVar2 = (p038ca.e) this.f7058e.get();
                        if (eVar2 != null) {
                            eVar2.f(r0.i(fileSaveViewsAsImage2.getName(), SelectMimeType.SYSTEM_IMAGE), new p1.d(10, fileSaveViewsAsImage2, weakReference2));
                        }
                    } else {
                        r0.N1(BaseApplication.getContext(), fileSaveViewsAsImage2.getPath());
                    }
                }
                r0.x1(weakReference2, fileSaveViewsAsImage2);
                break;
        }
    }
}
