package G9;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.E;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.send_money.ui.activity.TransferToBaseActivity;
import com.transsnet.palmpay.teller.ui.view.WrapContentViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3187b;

    public /* synthetic */ r(Object obj, int i7) {
        this.f3186a = i7;
        this.f3187b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        DigitalKeyboardView digitalKeyboardView;
        Window window;
        View decorView;
        Object obj = this.f3187b;
        switch (this.f3186a) {
            case 0:
                Rect rect = new Rect();
                WithdrawV2Fragment withdrawV2Fragment = (WithdrawV2Fragment) obj;
                E activity = withdrawV2Fragment.getActivity();
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.getWindowVisibleDisplayFrame(rect);
                }
                int iHeight = rect.height();
                int i7 = withdrawV2Fragment.f27062q0;
                if (i7 == 0) {
                    withdrawV2Fragment.f27062q0 = iHeight;
                    break;
                } else {
                    p355xf.t tVar = withdrawV2Fragment.f27057j;
                    if (i7 != iHeight) {
                        if (!withdrawV2Fragment.f27063r0) {
                            withdrawV2Fragment.f27063r0 = true;
                            DigitalKeyboardView digitalKeyboardView2 = (DigitalKeyboardView) tVar.getValue();
                            if (digitalKeyboardView2 != null) {
                                p220oa.h.s(digitalKeyboardView2, false);
                            }
                        }
                        break;
                    } else if (withdrawV2Fragment.f27063r0 && (digitalKeyboardView = (DigitalKeyboardView) tVar.getValue()) != null) {
                        p220oa.h.s(digitalKeyboardView, true);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = WrapContentViewPager2.f34365e;
                ((WrapContentViewPager2) obj).b();
                break;
            default:
                int i11 = TransferToBaseActivity.f33258Q;
                Rect rect2 = new Rect();
                TransferToBaseActivity transferToBaseActivity = (TransferToBaseActivity) obj;
                transferToBaseActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                int iHeight2 = rect2.height();
                if (transferToBaseActivity.f33262H == 0) {
                    transferToBaseActivity.f33262H = iHeight2;
                    break;
                } else if (!transferToBaseActivity.isFinishing()) {
                    if (transferToBaseActivity.f33262H == iHeight2) {
                        if (transferToBaseActivity.f33263L && transferToBaseActivity.q() != null) {
                            p220oa.h.s(transferToBaseActivity.q(), true);
                            break;
                        }
                    } else if (!transferToBaseActivity.f33263L && transferToBaseActivity.q() != null) {
                        transferToBaseActivity.f33263L = true;
                        p220oa.h.s(transferToBaseActivity.q(), false);
                        break;
                    }
                }
                break;
        }
    }
}
