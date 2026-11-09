package Ra;

import Ue.b;
import Ue.c;
import Ue.d;
import Ue.e;
import android.graphics.Canvas;
import com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener;
import com.zhpan.indicator.drawer.IDrawer;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import top.zibin.luban.OnNewCompressListener;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements OnNewCompressListener, IDrawer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7965a;

    public a(Ve.a indicatorOptions) {
        Intrinsics.g(indicatorOptions, "indicatorOptions");
        a(indicatorOptions);
    }

    public void a(Ve.a indicatorOptions) {
        Object eVar;
        Intrinsics.g(indicatorOptions, "indicatorOptions");
        int i7 = indicatorOptions.f10330b;
        if (i7 != 2) {
            eVar = i7 != 4 ? new d(indicatorOptions) : new e(indicatorOptions, 1);
        } else {
            eVar = new e(indicatorOptions, 0);
        }
        this.f7965a = eVar;
    }

    @Override // com.zhpan.indicator.drawer.IDrawer
    public void onDraw(Canvas canvas) {
        Intrinsics.g(canvas, "canvas");
        c cVar = (c) this.f7965a;
        if (cVar != null) {
            cVar.onDraw(canvas);
        } else {
            Intrinsics.n("mIDrawer");
            throw null;
        }
    }

    @Override // top.zibin.luban.OnNewCompressListener
    public void onError(String source, Throwable e10) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(e10, "e");
        OnKeyValueResultCallbackListener onKeyValueResultCallbackListener = (OnKeyValueResultCallbackListener) this.f7965a;
        if (onKeyValueResultCallbackListener != null) {
            onKeyValueResultCallbackListener.onCallback(source, null);
        }
    }

    @Override // com.zhpan.indicator.drawer.IDrawer
    public b onMeasure(int i7, int i10) {
        c cVar = (c) this.f7965a;
        if (cVar != null) {
            return cVar.onMeasure(i7, i10);
        }
        Intrinsics.n("mIDrawer");
        throw null;
    }

    @Override // top.zibin.luban.OnNewCompressListener
    public void onSuccess(String source, File compressFile) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(compressFile, "compressFile");
        OnKeyValueResultCallbackListener onKeyValueResultCallbackListener = (OnKeyValueResultCallbackListener) this.f7965a;
        if (onKeyValueResultCallbackListener != null) {
            onKeyValueResultCallbackListener.onCallback(source, compressFile.getAbsolutePath());
        }
    }

    @Override // top.zibin.luban.OnNewCompressListener
    public void onStart() {
    }

    @Override // com.zhpan.indicator.drawer.IDrawer
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
    }
}
