package G7;

import android.view.MotionEvent;
import android.view.View;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3125b;

    public /* synthetic */ m(Object obj, int i7) {
        this.f3124a = i7;
        this.f3125b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        switch (this.f3124a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() != 4) {
                    return false;
                }
                Balloon balloon = (Balloon) this.f3125b;
                if (balloon.f25223b.f3070I) {
                    balloon.f();
                }
                return true;
            default:
                ((ModelEnterPhoneNumber1) this.f3125b).f28343c.setText("");
                return false;
        }
    }
}
