package K6;

import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import com.palmpay.lib.scanplus.view.CodePointView;
import com.palmpay.lib.scanplus.view.ScanView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScanView f4946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4947c;

    public /* synthetic */ e(ScanView scanView, ArrayList arrayList, int i7) {
        this.f4945a = i7;
        this.f4946b = scanView;
        this.f4947c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList codeBeans = this.f4947c;
        ScanView this$0 = this.f4946b;
        switch (this.f4945a) {
            case 0:
                int i7 = ScanView.t;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(codeBeans, "$codeBeans");
                CodePointView codePointView = this$0.f24043b;
                if (codePointView != null) {
                    codePointView.a();
                }
                CodePointView codePointView2 = this$0.f24043b;
                if (codePointView2 != null) {
                    codePointView2.setQrCodes(codeBeans);
                }
                break;
            default:
                int i10 = ScanView.t;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(codeBeans, "$codeBeans");
                AbstractC1205o abstractC1205o = this$0.f24045d;
                if (abstractC1205o instanceof C1212w) {
                    C1212w c1212w = (C1212w) abstractC1205o;
                    if (c1212w.f17478d != EnumC1204n.f17460a) {
                        c1212w.g(EnumC1204n.f17462c);
                    }
                }
                CodePointView codePointView3 = this$0.f24043b;
                if (codePointView3 != null) {
                    codePointView3.a();
                }
                CodePointView codePointView4 = this$0.f24043b;
                if (codePointView4 != null) {
                    codePointView4.setQrCodes(codeBeans);
                }
                break;
        }
    }
}
