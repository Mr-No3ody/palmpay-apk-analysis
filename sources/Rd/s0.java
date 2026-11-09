package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8483a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f8484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f8485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8486d;

    public s0(View view, ImageView imageView, TextView textView) {
        this.f8484b = view;
        this.f8485c = imageView;
        this.f8486d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f8483a) {
            case 0:
                break;
        }
        return this.f8484b;
    }

    public s0(View view, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.f8484b = view;
        this.f8485c = imageView;
        this.f8486d = textView;
    }
}
