package N8;

import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignUpSuccessActivity f6215a;

    public g0(SignUpSuccessActivity signUpSuccessActivity) {
        this.f6215a = signUpSuccessActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView.Adapter adapter;
        SignUpSuccessActivity signUpSuccessActivity = this.f6215a;
        int i7 = signUpSuccessActivity.f26047c + 1;
        signUpSuccessActivity.f26047c = i7;
        Bc.B b7 = signUpSuccessActivity.f26049e;
        if (i7 < ((b7 == null || (adapter = ((RecyclerView) b7.f588A).getAdapter()) == null) ? 0 : adapter.getItemCount())) {
            Bc.B b10 = signUpSuccessActivity.f26049e;
            if (b10 != null) {
                RecyclerView recyclerView = (RecyclerView) b10.f588A;
                p355xf.t tVar = signUpSuccessActivity.f26051g;
                ((L8.b) tVar.getValue()).setTargetPosition(signUpSuccessActivity.f26047c);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll((L8.b) tVar.getValue());
                }
            }
            Bc.B b11 = signUpSuccessActivity.f26049e;
            if (b11 != null) {
                ((RecyclerView) b11.f588A).postDelayed(this, 2000L);
            }
        }
    }
}
