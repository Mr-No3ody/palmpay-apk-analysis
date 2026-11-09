package Ce;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionHistoryFragment f1533b;

    public t0(TransactionHistoryFragment transactionHistoryFragment) {
        this.f1533b = transactionHistoryFragment;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int iFindLastVisibleItemPosition;
        TransactionHistoryFragment transactionHistoryFragment = this.f1533b;
        if (!Intrinsics.c(transactionHistoryFragment.f35259o, Boolean.TRUE)) {
            if (motionEvent == null || motionEvent.getAction() != 2) {
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    if (((int) motionEvent.getY()) - this.f1532a < 0 && (iFindLastVisibleItemPosition = ((LinearLayoutManager) transactionHistoryFragment.f35250B.getValue()).findLastVisibleItemPosition()) == transactionHistoryFragment.v().getLoadMoreModule().c() && transactionHistoryFragment.v().getLoadMoreModule().f8645d == R1.a.f7907a) {
                        transactionHistoryFragment.v().getLoadMoreModule().i();
                        F6.d.h(transactionHistoryFragment.f27317a, 3, "load more , lastItemPosition = " + iFindLastVisibleItemPosition);
                    }
                    this.f1532a = 0;
                }
            } else if (this.f1532a == 0) {
                this.f1532a = (int) motionEvent.getY();
                return false;
            }
        }
        return false;
    }
}
