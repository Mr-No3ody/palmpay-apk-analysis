package com.transsnet.palmpay.account.sync;

import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface ISyncAidlInterface extends IInterface {
    public static final String DESCRIPTOR = "com.transsnet.palmpay.account.sync.ISyncAidlInterface";

    void onPerformSync(String str) throws RemoteException;
}
