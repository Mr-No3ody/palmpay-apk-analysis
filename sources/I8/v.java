package I8;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.custom_view.TitleEditView;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f4238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TitleEditView f4239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f4241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f4242f;

    public /* synthetic */ v(RelativeLayout relativeLayout, TitleEditView titleEditView, TextView textView, TextView textView2, TextView textView3, int i7) {
        this.f4237a = i7;
        this.f4238b = relativeLayout;
        this.f4239c = titleEditView;
        this.f4240d = textView;
        this.f4241e = textView2;
        this.f4242f = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4237a) {
            case 0:
                break;
        }
        return this.f4238b;
    }
}
