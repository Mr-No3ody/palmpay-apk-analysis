package W9;

import android.view.View;
import com.transsnet.palmpay.core.bean.PalmPayContact;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmPayContact f10641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f10643c;

    public l(p pVar, PalmPayContact palmPayContact, int i7) {
        this.f10643c = pVar;
        this.f10641a = palmPayContact;
        this.f10642b = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.greenrobot.eventbus.f fVar = this.f10643c.f10646f;
        if (fVar != null) {
            fVar.onAdd(this.f10641a, this.f10642b);
        }
    }
}
