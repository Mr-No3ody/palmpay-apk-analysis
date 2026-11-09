package com.luck.picture.lib.basic;

import N8.q0;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.luck.picture.lib.R;
import com.luck.picture.lib.utils.ActivityCompatHelper;

/* JADX INFO: loaded from: classes3.dex */
public class FragmentInjectManager {
    public static void injectFragment(E e10, String str, Fragment fragment) {
        if (ActivityCompatHelper.checkFragmentNonExits(e10, str)) {
            Z supportFragmentManager = e10.getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
            c1161aE.d(R.id.fragment_container, fragment, str, 1);
            c1161aE.c(str);
            c1161aE.h(true);
        }
    }

    public static void injectSystemRoomFragment(Z z3, String str, Fragment fragment) {
        C1161a c1161aE = q0.e(z3, z3);
        c1161aE.d(android.R.id.content, fragment, str, 1);
        c1161aE.c(str);
        c1161aE.h(true);
    }
}
