package com.transsnet.palmpay.core.ui.activity;

import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C1052d;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PPRNActivity f27741b;

    public /* synthetic */ a0(PPRNActivity pPRNActivity, int i7) {
        this.f27740a = i7;
        this.f27741b = pPRNActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.chromium.support_lib_boundary.util.b s0Var;
        PPRNActivity pPRNActivity = this.f27741b;
        switch (this.f27740a) {
            case 0:
                int i7 = PPRNActivity.f27676v;
                if (Build.VERSION.SDK_INT > 34) {
                    try {
                        Window window = pPRNActivity.getWindow();
                        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                        C1052d c1052d = new C1052d(viewGroup, 4);
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 35) {
                            s0Var = new v0(window, c1052d);
                        } else if (i10 >= 30) {
                            s0Var = new u0(window, c1052d);
                        } else {
                            s0Var = i10 >= 26 ? new s0(window, c1052d) : new r0(window, c1052d);
                        }
                        s0Var.c0(true);
                        io.fastkv.n.K(window, false);
                        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                        androidx.core.view.E.n(viewGroup, pPRNActivity);
                    } catch (Exception e10) {
                        F6.d.c("ReactNative", "applySystemBarAppearance: ", e10);
                        return;
                    }
                }
                break;
            case 1:
                int i11 = PPRNActivity.f27676v;
                pPRNActivity.g(Boolean.FALSE);
                break;
            default:
                int i12 = PPRNActivity.f27676v;
                if (!pPRNActivity.isFinishing() && !pPRNActivity.isDestroyed()) {
                    pPRNActivity.j();
                    pPRNActivity.f();
                    break;
                }
                break;
        }
    }
}
