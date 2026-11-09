package K6;

import N0.n;
import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Rect;
import androidx.camera.core.ImageProxy;
import androidx.fragment.app.E;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.palmpay.lib.scanplus.bean.ScanType;
import com.palmpay.lib.scanplus.callback.OnScanListener;
import com.palmpay.lib.scanplus.view.ScanView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends o implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i7) {
        super(4);
        this.f4951a = i7;
        this.f4952b = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z3 = true;
        char c6 = 1;
        switch (this.f4951a) {
            case 0:
                ImageProxy imageProxy = (ImageProxy) obj;
                byte[] bytes = (byte[]) obj2;
                int iIntValue = ((Number) obj3).intValue();
                int iIntValue2 = ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                ScanView scanView = (ScanView) this.f4952b;
                int i7 = ScanView.t;
                synchronized (scanView) {
                    if (scanView.f24049i) {
                        imageProxy.close();
                    } else {
                        ScanType scanType = scanView.f24048g;
                        if (scanType == ScanType.SCAN_FULL_SCREEN) {
                            ArrayList arrayListG = scanView.g(bytes, iIntValue, iIntValue2, null);
                            if (!arrayListG.isEmpty()) {
                                scanView.f24051o.e();
                                OnScanListener onScanListener = scanView.f24046e;
                                if (onScanListener != null && onScanListener.onResult(arrayListG)) {
                                    scanView.f24049i = true;
                                    Context context = scanView.getContext();
                                    Intrinsics.f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                    ((E) context).runOnUiThread(new e(scanView, arrayListG, c6 == true ? 1 : 0));
                                }
                            }
                        } else if (scanType == ScanType.SCAN_BOX) {
                            ArrayList arrayListG2 = scanView.g(bytes, iIntValue, iIntValue2, new Rect((int) scanView.f24044c.getBoxRect().left, (int) scanView.f24044c.getBoxRect().top, (int) scanView.f24044c.getBoxRect().right, (int) scanView.f24044c.getBoxRect().bottom));
                            if (!arrayListG2.isEmpty()) {
                                scanView.f24051o.e();
                                OnScanListener onScanListener2 = scanView.f24046e;
                                if (onScanListener2 == null || !onScanListener2.onResult(arrayListG2)) {
                                    z3 = false;
                                }
                                scanView.f24049i = z3;
                            }
                        }
                        imageProxy.close();
                    }
                }
                return Unit.f38893a;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                Intrinsics.e(sQLiteQuery);
                ((SupportSQLiteQuery) this.f4952b).bindTo(new n(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
