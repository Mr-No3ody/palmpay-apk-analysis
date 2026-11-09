package com.transsnet.palmpay.account;

import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface ILoginInfoInterface extends IInterface {
    public static final String DESCRIPTOR = "com.transsnet.palmpay.account.ILoginInfoInterface";

    LoginInfo getLoginInfo() throws RemoteException;
}
