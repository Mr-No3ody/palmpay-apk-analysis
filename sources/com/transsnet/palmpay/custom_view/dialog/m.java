package com.transsnet.palmpay.custom_view.dialog;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f31286a = new ConcurrentHashMap();

    public static void a(Activity activity) {
        l lVar;
        if (activity == null || (lVar = (l) f31286a.remove(activity)) == null) {
            return;
        }
        lVar.f31284d = null;
        View view = lVar.f31281a;
        view.setOnClickListener(null);
        view.removeCallbacks(lVar.f31285e);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
