package com.facebook.react;

import M7.C0452l;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.dylanvann.fastimage.FastImageViewPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.microsoft.codepush.react.CodePush;
import com.rnmaps.maps.K;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), CodePush.getInstance(getResources().getString(E8.a.CodePushDeploymentKey), getApplicationContext(), false), new D5.a(3), new D5.a(7), new Ze.b(1), new p249q7.b(), new D5.a(2), new D5.a(8), new D5.a(0), new D5.a(1), new FastImageViewPackage(), new D5.a(6), new K(0), new D5.a(10), new K(1), new C0452l(), new D5.a(5), new SvgPackage(), new D5.a(4), new Ze.b(0), new Ze.b(2)));
    }

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }
}
