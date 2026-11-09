package com.facebook.react.jstasks;

import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "", "taskKey", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/facebook/react/bridge/WritableMap;", "timeout", "", "isAllowedInForeground", "", "retryPolicy", "Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZLcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;)V", "source", "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V", "getTaskKey", "()Ljava/lang/String;", "getData", "()Lcom/facebook/react/bridge/WritableMap;", "getTimeout", "()J", "()Z", "getRetryPolicy", "()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeadlessJsTaskConfig {

    @NotNull
    private final WritableMap data;
    private final boolean isAllowedInForeground;

    @Nullable
    private final HeadlessJsTaskRetryPolicy retryPolicy;

    @NotNull
    private final String taskKey;
    private final long timeout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeadlessJsTaskConfig(@NotNull String taskKey, @NotNull WritableMap data) {
        this(taskKey, data, 0L, false, null, 28, null);
        Intrinsics.checkNotNullParameter(taskKey, "taskKey");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @NotNull
    public final WritableMap getData() {
        return this.data;
    }

    @Nullable
    public final HeadlessJsTaskRetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    @NotNull
    public final String getTaskKey() {
        return this.taskKey;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: isAllowedInForeground, reason: from getter */
    public final boolean getIsAllowedInForeground() {
        return this.isAllowedInForeground;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeadlessJsTaskConfig(@NotNull String taskKey, @NotNull WritableMap data, long j6) {
        this(taskKey, data, j6, false, null, 24, null);
        Intrinsics.checkNotNullParameter(taskKey, "taskKey");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeadlessJsTaskConfig(@NotNull String taskKey, @NotNull WritableMap data, long j6, boolean z3) {
        this(taskKey, data, j6, z3, null, 16, null);
        Intrinsics.checkNotNullParameter(taskKey, "taskKey");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @JvmOverloads
    public HeadlessJsTaskConfig(@NotNull String taskKey, @NotNull WritableMap data, long j6, boolean z3, @Nullable HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy) {
        Intrinsics.checkNotNullParameter(taskKey, "taskKey");
        Intrinsics.checkNotNullParameter(data, "data");
        this.taskKey = taskKey;
        this.data = data;
        this.timeout = j6;
        this.isAllowedInForeground = z3;
        this.retryPolicy = headlessJsTaskRetryPolicy;
    }

    public /* synthetic */ HeadlessJsTaskConfig(String str, WritableMap writableMap, long j6, boolean z3, HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, writableMap, (i7 & 4) != 0 ? 0L : j6, (i7 & 8) != 0 ? false : z3, (i7 & 16) != 0 ? NoRetryPolicy.INSTANCE : headlessJsTaskRetryPolicy);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HeadlessJsTaskConfig(@NotNull HeadlessJsTaskConfig source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String str = source.taskKey;
        WritableMap writableMapCopy = source.data.copy();
        long j6 = source.timeout;
        boolean z3 = source.isAllowedInForeground;
        HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy = source.retryPolicy;
        this(str, writableMapCopy, j6, z3, headlessJsTaskRetryPolicy != null ? headlessJsTaskRetryPolicy.copy() : null);
    }
}
