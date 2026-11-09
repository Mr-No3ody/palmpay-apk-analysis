package G7;

import Ab.C;
import android.view.View;
import com.skydoves.balloon.OnBalloonClickListener;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements OnBalloonClickListener, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f3144a;

    public u(C c6) {
        this.f3144a = c6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OnBalloonClickListener) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return this.f3144a.equals(((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.f3144a;
    }

    public final int hashCode() {
        return this.f3144a.hashCode();
    }

    @Override // com.skydoves.balloon.OnBalloonClickListener
    public final /* synthetic */ void onBalloonClick(View view) {
        this.f3144a.invoke(view);
    }
}
