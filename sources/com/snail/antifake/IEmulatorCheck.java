package com.snail.antifake;

import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IEmulatorCheck extends IInterface {
    boolean isEmulator() throws RemoteException;

    void kill() throws RemoteException;
}
