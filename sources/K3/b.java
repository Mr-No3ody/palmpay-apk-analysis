package K3;

import android.view.MotionEvent;
import android.view.View;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.util.KeyboardUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4910a;

    public /* synthetic */ b(int i7) {
        this.f4910a = i7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f4910a) {
            case 0:
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                KeyboardUtils.hideSoftInput(view);
                return false;
            case 1:
                return false;
            default:
                return BaseActivity.lambda$hideKeyboardWhenTouchAround$2(view, motionEvent);
        }
    }
}
