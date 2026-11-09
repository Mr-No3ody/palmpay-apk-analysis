package p012ad;

import Ab.r;
import android.content.Context;
import android.widget.OverScroller;
import com.github.chrisbanes.photoview.e;
import com.transsnet.palmpay.photograph.crop.CropView;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11880a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11884e;

    public c(CropView cropView, Context context) {
        this.f11884e = cropView;
        this.f11883d = new r(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11880a) {
            case 0:
                r rVar = (r) this.f11883d;
                if (!((OverScroller) rVar.f139b).isFinished() && ((OverScroller) rVar.f139b).computeScrollOffset()) {
                    int currX = ((OverScroller) rVar.f139b).getCurrX();
                    int currY = ((OverScroller) rVar.f139b).getCurrY();
                    CropView cropView = (CropView) this.f11884e;
                    cropView.t.postTranslate(this.f11881b - currX, this.f11882c - currY);
                    cropView.setImageMatrix(cropView.getDrawMatrix());
                    this.f11881b = currX;
                    this.f11882c = currY;
                    cropView.postOnAnimation(this);
                }
                break;
            default:
                OverScroller overScroller = (OverScroller) this.f11883d;
                if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                    int currX2 = overScroller.getCurrX();
                    int currY2 = overScroller.getCurrY();
                    e eVar = (e) this.f11884e;
                    eVar.f22365v.postTranslate(this.f11881b - currX2, this.f11882c - currY2);
                    eVar.a();
                    this.f11881b = currX2;
                    this.f11882c = currY2;
                    eVar.f22355i.postOnAnimation(this);
                }
                break;
        }
    }

    public c(e eVar, Context context) {
        this.f11884e = eVar;
        this.f11883d = new OverScroller(context);
    }
}
