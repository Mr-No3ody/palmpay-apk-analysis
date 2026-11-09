package androidx.activity.result;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\t\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/activity/result/ActivityResultCaller;", "", "I", "O", "Lm/b;", "contract", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/a;", "registerForActivityResult", "(Lm/b;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/a;", "Landroidx/activity/result/h;", "registry", "(Lm/b;Landroidx/activity/result/h;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ActivityResultCaller {
    @NotNull
    <I, O> a registerForActivityResult(@NotNull p177m.b contract, @NotNull ActivityResultCallback<O> callback);

    @NotNull
    <I, O> a registerForActivityResult(@NotNull p177m.b contract, @NotNull h registry, @NotNull ActivityResultCallback<O> callback);
}
