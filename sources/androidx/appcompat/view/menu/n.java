package androidx.appcompat.view.menu;

import android.view.ActionProvider;
import androidx.core.view.AbstractC1051c;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC1051c implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Sd.b f12467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionProvider f12468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f12469d;

    public n(q qVar, ActionProvider actionProvider) {
        this.f12469d = qVar;
        this.f12468c = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        Sd.b bVar = this.f12467b;
        if (bVar != null) {
            bVar.onActionProviderVisibilityChanged(z3);
        }
    }
}
