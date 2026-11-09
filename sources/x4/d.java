package x4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f43590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43591c;

    public /* synthetic */ d(RelativeLayout relativeLayout, TextView textView, int i7) {
        this.f43589a = i7;
        this.f43590b = relativeLayout;
        this.f43591c = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f43589a) {
            case 0:
                break;
        }
        return this.f43590b;
    }
}
