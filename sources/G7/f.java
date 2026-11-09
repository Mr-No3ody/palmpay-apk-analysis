package G7;

import Gb.E;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.custom_view.input.InputAutoCompleteTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3061b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f3060a = i7;
        this.f3061b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f3060a) {
            case 0:
                Balloon this$0 = (Balloon) this.f3061b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FrameLayout frameLayout = (FrameLayout) this$0.f25224c.f726d;
                Animation animation = frameLayout.getAnimation();
                if (animation != null) {
                    animation.cancel();
                    animation.reset();
                }
                frameLayout.clearAnimation();
                this$0.f();
                break;
            case 1:
                E e10 = (E) this.f3061b;
                WindowManager.LayoutParams attributes = e10.f3228a.getWindow().getAttributes();
                Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                attributes.alpha = 1.0f;
                e10.f3228a.getWindow().setAttributes(attributes);
                break;
            default:
                InputAutoCompleteTextView.setInternalOnDismissListener$lambda$0((InputAutoCompleteTextView) this.f3061b);
                break;
        }
    }
}
