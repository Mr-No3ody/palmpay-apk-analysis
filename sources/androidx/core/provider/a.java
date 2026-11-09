package androidx.core.provider;

import com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelView;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16103c;

    public /* synthetic */ a(Object obj, int i7, int i10) {
        this.f16101a = i10;
        this.f16103c = obj;
        this.f16102b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size;
        int size2;
        switch (this.f16101a) {
            case 0:
                Y.h hVar = (Y.h) ((p1.c) this.f16103c).f41176b;
                if (hVar != null) {
                    hVar.onFontRetrievalFailed(this.f16102b);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f16103c;
                int size3 = arrayList.size();
                int i7 = 0;
                if (this.f16102b == 1) {
                    while (i7 < size3) {
                        ((androidx.emoji2.text.g) arrayList.get(i7)).b();
                        i7++;
                    }
                } else {
                    while (i7 < size3) {
                        ((androidx.emoji2.text.g) arrayList.get(i7)).a();
                        i7++;
                    }
                }
                break;
            case 2:
                WheelView wheelView = (WheelView) this.f16103c;
                if (G8.a.H(wheelView.f31726d)) {
                    size = 0;
                } else {
                    boolean z3 = wheelView.f31725c;
                    size = this.f16102b;
                    if (z3) {
                        size = ((wheelView.f31726d.size() * (1073741823 / wheelView.f31726d.size())) + size) - (wheelView.f31724b / 2);
                    }
                }
                super/*android.widget.ListView*/.setSelection(size);
                WheelView.b(wheelView, false);
                wheelView.setVisibility(0);
                break;
            default:
                FlexiBankWheelView flexiBankWheelView = (FlexiBankWheelView) this.f16103c;
                List list = flexiBankWheelView.f22283d;
                if (list == null || list.size() == 0) {
                    size2 = 0;
                } else {
                    boolean z8 = flexiBankWheelView.f22282c;
                    size2 = this.f16102b;
                    if (z8) {
                        List list2 = flexiBankWheelView.f22283d;
                        Intrinsics.e(list2);
                        int size4 = 1073741823 / list2.size();
                        List list3 = flexiBankWheelView.f22283d;
                        Intrinsics.e(list3);
                        size2 = ((list3.size() * size4) + size2) - (flexiBankWheelView.f22281b / 2);
                    }
                }
                super/*android.widget.ListView*/.setSelection(size2);
                FlexiBankWheelView.b(flexiBankWheelView, false);
                flexiBankWheelView.setVisibility(0);
                break;
        }
    }

    public a(List list, int i7, Throwable th) {
        this.f16101a = 1;
        p118hf.a.j(list, "initCallbacks cannot be null");
        this.f16103c = new ArrayList(list);
        this.f16102b = i7;
    }
}
