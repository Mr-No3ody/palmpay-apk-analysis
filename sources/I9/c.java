package I9;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f4278d;

    public c(View view, int i7) {
        this.f4275a = i7;
        switch (i7) {
            case 1:
                this.f4278d = view.getContext();
                this.f4276b = view;
                this.f4277c = (TextView) view.findViewById(p025ba.e.tvAmount);
                break;
            default:
                this.f4278d = view.getContext();
                this.f4276b = view;
                this.f4277c = (TextView) view.findViewById(p366y9.b.tvAmount);
                break;
        }
    }

    public void a(int i7) {
        switch (this.f4275a) {
            case 0:
                View view = this.f4276b;
                if (view != null) {
                    view.setVisibility(i7);
                }
                break;
            default:
                View view2 = this.f4276b;
                if (view2 != null) {
                    view2.setVisibility(i7);
                }
                break;
        }
    }
}
