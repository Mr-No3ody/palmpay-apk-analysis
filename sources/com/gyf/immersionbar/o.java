package com.gyf.immersionbar;

import android.app.FragmentManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.utils.Consts;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23256a = i.class.getName().concat(Consts.DOT);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23258c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f23259d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f23260e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f23261f = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f23257b = new Handler(Looper.getMainLooper(), this);

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            this.f23258c.remove((FragmentManager) message.obj);
            return true;
        }
        if (i7 == 2) {
            this.f23259d.remove((Z) message.obj);
            return true;
        }
        if (i7 == 3) {
            this.f23260e.remove((String) message.obj);
            return true;
        }
        if (i7 != 4) {
            return false;
        }
        this.f23261f.remove((String) message.obj);
        return true;
    }
}
