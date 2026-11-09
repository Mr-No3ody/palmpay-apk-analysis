package Yd;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f11372b;

    public /* synthetic */ u(Function0 function0, int i7) {
        this.f11371a = i7;
        this.f11372b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11371a) {
            case 0:
                this.f11372b.invoke();
                break;
            default:
                this.f11372b.invoke();
                break;
        }
    }
}
