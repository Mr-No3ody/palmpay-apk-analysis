package N6;

import L6.f;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f6097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f6098c;

    public /* synthetic */ e(ConstraintLayout constraintLayout, TextView textView, int i7) {
        this.f6096a = i7;
        this.f6097b = constraintLayout;
        this.f6098c = textView;
    }

    public static e a(View view) {
        int i7 = f.tv_title;
        TextView textView = (TextView) p059e1.a.m(i7, view);
        if (textView != null) {
            return new e((ConstraintLayout) view, textView, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f6096a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f6097b;
    }

    public e(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView) {
        this.f6096a = 1;
        this.f6097b = constraintLayout;
        this.f6098c = textView;
    }
}
