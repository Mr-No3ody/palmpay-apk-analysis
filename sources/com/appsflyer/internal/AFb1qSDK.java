package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AFb1qSDK {

    public static final class AFa1tSDK implements IInterface {
        private final IBinder getRevenue;

        public AFa1tSDK(IBinder iBinder) {
            this.getRevenue = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getRevenue;
        }

        public final boolean getCurrencyIso4217Code() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.getRevenue.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final String getMonetizationNetwork() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getRevenue.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static final class AFa1vSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getRevenue = new LinkedBlockingQueue<>(1);
        boolean AFAdRevenueData = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getRevenue.put(iBinder);
            } catch (InterruptedException e10) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e10);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class AFa1zSDK {
        public final String AFAdRevenueData;
        private final boolean getMediationNetwork;

        public AFa1zSDK(String str, boolean z3) {
            this.AFAdRevenueData = str;
            this.getMediationNetwork = z3;
        }

        public final boolean getMediationNetwork() {
            return this.getMediationNetwork;
        }
    }

    public static AFa1zSDK getMonetizationNetwork(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1vSDK aFa1vSDK = new AFa1vSDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1vSDK, 1)) {
                context.unbindService(aFa1vSDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1vSDK.AFAdRevenueData) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1vSDK.AFAdRevenueData = true;
            IBinder iBinderPoll = aFa1vSDK.getRevenue.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1tSDK aFa1tSDK = new AFa1tSDK(iBinderPoll);
            AFa1zSDK aFa1zSDK = new AFa1zSDK(aFa1tSDK.getMonetizationNetwork(), aFa1tSDK.getCurrencyIso4217Code());
            context.unbindService(aFa1vSDK);
            return aFa1zSDK;
        } catch (Throwable th) {
            context.unbindService(aFa1vSDK);
            throw th;
        }
    }
}
