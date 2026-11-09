package p215o4;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.flexibank.sdk.s;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Dialog implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f40022d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f40023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnShowListener f40025c;

    static {
        new a(null);
        String simpleName = b.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f40022d = simpleName;
    }

    public /* synthetic */ b(Context context, int i7, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? 0 : i7, s.fb_BaseDialogTheme);
    }

    public static void b(b bVar, Window window) {
        int i7 = s.fb_dialog_bottom_in_out;
        int screenWidth = ScreenUtils.getScreenWidth();
        if (window == null) {
            return;
        }
        window.setGravity(80);
        window.setWindowAnimations(i7);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = screenWidth;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public abstract void a();

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            Intrinsics.e(ownerActivity);
            if (ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                return;
            }
        }
        try {
            if (isShowing()) {
                super.dismiss();
            }
        } catch (Exception e10) {
            Log.e(f40022d, "dismiss: ", e10);
        }
    }

    public void onClick(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Window window = getWindow();
            Intrinsics.e(window);
            window.requestFeature(1);
            Window window2 = getWindow();
            Intrinsics.e(window2);
            window2.setBackgroundDrawableResource(R.color.transparent);
        } catch (Throwable th) {
            th.toString();
        }
        int i7 = this.f40024b;
        if (i7 > 0) {
            try {
                setContentView(i7);
            } catch (Exception e10) {
                if (e10.getMessage() != null) {
                    String message = e10.getMessage();
                    Intrinsics.e(message);
                    String lowerCase = message.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (StringsKt.A(lowerCase, "webview", false)) {
                        ToastUtils.showLong(e10.getMessage(), new Object[0]);
                        dismiss();
                        return;
                    }
                }
            }
        }
        this.f40023a = getContext();
        a();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f40025c;
        if (onShowListener != null) {
            Intrinsics.e(onShowListener);
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        super.setOnShowListener(this);
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f40025c = onShowListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i7, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40024b = i7;
    }
}
