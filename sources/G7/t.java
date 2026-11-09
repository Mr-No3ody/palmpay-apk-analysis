package G7;

import android.view.View;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Balloon f3142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3143c;

    public /* synthetic */ t(Balloon balloon, View view, int i7) {
        this.f3141a = i7;
        this.f3142b = balloon;
        this.f3143c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3141a) {
            case 0:
                Balloon balloon = this.f3142b;
                balloon.getClass();
                View anchor = this.f3143c;
                Intrinsics.checkNotNullParameter(anchor, "anchor");
                View[] viewArr = {anchor};
                View view = viewArr[0];
                if (balloon.e(view)) {
                    view.post(new n(balloon, view, viewArr, balloon, anchor, 0));
                } else if (balloon.f25223b.f3071J) {
                    balloon.f();
                }
                break;
            default:
                Balloon balloon2 = this.f3142b;
                balloon2.getClass();
                View anchor2 = this.f3143c;
                Intrinsics.checkNotNullParameter(anchor2, "anchor");
                View[] viewArr2 = {anchor2};
                View view2 = viewArr2[0];
                if (balloon2.e(view2)) {
                    view2.post(new n(balloon2, view2, viewArr2, balloon2, anchor2, 1));
                } else if (balloon2.f25223b.f3071J) {
                    balloon2.f();
                }
                break;
        }
    }
}
