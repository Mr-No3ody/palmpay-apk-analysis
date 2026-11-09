package D8;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1691a;

    public /* synthetic */ a(int i7) {
        this.f1691a = i7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v3, MotionEvent motionEvent) {
        switch (this.f1691a) {
            case 0:
                v3.getParent().requestDisallowInterceptTouchEvent(true);
                break;
            case 1:
                break;
            case 2:
                v3.getParent().requestDisallowInterceptTouchEvent(true);
                break;
            default:
                Intrinsics.checkNotNullParameter(v3, "v");
                v3.getParent().requestDisallowInterceptTouchEvent(true);
                break;
        }
        return false;
    }
}
