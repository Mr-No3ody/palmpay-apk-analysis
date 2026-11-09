package com.transsnet.adsdk.remote;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.transsnet.adsdk.IRemoteDraw;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001-B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016J\b\u0010'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020\u0018H\u0014J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/transsnet/adsdk/remote/ProcessSurfaceView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/content/ServiceConnection;", "Landroid/os/IBinder$DeathRecipient;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "surface", "Landroid/view/Surface;", "iRemoteDraw", "Lcom/transsnet/adsdk/IRemoteDraw;", "isSetSurface", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mUrl", "", "surfaceCreated", "", "holder", "Landroid/view/SurfaceHolder;", "surfaceChanged", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "p3", "surfaceDestroyed", "onServiceConnected", "p0", "Landroid/content/ComponentName;", "iBinder", "Landroid/os/IBinder;", "onServiceDisconnected", "binderDied", "bindService", "unbindService", "onDetachedFromWindow", "setSurfaceToRemote", "setWebViewUrl", "url", "Companion", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessSurfaceView extends SurfaceView implements SurfaceHolder.Callback, ServiceConnection, IBinder.DeathRecipient {

    @NotNull
    private static final String TAG = "ProcessSurfaceView";

    @Nullable
    private IRemoteDraw iRemoteDraw;

    @NotNull
    private final AtomicBoolean isSetSurface;

    @Nullable
    private String mUrl;

    @Nullable
    private Surface surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessSurfaceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSetSurface = new AtomicBoolean(false);
        getHolder().addCallback(this);
        bindService();
    }

    private final void bindService() {
        getContext().bindService(new Intent(getContext(), (Class<?>) RemoteDrawService.class), this, 65);
    }

    private final void setSurfaceToRemote(Surface surface) throws RemoteException {
        IRemoteDraw iRemoteDraw;
        if (this.isSetSurface.get() || (iRemoteDraw = this.iRemoteDraw) == null) {
            return;
        }
        iRemoteDraw.setWebUrl(this.mUrl);
        iRemoteDraw.setSurface(surface, getWidth(), getHeight());
        this.isSetSurface.set(true);
    }

    private final void unbindService() {
        getContext().unbindService(this);
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        try {
            unbindService();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.surface = null;
            IRemoteDraw iRemoteDraw = this.iRemoteDraw;
            if (iRemoteDraw != null) {
                iRemoteDraw.release();
            }
            this.iRemoteDraw = null;
        } catch (Exception unused) {
        }
        super.onDetachedFromWindow();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName p3, @Nullable IBinder iBinder) throws RemoteException {
        toString();
        if (iBinder == null) {
            Log.e(TAG, "onServiceDisconnected: iBinder is null.");
            return;
        }
        this.iRemoteDraw = IRemoteDraw.Stub.asInterface(iBinder);
        Surface surface = this.surface;
        if (surface != null) {
            setSurfaceToRemote(surface);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName p3) {
        this.iRemoteDraw = null;
    }

    public final void setWebViewUrl(@Nullable String url) {
        this.mUrl = url;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NotNull SurfaceHolder holder, int p3, int p10, int p11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder holder) throws RemoteException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Surface surface = holder.getSurface();
        this.surface = surface;
        if (surface != null) {
            setSurfaceToRemote(surface);
        }
        Objects.toString(this.surface);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.isSetSurface.set(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessSurfaceView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.isSetSurface = new AtomicBoolean(false);
        getHolder().addCallback(this);
        bindService();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessSurfaceView(@NotNull Context context, @NotNull AttributeSet attrs, int i7) {
        super(context, attrs, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.isSetSurface = new AtomicBoolean(false);
        getHolder().addCallback(this);
        bindService();
    }
}
