package Bc;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.text.ImageTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f813d;

    public /* synthetic */ p(View view, Object obj, Object obj2, int i7) {
        this.f810a = i7;
        this.f811b = view;
        this.f812c = obj;
        this.f813d = obj2;
    }

    public static p a(View view) {
        int i7 = F8.d.ivStatus;
        ImageView imageView = (ImageView) p059e1.a.m(i7, view);
        if (imageView != null) {
            i7 = F8.d.tvStep;
            TextView textView = (TextView) p059e1.a.m(i7, view);
            if (textView != null) {
                return new p((LinearLayout) view, imageView, textView, 12);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    public static p b(View view) {
        int i7 = Pd.c.ma_clear_iv;
        ImageView imageView = (ImageView) p059e1.a.m(i7, view);
        if (imageView != null) {
            i7 = Pd.c.ma_search_et;
            EditText editText = (EditText) p059e1.a.m(i7, view);
            if (editText != null) {
                return new p((LinearLayout) view, imageView, editText, 15);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f810a) {
            case 0:
                return (LinearLayout) this.f811b;
            case 1:
                return (LinearLayout) this.f811b;
            case 2:
                return (LinearLayout) this.f811b;
            case 3:
                return (LinearLayout) this.f811b;
            case 4:
                return (LinearLayout) this.f811b;
            case 5:
                return (CardView) this.f811b;
            case 6:
                return (ConstraintLayout) this.f811b;
            case 7:
                return (LinearLayout) this.f811b;
            case 8:
                return (LinearLayout) this.f811b;
            case 9:
                return (LinearLayout) this.f811b;
            case 10:
                return (LinearLayout) this.f811b;
            case 11:
                return (LinearLayout) this.f811b;
            case 12:
                return (LinearLayout) this.f811b;
            case 13:
                return this.f811b;
            case 14:
                return (LinearLayout) this.f811b;
            case 15:
                return (LinearLayout) this.f811b;
            case 16:
                return (LinearLayout) this.f811b;
            case 17:
                return (ConstraintLayout) this.f811b;
            case 18:
                return (LinearLayout) this.f811b;
            case 19:
                return (ConstraintLayout) this.f811b;
            case 20:
                return (ConstraintLayout) this.f811b;
            default:
                return (LinearLayout) this.f811b;
        }
    }

    public p(LinearLayout linearLayout, ImageTextView imageTextView, RecyclerView recyclerView, TextView textView) {
        this.f810a = 21;
        this.f811b = linearLayout;
        this.f812c = imageTextView;
        this.f813d = textView;
    }

    public p(TextView textView, ConstraintLayout constraintLayout, RecyclerView recyclerView, IconicsImageView iconicsImageView) {
        this.f810a = 6;
        this.f811b = constraintLayout;
        this.f812c = iconicsImageView;
        this.f813d = textView;
    }

    public p(ConstraintLayout constraintLayout, PpButton ppButton, FrameLayout frameLayout, ImageView imageView) {
        this.f810a = 19;
        this.f811b = constraintLayout;
        this.f812c = frameLayout;
        this.f813d = imageView;
    }
}
