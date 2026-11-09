package V6;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import p349x8.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i7) {
        super(context);
        this.f10088a = i7;
        switch (i7) {
            case 1:
                super(context, e.BaseDialogTheme);
                this.f10089b = context;
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                break;
        }
    }

    public abstract void b();

    public abstract void c(ViewBinding viewBinding);

    public abstract ViewBinding d();

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        switch (this.f10088a) {
            case 0:
                super.onCreate(bundle);
                Window window = getWindow();
                if (window != null) {
                    window.requestFeature(1);
                }
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawableResource(R.color.transparent);
                }
                ViewBinding viewBindingD = d();
                this.f10089b = viewBindingD;
                View root = viewBindingD.getRoot();
                if (root != null) {
                    setContentView(root);
                }
                ViewBinding viewBinding = (ViewBinding) this.f10089b;
                if (viewBinding != null) {
                    c(viewBinding);
                }
                break;
            default:
                super.onCreate(bundle);
                getWindow().requestFeature(1);
                getWindow().setBackgroundDrawableResource(R.color.transparent);
                b();
                a();
                setCanceledOnTouchOutside(true);
                break;
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        switch (this.f10088a) {
            case 1:
                super.onStart();
                break;
            default:
                super.onStart();
                break;
        }
    }

    public void a() {
    }
}
