package com.facebook.react;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\b\u0016\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002?@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016J\"\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0017J\b\u0010+\u001a\u00020\fH\u0016J\u0018\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/H\u0016J+\u00100\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'2\f\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u000205H\u0017¢\u0006\u0002\u00106J \u00107\u001a\u00020'2\u0006\u00108\u001a\u0002032\u0006\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020'H\u0016J\u0010\u0010;\u001a\u00020'2\u0006\u00108\u001a\u000203H\u0016J-\u0010<\u001a\u00020\u00102\f\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010&\u001a\u00020'2\b\u0010=\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010>R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00148TX\u0095\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006A"}, d2 = {"Lcom/facebook/react/ReactFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/react/modules/core/PermissionAwareActivity;", "<init>", "()V", "reactDelegate", "Lcom/facebook/react/ReactDelegate;", "getReactDelegate", "()Lcom/facebook/react/ReactDelegate;", "setReactDelegate", "(Lcom/facebook/react/ReactDelegate;)V", "disableHostLifecycleEvents", "", "permissionListener", "Lcom/facebook/react/modules/core/PermissionListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost$annotations", "getReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "reactHost", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onPause", "onDestroy", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onKeyUp", "keyCode", "event", "Landroid/view/KeyEvent;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "checkPermission", "permission", "pid", "uid", "checkSelfPermission", "requestPermissions", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V", "Builder", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactFragment.kt\ncom/facebook/react/ReactFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public class ReactFragment extends Fragment implements PermissionAwareActivity {

    @NotNull
    protected static final String ARG_COMPONENT_NAME = "arg_component_name";

    @NotNull
    protected static final String ARG_DISABLE_HOST_LIFECYCLE_EVENTS = "arg_disable_host_lifecycle_events";

    @NotNull
    protected static final String ARG_FABRIC_ENABLED = "arg_fabric_enabled";

    @NotNull
    protected static final String ARG_LAUNCH_OPTIONS = "arg_launch_options";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean disableHostLifecycleEvents;

    @Nullable
    private PermissionListener permissionListener;
    protected ReactDelegate reactDelegate;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/ReactFragment$Builder;", "", "<init>", "()V", "componentName", "", "getComponentName", "()Ljava/lang/String;", "setComponentName", "(Ljava/lang/String;)V", "launchOptions", "Landroid/os/Bundle;", "getLaunchOptions", "()Landroid/os/Bundle;", "setLaunchOptions", "(Landroid/os/Bundle;)V", "fabricEnabled", "", "getFabricEnabled", "()Z", "setFabricEnabled", "(Z)V", "build", "Lcom/facebook/react/ReactFragment;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String componentName;
        private boolean fabricEnabled;

        @Nullable
        private Bundle launchOptions;

        @NotNull
        public final ReactFragment build() {
            return ReactFragment.INSTANCE.newInstance(this.componentName, this.launchOptions, this.fabricEnabled);
        }

        @Nullable
        public final String getComponentName() {
            return this.componentName;
        }

        public final boolean getFabricEnabled() {
            return this.fabricEnabled;
        }

        @Nullable
        public final Bundle getLaunchOptions() {
            return this.launchOptions;
        }

        /* JADX INFO: renamed from: setComponentName, reason: collision with other method in class */
        public final void m82setComponentName(@Nullable String str) {
            this.componentName = str;
        }

        /* JADX INFO: renamed from: setFabricEnabled, reason: collision with other method in class */
        public final void m83setFabricEnabled(boolean z3) {
            this.fabricEnabled = z3;
        }

        /* JADX INFO: renamed from: setLaunchOptions, reason: collision with other method in class */
        public final void m84setLaunchOptions(@Nullable Bundle bundle) {
            this.launchOptions = bundle;
        }

        @NotNull
        public final Builder setComponentName(@NotNull String componentName) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            this.componentName = componentName;
            return this;
        }

        @Deprecated(message = "You should not change call ReactFragment.setFabricEnabled. Instead enable the NewArchitecture for the whole application with newArchEnabled=true in your gradle.properties file")
        @NotNull
        public final Builder setFabricEnabled(boolean fabricEnabled) {
            this.fabricEnabled = fabricEnabled;
            return this;
        }

        @NotNull
        public final Builder setLaunchOptions(@NotNull Bundle launchOptions) {
            Intrinsics.checkNotNullParameter(launchOptions, "launchOptions");
            this.launchOptions = launchOptions;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0084T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00058\u0004X\u0085T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/ReactFragment$Companion;", "", "<init>", "()V", "ARG_COMPONENT_NAME", "", "ARG_LAUNCH_OPTIONS", "ARG_FABRIC_ENABLED", "ARG_DISABLE_HOST_LIFECYCLE_EVENTS", "getARG_DISABLE_HOST_LIFECYCLE_EVENTS$annotations", "newInstance", "Lcom/facebook/react/ReactFragment;", "componentName", "launchOptions", "Landroid/os/Bundle;", "fabricEnabled", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactFragment.kt\ncom/facebook/react/ReactFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "We will remove this and use a different solution for handling Fragment lifecycle events.")
        public static /* synthetic */ void getARG_DISABLE_HOST_LIFECYCLE_EVENTS$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReactFragment newInstance(String componentName, Bundle launchOptions, boolean fabricEnabled) {
            Bundle bundle = new Bundle();
            bundle.putString(ReactFragment.ARG_COMPONENT_NAME, componentName);
            bundle.putBundle(ReactFragment.ARG_LAUNCH_OPTIONS, launchOptions);
            bundle.putBoolean(ReactFragment.ARG_FABRIC_ENABLED, fabricEnabled);
            ReactFragment reactFragment = new ReactFragment();
            reactFragment.setArguments(bundle);
            return reactFragment;
        }

        private Companion() {
        }
    }

    @Deprecated(message = "You should not use ReactNativeHost directly in the New Architecture. Use ReactHost instead.", replaceWith = @ReplaceWith(expression = "reactHost", imports = {}))
    public static /* synthetic */ void getReactNativeHost$annotations() {
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkPermission(@NotNull String permission, int pid, int uid) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        E activity = getActivity();
        if (activity != null) {
            return activity.checkPermission(permission, pid, uid);
        }
        return 0;
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkSelfPermission(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        E activity = getActivity();
        if (activity != null) {
            return activity.checkSelfPermission(permission);
        }
        return 0;
    }

    @NotNull
    public final ReactDelegate getReactDelegate() {
        ReactDelegate reactDelegate = this.reactDelegate;
        if (reactDelegate != null) {
            return reactDelegate;
        }
        Intrinsics.n("reactDelegate");
        throw null;
    }

    @Nullable
    public ReactHost getReactHost() {
        E activity = getActivity();
        ReactApplication reactApplication = (ReactApplication) (activity != null ? activity.getApplication() : null);
        if (reactApplication != null) {
            return reactApplication.getReactHost();
        }
        return null;
    }

    @Nullable
    public ReactNativeHost getReactNativeHost() {
        E activity = getActivity();
        ReactApplication reactApplication = (ReactApplication) (activity != null ? activity.getApplication() : null);
        if (reactApplication != null) {
            return reactApplication.getReactNativeHost();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getReactDelegate().onActivityResult(requestCode, resultCode, data, false);
    }

    public boolean onBackPressed() {
        return getReactDelegate().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        boolean z3;
        String str;
        Bundle bundle;
        ReactDelegate reactDelegate;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(ARG_COMPONENT_NAME);
            Bundle bundle2 = arguments.getBundle(ARG_LAUNCH_OPTIONS);
            z3 = arguments.getBoolean(ARG_FABRIC_ENABLED);
            this.disableHostLifecycleEvents = arguments.getBoolean(ARG_DISABLE_HOST_LIFECYCLE_EVENTS);
            str = string;
            bundle = bundle2;
        } else {
            z3 = false;
            str = null;
            bundle = null;
        }
        boolean z8 = z3;
        if (str == null) {
            throw new IllegalStateException("Cannot loadApp if component name is null");
        }
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            E eRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
            reactDelegate = new ReactDelegate(eRequireActivity, getReactHost(), str, bundle);
        } else {
            E eRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(eRequireActivity2, "requireActivity(...)");
            reactDelegate = new ReactDelegate(eRequireActivity2, getReactNativeHost(), str, bundle, z8);
        }
        setReactDelegate(reactDelegate);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        getReactDelegate().loadApp();
        return getReactDelegate().getReactRootView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.disableHostLifecycleEvents) {
            getReactDelegate().unloadApp();
        } else {
            getReactDelegate().onHostDestroy();
        }
    }

    public boolean onKeyUp(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return getReactDelegate().shouldShowDevMenuOrReload(keyCode, event);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.disableHostLifecycleEvents) {
            return;
        }
        getReactDelegate().onHostPause();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionListener permissionListener = this.permissionListener;
        if (permissionListener == null || !permissionListener.onRequestPermissionsResult(requestCode, permissions, grantResults)) {
            return;
        }
        this.permissionListener = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.disableHostLifecycleEvents) {
            return;
        }
        getReactDelegate().onHostResume();
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public void requestPermissions(@NotNull String[] permissions, int requestCode, @Nullable PermissionListener listener) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.permissionListener = listener;
        requestPermissions(permissions, requestCode);
    }

    public final void setReactDelegate(@NotNull ReactDelegate reactDelegate) {
        Intrinsics.checkNotNullParameter(reactDelegate, "<set-?>");
        this.reactDelegate = reactDelegate;
    }
}
