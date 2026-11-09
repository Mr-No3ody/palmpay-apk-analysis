package p012ad;

import com.github.chrisbanes.photoview.e;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.photograph.crop.CropView;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11874c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f11877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11878g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11872a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11875d = System.currentTimeMillis();

    public a(CropView cropView, float f10, float f11, float f12, float f13) {
        this.f11878g = cropView;
        this.f11873b = f10;
        this.f11874c = f11;
        this.f11876e = f12;
        this.f11877f = f13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11872a) {
            case 0:
                float fCurrentTimeMillis = (System.currentTimeMillis() - this.f11875d) * 1.0f;
                CropView cropView = (CropView) this.f11878g;
                float interpolation = cropView.f33086C.getInterpolation(Math.min(1.0f, fCurrentTimeMillis / cropView.f33094d));
                float f10 = this.f11874c;
                float f11 = this.f11873b;
                cropView.onScale(d0.e(f10, f11, interpolation, f11) / cropView.getScale(), this.f11876e, this.f11877f);
                if (interpolation < 1.0f) {
                    cropView.postOnAnimation(this);
                }
                break;
            default:
                float fCurrentTimeMillis2 = (System.currentTimeMillis() - this.f11875d) * 1.0f;
                e eVar = (e) this.f11878g;
                float interpolation2 = eVar.f22348a.getInterpolation(Math.min(1.0f, fCurrentTimeMillis2 / eVar.f22349b));
                float f12 = this.f11877f;
                float f13 = this.f11876e;
                eVar.f22364t0.onScale(d0.e(f12, f13, interpolation2, f13) / eVar.e(), this.f11873b, this.f11874c);
                if (interpolation2 < 1.0f) {
                    eVar.f22355i.postOnAnimation(this);
                }
                break;
        }
    }

    public a(e eVar, float f10, float f11, float f12, float f13) {
        this.f11878g = eVar;
        this.f11873b = f12;
        this.f11874c = f13;
        this.f11876e = f10;
        this.f11877f = f11;
    }
}
